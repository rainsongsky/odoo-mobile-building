package com.haogefeifei.odoo.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.WindowManager;

import com.github.paolorotolo.appintro.AppIntro;
import com.haogefeifei.odoo.R;
import com.haogefeifei.odoo.ui.fragment.SampleSlide;

/**
 * 介绍Activity
 */
public class IntroActivity extends AppIntro {

    public static final String TAG = "IntroActivity";

    @Override
    public void init(@Nullable Bundle savedInstanceState) {

        addSlide(SampleSlide.newInstance(R.layout.view_intro));
        addSlide(SampleSlide.newInstance(R.layout.view_intro2));
        addSlide(SampleSlide.newInstance(R.layout.view_intro3));
        addSlide(SampleSlide.newInstance(R.layout.view_intro4));

    }

    @Override
    public void onSkipPressed() {

        loadMainActivity();
    }

    @Override
    public void onDonePressed() {

        loadMainActivity();
    }

    private void loadMainActivity(){

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);

        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();
    }
}
