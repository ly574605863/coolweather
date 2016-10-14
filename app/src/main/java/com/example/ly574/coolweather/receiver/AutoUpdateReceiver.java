package com.example.ly574.coolweather.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.example.ly574.coolweather.service.AutoUpdateService;

import java.io.BufferedReader;

/**
 * Created by ly574 on 2016/10/14.
 */

public class AutoUpdateReceiver extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, AutoUpdateService.class);
        context.startActivity(i);
    }
}
