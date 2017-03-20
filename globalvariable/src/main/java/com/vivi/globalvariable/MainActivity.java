package com.vivi.globalvariable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.vivi.globalvariable.R.id.button_name;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final MyApplication application = (MyApplication) getApplication();
        application.setName("全局变量");

        button = (Button) findViewById(R.id.button_name);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ShowNameActivity.class);
                startActivity(intent);
            }
        });
    }
}
