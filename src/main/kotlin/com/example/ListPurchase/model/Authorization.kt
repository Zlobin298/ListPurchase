package com.example.ListPurchase.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "authorization", schema = "public")
class Authorization {
    @Id
    @Column(name = "emil", nullable = false)
    private lateinit var email: String

    @Column(name = "password", nullable = false)
    private lateinit var password: String
}