package chapter.android.aweme.ss.com.homework;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 作业2：一个抖音笔试题：统计页面所有view的个数
 * Tips：ViewGroup有两个API
 * {@link android.view.ViewGroup #getChildAt(int) #getChildCount()}
 * 用一个TextView展示出来
 */
public class Exercises2 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View inflate = LayoutInflater.from(this).inflate(R.layout.activity_chatroom , null);
        setContentView(inflate);
        int count = getViewCount(inflate);
        Log.d("exercise2", count + "");
    }

    public static int getViewCount(View view) {
        //todo 补全你的代码
        if (view == null) return 0;
        int sum = 1;
        if (!(view instanceof ViewGroup)) return 1;
        ViewGroup group = (ViewGroup)view;
        for (int i = 0; i < group.getChildCount(); i++)
            sum += getViewCount(group.getChildAt(i));
        return sum;
    }
}
