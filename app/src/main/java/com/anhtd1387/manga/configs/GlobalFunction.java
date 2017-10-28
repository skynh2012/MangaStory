package com.anhtd1387.manga.configs;

import android.content.Context;
import android.util.Log;

public class GlobalFunction {

    /*public static InterstitialAd mInterstitialAd;

    public static void addCountReadBook(final Context context, String bookId) {
        RequestManager.countReadBook(context, Constant.TYPE_ACTION_READ, bookId, new ApiManager.CompleteListener() {
            @Override
            public void onSuccess(ApiResponse response) {
                Log.d("Add Count", "Add count readbook success");
            }

            @Override
            public void onError(String message) {
                AppUtil.showToast(context, message);
            }
        });
    }

    public static void initInterstitialAdmob(Context context) {
        mInterstitialAd = new InterstitialAd(context);
        mInterstitialAd.setAdUnitId(context.getString(R.string.google_admob_interstitial));
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                // Load the next interstitial.
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }

        });
    }

    public static void showInterstitialAdmob() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            Log.d("TAG", "The interstitial wasn't loaded yet.");
        }
    }*/
}
