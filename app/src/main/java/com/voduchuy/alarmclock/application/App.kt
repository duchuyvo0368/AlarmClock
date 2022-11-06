package com.voduchuy.alarmclock.application

import android.app.Application
import android.app.Notification.Builder
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build

class App:Application() {
    companion object{
        val CHANNEL_ID:String="ALARM_SERVICE_CHANNEL"
    }
    override fun onCreate() {
        super.onCreate()
        createNotificationChannel()
    }

    private fun createNotificationChannel() {
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){
            val serviceChannel= NotificationChannel(CHANNEL_ID,"Alarm Service Channel",NotificationManager.IMPORTANCE_DEFAULT)
            val notificationManager:NotificationManager=getSystemService(NotificationManager::class.java)
            notificationManager.createNotificationChannel(serviceChannel)
        }
    }
}