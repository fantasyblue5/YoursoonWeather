package com.yoursoonweather.android.viewmodel;

import androidx.lifecycle.MutableLiveData;

import com.yoursoonweather.android.db.bean.CityConverter;
import com.yoursoonweather.android.db.bean.Province;
import com.yoursoonweather.android.repository.CityRepository;
import com.yoursoonweather.library.base.BaseViewModel;

import java.util.List;

public class SplashViewModel extends BaseViewModel {
    public MutableLiveData<List<Province>> listMutableLiveData = new MutableLiveData<>();

    /**
     * 添加城市数据
     */
    public void addCityData(List<Province> provinceList){
        CityRepository.getInstance().addCityData(provinceList);
    }

    /**
     * 获取城市数据
     */
    public void getAllCityData(){
        CityRepository.getInstance().getCityData(listMutableLiveData);
    }
}

