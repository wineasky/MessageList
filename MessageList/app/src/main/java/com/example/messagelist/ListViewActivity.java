package com.example.messagelist;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.LinkedList;
import java.util.List;

public class ListViewActivity extends Activity {
    private List<MessageInfo> mDate = null;
    private ListView list_message;
    private MessageAdapter mAdapter = null;
    private Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("消息通知 listView");
        setContentView(R.layout.activity_list_view);

        list_message = (ListView)findViewById(R.id.mlist_item);
        mContext = ListViewActivity.this;
        mDate = new MData().getmDate();
        mAdapter = new MessageAdapter((LinkedList<MessageInfo>)mDate,mContext);
        list_message.setAdapter(mAdapter);

        Button button = (Button)findViewById(R.id.mbutton);
        button.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(ListViewActivity.this,RecyclerViewActivity.class);
                startActivity(intent);
                setTitle("消息通知 RecyclerView");
                }
            });
        }
}
