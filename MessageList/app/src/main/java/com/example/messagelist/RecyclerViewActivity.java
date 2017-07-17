package com.example.messagelist;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import junit.framework.TestResult;

import java.util.LinkedList;
import java.util.List;

public class RecyclerViewActivity extends Activity {
    private List<MessageInfo> mDate = null;
    private RecyclerView recyclerView_message;
    private RecyclerView.Adapter mAdapter;
    private Context mContext;
    private LinearLayoutManager mLauyoutManeger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        setTitle("消息通知 RecyclerView");
        //切换活动
        Button button = (Button)findViewById(R.id.rbutton);
        button.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(RecyclerViewActivity.this,ListViewActivity.class);
                startActivity(intent);
                setTitle("消息通知 ListView");
            }
        });
        //设置RecyclerView
        recyclerView_message = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView_message.setLayoutManager(new LinearLayoutManager(this));
        recyclerView_message.setItemAnimator(new DefaultItemAnimator());
        recyclerView_message.setHasFixedSize(true);

        mDate = new MData().getmDate();
        mAdapter = new MessageRecyclerAdapter((LinkedList<MessageInfo>)mDate,mContext);
        recyclerView_message.setAdapter(mAdapter);
    }
}
