package com.xyz.maaccount.core.base.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    protected Context mContext;
    protected Activity mActivity;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setView());
        mContext = getApplicationContext();
        mActivity = this;
    }

    /**
     * set layout file.
     *
     * @return layout file id.
     */
    protected abstract int setView();
}