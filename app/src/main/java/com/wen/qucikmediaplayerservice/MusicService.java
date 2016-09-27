package com.wen.qucikmediaplayerservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by Administrator on 2016/9/28.
 */

public class MusicService extends Service{
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
