package com.xyz.maaccount.global;

public class App extends com.auroral.core.global.App {

    @Override
    public void onCreate() {
        super.onCreate();
        // 初始化手机屏幕信息
        initScreenInfo();
    }
}