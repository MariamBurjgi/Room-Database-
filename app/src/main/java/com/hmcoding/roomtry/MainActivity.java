package com.hmcoding.roomtry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name, phoneno, address;
    Button save, getData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.nameId);
        phoneno = findViewById(R.id.phoneId);
        address = findViewById(R.id.addressId);
        save = findViewById(R.id.saveBtn);
        getData = findViewById(R.id.getData);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                savedata();
            }
        });

        getData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),GetData.class));
            }
        });

    }

    private void savedata()
    {
        String name_txt=name.getText().toString().trim();
        String phone_txt=phoneno.getText().toString().trim();
        String address_txt=address.getText().toString().trim();


            userModel model=new userModel();

            model.setName(name_txt);
            model.setAddress(address_txt);
            model.setPhoneno(phone_txt);



            DataBaseClass.getDatabase(getApplicationContext())
                    .getDao().insertAltData(model);

            name.setText("");
            phoneno.setText("");
            address.setText("");
            Toast.makeText(this, "Data Saved", Toast.LENGTH_SHORT).show();


    }

}