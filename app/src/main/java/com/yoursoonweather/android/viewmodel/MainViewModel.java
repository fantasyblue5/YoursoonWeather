package com.yoursoonweather.android.viewmodel;

import androidx.lifecycle.MutableLiveData;

import com.yoursoonweather.android.db.bean.DailyResponse;
import com.yoursoonweather.android.db.bean.LifestyleResponse;
import com.yoursoonweather.android.db.bean.NowResponse;
import com.yoursoonweather.android.db.bean.Province;
import com.yoursoonweather.android.db.bean.SearchCityResponse;
import com.yoursoonweather.android.repository.CityRepository;
import com.yoursoonweather.android.repository.SearchCityRepository;
import com.yoursoonweather.android.repository.WeatherRepository;
import com.yoursoonweather.library.base.BaseViewModel;

import java.util.List;

public class MainViewModel extends BaseViewModel {

    public MutableLiveData<SearchCityResponse> searchCityResponseMutableLiveData = new MutableLiveData<>();

    public MutableLiveData<NowResponse> nowResponseMutableLiveData = new MutableLiveData<>();

    public MutableLiveData<DailyResponse> dailyResponseMutableLiveData = new MutableLiveData<>();

    public MutableLiveData<LifestyleResponse> lifestyleResponseMutableLiveData = new MutableLiveData<>();
    public MutableLiveData<List<Province>> cityMutableLiveData = new MutableLiveData<>();

    /**
     * 搜索成功
     * @param cityName 城市名称
     */
    public void searchCity(String cityName) {
        new SearchCityRepository().searchCity(searchCityResponseMutableLiveData, failed, cityName);
    }


    public void nowWeather(String cityId) {
        new WeatherRepository().nowWeather(nowResponseMutableLiveData,failed, cityId);
    }


    public void dailyWeather(String cityId) {
        new WeatherRepository().dailyWeather(dailyResponseMutableLiveData, failed, cityId);
    }

    public void lifestyle(String cityId) {
        WeatherRepository.getInstance().lifestyle(lifestyleResponseMutableLiveData, failed, cityId);
    }

    public void getAllCity() {
        CityRepository.getInstance().getCityData(cityMutableLiveData);
    }
}

