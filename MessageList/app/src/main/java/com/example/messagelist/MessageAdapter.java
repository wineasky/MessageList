package com.example.messagelist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.LinkedList;

public class MessageAdapter extends BaseAdapter {

    private LinkedList<MessageInfo> mData;
    private Context mContext;


   public MessageAdapter(LinkedList<MessageInfo> mData, Context mContext) {
        this.mData = mData;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(mContext).
                inflate(R.layout.list_item,parent,false);

        TextView txt_mTitle = (TextView)convertView.findViewById(R.id.txt_mTitle);
        TextView txt_mMessage = (TextView)convertView.findViewById(R.id.txt_mMessage);
        TextView txt_num = (TextView)convertView.findViewById(R.id.txt_num);
        ImageView img_mIcon = (ImageView)convertView.findViewById(R.id.img_mIcon);

        txt_mTitle.setText(mData.get(position).getmTitle());
        txt_mMessage.setText(mData.get(position).getmMessage());
        img_mIcon.setBackgroundResource(mData.get(position).getmIcon());
        txt_num.setText(mData.get(position).getNum());
        return convertView;
    }
}
