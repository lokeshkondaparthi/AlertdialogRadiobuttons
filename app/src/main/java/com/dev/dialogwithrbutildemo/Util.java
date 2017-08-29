package com.dev.dialogwithrbutildemo;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.widget.Toast;

/**
 * Created by user2 on 8/29/2017.
 */

public class Util {

    public String mSelectedItem;

    public   void showSingleChoiseDialog(final Context context, String title, String[] buttonsText,
                                         final String[] list, int checkedItem,
                                         final OnItemSelectedListener onItemSelectedListener) {

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(title);
        builder.setSingleChoiceItems(list, checkedItem, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                mSelectedItem = list[which];
            }
        });
        if (buttonsText.length > 0)             // OK button listener
            builder.setPositiveButton(buttonsText[0], new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    if (mSelectedItem != null) {
                        onItemSelectedListener.onItemclick(mSelectedItem);
                        mSelectedItem = null;
                    } else {
                        Toast.makeText(context, "You have not selected any option!", Toast.LENGTH_SHORT).show();
                    }
                }
            });

        if (buttonsText.length > 1)             // Cancel button listener
            builder.setNegativeButton(buttonsText[1], new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                }
            });

        builder.show();

    }
}
