package com.example.musicapp

import androidx.annotation.DrawableRes

data class Dummy(@DrawableRes val icon:Int , val name : String)

val libraries = listOf<Dummy>(
    Dummy(R.drawable.baseline_library_music_24,"Playlist"),
    Dummy(R.drawable.baseline_mic_24,"Artist"),
    Dummy(R.drawable.baseline_album_24,"Album"),
    Dummy(R.drawable.baseline_music_note_24,"Songs")
)