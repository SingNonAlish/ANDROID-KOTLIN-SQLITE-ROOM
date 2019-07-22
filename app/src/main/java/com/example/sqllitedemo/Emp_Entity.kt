package com.example.sqllitedemo

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey


@Entity
class Emp_Entity {
    @PrimaryKey
    var emp_id : Int = 0

    @ColumnInfo (name = "EMP_NAME")
    var emp_name : String = ""

    @ColumnInfo (name = "EMP_POST")
    var emp_post : String = ""
}