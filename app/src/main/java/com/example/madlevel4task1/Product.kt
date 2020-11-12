package com.example.madlevel4task1

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "product_Table")
data class Product (
    @ColumnInfo(name = "productName")
    var product_name: String,

    @ColumnInfo(name = "product_amount")
    var product_amount: String,

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long? = null
)
