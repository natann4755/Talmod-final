package com.example.myapp.utils;

public class ConvertNamesToEnglish {

//    {
//        "name" : "זרעים",
//            "masechtot":
//                [
//        {
//            "masechet": "ברכות",
//                "masechetEName": "Berakhot",
//                "pages" : 63
//        }
//
//                ]
//    },
//
//
//    {
//        "name" : "מועד",
//            "masechtot":
//                [
//        {
//            "masechet": "שבת",
//                "masechetEName": "Shabbat",
//                "pages" : 156
//        },
//        {
//            "masechet": "עירובין",
//                "masechetEName": "Eruvin",
//                "pages" : 104
//        },
//        {
//            "masechet": "פסחים",
//                "masechetEName": "Pesachim",
//                "pages" : 120
//        },
//        {
//            "masechet": "שקלים",
//                "masechetEName": "Shekalim",
//                "pages" : 21
//        },
//        {
//            "masechet": "ראש השנה",
//                "masechetEName": "Rosh_Hashanah",
//                "pages" : 34
//        },
//        {
//            "masechet": "יומא",
//                "masechetEName": "Yoma",
//                "pages" : 87
//        },
//        {
//            "masechet": "סוכה",
//                "masechetEName": "Sukkah",
//                "pages" : 55
//        },
//        {
//            "masechet": "ביצה",
//                "masechetEName": "Beitzah",
//                "pages" : 39
//        },
//        {
//            "masechet": "תענית",
//                "masechetEName": "Taanit",
//                "pages" : 30
//        },
//        {
//            "masechet": "מגילה",
//                "masechetEName": "Megillah",
//                "pages" : 31
//        },
//        {
//            "masechet": "מועד קטן",
//                "masechetEName": "Moed_Katan",
//                "pages" : 28
//        },
//        {
//            "masechet": "חגיגה",
//                "masechetEName": "Chagigah",
//                "pages" : 26
//        }
//
//               ]
//
//    },
//
//    {
//        "name" : "נשים",
//            "masechtot":
//                [
//        {
//            "masechet": "יבמות",
//                "masechetEName": "Yevamot",
//                "pages" : 121
//        },
//        {
//            "masechet": "כתובות",
//                "masechetEName": "Ketubot",
//                "pages" : 111
//        },
//        {
//            "masechet": "נדרים",
//                "masechetEName": "Nedarim",
//                "pages" : 90
//        },
//        {
//            "masechet": "נזיר",
//                "masechetEName": "Nazir",
//                "pages" : 65
//        },
//        {
//            "masechet": "סוטה",
//                "masechetEName": "Sotah",
//                "pages" : 48
//        },
//        {
//            "masechet": "גיטין",
//                "masechetEName": "Gittin",
//                "pages" : 89
//        },
//        {
//            "masechet": "קידושין",
//                "masechetEName": "Kiddushin",
//                "pages" : 81
//        }
//
//               ]
//
//    },
//
//    {
//        "name" : "נזיקין",
//            "masechtot":
//                [
//        {
//            "masechet": "בבא קמא",
//                "masechetEName": "Bava_Kamma",
//                "pages" : 118
//        },
//        {
//            "masechet": "בבא מציעא",
//                "masechetEName": "Bava_Metzia",
//                "pages" : 118
//        },
//        {
//            "masechet": "בבא בתרא",
//                "masechetEName": "Bava_Batra",
//                "pages" : 175
//        },
//        {
//            "masechet": "סנהדרין",
//                "masechetEName": "Sanhedrin",
//                "pages" : 112
//        },
//        {
//            "masechet": "מכות",
//                "masechetEName": "Makkot",
//                "pages" : 23
//        },
//        {
//            "masechet": "שבועות",
//                "masechetEName": "Shevuot",
//                "pages" : 48
//        },
//        {
//            "masechet": "עבודה זרה",
//                "masechetEName": "Avodah_Zarah",
//                "pages" : 75
//        },
//        {
//            "masechet": "הוריות",
//                "masechetEName": "Horayot",
//                "pages" : 13
//        }
//
//               ]
//
//    },
//
//    {
//        "name" : "קדשים",
//            "masechtot":
//                [
//        {
//            "masechet": "זבחים",
//                "masechetEName": "Zevachim",
//                "pages" : 119
//        },
//        {
//            "masechet": "מנחות",
//                "masechetEName": "Menachot",
//                "pages" : 109
//        },
//        {
//            "masechet": "חולין",
//                "masechetEName": "Chullin",
//                "pages" : 141
//        },
//        {
//            "masechet": "בכורות",
//                "masechetEName": "Bekhorot",
//                "pages" : 60
//        },
//        {
//            "masechet": "ערכין",
//                "masechetEName": "Arakhin",
//                "pages" : 33
//        },
//        {
//            "masechet": "תמורה",
//                "masechetEName": "Temurah",
//                "pages" : 33
//        },
//        {
//            "masechet": "כריתות",
//                "masechetEName": "Keritot",
//                "pages" : 27
//        },
//        {
//            "masechet": "מעילה",
//                "masechetEName": "Meilah",
//                "pages" : 20
//        },
//        {
//            "masechet": "קינים",
//                "masechetEName": "Kinnim",
//                "pages" : 3
//        },
//        {
//            "masechet": "תמיד",
//                "masechetEName": "Tamid",
//                "pages" : 9
//        },
//        {
//            "masechet": "מידות",
//                "masechetEName": "Middot",
//                "pages" : 4
//        }
//
//               ]
//
//    },
//
//    {
//        "name" : "טהרות",
//            "masechtot":
//                [
//        {
//            "masechet": "נדה",
//                "masechetEName": "Niddah",
//                "pages" : 72
//        }
//
//                ]
//
//    }


}
