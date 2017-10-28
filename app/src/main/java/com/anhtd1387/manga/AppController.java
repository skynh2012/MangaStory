package com.anhtd1387.manga;

import android.app.Application;

import com.anhtd1387.manga.datastore.DataStoreManager;

/**
 * Created by Administrator on 09/10/2017.
 */

public class AppController extends Application {

    private static AppController instance;

    public static AppController getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        DataStoreManager.init(getApplicationContext());
    }
}
