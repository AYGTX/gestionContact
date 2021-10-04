package com.example.gestioncontact;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_val,btn_quit;
    EditText ed_nom, ed_pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Recuperation
         btn_val = findViewById(R.id.btn_val_main);
         btn_quit = findViewById(R.id.btn_quit_main);
         ed_nom = findViewById(R.id.ed_name_main);
         ed_pass = findViewById(R.id.ed_pass_main);

        btn_quit.setOnClickListener(this);
        btn_val.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v == btn_quit){
            this.finish();
        }
        if(v == btn_val){
            String nom = ed_nom.getText().toString();
            String pass = ed_pass.getText().toString();
            Toast.makeText(this, "Name: "+nom+" Pass: "+pass, Toast.LENGTH_SHORT).show();

        }
        //if not equals to issatso and 000 then toast error
        //move to another activity
        //intent i= new intent(this,Accueil.class)
        //start Activity(i);
        //accueil ajouter & afficher
        /* clicking on ajout : activiter ajout : nom prenom numero buton quitter
           clicking on afficher : chercher ( autocomplete ) + listview

         */
    }
}