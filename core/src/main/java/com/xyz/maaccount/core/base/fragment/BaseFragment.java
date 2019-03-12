package com.xyz.maaccount.core.base.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public abstract class BaseFragment extends Fragment {

    protected View mView;
    protected Activity mActivity;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mActivity = getActivity();
        mView = LayoutInflater.from(mActivity).inflate(setView(), container, false);
        init();
        return mView;
    }

    /**
     * init fragment.
     */
    protected void init() {
    }

    /**
     * set layout file.
     *
     * @return layout file id.
     */
    protected abstract int setView();
}