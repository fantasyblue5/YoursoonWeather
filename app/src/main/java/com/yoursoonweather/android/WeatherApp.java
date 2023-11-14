package com.yoursoonweather.android;

import android.app.Application;

import com.baidu.location.LocationClient;
import com.tencent.mmkv.MMKV;
import com.yoursoonweather.android.db.AppDatabase;
import com.yoursoonweather.android.utils.MVUtils;
import com.yoursoonweather.library.BaseApplication;
import com.yoursoonweather.library.network.NetworkApi;

public class WeatherApp extends BaseApplication {

    //数据库
    private static AppDatabase db;
    @Override
    public void onCreate() {
        super.onCreate();
        //使用定位需要同意隐私合规政策
        LocationClient.setAgreePrivacy(true);
        //初始化网络框架
        NetworkApi.init(new NetworkRequiredInfo(this));
        //MMKV初始化
        MMKV.initialize(this);
        //工具类初始化
        MVUtils.getInstance();
        //初始化Room数据库
        db = AppDatabase.getInstance(this);
    }

    public static AppDatabase getDb() {
        return db;
    }
}
