package com.sritechsoftsolutions.location

import android.annotation.SuppressLint
import android.content.Context
import android.location.Location
import android.location.LocationListener
import android.location.LocationManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingPermission")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var lManager:LocationManager= getSystemService(Context.LOCATION_SERVICE) as LocationManager

        lManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER,1000L,1f,
            object :LocationListener{
                override fun onLocationChanged(location: Location?) {
                    var lat=location?.latitude
                    var long=location?.longitude
                    tlat.setText("Latitude: $lat")
                    tlang.setText("Longitude: $long")

                }

                override fun onStatusChanged(provider: String?, status: Int, extras: Bundle?) {
                    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                }

                override fun onProviderEnabled(provider: String?) {
                    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                }

                override fun onProviderDisabled(provider: String?) {
                    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                }

            })

    }
}
