package com.example.messagelist;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by w on 2017/7/17.
 */
public class MData {
    private List<MessageInfo> mDate = null;
    public  List<MessageInfo> getmDate() {

        mDate = new LinkedList<MessageInfo>();
        for (int i =0;i<4;i++){
        mDate.add(new MessageInfo
                ("交易提醒","恭喜，您已经成功买入刘强东(23888)…",
                        R.drawable.icon_news_trade,"2"));
        mDate.add(new MessageInfo
                ("预约提醒","恭喜，您已经成功约见刘强东(23888)…",
                        R.drawable.icon_news_order,"20"));
        mDate.add(new MessageInfo
                ("优惠券到期提醒","您有1张100元抵扣券(满1000使用)将…",
                        R.drawable.icon_news_coupon,"120"));
        mDate.add(new MessageInfo
                ("股价提醒","您自选的刘强东(2138)最新价9.2打开…",
                        R.drawable.icon_news_price,"120"));
        mDate.add(new MessageInfo
                ("充值/提现到账","您提现至支付宝1837113@qq.com已到…",
                        R.drawable.icon_news_account,"2"));
        }

        return mDate;
    }
}
