package com.example.mymessanger;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onSendMessage(View view){
        EditText messageview = (EditText) findViewById(R.id.message);
        String messagetext = messageview.getText().toString();
        Intent intent = new Intent(this,ReceiveActivity.class);
        intent.putExtra(ReceiveActivity.EXTRA_MESSAGE,messagetext);
        MainActivity(intent);
    }

}
