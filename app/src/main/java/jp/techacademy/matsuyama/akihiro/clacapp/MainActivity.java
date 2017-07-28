package jp.techacademy.matsuyama.akihiro.clacapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.text.InputType.TYPE_CLASS_NUMBER;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText mEditView1;
    EditText mEditView2;
    SpannableStringBuilder sb1;
    SpannableStringBuilder sb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditView1 = (EditText)findViewById(R.id.editText1);
        mEditView2 = (EditText)findViewById(R.id.editText2);
        sb1 = (SpannableStringBuilder)mEditView1.getText();
        sb2 = (SpannableStringBuilder)mEditView2.getText();

        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = (Button)findViewById(R.id.button4);
        button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button1) {
            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra("value", Double.parseDouble(sb1.toString()) + Double.parseDouble(sb2.toString()));
            startActivity(intent);
        }
        else if(v.getId() == R.id.button2) {
            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra("value", Double.parseDouble(sb1.toString()) - Double.parseDouble(sb2.toString()));
            startActivity(intent);
        }
        else if(v.getId() == R.id.button3) {
            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra("value", Double.parseDouble(sb1.toString()) * Double.parseDouble(sb2.toString()));
            startActivity(intent);
        }
        else if(v.getId() == R.id.button4){
            Intent intent = new Intent(this, SecondActivity.class);
            if(Double.parseDouble(sb2.toString()) == 0) {
                intent.putExtra("value1", "ゼロでは除算できません");
            } else {
                intent.putExtra("value", Double.parseDouble(sb1.toString()) / Double.parseDouble(sb2.toString()));
            }
            startActivity(intent);
        }

    }
}
