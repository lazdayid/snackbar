package com.lazday.snackbar.utils;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.design.widget.Snackbar;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;

import com.lazday.snackbar.R;

/**
 * By Lazday Indonesia on 10/06/18.
 * https://www.lazday.com
 * https://github.com/lazdayid/
 */

public class CustomUtils {

    public static void snackbarTop (View v){
        Snackbar snack = Snackbar.make(v, "Testing", Snackbar.LENGTH_LONG);
        View view = snack.getView();
        FrameLayout.LayoutParams params =(FrameLayout.LayoutParams)view.getLayoutParams();
        params.gravity = Gravity.TOP;
        view.setLayoutParams(params);
        snack.show();
    }

    public static void snackbarSound(View v, MediaPlayer mediaPlayer){
        if (!mediaPlayer.isPlaying()){
            mediaPlayer.start();
            Snackbar.make(v, "Testing", Snackbar.LENGTH_LONG).show();
        }
    }

    public static void snackbarColor(View v, Context context){
        Snackbar snackbar = Snackbar.make(v, "Testing", Snackbar.LENGTH_LONG);
        snackbar.getView().setBackgroundColor(context.getResources().getColor(R.color.colorPrimaryDark));
        snackbar.show();
    }
}
