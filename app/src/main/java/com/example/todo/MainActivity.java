package com.example.todo;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv1;
    Button btn;
    ArrayList<Data> mylist = new ArrayList<Data>();
    DataAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv1 = findViewById(R.id.ListView1);
        btn = findViewById(R.id.button);
        ActivityResultLauncher<Intent> launcher = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult result) {
                        if (result.getResultCode() == Activity.RESULT_OK) {
                            Toast.makeText(MainActivity.this, "jshdhhdff", Toast.LENGTH_SHORT).show();
                            Intent intent = result.getData();
                            String name = intent.getStringExtra("name");
                            String des = intent.getStringExtra("des");
                            String date = intent.getStringExtra("date");
                            Boolean check = intent.getBooleanExtra("check",true);
                            int n = mylist.size();
                            mylist.add(new Data(n+1,name,des,date,check));
                            adapter = new DataAdapter(MainActivity.this, R.layout.custom_item, mylist);
                            lv1.setAdapter(adapter);

                        }
                    }
                }
        );

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launcher.launch(new Intent(MainActivity.this, DetailsActivity.class));
            }
        });


    }
}