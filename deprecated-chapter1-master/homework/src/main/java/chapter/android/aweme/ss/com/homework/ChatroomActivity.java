package chapter.android.aweme.ss.com.homework;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ChatroomActivity extends AppCompatActivity {

    public static final String object = "CHAT_OBJECT";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatroom);

        TextView title = findViewById(R.id.tv_with_name);
        Intent intent = getIntent();
        String chat_object = intent.getStringExtra(object);
        title.setText(chat_object);
    }
}
