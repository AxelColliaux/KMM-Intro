package com.example.kmmintro

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform