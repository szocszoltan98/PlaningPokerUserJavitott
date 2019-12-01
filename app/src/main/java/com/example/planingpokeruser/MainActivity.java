package com.example.planingpokeruser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    EditText name;
    Button login;
    DatabaseReference databaseUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.edt_name);

        login=findViewById(R.id.btn_login);
        databaseUser = FirebaseDatabase.getInstance().getReference("users");
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addUser();
            }
        });
    }
    private void addUser()
    {
        String nametext=name.getText().toString().trim();

        if(TextUtils.isEmpty(nametext)) {
            name.setError("Name is empty");
            return;
        }
        else
        {
            String id=databaseUser.push().getKey();
            User user=new User(id,nametext);
            databaseUser.child(id).setValue(user);
            Toast.makeText(this,"User added",Toast.LENGTH_LONG).show();
            openActivity();
        }
    }
    private void openActivity(){//ezzel megnyitok egy adott activity-it
        Intent openIntent = new Intent(MainActivity.this,UserActivity.class);
        startActivity(openIntent);
    }




}
