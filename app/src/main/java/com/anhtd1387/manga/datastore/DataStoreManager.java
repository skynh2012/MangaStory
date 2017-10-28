package com.anhtd1387.manga.datastore;

import android.content.Context;

import com.anhtd1387.manga.datastore.db.DbConnection;
import com.anhtd1387.manga.model.ListType;
import com.google.gson.Gson;

/**
 * Created by Anhtd on 10/11/2017.
 */
public class DataStoreManager {

    // ============== User ============================
    private static final String PREF_USER = "PREF_USER";
    private static final String PREF_TOKEN_USER = "PREF_TOKEN_USER";
    public static final String CHECK_FIRST_INSTALL_APP = "CHECK_FIRST_INSTALL_APP";
    public static final String PREF_THEME = "PREF_THEME";
    public static final String PREF_LIST_TYPE = "PREF_LIST_TYPE";
    public static final String PREF_TYPE_BACKGROUND_APP = "PREF_TYPE_BACKGROUND_APP";
    public static final String PREF_LANGUAGE = "PREF_LANGUAGE";


    private static DataStoreManager instance;
    private MySharedPreferences sharedPreferences;
    private DbConnection dbConnection;

    /**
     * Call when start application
     */
    public static void init(Context context) {
        instance = new DataStoreManager();
        instance.sharedPreferences = new MySharedPreferences(context);
        instance.dbConnection = new DbConnection(context);
    }

    public static DataStoreManager getInstance() {
        if (instance != null) {
            return instance;
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }

    /**
     * save and get user
     */
    /*public static void saveUser(User user) {
        if (user != null) {
            String jsonUser = user.toJSon();
            DataStoreManager.getInstance().sharedPreferences.putStringValue(PREF_USER, jsonUser);
        }
    }*/

    public static void removeUser() {
        DataStoreManager.getInstance().sharedPreferences.putStringValue(PREF_USER, null);
    }

    /*public static User getUser() {
        String jsonUser = DataStoreManager.getInstance().sharedPreferences.getStringValue(PREF_USER);
        User user = new Gson().fromJson(jsonUser, User.class);
        return user;
    }*/

    /**
     * save and get user's token
     */
    public static void saveToken(String token) {
        DataStoreManager.getInstance().sharedPreferences.putStringValue(PREF_TOKEN_USER, token);
    }

    public static String getToken() {
        return DataStoreManager.getInstance().sharedPreferences.getStringValue(PREF_TOKEN_USER);
    }

    /**
     * save and get caching time
     */
   /* public static String getCaching(String request) {
        return DataStoreManager.getInstance().dbConnection.getCaching(StringUtil.getAction(request));
    }

    public static void saveCaching(String url, String objectRoot, String timeCaching) {
        DataStoreManager.getInstance().dbConnection.saveCaching(StringUtil.getAction(url), objectRoot, timeCaching);
    }*/

    /*public static void addBook(Book book, String key) {
        List<Book> listBookHistory = getListBook(key);
        for (int i = 0; i < listBookHistory.size(); i++) {
            if (book.getId().equals(listBookHistory.get(i).getId())) {
                listBookHistory.remove(i);
                break;
            }
        }
        listBookHistory.add(0, book);
        DataStoreManager.getInstance().sharedPreferences.putStringValue(key, new Gson().toJson(listBookHistory));
    }*/

    /*public static void deleteBook(Book book, String key) {
        List<Book> listBookHistory = getListBook(key);
        for (int i = 0; i < listBookHistory.size(); i++) {
            if (book.getId().equals(listBookHistory.get(i).getId())) {
                listBookHistory.remove(i);
                break;
            }
        }
        DataStoreManager.getInstance().sharedPreferences.putStringValue(key, new Gson().toJson(listBookHistory));
    }*/

   /* public static boolean isBookMarks(String id, String key) {
        List<Book> listBookHistory = getListBook(key);
        if (listBookHistory != null && listBookHistory.size() > 0) {
            for (int i = 0; i < listBookHistory.size(); i++) {
                if (id != null && id.equals(listBookHistory.get(i).getId())) {
                    return true;
                }
            }
        }
        return false;
    }*/


    /*public static List<Book> getListBook(String key) {
        String jsonListBook = DataStoreManager.getInstance().sharedPreferences.getStringValue(key, "");
        List<Book> listBook;
        if (!jsonListBook.isEmpty()) {
            listBook = new Gson().fromJson(jsonListBook, new TypeToken<ArrayList<Book>>() {
            }.getType());
        } else {
            listBook = new ArrayList<>();
        }
        return listBook;
    }*/

    public static void clearBook(String key) {
        DataStoreManager.getInstance().sharedPreferences.putStringValue(key, "");
    }

    public static void putInt(String key, int values) {
        DataStoreManager.getInstance().sharedPreferences.putIntValue(key, values);
    }

    public static int getInt(String key, int defaultValues) {
        return DataStoreManager.getInstance().sharedPreferences.getIntValue(key, defaultValues);
    }

    public static boolean getBoolean(String key) {
        return DataStoreManager.getInstance().sharedPreferences.getBooleanValue(key);
    }

    public static void putBoolean(String key, boolean values) {
        DataStoreManager.getInstance().sharedPreferences.putBooleanValue(key, values);
    }

    // Setting

    public static final String Key_SETTING_TEXT_SIZE = "Key_SETTING_TEXT_SIZE";

    public static int getSettingTextSize() {
        return DataStoreManager.getInt(Key_SETTING_TEXT_SIZE, 12);
    }

    public static void setSettingTextSize(int textSize) {
        DataStoreManager.putInt(Key_SETTING_TEXT_SIZE, textSize);
    }


    public static final String KEY_SETTING_SCREEN_ON = "KEY_SETTING_SCREEN_ON";

    public static boolean getSettingScreenOn() {
        return DataStoreManager.getBoolean(KEY_SETTING_SCREEN_ON);
    }

    public static void setSettingScreenOn(boolean screenOn) {
        DataStoreManager.putBoolean(KEY_SETTING_SCREEN_ON, screenOn);
    }

    /*// SQLite
    public static void saveIndexChapter(Context context, Chapter model, String index) {
        ChapterDao instance = ChapterDao.getInstance(context);
        boolean creat = instance.update(model, index);
        Log.e("updete : ", "" + creat + "  -  " + index);
    }*/

   /* public static String getIndexChapter(Context context, Chapter model) {
        ChapterDao instance = ChapterDao.getInstance(context);
        String index = instance.getIndex(model);
        Log.e("index : ", "" + index);
        return index;
    }*/

    /**
     * save first install
     */
    public static void saveFirstInstall(boolean isFirstInstall) {
        DataStoreManager.getInstance().sharedPreferences.putBooleanValue(CHECK_FIRST_INSTALL_APP, isFirstInstall);
    }

    /**
     * get firt install
     */
    public static boolean getFirstInstall() {
        return DataStoreManager.getInstance().sharedPreferences.getBooleanValue(CHECK_FIRST_INSTALL_APP);
    }

    /**
     * save Theme to sharePreferences
     */
   /* public static void saveTheme(Theme theme) {
        if (theme != null) {
            String jsonTheme = theme.toJSon();
            DataStoreManager.getInstance().sharedPreferences.putStringValue(PREF_THEME, jsonTheme);
        }
    }*/

    /**
     * get Theme from sharePreferences
     */
    /*public static Theme getTheme() {
        String jsonTheme = DataStoreManager.getInstance().sharedPreferences.getStringValue(PREF_THEME);
        Theme theme = new Gson().fromJson(jsonTheme, Theme.class);
        return theme;
    }*/

    /**
     * save list type to sharePreferences
     */
    public static void saveListType(ListType listType) {
        if (listType != null) {
            String jsonListType = listType.toJSon();
            DataStoreManager.getInstance().sharedPreferences.putStringValue(PREF_LIST_TYPE, jsonListType);
        }
    }

    /**
     * get list type from sharePreferences
     */
    public static ListType getListType() {
        String jsonListType = DataStoreManager.getInstance().sharedPreferences.getStringValue(PREF_LIST_TYPE);
        ListType listType = new Gson().fromJson(jsonListType, ListType.class);
        return listType;
    }

    /**
     * save type background app to sharePreferences
     */
    public static void saveTypeBackgroundApp(String type) {
        DataStoreManager.getInstance().sharedPreferences.putStringValue(PREF_TYPE_BACKGROUND_APP, type);
    }

    /**
     * get type background app from sharePreferences
     */
    public static String getTypeBackgroundApp() {
       return DataStoreManager.getInstance().sharedPreferences.getStringValue(PREF_TYPE_BACKGROUND_APP);
    }

    /**
     * save language app to sharePreferences
     */
    /*public static void saveLanguage(Language language) {
        if (language != null) {
            String jsonLanguage = language.toJSon();
            DataStoreManager.getInstance().sharedPreferences.putStringValue(PREF_LANGUAGE, jsonLanguage);
        }
    }*/

    /**
     * get language app from sharePreferences
     */
   /* public static Language getLanguage() {
        String jsonLanguage = DataStoreManager.getInstance().sharedPreferences.getStringValue(PREF_LANGUAGE);
        Language language = new Gson().fromJson(jsonLanguage, Language.class);
        return language;
    }*/
}
