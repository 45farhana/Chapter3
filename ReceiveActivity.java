package com.example.mymessanger;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveActivity extends Activity {

    public static final String EXTRA_MESSAGE ="message" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive);
        Intent intent=getIntent();
        String messagetext =intent.getStringExtra(EXTRA_MESSAGE);
        TextView messageview =(TextView) findViewById(R.id.message);
        messageview.setText(messagetext);
    }
}
