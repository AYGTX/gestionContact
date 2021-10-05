package com.example.gestioncontact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class AddContact extends AppCompatActivity implements View.OnClickListener {
    EditText ed_contactFirstName, ed_contactLastName,ed_contactNumber;
    Button btn_add;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);
        ed_contactFirstName = findViewById(R.id.ed_contactFirstName_addContact);
        ed_contactLastName = findViewById(R.id.ed_contactLastName_addContact);
        ed_contactNumber = findViewById(R.id.ed_contactNumber_addContact);
        btn_add=findViewById(R.id.btn_val_addContact);
        btn_add.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        String fName = ed_contactFirstName.getText().toString();
        String lName = ed_contactLastName.getText().toString();
        String phone = ed_contactNumber.getText().toString();
        if (view==btn_add){
            if (!(fName.equals("")&&lName.equals("")&&phone.equals(""))){
                Contact c = new Contact(fName,lName,phone);
                Accueil.data.add(c);
                Toast toast = Toast.makeText(getApplicationContext(),c.toString(),Toast.LENGTH_LONG);
                toast.show();
            }
        }
    }
}