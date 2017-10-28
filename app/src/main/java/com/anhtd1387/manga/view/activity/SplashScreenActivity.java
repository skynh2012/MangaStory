package com.anhtd1387.manga.view.activity;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.anhtd1387.manga.R;
import com.anhtd1387.manga.configs.DefaultConfig;
import com.anhtd1387.manga.datastore.DataStoreManager;
import com.anhtd1387.manga.util.AppUtil;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        checkFirstSettingApp();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                AppUtil.startActivityLTR(SplashScreenActivity.this, HomeActivity.class);
                finish();
            }
        }, 2000);
    }

    private void checkFirstSettingApp() {
        if (!DataStoreManager.getFirstInstall()) {
            DataStoreManager.saveFirstInstall(true);
            //DataStoreManager.saveTheme(DefaultConfig.getThemeDefault(this));
            DataStoreManager.saveListType(DefaultConfig.listType);
            //DataStoreManager.saveTypeBackgroundApp(DefaultConfig.backgroundDefault);
            //DataStoreManager.saveLanguage(DefaultConfig.getLanguageDefault(this));
        }
    }
}
