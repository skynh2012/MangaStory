package com.anhtd1387.manga.view.fragment;


import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.anhtd1387.manga.R;
import com.anhtd1387.manga.base.view.BaseFragment;
import com.anhtd1387.manga.configs.Constant;

public class HomeFragment extends BaseFragment {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private Fragment mCurrenFragment1, mCurrenFragment2, mCurrenFragment3;
    @Override
    protected int getLayoutInflate() {
        return R.layout.fragment_home;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void initView(View view) {
        tabLayout = (TabLayout) view.findViewById(R.id.tab_layout);
        tabLayout.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        viewPager = (ViewPager) view.findViewById(R.id.view_pagger);
        viewPager.setAdapter(new TabViewPaggerAdapter(getChildFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);
        viewPager.setCurrentItem(1);
        viewPager.setOffscreenPageLimit(3);
    }

    @Override
    protected void getData() {

    }

    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);

        return fragment;
    }

    private class TabViewPaggerAdapter extends FragmentPagerAdapter {

        String[] titles = getResources().getStringArray(R.array.tabs);

        public TabViewPaggerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Bundle bundle = new Bundle();
            switch (position){
                case 0:
                    bundle.putInt(Constant.OPTIONS_FRAGMENT_LIST_BOOK, Constant.MENU_LEFT_NEW_BOOK);
                    bundle.putString(Constant.KEY_TITLE_TOOLBAR, getString(R.string.lastest));
                    mCurrenFragment1 = AllBookFragment.newInstance();
                    mCurrenFragment1.setArguments(bundle);
                    return mCurrenFragment1;
                case 1:
                    bundle.putInt(Constant.OPTIONS_FRAGMENT_LIST_BOOK, Constant.MENU_LEFT_TOP_BOOK);
                    bundle.putString(Constant.KEY_TITLE_TOOLBAR, getString(R.string.most_viewed));
                    mCurrenFragment2 = AllBookFragment.newInstance();
                    mCurrenFragment2.setArguments(bundle);
                    return mCurrenFragment2;
                case 2:
                    bundle.putInt(Constant.OPTIONS_FRAGMENT_LIST_BOOK, Constant.MENU_LEFT_POPULAR);
                    bundle.putString(Constant.KEY_TITLE_TOOLBAR, getString(R.string.home));
                    mCurrenFragment3 = AllBookFragment.newInstance();
                    mCurrenFragment3.setArguments(bundle);
                    return mCurrenFragment3;
            }
            return null;
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return titles[position];
        }
    }


}
