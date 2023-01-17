package com.example.hajiraamnababbo

import android.annotation.SuppressLint
import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.example.hajiraamnababbo.databinding.ActivityAdeemaApiJanStoriesBinding

class AdeemaApiJanStories : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adeema_api_jan_stories)

        val videoView = findViewById<VideoView>(R.id.videoViewadeema)
        val videoPath = "android.resource://" + packageName + "/" + R.raw.adeema_api_stories
        val uri = Uri.parse(videoPath)
        videoView.setVideoURI(uri)
        val mediaController = MediaController(this)
        videoView.setMediaController(mediaController)
        mediaController.setAnchorView(videoView)


    }
}