package com.example.sqllitedemo

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query

@Dao
interface Emp_DAO {

    @Insert
    fun saveEmp(emp : Emp_Entity)

    @Query("SELECT * FROM Emp_Entity")
    fun readEmp() : List<Emp_Entity>
}