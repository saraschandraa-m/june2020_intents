package com.appstone.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConversationActivity extends AppCompatActivity {

    private String TAG = "Activity-Conversation";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversation);
        Log.i(TAG, "onCreate");

        Button mBtnMoveToProfileClosing = findViewById(R.id.btn_move_profile_closing);
        Button mBtnMoveToProfile = findViewById(R.id.btn_move_profile);
        TextView mTvEmailAddress = findViewById(R.id.tv_email_address);


        Bundle data = getIntent().getExtras();

        String email = data.getString("EMAIL", "Default Value");
//

//        String email = getIntent().getStringExtra("EMAIL");

        mTvEmailAddress.setText(email);

        mBtnMoveToProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent profileIntent = new Intent(ConversationActivity.this, ProfileActivity.class);
                startActivity(profileIntent);
            }
        });

        mBtnMoveToProfileClosing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent profileIntent = new Intent(ConversationActivity.this, ProfileActivity.class);
                startActivity(profileIntent);
                finish();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart");
    }
}
