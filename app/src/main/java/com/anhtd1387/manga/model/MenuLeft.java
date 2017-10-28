package com.anhtd1387.manga.model;

public class MenuLeft {

    public static final int FRAGMENT_HOME = 0;
    public static final int FRAGMENT_ALL_CONTENT = 1;
    public static final int FRAGMENT_CATEGORY = 2;
    public static final int FRAGMENT_HISTORY = 3;
    public static final int FRAGMENT_BOOKMARK = 4;
    public static final int FRAGMENT_SETTING = 5;
    public static final int FRAGMENT_FEEDBACK = 6;
    public static final int FRAGMENT_MORE_APP = 7;
    public static final int FRAGMENT_ABOUT = 8;


    private int id;
    private String name;
    private boolean isSelected;

    public MenuLeft() {
    }

    public MenuLeft(int id, String name, boolean isSelected) {
        this.id = id;
        this.name = name;
        this.isSelected = isSelected;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
