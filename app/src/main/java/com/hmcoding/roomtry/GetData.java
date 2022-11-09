package com.hmcoding.roomtry;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class GetData extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_data);

        recyclerView=findViewById(R.id.recyclerview);
        
        getData();

    }

    private void getData() {

        recyclerView.setAdapter(new UserAdapter(getApplicationContext(),
                DataBaseClass.getDatabase(getApplicationContext()).getDao().getAllData()));
    }
}