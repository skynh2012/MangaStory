package com.anhtd1387.manga.view.activity;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.anhtd1387.manga.R;
import com.anhtd1387.manga.base.view.BaseActivity;
import com.anhtd1387.manga.configs.Config;
import com.anhtd1387.manga.datastore.DataStoreManager;
import com.anhtd1387.manga.model.MenuLeft;
import com.anhtd1387.manga.util.AppUtil;
import com.anhtd1387.manga.view.adapter.MenuLeftAdapter;
import com.anhtd1387.manga.view.fragment.AboutFragment;
import com.anhtd1387.manga.view.fragment.AllBookFragment;
import com.anhtd1387.manga.view.fragment.CategoryFragment;
import com.anhtd1387.manga.view.fragment.FeedbackFragment;
import com.anhtd1387.manga.view.fragment.HomeFragment;
import com.anhtd1387.manga.view.fragment.MoreAppFragment;
import com.anhtd1387.manga.view.fragment.SettingFragment;

import java.util.ArrayList;


public class HomeActivity extends BaseActivity {

    private DrawerLayout drawer;
    private Fragment mCurrenFragment;
    private ListView mLvMenu;
    private ArrayList<MenuLeft> mArrMenu;
    private Integer[] arrImageMenu;
    private Bundle bundle;
    private int mIndex = 0;
    private MenuLeftAdapter mMenuLeftAdapter;
    private boolean checkSelectMenuLeft = true;
    private RelativeLayout layoutMenuLeft;
    private Menu menu;
    public MenuItem itemListOrGrid;

    @Override
    protected ToolbarType getToolbarType() {
        return ToolbarType.MENU_LEFT;
    }

    @Override
    protected int getLayoutInflate() {
        return R.layout.activity_home;
    }

    @Override
    protected void getExtraData(Intent intent) {

    }

    @Override
    protected void initilize() {
        initNavigationView();
        initMenuLeft();
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void onViewCreated() {
        mCurrenFragment = HomeFragment.newInstance();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.content, mCurrenFragment, "FRAGMENT_" + MenuLeft.FRAGMENT_HOME)
                .commit();
    }

    private void initNavigationView() {
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

    }

    public void initMenuLeft() {
        layoutMenuLeft = (RelativeLayout) findViewById(R.id.layoutMenuLeft);
        mLvMenu = (ListView) findViewById(R.id.lvMenu);
        initMenu();
        mLvMenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mIndex = position;
                switchScreen(mArrMenu.get(position).getId());
                if (checkSelectMenuLeft) setSelectedItemMenu(position);
                mMenuLeftAdapter.notifyDataSetChanged();
            }
        });
    }
    private void setSelectedItemMenu(int position) {
        if (mArrMenu != null && mArrMenu.size() > 0) {
            for (int i = 0; i < mArrMenu.size(); i++) {
                if (i == position) {
                    mArrMenu.get(i).setSelected(true);
                } else {
                    mArrMenu.get(i).setSelected(false);
                }
            }
        }
    }

    public void initMenu() {

        arrImageMenu = new Integer[]{R.drawable.ic_menu_home_black, R.drawable.ic_menu_select_all_black,
                R.drawable.ic_menu_category_black,
                R.drawable.ic_menu_history_black, R.drawable.ic_menu_bookmark_black,
                R.drawable.ic_menu_settings_black, R.drawable.ic_menu_feedback_black,
                R.drawable.ic_menu_more_black, R.drawable.ic_menu_info_black};

        mArrMenu = new ArrayList<>();
        mArrMenu.add(new MenuLeft(MenuLeft.FRAGMENT_HOME, getString(R.string.home), false));
        mArrMenu.add(new MenuLeft(MenuLeft.FRAGMENT_ALL_CONTENT, getString(R.string.all_book), false));
        mArrMenu.add(new MenuLeft(MenuLeft.FRAGMENT_CATEGORY, getString(R.string.category), false));
        mArrMenu.add(new MenuLeft(MenuLeft.FRAGMENT_HISTORY, getString(R.string.histories), false));
        mArrMenu.add(new MenuLeft(MenuLeft.FRAGMENT_BOOKMARK, getString(R.string.bookmarks), false));
        mArrMenu.add(new MenuLeft(MenuLeft.FRAGMENT_SETTING, getString(R.string.settings), false));
        mArrMenu.add(new MenuLeft(MenuLeft.FRAGMENT_FEEDBACK, getString(R.string.feedback), false));
        mArrMenu.add(new MenuLeft(MenuLeft.FRAGMENT_MORE_APP, getString(R.string.more_apps), false));
        mArrMenu.add(new MenuLeft(MenuLeft.FRAGMENT_ABOUT, getString(R.string.about), false));

        mArrMenu.get(mIndex).setSelected(true);
        mMenuLeftAdapter = new MenuLeftAdapter((HomeActivity) self, mArrMenu, arrImageMenu);
        mLvMenu.setAdapter(mMenuLeftAdapter);
    }

    private void switchScreen(int values) {
        bundle = new Bundle();
        String tag = "FRAGMENT_" + values;
        switch (values) {
            case MenuLeft.FRAGMENT_HOME:
                checkSelectMenuLeft = true;
                mCurrenFragment = HomeFragment.newInstance();
                break;
            case MenuLeft.FRAGMENT_ALL_CONTENT:
                checkSelectMenuLeft = true;
                mCurrenFragment = AllBookFragment.newInstance();
                break;
            case MenuLeft.FRAGMENT_CATEGORY:
                checkSelectMenuLeft = true;
                mCurrenFragment = CategoryFragment.newInstance();
                break;
            case MenuLeft.FRAGMENT_HISTORY:
                checkSelectMenuLeft = true;
                mCurrenFragment = AllBookFragment.newInstance();
                break;
            case MenuLeft.FRAGMENT_BOOKMARK:
                checkSelectMenuLeft = true;
                mCurrenFragment = AllBookFragment.newInstance();
                break;
            case MenuLeft.FRAGMENT_SETTING:
                checkSelectMenuLeft = true;
                mCurrenFragment = SettingFragment.newInstance();
                break;
            case MenuLeft.FRAGMENT_FEEDBACK:
                checkSelectMenuLeft = true;
                mCurrenFragment = FeedbackFragment.newInstance();
                break;
            case MenuLeft.FRAGMENT_ABOUT:
                checkSelectMenuLeft = true;
                mCurrenFragment = AboutFragment.newInstance();
                break;
            case MenuLeft.FRAGMENT_MORE_APP:
                checkSelectMenuLeft = true;
                mCurrenFragment = MoreAppFragment.newInstance();
                break;

        }
        if (checkSelectMenuLeft) {
            mCurrenFragment.setArguments(bundle);
            if (!tag.equals(getSupportFragmentManager().findFragmentById(R.id.content).getTag())) {
                getSupportFragmentManager().beginTransaction()
                        .setCustomAnimations(R.anim.translate_left_in,
                                R.anim.translate_right_out,
                                R.anim.translate_pop_in,
                                R.anim.translate_pop_out)
                        .replace(R.id.content, mCurrenFragment, tag)
                        .commit();
            }
        }
        drawer.closeDrawer(GravityCompat.START);
        AppUtil.hideSoftKeyboard(this);
    }

    public void initTootlbarNavi(boolean values) {
        if (values) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onBackPressed();
                }
            });
        } else {
            getSupportActionBar().setDisplayHomeAsUpEnabled(false);
            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    drawer.openDrawer(GravityCompat.START);
                }
            });
            initNavigationView();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.main, menu);
        this.menu = menu;
        ((HomeActivity) self).showIconToolbar(R.id.action_search2, R.id.action_list_or_grid);
        return true;
    }

    public void showIconToolbar(Integer... id) {

        if (menu != null) {
            MenuItem itemBookMarks = menu.findItem(R.id.action_bookmarks);
            MenuItem itemSearch = menu.findItem(R.id.action_search2);
            MenuItem itemClearHistory = menu.findItem(R.id.action_clear_history);
            itemListOrGrid = menu.findItem(R.id.action_list_or_grid);
            itemBookMarks.setVisible(false);
            itemSearch.setVisible(false);
            itemClearHistory.setVisible(false);
            itemListOrGrid.setVisible(false);
            if (Config.TYPE_GRID == DataStoreManager.getListType().getId()) {
                itemListOrGrid.setIcon(R.drawable.ic_list);
            } else {
                itemListOrGrid.setIcon(R.drawable.ic_grid);
            }
            for (int i = 0; i < id.length; i++) {
                switch (id[i]) {
                    case R.id.action_bookmarks:
                        itemBookMarks.setVisible(true);
                        break;
                    case R.id.action_search2:
                        itemSearch.setVisible(true);
                        break;
                    case R.id.action_clear_history:
                        itemClearHistory.setVisible(true);
                        break;
                    case R.id.action_list_or_grid:
                        itemListOrGrid.setVisible(true);
                        break;
                }
            }
        }
    }
}
