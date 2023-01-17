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
import com.example.hajiraamnababbo.databinding.ActivityUncleStoriesBinding

import android.content.Intent
import android.view.View
import android.widget.Toast
import com.example.hajiraamnababbo.ui.home.HomeViewModel


class UncleStories : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uncle_stories)

        val videoView = findViewById<VideoView>(R.id.videoViewabba)
        val videoPath = "android.resource://" + packageName + "/" + R.raw.storyuncle
        val uri = Uri.parse(videoPath)
        videoView.setVideoURI(uri)
        val mediaController = MediaController(this)
        videoView.setMediaController(mediaController)
        mediaController.setAnchorView(videoView)


    }
}