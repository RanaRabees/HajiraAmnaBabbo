package com.example.hajiraamnababbo
import androidx.appcompat.app.AppCompatActivity
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.hajiraamnababbo.ui.home.HomeViewModel
import android.net.Uri
import android.widget.MediaController
import android.widget.VideoView


class hajra : AppCompatActivity() {

        @SuppressLint("MissingInflatedId")
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_hajra)

            val videoView = findViewById<VideoView>(R.id.videoView1)
            val videoPath = "android.resource://" + packageName + "/" + R.raw.storyuncle
            val uri = Uri.parse(videoPath)
            videoView.setVideoURI(uri)
            val mediaController = MediaController(this)
            videoView.setMediaController(mediaController)
            mediaController.setAnchorView(videoView)


        }

//    private lateinit var binding: ActivityHajraBinding
//    private lateinit var fullscreenContent: TextView
//    private lateinit var fullscreenContentControls: LinearLayout
//    private val hideHandler = Handler(Looper.myLooper()!!)
//
//    @SuppressLint("InlinedApi")
//    private val hidePart2Runnable = Runnable {
//        if (Build.VERSION.SDK_INT >= 30) {
//            fullscreenContent.windowInsetsController?.hide(WindowInsets.Type.statusBars() or WindowInsets.Type.navigationBars())
//        } else {
//            fullscreenContent.systemUiVisibility =
//                View.SYSTEM_UI_FLAG_LOW_PROFILE or
//                        View.SYSTEM_UI_FLAG_FULLSCREEN or
//                        View.SYSTEM_UI_FLAG_LAYOUT_STABLE or
//                        View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY or
//                        View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION or
//                        View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
//        }
//    }
//    private val showPart2Runnable = Runnable {
//        supportActionBar?.show()
//        fullscreenContentControls.visibility = View.VISIBLE
//    }
//    private var isFullscreen: Boolean = false
//
//    private val hideRunnable = Runnable { hide() }
//
//    private val delayHideTouchListener = View.OnTouchListener { view, motionEvent ->
//        when (motionEvent.action) {
//            MotionEvent.ACTION_DOWN -> if (AUTO_HIDE) {
//                delayedHide(AUTO_HIDE_DELAY_MILLIS)
//            }
//            MotionEvent.ACTION_UP -> view.performClick()
//            else -> {
//            }
//        }
//        false
//    }
//
//    @SuppressLint("ClickableViewAccessibility")
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        binding = ActivityHajraBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)
//
//        isFullscreen = true
//
//        fullscreenContent = binding.fullscreenContent
//        fullscreenContent.setOnClickListener { toggle() }
//
//        fullscreenContentControls = binding.fullscreenContentControls
//
//    }
//
//    override fun onPostCreate(savedInstanceState: Bundle?) {
//        super.onPostCreate(savedInstanceState)
//        delayedHide(100)
//    }
//
//    private fun toggle() {
//        if (isFullscreen) {
//            hide()
//        } else {
//            show()
//        }
//    }
//
//    private fun hide() {
//        supportActionBar?.hide()
//        fullscreenContentControls.visibility = View.GONE
//        isFullscreen = false
//
//        hideHandler.removeCallbacks(showPart2Runnable)
//        hideHandler.postDelayed(hidePart2Runnable, UI_ANIMATION_DELAY.toLong())
//    }
//
//    private fun show() {
//        // Show the system bar
//        if (Build.VERSION.SDK_INT >= 30) {
//            fullscreenContent.windowInsetsController?.show(WindowInsets.Type.statusBars() or WindowInsets.Type.navigationBars())
//        } else {
//            fullscreenContent.systemUiVisibility =
//                View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or
//                        View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
//        }
//        isFullscreen = true
//
//        hideHandler.removeCallbacks(hidePart2Runnable)
//        hideHandler.postDelayed(showPart2Runnable, UI_ANIMATION_DELAY.toLong())
//    }
//
//
//    private fun delayedHide(delayMillis: Int) {
//        hideHandler.removeCallbacks(hideRunnable)
//        hideHandler.postDelayed(hideRunnable, delayMillis.toLong())
//    }
//
//    companion object {
//        private const val AUTO_HIDE = true
//
//        private const val AUTO_HIDE_DELAY_MILLIS = 3000
//
//        private const val UI_ANIMATION_DELAY = 300
//    }
    fun hajramain(view: View) {
        val intent = Intent(/* packageContext = */ this,/* cls = */ HomeViewModel::class.java)
        startActivity(intent)
        Toast.makeText(this, "You Are  \uD83E\uDDD0     \uD83E\uDD13Going Back To\uD83D\uDC7B" +
                " Main Page", Toast.LENGTH_LONG).show()
    }
}