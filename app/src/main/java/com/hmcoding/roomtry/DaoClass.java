package com.hmcoding.roomtry;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface DaoClass {

    @Insert
    void insertAltData(userModel model);

    @Query("select * from user")
    List<userModel> getAllData();



}
