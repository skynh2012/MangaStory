package com.anhtd1387.manga.view.fragment;

import android.os.Bundle;
import android.view.View;

import com.anhtd1387.manga.R;
import com.anhtd1387.manga.base.view.BaseFragment;

public class MoreAppFragment extends BaseFragment {

    @Override
    protected int getLayoutInflate() {
        return R.layout.fragment_more_app;
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
    public static MoreAppFragment newInstance() {
        MoreAppFragment fragment = new MoreAppFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);

        return fragment;
    }
}
