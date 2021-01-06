package com.example.myapp.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.widget.LinearLayout;

import com.example.model.Daf;
import com.example.myapp.R;
import com.example.myapp.databinding.FragmentShowDafBinding;
import com.example.myapp.utils.ConvertNamesToEnglish;

import java.util.Objects;


public class ShowDafFragment extends Fragment {

    public static final String TAG = ShowDafFragment.class.getSimpleName();
    private static final String KEY_DAF_TO_SHOW = "KEY_DAF_TO_SHOW";
    private FragmentShowDafBinding binding;
    private Daf mDafToShow;
    private LinearLayout linearLayoutButtons;
    private static final String BASIC_PATH = "https://www.sefaria.org.il/";

    public static Fragment newInstance(Daf dafToShow) {
        ShowDafFragment fragment = new ShowDafFragment();
        Bundle args = new Bundle();
        args.putParcelable(KEY_DAF_TO_SHOW, dafToShow);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mDafToShow = getArguments().getParcelable(KEY_DAF_TO_SHOW);

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentShowDafBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews();
        ShowDaf(mDafToShow);
    }


    @SuppressLint("SetJavaScriptEnabled")
    private void ShowDaf(Daf mDafToShow) {
        String path = createPath(mDafToShow);
        binding.FSDWebViewWV.getSettings().setJavaScriptEnabled(true);
        binding.FSDWebViewWV.loadUrl(path);
    }

    private String createPath(Daf mDafToShow) {
        //               מידות  קינים   לטפל בשקלים!
        return BASIC_PATH +
                ConvertNamesToEnglish.convertMasechetNamesToEnglish(mDafToShow.getMasechet())
                + "."
                + mDafToShow.getPageNumber()
                + "a"
                + "?lang=he";
    }


    @SuppressLint("SetJavaScriptEnabled")
    private void initWebView(Daf dafToShow) {
//        binding.ShowTheDafWV.setVisibility(View.VISIBLE);
//        binding.ShowTheDafWV.
//
//        String pdf = "https://outorah.org/dafImage/Pesachim/19/0.pdf";
//        binding.ShowTheDafWV.loadUrl("http://docs.google.com/gview?embedded=true&amp;url=" + pdf);
//         binding.ShowTheDafWV.loadUrl("https://www.sefaria.org.il/Eruvin.2b.2?lang=he&with=all&lang2=he");


    }

    private void initViews() {
        linearLayoutButtons = Objects.requireNonNull(getActivity()).findViewById(R.id.typeOfStudy_buttons_LL);
        linearLayoutButtons.setVisibility(View.GONE);
    }

    @Override
    public void onPause() {
        super.onPause();
        linearLayoutButtons.setVisibility(View.VISIBLE);
    }
}