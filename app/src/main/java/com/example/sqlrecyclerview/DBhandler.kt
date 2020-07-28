package com.example.sqlrecyclerview

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.os.FileObserver.CREATE

class DBhandler(context:Context, name : String, factory: SQLiteDatabase.CursorFactory,version:Int) :

    SQLiteOpenHelper(context, DATABASE_NAME,factory, DATABASE_VERSION){


    companion object {

        val DATABASE_NAME = "MyData"
        val DATABASE_VERSION = 1

        val CUSTOMER_TABLE_NAME = "Customers"
        val COLUMN_CUSTOMERID = "CustomerId"
        val COLUMN_CUSTOMERNAME = "customerName"
        val COLUMN_MAXCREDIT = "maxCredit"

    }


    override fun onCreate(db: SQLiteDatabase?) {

       val CREATE_CUSTOMERS_TABLE :String = ("CREATE TABLE $CUSTOMER_TABLE_NAME ("+
               "$COLUMN_CUSTOMERID INTEGER PRIMARY KEY AUTOINCREMENT," +
               "$COLUMN_CUSTOMERNAME TEXT,"+
               "$COLUMN_MAXCREDIT DOUBLE DEFAULT 0)")

               db?.execSQL(CREATE_CUSTOMERS_TABLE)



    }



    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }


}