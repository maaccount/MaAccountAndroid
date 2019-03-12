package com.xyz.maaccount.core.base.activity;

import android.os.Bundle;

import androidx.annotation.Nullable;

public abstract class CommonActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initData();
        initView();
        initViewData();
    }

    /**
     * init date.
     */
    protected void initData() {
    }

    /**
     * init view.
     */
    protected abstract void initView();

    /**
     * init view data.
     */
    protected abstract void initViewData();
}