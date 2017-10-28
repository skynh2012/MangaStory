package com.anhtd1387.manga.configs;

/**
 * Created by Anhtd on 10/11/2017.
 */
public class Constant {


    public class Caching {
        public static final String KEY_REQUEST = "request";
        public static final String KEY_RESPONSE = "response";
        public static final String KEY_TIME_UPDATED = "time_updated";
        public static final String CACHING_PARAMS_TIME_REQUEST = "caching_time_request";
    }

    // key model
    public static final String KEY_BOOK = "KEY_BOOK";
    public static final String KEY_OPEN_LAST_CHAPTER = "KEY_OPEN_LAST_CHAPTER";
    public static final String KEY_CATEGORY = "KEY_CATEGORY";
    public static final String KEY_CHAPTER = "KEY_CHAPTER";
    public static final String KEY_SEARCH = "KEY_SEARCH";
    public static final String KEY_TITLE_TOOLBAR = "KEY_TITLE_TOOLBAR";

    // key sharedPreferences
    public static final String LIST_BOOK_HISTORY = "LIST_BOOK_HISTORY";
    public static final String LIST_BOOK_MARKS = "LIST_BOOK_MARKS";

    // key folder sdcard
    public static final String FOLDER_EBOOK = "/ebook/";
    public static final String FOLDER_PDF = FOLDER_EBOOK + "pdf/";
    public static final String FOLDER_EPUB = FOLDER_EBOOK + "epub/";

    // tag fragment
    public static final String FRAGMENT_DETAILS_BOOK = "FRAGMENT_DETAILS_BOOK";
    public static final String FRAGMENT_CHAPTER = "FRAGMENT_CHAPTER";
    public static final String FRAGMENT_DETAILS_CATEGORY = "FRAGMENT_DETAILS_CATEGORY";
    public static final String FRAGMENT_SEARCH = "FRAGMENT_SEARCH";
    public static final String FRAGMENT_DETAILS_CHAPTER = "FRAGMENT_DETAILS_CHAPTER";
    public static final String FRAGMENT_COMENT = "FRAGMENT_COMENT";

    public static final String OPTIONS_FRAGMENT_LIST_BOOK = "OPTIONS_FRAGMENT_LIST_BOOK";
    public static final int MENU_LEFT_HOME = 1;
    public static final int MENU_LEFT_CATEGORY = 2;
    public static final int MENU_LEFT_LASTTEST = 3;
    public static final int MENU_LEFT_MOST_VIEW = 4;
    public static final int MENU_LEFT_ALL_BOOK = 5;
    public static final int MENU_LEFT_HISTORY = 6;
    public static final int MENU_LEFT_BOOKMARKS = 7;
    public static final int SEARCH_BOOK = 8;
    public static final int MENU_LEFT_TOP_BOOK = 9;
    public static final int MENU_LEFT_NEW_BOOK = 10;
    public static final int MENU_LEFT_POPULAR = 11;

    public static final String STATUS_BOOK_HOT = "0";
    public static final String STATUS_BOOK_NEW = "1";
    public static final String STATUS_BOOK_MOST = "2";

    public static final String TYPE_ALL = "all";
    public static final String TYPE_ACTION_READ = "read";

    public static final String LISTEN_CHANGE_THEME = "listenChangeTheme";
}
