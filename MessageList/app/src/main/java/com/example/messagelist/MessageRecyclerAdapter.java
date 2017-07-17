package com.example.messagelist;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by w on 2017/7/17.
 */
public class MessageRecyclerAdapter extends RecyclerView.Adapter  {
    private LinkedList<MessageInfo> mData;
    private Context mContext;

    public MessageRecyclerAdapter(LinkedList<MessageInfo> mData, Context mContext) {
        this.mData = mData;
        this.mContext = mContext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.list_item, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MessageInfo m = (MessageInfo) mData.get(position);
        ((ViewHolder)holder).txt_mTitle.setText(m.getmTitle());
        ((ViewHolder)holder).txt_mMessage.setText(m.getmMessage());
        ((ViewHolder)holder).txt_num.setText(m.getNum());
        ((ViewHolder)holder).img_mIcon.setBackgroundResource(m.getmIcon());
    }

    @Override
    public int getItemCount() {
        return mData == null ? 0 : mData.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView txt_mTitle;
        public TextView txt_mMessage;
        public TextView txt_num;
        public ImageView img_mIcon;


        public ViewHolder(View v) {
            super(v);
            txt_mTitle = (TextView)v.findViewById(R.id.txt_mTitle);
            txt_mMessage = (TextView)v.findViewById(R.id.txt_mMessage);
            txt_num = (TextView)v.findViewById(R.id.txt_num);
            img_mIcon = (ImageView)v.findViewById(R.id.img_mIcon);
        }
    }
}
