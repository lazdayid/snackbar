package com.lazday.snackbar;

import android.media.MediaPlayer;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.lazday.snackbar.utils.CustomUtils;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    CustomUtils custom;

    @OnClick(R.id.btnBottom)
    public void onBtnBottomClick(View v){
        Snackbar.make(v, "Testing", Snackbar.LENGTH_LONG).show();
    }

    @OnClick(R.id.btnTop)
    public void onBtnTopClick(View v){
        custom.snackbarTop(v);
    }

    @OnClick(R.id.btnSound)
    public void onBtnSoundClick(View v){
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.click);
        custom.snackbarSound(v, mediaPlayer);
    }

    @OnClick(R.id.btnColor)
    public void onBtnColorClick(View v){
        custom.snackbarColor(v, MainActivity.this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        custom = new CustomUtils();
    }
}
