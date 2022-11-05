package com.voduchuy.alarmclock

import android.annotation.SuppressLint
import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.annotation.RequiresApi
import com.voduchuy.alarmclock.databinding.ActivityAddBinding
import java.util.Calendar

class AddActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddBinding
    private lateinit var pendingIntent: PendingIntent
    private lateinit var alarmManager:AlarmManager
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddBinding.inflate(layoutInflater)
        setContentView(binding.root)
        alarmManager= getSystemService(ALARM_SERVICE) as AlarmManager
        binding.setAlarm.setOnClickListener {
            setAlarm()
        }
    }




    @RequiresApi(Build.VERSION_CODES.M)
    private fun setAlarm() {
        var time :Long=0
        val intent = Intent(this, AlarmReceiver::class.java)
        val calendar: Calendar = Calendar.getInstance()
        calendar.set(calendar.get(Calendar.YEAR),
            calendar.get(Calendar.MONTH),
            calendar.get(Calendar.DAY_OF_MONTH),
            binding.timePacked.hour,
            binding.timePacked.minute,
            0)
        pendingIntent=PendingIntent.getBroadcast(this,0,intent,PendingIntent.FLAG_UPDATE_CURRENT)
        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,calendar.timeInMillis,AlarmManager.INTERVAL_DAY,pendingIntent)
       // time = (calendar.getTimeInMillis() - (calendar.getTimeInMillis() % 60000));
       Toast.makeText(applicationContext,"Đã hẹn giờ thành công  ",Toast.LENGTH_SHORT).show()
        Log.d("AAA","${calendar.getTimeInMillis()}")


    }


}