package com.voduchuy.alarmclock

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.provider.Settings
import android.util.Log
import android.widget.Toast

class AlarmReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
//       Log.d("AAA","Hello")
//        val serviceIntent=Intent(context,Service::class.java)
//        context.startService(serviceIntent)
        val mediaPlayer:MediaPlayer=MediaPlayer.create(context,Settings.System.DEFAULT_RINGTONE_URI)
        mediaPlayer.start()
    }
}