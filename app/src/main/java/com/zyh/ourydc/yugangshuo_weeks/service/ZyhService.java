package com.zyh.ourydc.yugangshuo_weeks.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

import com.zyh.ourydc.yugangshuo_weeks.event.EventFreshLog;

import org.greenrobot.eventbus.EventBus;

/**
 * Created by zhengyouhong on 2018/3/22.
 */

public class ZyhService extends Service{

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        sendEvent("onStartCommand");
        return super.onStartCommand(intent, flags, startId);
    }



    private void sendEvent(String log){
        EventFreshLog event = new EventFreshLog();
        event.log = log;
        EventBus.getDefault().post(event);
    }

}
