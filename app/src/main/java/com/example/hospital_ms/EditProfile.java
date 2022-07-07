package com.example.hospital_ms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EditProfile extends AppCompatActivity {
    EditText editTxtName,editTxtPhone,editTextPassword,editTextAddress,editTextEmail;
    //Button btnUpdate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        editTxtName=(EditText)findViewById(R.id.editTName);
        editTxtPhone=(EditText)findViewById(R.id.editTphone);
        editTextPassword=(EditText)findViewById(R.id.editTpassword);
        editTextAddress=(EditText)findViewById(R.id.editTaddress);
        editTextEmail=(EditText)findViewById(R.id.editTemail);
        //btnUpdate=(Button)findViewById(R.id.btnUpdate);

        Intent data=getIntent();
        String name=data.getStringExtra("name");
        String email=data.getStringExtra("email");
        String phone=data.getStringExtra("phone");
        String address=data.getStringExtra("address");
        String password=data.getStringExtra("password");

        editTxtName.setText(name);
        editTxtPhone.setText(phone);
        editTextEmail.setText(email);
        editTextAddress.setText(address);
        editTextPassword.setText(password);

//        btnUpdate.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String Newname = editTxtName.getText().toString().trim();
//                String Newphone= editTxtPhone.getText().toString().trim();
//                String Newpasswd = editTextPassword.getText().toString().trim();
//                String Newaddress = editTextAddress.getText().toString().trim();
//                String Newemail = editTextEmail.getText().toString().trim();
//            }
//        });





    }
}