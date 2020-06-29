package com.appstone.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ChatListActivity extends AppCompatActivity {

    private String TAG = "Activity-ChatList";

    private Button mBtnMoveToConversation; //Global Declaration

//    private String email;

    //Topics for next session
    //1. startActivityForResult
    //2. Implicit Intent


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_list);
        Log.i(TAG, "onCreate");

        //Local Declaration
//        Button mBtmMoveToConversation

        //Intent
        final EditText mEtEmailAddress = findViewById(R.id.et_email_address);

        mBtnMoveToConversation = findViewById(R.id.btn_move_conversation);

        mBtnMoveToConversation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = mEtEmailAddress.getText().toString();
                Intent conversationIntent = new Intent(ChatListActivity.this, ConversationActivity.class);
                conversationIntent.putExtra("EMAIL", email);
                startActivity(conversationIntent);

//                startActivity(new Intent(ChatListActivity.this, ConversationActivity.class).putExtra("EMAIL", mEtEmailAddress.getText().toString()));
            }
        });

    }

    //access-specifier return-type function-name(parameteres,... )
//    private boolean somefunction() {
//
//        return true;
//    }

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

    //backstack

    /**
     * 1. onCreate
     * 2. onStart (Broadcast Receiver)
     * 3. onResume
     * 4. onPause
     * 5. onStop
     * 6. onDestroy
     * 7. onRestart
     */
}
