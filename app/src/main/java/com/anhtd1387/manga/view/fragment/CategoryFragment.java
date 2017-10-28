package com.anhtd1387.manga.view.fragment;

import android.os.Bundle;
import android.view.View;

import com.anhtd1387.manga.R;
import com.anhtd1387.manga.base.view.BaseFragment;

public class CategoryFragment extends BaseFragment {

    @Override
    protected int getLayoutInflate() {
        return R.layout.fragment_category;
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
    public static CategoryFragment newInstance() {
        CategoryFragment fragment = new CategoryFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);

        return fragment;
    }
}
