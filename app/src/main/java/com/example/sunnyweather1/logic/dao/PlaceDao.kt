package com.example.sunnyweather1.logic.dao

import android.content.Context
import android.provider.Settings.Global.putString
import androidx.core.content.edit
import com.example.sunnyweather1.SunnyWeatherApplication
import com.example.sunnyweather1.logic.model.Place
import com.google.gson.Gson


object PlaceDao {
    fun savePlace(place: Place){
        sharedPrefreences().edit {
            putString("place",Gson().toJson(place))
        }
    }
    fun getSavedPlace():Place{
        val placeJson= sharedPrefreences().getString("place","")
        return Gson().fromJson(placeJson,Place::class.java)
    }
    fun isPlaceSaved()= sharedPrefreences().contains("place")

    private fun sharedPrefreences()= SunnyWeatherApplication.context.getSharedPreferences("sunny_weather",Context.MODE_PRIVATE)
}