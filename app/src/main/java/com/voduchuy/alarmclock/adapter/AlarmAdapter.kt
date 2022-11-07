package com.voduchuy.alarmclock.adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.voduchuy.alarmclock.R
import com.voduchuy.alarmclock.model.Alarm

class AlarmAdapter : RecyclerView.Adapter<AlarmAdapter.AlarmVH>() {
    private var listAlarm = mutableListOf<Alarm>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlarmVH {
        return AlarmVH(LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false))
    }

    override fun onBindViewHolder(holder: AlarmVH, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    inner class AlarmVH(private val iv: View) : RecyclerView.ViewHolder(iv) {
        fun bind(alarm: Alarm){

        }
    }
}