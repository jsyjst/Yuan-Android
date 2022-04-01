package com.example.learnkt.base

import android.app.Activity

object ActivityCollector {
    private val activityList = ArrayList<Activity>()

    fun addActivity(activity: Activity) {
        activityList.add(activity)
    }

    fun removeActivity(activity: Activity) {
        activityList.remove(activity)
    }

    fun finishAll() {
        for (activity in activityList) {
            if (!activity.isFinishing) {
                activity.finish()
            }
        }
        activityList.clear()
        // 杀掉当前程序的进程
        android.os.Process.killProcess(android.os.Process.myPid())
    }
}