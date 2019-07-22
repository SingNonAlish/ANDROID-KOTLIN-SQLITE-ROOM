package com.example.sqllitedemo

import android.arch.persistence.room.Room
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var db = Room.databaseBuilder(applicationContext,AppDB::class.java,"EmployeeDB").build()

        Thread{
            var emp = Emp_Entity()
//            emp.emp_id = 3
//            emp.emp_name = "Singnoi3"
//            emp.emp_post = "DataBase Room3"

            db.empDAO().saveEmp(emp)

            db.empDAO().readEmp().forEach {
                Log.i("DATA :","""" Id is : ${it.emp_id}""")
                Log.i("DATA :","""" Name is : ${it.emp_name}""")
                Log.i("DATA :","""" Post is : ${it.emp_post}""")
            }
        }.start()
    }
    fun saveData(){

    }
}
