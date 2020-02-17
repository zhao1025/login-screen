package com.example.uiwidgettest;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText eusernumber;
    private EditText euserpassword;
    private Button  btnlogin;
    private Button  btncode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eusernumber = (EditText) findViewById(R.id.e_user_number);
        euserpassword = (EditText) findViewById(R.id.e_user_password);
        btnlogin = (Button) findViewById(R.id.b_btn_login);
        btncode = (Button) findViewById(R.id.b_btn_code);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = eusernumber.getText().toString();
                String userpassword = euserpassword.getText().toString();
                    Toast.makeText(MainActivity.this,"登录成功",Toast.LENGTH_SHORT).show();
            }
        });
        btncode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = eusernumber.getText().toString();
                String userpassword = euserpassword.getText().toString();
                    Toast.makeText(MainActivity.this,"验证码已发送至您的手机",Toast.LENGTH_SHORT).show();

            }
        });
    }
}