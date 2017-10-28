package com.anhtd1387.manga.view.fragment;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.anhtd1387.manga.R;
import com.anhtd1387.manga.base.view.BaseFragment;
import com.anhtd1387.manga.configs.Config;
import com.anhtd1387.manga.configs.Constant;
import com.anhtd1387.manga.datastore.DataStoreManager;
import com.anhtd1387.manga.model.Book;
import com.anhtd1387.manga.view.adapter.BookAdapter;

import java.util.ArrayList;
import java.util.List;

public class AllBookFragment extends BaseFragment {
    private Bundle bundle;
    private RecyclerView rcvData;
    private BookAdapter mAdapter;
    private ArrayList<Book> mBook = new ArrayList<>();

    @Override
    protected int getLayoutInflate() {
        return R.layout.fragment_all_book;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void initView(View view) {
        rcvData = (RecyclerView) view.findViewById(R.id.rcv_data);
        setUpRecycleView();
    }

    @Override
    protected void getData() {
        if (bundle == null) {
            bundle = getArguments();
        }
        switch (bundle.getInt(Constant.OPTIONS_FRAGMENT_LIST_BOOK)) {
            case Constant.MENU_LEFT_NEW_BOOK:
                faceNewBook();
                break;

            case Constant.MENU_LEFT_TOP_BOOK:
                faceTopBook();
                break;
            case Constant.MENU_LEFT_POPULAR:
                facePopular();
                break;
        }
    }

    public static AllBookFragment newInstance() {
        AllBookFragment fragment = new AllBookFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);

        return fragment;
    }

    private void setUpRecycleView() {
        mAdapter = new BookAdapter(self, mBook, DataStoreManager.getListType().getId());

        if (Config.TYPE_GRID == DataStoreManager.getListType().getId()) {
            rcvData.setLayoutManager(new GridLayoutManager(self, Config.TYPE_NUMBER_COLUMN_GRID_BOOK));
        } else {
            rcvData.setLayoutManager(new LinearLayoutManager(self));
        }

        rcvData.setAdapter(mAdapter);
    }

    private void faceNewBook() {
        Book book;

        book = new Book();
        book.setId("1");
        book.setTitle("LƯU LUYẾN TINH DIỆU");
        book.setAuthor("Đang cập nhật");
        book.setImage("http://st.nettruyen.com/Data/Comics/72/luu-luyen-tinh-dieu.jpg");
        book.setDescription("2131");
        book.setStatus("");
        book.setCategoryId("ID");
        mBook.add(book);


        book = new Book();
        book.setId("2");
        book.setTitle("HẮN TA LÀ VUA");
        book.setAuthor("Đang cập nhật");
        book.setImage("http://st.nettruyen.com/Data/Comics/48/han-ta-la-vua.jpg");
        book.setDescription("2131");
        book.setStatus("");
        book.setCategoryId("ID");
        mBook.add(book);

        book = new Book();
        book.setId("3");
        book.setTitle("HENYOKU NO LABYRINTH");
        book.setAuthor("Đang cập nhật");
        book.setImage("http://st.nettruyen.com/Data/Comics/139/henyoku-no-labyrinth.jpg");
        book.setDescription("2131");
        book.setStatus("");
        book.setCategoryId("ID");
        mBook.add(book);

        book = new Book();
        book.setId("1");
        book.setTitle("JUDGE");
        book.setAuthor("Đang cập nhật");
        book.setImage("http://st.nettruyen.com/Data/Comics/138/judge.jpg");
        book.setDescription("2131");
        book.setStatus("");
        book.setCategoryId("ID");
        mBook.add(book);

        mAdapter.notifyDataSetChanged();
    }

    private void faceTopBook() {
        Book book;


        book = new Book();
        book.setId("2");
        book.setTitle("HẮN TA LÀ VUA");
        book.setAuthor("Đang cập nhật");
        book.setImage("http://st.nettruyen.com/Data/Comics/48/han-ta-la-vua.jpg");
        book.setDescription("2131");
        book.setStatus("");
        book.setCategoryId("ID");
        mBook.add(book);

        book = new Book();
        book.setId("3");
        book.setTitle("HENYOKU NO LABYRINTH");
        book.setAuthor("Đang cập nhật");
        book.setImage("http://st.nettruyen.com/Data/Comics/139/henyoku-no-labyrinth.jpg");
        book.setDescription("2131");
        book.setStatus("");
        book.setCategoryId("ID");
        mBook.add(book);

        book = new Book();
        book.setId("1");
        book.setTitle("JUDGE");
        book.setAuthor("Đang cập nhật");
        book.setImage("http://st.nettruyen.com/Data/Comics/138/judge.jpg");
        book.setDescription("2131");
        book.setStatus("");
        book.setCategoryId("ID");
        mBook.add(book);

        mAdapter.notifyDataSetChanged();
    }

    private void facePopular() {
        Book book;

        book = new Book();
        book.setId("1");
        book.setTitle("LƯU LUYẾN TINH DIỆU");
        book.setAuthor("Đang cập nhật");
        book.setImage("http://st.nettruyen.com/Data/Comics/72/luu-luyen-tinh-dieu.jpg");
        book.setDescription("2131");
        book.setStatus("");
        book.setCategoryId("ID");
        mBook.add(book);

        book = new Book();
        book.setId("2");
        book.setTitle("HẮN TA LÀ VUA");
        book.setAuthor("Đang cập nhật");
        book.setImage("http://st.nettruyen.com/Data/Comics/48/han-ta-la-vua.jpg");
        book.setDescription("2131");
        book.setStatus("");
        book.setCategoryId("ID");
        mBook.add(book);

        book = new Book();
        book.setId("3");
        book.setTitle("HENYOKU NO LABYRINTH");
        book.setAuthor("Đang cập nhật");
        book.setImage("http://st.nettruyen.com/Data/Comics/139/henyoku-no-labyrinth.jpg");
        book.setDescription("2131");
        book.setStatus("");
        book.setCategoryId("ID");
        mBook.add(book);


        mAdapter.notifyDataSetChanged();
    }
}
