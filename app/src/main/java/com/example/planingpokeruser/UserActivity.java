package com.example.planingpokeruser;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class UserActivity extends AppCompatActivity {

    ListView listViewGroups;
    List<Groups> groupsList;
    DatabaseReference databaseGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        listViewGroups=(ListView)findViewById(R.id.listViewGroups);
        groupsList= new ArrayList<>();
        databaseGroup= FirebaseDatabase.getInstance().getReference("groups");


    }

}
