package com.example.ly574.coolweather.util;

/**
 * Created by ly574 on 2016/10/10.
 */

public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
