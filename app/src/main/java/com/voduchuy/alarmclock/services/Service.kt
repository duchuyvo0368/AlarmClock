package com.voduchuy.alarmclock.services

import android.app.Notification
import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.provider.Settings
import android.util.Log
import androidx.core.app.NotificationCompat
import com.voduchuy.alarmclock.application.App.Companion.CHANNEL_ID


class Service : Service() {
    private lateinit var mediaPlayer: MediaPlayer
    override fun onBind(p0: Intent?): IBinder? {
        Log.d("AAA", "Đang trong Service onBind")
        return null
    }

    override fun onCreate() {
        super.onCreate()
        mediaPlayer = MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI)
        mediaPlayer.isLooping = true
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        val notification: Notification =
            NotificationCompat.Builder(this, CHANNEL_ID).setContentTitle("Hello")
                .setContentText("Ring Ring...Ring Ring")
                .build()
        mediaPlayer.start()
        startForeground(1,notification)
        return START_NOT_STICKY
    }


}