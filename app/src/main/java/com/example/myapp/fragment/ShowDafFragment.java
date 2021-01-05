package com.example.myapp.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.model.Daf;
import com.example.myapp.R;

import java.util.Objects;


public class ShowDafFragment extends Fragment {

    private static final String KEY_DAF_TO_SHOW = "KEY_DAF_TO_SHOW";
    private Daf mDafToShow;
    private LinearLayout linearLayoutButtons;

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
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_show_daf, container, false);
    }

//    private void initViews() {
//        linearLayoutButtons = Objects.requireNonNull(getActivity()).findViewById(R.id.typeOfStudy_buttons_LL);
//        linearLayoutButtons.setVisibility(View.GONE);
//    }
}