package com.ansela.kisahnabiapp.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ResponseMain (

    @field:SerializedName("name")
    val name: String? = null,

    @field:SerializedName("thn_kelahiran")
    val thnkelahiran: String? = null,

    @field:SerializedName("usia")
    val usia: String? = null,

    @field:SerializedName("description")
    val description: String? = null,

    @field:SerializedName("tmp")
    val tmp: String? = null,

    @field:SerializedName("image_url")
    val imageurl: String? = null,

    @field:SerializedName("icon_url")
    val iconurl: String? = null,

): Parcelable
