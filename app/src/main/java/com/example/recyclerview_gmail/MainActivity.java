package com.example.recyclerview_gmail;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcvUser;
    private Adapter userAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcvUser = findViewById(R.id.rcv_user);
        userAdapter = new Adapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL,false);
        rcvUser.setLayoutManager(linearLayoutManager);

        userAdapter.setData(getListUser());
        rcvUser.setAdapter(userAdapter);
    }

    private List<User> getListUser(){
        List<User> list = new ArrayList<>();

        list.add(new User(R.drawable.avt, "User Name 1","Hallo 1"));
        list.add(new User(R.drawable.avt1, "User Name 2","Hallo 2"));
        list.add(new User(R.drawable.avt2, "User Name 3","Hallo 3"));
        list.add(new User(R.drawable.avt3, "User Name 4","Hallo 4"));
        list.add(new User(R.drawable.avt4, "User Name 5","Hallo 5"));
        list.add(new User(R.drawable.avt5, "User Name 6","Hallo 6"));
        list.add(new User(R.drawable.avt6, "User Name 7","Hallo 7"));

        list.add(new User(R.drawable.avt, "User Name 1","Hallo 1"));
        list.add(new User(R.drawable.avt1, "User Name 2","Hallo 2"));
        list.add(new User(R.drawable.avt2, "User Name 3","Hallo 3"));
        list.add(new User(R.drawable.avt3, "User Name 4","Hallo 4"));
        list.add(new User(R.drawable.avt4, "User Name 5","Hallo 5"));
        list.add(new User(R.drawable.avt5, "User Name 6","Hallo 6"));
        list.add(new User(R.drawable.avt6, "User Name 7","Hallo 7"));
        return list;
    }
}