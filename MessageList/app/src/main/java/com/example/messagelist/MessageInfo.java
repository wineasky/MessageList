package com.example.messagelist;

/**
 * Created by w on 2017/7/17.
 */
public class MessageInfo {
   private String mTitle;
   private String mMessage;
   private int mIcon;
    private String num;

    public MessageInfo(String mTitle, String mMessage, int mIcon, String num) {
        this.mTitle = mTitle;
        this.mMessage = mMessage;
        this.mIcon = mIcon;
        this.num = num;
    }

    public MessageInfo() {
    }


    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmMessage() {
        return mMessage;
    }

    public void setmMessage(String mMessage) {
        this.mMessage = mMessage;
    }

    public int getmIcon() {
        return mIcon;
    }

    public void setmIcon(int mIcon) {
        this.mIcon = mIcon;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
