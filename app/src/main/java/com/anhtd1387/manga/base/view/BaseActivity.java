package com.anhtd1387.manga.base.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by Anhtd on 6/17/2016.
 */
public abstract class BaseActivity extends AbstractActivity {

    protected abstract ToolbarType getToolbarType();
    protected abstract int getLayoutInflate();
    protected abstract void getExtraData(Intent intent);
    protected abstract void initilize();
    protected abstract void initView();
    protected abstract void onViewCreated();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLayoutInflater().inflate(getLayoutInflate(),contentLayout);
        initilize();
        initView();
        onViewCreated();
    }


}
