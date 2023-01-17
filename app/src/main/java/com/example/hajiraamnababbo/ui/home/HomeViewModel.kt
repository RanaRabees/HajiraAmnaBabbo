package com.example.hajiraamnababbo.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

//package com.example.kaiqabeela


//package com.example.kaiqabeela

//import android.os.Bundle
//import androidx.appcompat.app.AppCompatActivity
import com.example.hajiraamnababbo.databinding.ActivityMainBinding

//class HomeViewModel : AppCompatActivity() {
//    @SuppressLint("MissingInflatedId")
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.fragment_dashboard)
//
//        val videoView = findViewById<VideoView>(R.id.videoView)
//        val videoPath = "android.resource://" + packageName + "/" + R.raw.video1
//        val uri = Uri.parse(videoPath)
//        videoView.setVideoURI(uri)
//        val mediaController = MediaController(this)
//        videoView.setMediaController(mediaController)
//        mediaController.setAnchorView(videoView)
//
//
//    }
//
//
//}

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is My Cute Hajira page"
    }
    val text: LiveData<String> = _text


}