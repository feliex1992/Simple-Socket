package com.example.jp.simplesocket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText el;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        el = (EditText)findViewById(R.id.editText);
    }

    public void Send(View view){
        SocketClient socketClient = new SocketClient();
        socketClient.execute(el.getText().toString());
    }
}
