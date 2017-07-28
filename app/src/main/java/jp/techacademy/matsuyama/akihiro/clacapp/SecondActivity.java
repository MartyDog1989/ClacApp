package jp.techacademy.matsuyama.akihiro.clacapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        double value = intent.getDoubleExtra("value", 0);
        String value1 = intent.getStringExtra("value1");

        textView = (TextView) findViewById(R.id.textView);
        if(intent.hasExtra("value")) {
            textView.setText(String.valueOf(value));
        } else {
            textView.setText(value1);
        }
    }
}
