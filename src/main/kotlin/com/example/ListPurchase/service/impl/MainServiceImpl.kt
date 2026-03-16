package com.example.ListPurchase.service.impl

import com.example.ListPurchase.service.MainService
import org.springframework.mail.SimpleMailMessage
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.stereotype.Service
import kotlin.random.Random

@Service
class MainServiceImpl(private val mailSender: JavaMailSender): MainService {

    // генерация кода подтверждения по почте
    override fun sendVerificationCode(to: String): String {
        val code = List(6) { Random.nextInt(0, 10) }.joinToString("")

        val message = SimpleMailMessage()
        message.setTo(to)
        message.subject = "Код подтверждения"
        message.text = "Ваш код для авторизации: $code\nНе сообщайте его никому."

        mailSender.send(message)

        return code
    }
}