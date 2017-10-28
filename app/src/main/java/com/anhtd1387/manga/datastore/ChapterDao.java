package com.anhtd1387.manga.datastore;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;
import android.util.Log;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anhtd on 10/11/2017.
 */
public class ChapterDao implements BaseColumns {
    private Context context;
    private static ChapterDao instance;
    private ChapterHelper chapterHelper;

    private ChapterDao() {
    }

    private ChapterDao(Context context) {
        this.context = context;
        chapterHelper = new ChapterHelper(context);
    }

    public static ChapterDao getInstance(Context context) {
        if (instance == null) {
            instance = new ChapterDao(context);
        }
        return instance;
    }

    public void deadInstance() {
        instance = null;
    }

   /* public boolean creat(Chapter model, String index) {
        SQLiteDatabase database = chapterHelper.getWritableDatabase();
//        database.beginTransaction();
        ContentValues values = new ContentValues();
        values.put(ChapterHelper.COL_BOOK_CHAPTER_ID, model.getBookId() + model.getId());
        values.put(ChapterHelper.COL_INDEX, index);
        long insert = database.insert(ChapterHelper.TABLE_CHAPTER, null, values);
        if (insert > 0) {
            return true;
        }
        return false;
    }*/

   /* public String getIndex(Chapter model) {
        List<Chapter> list = new ArrayList<>();
        SQLiteDatabase database = chapterHelper.getWritableDatabase();
        Cursor cursor = database.query(ChapterHelper.TABLE_CHAPTER,
                new String[]{ChapterHelper.COL_BOOK_CHAPTER_ID, ChapterHelper.COL_INDEX},
                ChapterHelper.COL_BOOK_CHAPTER_ID + " = ?",
                new String[]{(model.getBookId() + model.getId())}, null, null, null);
        if (cursor != null) {
            cursor.moveToFirst();
            int indexIndex = cursor.getColumnIndex(ChapterHelper.COL_INDEX);
            while (!cursor.isAfterLast()) {
                return cursor.getString(indexIndex);
            }
        }
        return "-1";
    }
*/
    /*public boolean update(Chapter model, String index) {
        SQLiteDatabase database = chapterHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(ChapterHelper.COL_INDEX, index);

        String where = ChapterHelper.COL_BOOK_CHAPTER_ID + " LIKE ? ";
        String[] condinator = new String[]{model.getBookId() + model.getId() + ""};

        long update = database.update(ChapterHelper.TABLE_CHAPTER, values, where, condinator);
        if (update > 0) {
            return true;
        }
        boolean creat = creat(model, index);
        Log.e("INSERT : ", "" + creat);
        return false;
    }
*/
    public boolean delete(int id) {
        SQLiteDatabase database = chapterHelper.getWritableDatabase();

        String where = ChapterHelper.COL_BOOK_CHAPTER_ID + " LIKE ? ";
        String[] condinator = new String[]{id + ""};

        long insert = database.delete(ChapterHelper.TABLE_CHAPTER, where, condinator);
        if (insert > 0) {
            return true;
        }

        return false;
    }
}
