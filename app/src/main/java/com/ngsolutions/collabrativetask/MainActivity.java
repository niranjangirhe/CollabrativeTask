package com.ngsolutions.collabrativetask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.ngsolutions.collabrativetask.adapters.MainTaskAdapter;
import com.ngsolutions.collabrativetask.models.MainTaskModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerViewMain;
    ArrayList<MainTaskModel> mainTaskModels = new ArrayList<>();
    MainTaskAdapter mainTaskAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewMain = findViewById(R.id.taskrecycleview);

        LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerViewMain.setLayoutManager(layoutManager);
        mainTaskAdapter = new MainTaskAdapter(mainTaskModels, MainActivity.this);
        recyclerViewMain.setAdapter(mainTaskAdapter);
        MainTaskModel mainTaskModel = new MainTaskModel("4:20 PM 12 May","Science Homework PPT",1);
        mainTaskModels.add(mainTaskModel);
        mainTaskModel = new MainTaskModel("11:20 PM 12 May","History Assignment",1);
        mainTaskModels.add(mainTaskModel);
        mainTaskModel = new MainTaskModel("9:20 AM 14 May","Geography Poster Making",1);
        mainTaskModels.add(mainTaskModel);
        mainTaskModel = new MainTaskModel("4:20 PM 12 May","Science Homework PPT",1);
        mainTaskModels.add(mainTaskModel);
        mainTaskModel = new MainTaskModel("11:20 PM 12 May","History Assignment",1);
        mainTaskModels.add(mainTaskModel);
        mainTaskModel = new MainTaskModel("9:20 AM 14 May","Geography Poster Making",1);
        mainTaskModels.add(mainTaskModel);
        mainTaskModel = new MainTaskModel("4:20 PM 12 May","Science Homework PPT",1);
        mainTaskModels.add(mainTaskModel);
        mainTaskModel = new MainTaskModel("11:20 PM 12 May","History Assignment",1);
        mainTaskModels.add(mainTaskModel);
        mainTaskModel = new MainTaskModel("9:20 AM 14 May","Geography Poster Making",1);
        mainTaskModels.add(mainTaskModel);
        mainTaskModel = new MainTaskModel("4:20 PM 12 May","Science Homework PPT",1);
        mainTaskModels.add(mainTaskModel);
        mainTaskModel = new MainTaskModel("11:20 PM 12 May","History Assignment",1);
        mainTaskModels.add(mainTaskModel);
        mainTaskModel = new MainTaskModel("9:20 AM 14 May","Geography Poster Making",1);
        mainTaskModels.add(mainTaskModel);
        mainTaskModel = new MainTaskModel("4:20 PM 12 May","Science Homework PPT",1);
        mainTaskModels.add(mainTaskModel);
        mainTaskModel = new MainTaskModel("11:20 PM 12 May","History Assignment",1);
        mainTaskModels.add(mainTaskModel);
        mainTaskModel = new MainTaskModel("9:20 AM 14 May","Geography Poster Making",1);
        mainTaskModels.add(mainTaskModel);
        mainTaskModel = new MainTaskModel("4:20 PM 12 May","Science Homework PPT",1);
        mainTaskModels.add(mainTaskModel);
        mainTaskModel = new MainTaskModel("11:20 PM 12 May","History Assignment",1);
        mainTaskModels.add(mainTaskModel);
        mainTaskModel = new MainTaskModel("9:20 AM 14 May","Geography Poster Making",1);
        mainTaskModels.add(mainTaskModel);
        mainTaskAdapter.notifyDataSetChanged();
    }
}