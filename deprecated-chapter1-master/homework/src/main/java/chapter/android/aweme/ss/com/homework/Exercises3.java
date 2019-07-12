package chapter.android.aweme.ss.com.homework;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Adapter;

import java.io.InputStream;
import java.util.List;

import chapter.android.aweme.ss.com.homework.model.Message;
import chapter.android.aweme.ss.com.homework.model.PullParser;
import chapter.android.aweme.ss.com.homework.adapter.MsgAdapter;

/**
 * 大作业:实现一个抖音消息页面,所需资源已放在res下面
 */
public class Exercises3 extends AppCompatActivity implements MsgAdapter.OnListItemClickListener{

    private List<Message> messages;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise3);
        try {
            InputStream inputStream = getAssets().open("data.xml");
            messages = PullParser.pull2xml(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }

        initRecyclerView();

    }

    private void initRecyclerView() {
        RecyclerView rv_msg = findViewById(R.id.rv_msg);

        //列表方向
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rv_msg.setLayoutManager(linearLayoutManager);

        //适配器设置
        MsgAdapter msgAdapter = new MsgAdapter(messages,this);
        rv_msg.setAdapter(msgAdapter);
    }

    @Override
    public void onListItemClick(String name) {
        Intent intent = new Intent(this, ChatroomActivity.class);
        intent.putExtra(ChatroomActivity.object,name);
        startActivity(intent);
    }
}
