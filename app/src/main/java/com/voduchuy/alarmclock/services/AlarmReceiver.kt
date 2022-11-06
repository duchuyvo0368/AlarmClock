package com.voduchuy.alarmclock.services

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class AlarmReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
//       Log.d("AAA","Hello")
        Log.d("AAA","Đang trong BroadcastReceiver")
        val serviceIntent=Intent(context, Service::class.java)
        context.startService(serviceIntent)
    }

}