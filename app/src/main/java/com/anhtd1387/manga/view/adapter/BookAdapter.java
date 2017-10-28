package com.anhtd1387.manga.view.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.anhtd1387.manga.R;
import com.anhtd1387.manga.configs.Config;
import com.anhtd1387.manga.model.Book;
import com.joooonho.SelectableRoundedImageView;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Anhtd on 14/10/2017.
 */

public class BookAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context _context;
    private ArrayList<Book> mArrBook;
    private int type;

    public BookAdapter(Context context, ArrayList<Book> mArrBook, int type) {
        this._context = context;
        this.mArrBook = mArrBook;
        this.type = type;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (type == Config.TYPE_GRID) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_book_grid, parent, false);
            return new ViewHolderGrid(view);
        } else {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_book_list, parent, false);
            return new ViewHolderList(view);
        }

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Book book = mArrBook.get(position);
        if (book != null) {
            if (type == Config.TYPE_GRID) {
                ViewHolderGrid grid = (ViewHolderGrid) holder;
                grid.tvAuthor.setText(book.getAuthor());
                grid.tvTitle.setText(book.getTitle());
                if (!book.getImage().equals("")) {
                    Picasso.with(_context)
                            .load(book.getImage())
                            .into(grid.imvAvatar);
                }
                if (!book.getStatus().equals("")) {
                    grid.tvStatus.setText(book.getStatus());
                }
            } else {
                ViewHolderList list = (ViewHolderList) holder;
                if (!book.getImage().equals("")) {
                    Picasso.with(_context)
                            .load(book.getImage())
                            .into(list.imvAvatar);
                }
                list.tvAuthor.setText(book.getAuthor());
                list.tvTitle.setText(book.getTitle());
                list.tvCategory.setText(book.getCategoryId());
                list.tvLastUpdate.setText(book.getDateHistory());
                list.tvView.setText(book.getDescription());
                list.tvStatus.setText(book.getStatus());
            }
        }
    }

    @Override
    public int getItemCount() {
        return mArrBook != null ? mArrBook.size() : 0;
    }


    public class ViewHolderGrid extends RecyclerView.ViewHolder {

        @BindView(R.id.imv_avatar)
        SelectableRoundedImageView imvAvatar;
        @BindView(R.id.tv_author)
        TextView tvAuthor;
        @BindView(R.id.tv_title)
        TextView tvTitle;
        @BindView(R.id.tv_status)
        TextView tvStatus;

        public ViewHolderGrid(View itemView) {
            super(itemView);
            tvAuthor = (TextView) itemView.findViewById(R.id.tv_author);
            tvTitle = (TextView) itemView.findViewById(R.id.tv_title);
            tvStatus = (TextView) itemView.findViewById(R.id.tv_status);
            imvAvatar = (SelectableRoundedImageView) itemView.findViewById(R.id.imv_avatar);
            ButterKnife.bind(this, itemView);
        }
    }

    public class ViewHolderList extends RecyclerView.ViewHolder {
        @BindView(R.id.imv_avatar)
        SelectableRoundedImageView imvAvatar;
        @BindView(R.id.tv_title)
        TextView tvTitle;
        @BindView(R.id.tv_status)
        TextView tvStatus;
        @BindView(R.id.tv_author)
        TextView tvAuthor;
        @BindView(R.id.tv_category)
        TextView tvCategory;
        @BindView(R.id.tv_last_update)
        TextView tvLastUpdate;
        @BindView(R.id.tv_view)
        TextView tvView;

        public ViewHolderList(View itemView) {
            super(itemView);
            imvAvatar = (SelectableRoundedImageView) itemView.findViewById(R.id.imv_avatar);
            tvTitle = (TextView) itemView.findViewById(R.id.tv_title);
            tvStatus = (TextView) itemView.findViewById(R.id.tv_status);
            tvAuthor = (TextView) itemView.findViewById(R.id.tv_author);
            tvCategory = (TextView) itemView.findViewById(R.id.tv_category);
            tvLastUpdate = (TextView) itemView.findViewById(R.id.tv_last_update);
            tvView = (TextView) itemView.findViewById(R.id.tv_view);
            ButterKnife.bind(this, itemView);
        }
    }
}
