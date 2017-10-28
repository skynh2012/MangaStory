package com.anhtd1387.manga.view.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


import com.anhtd1387.manga.R;
import com.anhtd1387.manga.model.MenuLeft;

import java.util.ArrayList;

public class MenuLeftAdapter extends BaseAdapter {

    private ArrayList<MenuLeft> arrMenu;
    private Integer[] arrImageMenu;
    private LayoutInflater inflater;
    private Activity mActivity;

    public MenuLeftAdapter(Activity act, ArrayList<MenuLeft> arrMenu, Integer[] arrImage) {
        this.mActivity = act;
        this.arrMenu = arrMenu;
        this.arrImageMenu = arrImage;
        inflater = (LayoutInflater) act.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        try {
            return arrMenu.size();
        } catch (NullPointerException ex) {
            return 0;
        }
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.item_menu_left, null);
            holder.tvTitle = (TextView) convertView.findViewById(R.id.tvTitle);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        MenuLeft menu = arrMenu.get(position);
        if (menu != null) {

            if (menu.isSelected()) {
                holder.tvTitle.setBackgroundColor(mActivity.getResources().getColor(R.color.colorPrimary));
                holder.tvTitle.setTextColor(mActivity.getResources().getColor(R.color.white));
            } else {
                holder.tvTitle.setBackgroundColor(mActivity.getResources().getColor(R.color.white));
                holder.tvTitle.setTextColor(mActivity.getResources().getColor(R.color.textColorPrimary));
            }

            holder.tvTitle.setText(menu.getName());
            holder.tvTitle.setCompoundDrawablesWithIntrinsicBounds(arrImageMenu[position], 0, 0, 0);
        }

        return convertView;
    }

    class ViewHolder {
        private TextView tvTitle;
    }
}
