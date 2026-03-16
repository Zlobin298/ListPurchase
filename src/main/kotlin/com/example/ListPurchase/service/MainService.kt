package com.example.ListPurchase.service

interface MainService {
    fun sendVerificationCode(to: String): String;
}