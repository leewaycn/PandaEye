package com.pandaq.pandaeye.ui.ImplView;

import com.pandaq.pandaqlib.magicrecyclerView.BaseItem;

import java.util.ArrayList;

/**
 * Created by PandaQ on 2016/9/8.
 * email : 767807368@qq.com
 * 豆瓣电影列表界面的绑定接口
 */
public interface IDoubanFrag {

    void showProgressBar();

    void hideProgressBar();

    void showEmptyMessage();

    void hideEmptyMessage();

    void loadMoreData();

    void refreshData();

    void loadSuccessed(ArrayList<BaseItem> movieSubjects);

    void loadFail(String errMsg);

    void refreshSucceed(ArrayList<BaseItem> movieSubjects);

    void refreshFail(String errMsg);
}
