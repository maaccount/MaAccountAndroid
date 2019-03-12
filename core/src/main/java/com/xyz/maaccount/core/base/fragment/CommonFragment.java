package com.xyz.maaccount.core.base.fragment;

public abstract class CommonFragment extends BaseFragment {

    @Override
    protected void init() {
        initData();
        initView();
        initViewData();
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        if (hidden) {
            onPause();
        } else {
            onResume();
        }
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