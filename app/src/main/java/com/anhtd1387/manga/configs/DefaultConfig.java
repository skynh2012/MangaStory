package com.anhtd1387.manga.configs;

import com.anhtd1387.manga.model.ListType;


public class DefaultConfig {

    //Language default
   /* public static Language getLanguageDefault(Context context) {
        return Config.getListLanguage(context).get(0);
    }*/

    //Theme default
   /* public static Theme getThemeDefault(Context context) {
        return Config.getListTheme(context).get(0);
    }*/

    // List type default
    public static ListType listType = new ListType(Config.TYPE_GRID, Config.TYPE_GRID_NAME);

    // Background defaul
    //public static String backgroundDefault = Config.TYPE_BACKGROUND_LIGHT;
}
