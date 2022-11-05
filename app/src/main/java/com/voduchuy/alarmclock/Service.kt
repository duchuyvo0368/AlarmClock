package com.voduchuy.alarmclock

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.provider.Settings
import android.util.Log


class Service : Service() {

    private lateinit var mediaPlayer: MediaPlayer
    private var isRunning: Boolean = false
    private var startId: Int? = null
    override fun onBind(p0: Intent?): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        return START_NOT_STICKY
    }


}