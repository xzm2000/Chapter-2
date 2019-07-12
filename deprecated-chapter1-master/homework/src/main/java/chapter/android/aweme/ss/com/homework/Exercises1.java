package chapter.android.aweme.ss.com.homework;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * 作业1：
 * 打印出Activity屏幕切换 Activity会执行什么生命周期？
 */
public class Exercises1 extends AppCompatActivity {


    TextView logss;
    static String ans = "";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise1);
        logss  = findViewById(R.id.textView);
        if (savedInstanceState != null) {
            if (savedInstanceState.containsKey("callbacks")) {
                String savedContent = (String) savedInstanceState.get("callbacks");
                logss.setText(savedContent);
            }
        }
        Log.d("change","onCreate");
        ans += "onCreate\n";
        logss.setText(ans);
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("change","onRestart");
        ans += "onRestart\n";
        logss  = findViewById(R.id.textView);
        logss.setText(ans);
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("change","onStop");
        ans += "onStop\n";
        logss  = findViewById(R.id.textView);
        logss.setText(ans);
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("change","onPause");
        ans += "onPause\n";
        logss  = findViewById(R.id.textView);
        logss.setText(ans);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("change","onStart");
        ans += "onStart\n";
        logss  = findViewById(R.id.textView);
        logss.setText(ans);
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("change","onResume");
        ans += "onResume\n";
        logss  = findViewById(R.id.textView);
        logss.setText(ans);
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("change","onDestroy");
        ans += "onDestroy\n";
        logss  = findViewById(R.id.textView);
        logss.setText(ans);
    }

    @Override
    protected void onSaveInstanceState(Bundle State){
        super.onSaveInstanceState(State);
        Log.d("change","onSaveInstanceState");
        ans += "onSaveInstanceState\n";
        logss  = findViewById(R.id.textView);
        logss.setText(ans);
    }
}
