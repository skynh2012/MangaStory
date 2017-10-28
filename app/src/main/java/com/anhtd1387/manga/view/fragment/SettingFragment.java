package com.anhtd1387.manga.view.fragment;

import android.os.Bundle;
import android.view.View;

import com.anhtd1387.manga.R;
import com.anhtd1387.manga.base.view.BaseFragment;

public class SettingFragment extends BaseFragment {

    @Override
    protected int getLayoutInflate() {
        return R.layout.fragment_setting;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void initView(View view) {

    }

    @Override
    protected void getData() {

    }
    public static SettingFragment newInstance() {
        SettingFragment fragment = new SettingFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);

        return fragment;
    }
}
