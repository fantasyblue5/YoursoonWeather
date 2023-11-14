package com.yoursoonweather.android.ui.adapter;

import android.view.View;

import com.yoursoonweather.android.utils.AdministrativeType;

public interface AdministrativeClickCallback {
    /**
     * 行政区 点击事件
     *
     * @param view     点击视图
     * @param position 点击位置
     * @param type     行政区类型
     */
    void onAdministrativeItemClick(View view, int position, AdministrativeType type);
}

