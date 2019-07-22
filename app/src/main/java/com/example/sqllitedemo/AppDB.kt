package com.example.sqllitedemo

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

@Database (entities = [(Emp_Entity::class)], version = 1)
abstract class AppDB : RoomDatabase() {
    abstract fun empDAO() : Emp_DAO
}