package com.hmcoding.roomtry;


import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {userModel.class},version = 1)
public abstract class DataBaseClass extends RoomDatabase {

    public abstract DaoClass getDao();
    private static DataBaseClass instance;

    static DataBaseClass getDatabase(final Context context) {
        if (instance ==null)
        {
            synchronized (DataBaseClass.class) {

                instance = Room.databaseBuilder(context, DataBaseClass.class,
                        "Database").allowMainThreadQueries().build();
            }
        }
        return instance;


    }

}
