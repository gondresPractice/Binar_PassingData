package com.projectpertama.passing_data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.io.Serializable

//Serializable
data class Person (
    val name: String,
    val email: String,
    val address: String,
    val age: Int
    ): Serializable


//Parcelable

@Parcelize
data class PersonParcelabe(
    val name: String,
    val email: String,
    val address: String,
    val age: Int = 0
): Parcelable