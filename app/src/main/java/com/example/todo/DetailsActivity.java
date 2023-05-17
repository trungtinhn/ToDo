package com.example.todo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    TextView title;
    TextView descrip;
    TextView date;
    CheckBox check;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        title = findViewById(R.id.text_title);
        descrip = findViewById(R.id.text_descrip);
        date = findViewById(R.id.text_time);
        check = findViewById(R.id.check);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailsActivity.this, MainActivity.class);
                intent.putExtra("name",title.getText().toString());
                intent.putExtra("des",descrip.getText().toString());
                intent.putExtra("date",date.getText().toString());
                intent.putExtra("check", check.isChecked());
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}