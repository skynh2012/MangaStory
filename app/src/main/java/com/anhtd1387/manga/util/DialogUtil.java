package com.anhtd1387.manga.util;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

import com.anhtd1387.manga.R;


/**
 * Created by Anhtd on 09/10/2017.
 */
public class DialogUtil {

    public interface IDialogConfirm {
        void onClickOk();
    }

    public static void showAlertDialog(Context context, int title , int message , final IDialogConfirm iDialogConfirm){
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.setNegativeButton(R.string.ok, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.dismiss();
                iDialogConfirm.onClickOk();
            }
        });
        builder.setPositiveButton(context.getString(R.string.cancel),new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.dismiss();
            }
        });

        builder.show();
    }

}
