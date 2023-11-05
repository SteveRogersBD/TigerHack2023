package com.aniruddha.afinal

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.Button
import android.widget.MediaController
import android.widget.VideoView

class CurlFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_curl, container, false)
        val button = view.findViewById<Button>(R.id.youtube)
        val webView = view.findViewById<WebView>(R.id.webView)

        button.setOnClickListener {
            // Load the YouTube video when the button is pressed
            val videoId = "YOUR_YOUTUBE_VIDEO_ID" // Replace with the actual YouTube video ID
            val youtubeUrl = "https://www.youtube.com/watch?v=0AUGkch3tzc"

            val webSettings = webView.settings
            webSettings.javaScriptEnabled = true
            webView.loadUrl(youtubeUrl)
        }

        return view
    }
}
