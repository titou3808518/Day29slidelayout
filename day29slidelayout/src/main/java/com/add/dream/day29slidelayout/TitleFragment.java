package com.add.dream.day29slidelayout;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by DELL on 2016/6/2.
 */
public class TitleFragment extends ListFragment{

    private onTitleItemClickedListenner listenner;

    public interface  onTitleItemClickedListenner{
        void onTitleItemClicked(int position);
    }

    public void setOnTitleItemClickedListenner(onTitleItemClickedListenner listenner){
        this.listenner=listenner;
    }

    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        setOnTitleItemClickedListenner((onTitleItemClickedListenner) getActivity());
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        String[] strings = {"百度","网易","搜狐"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1,strings);
        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        if(listenner!=null){
           listenner.onTitleItemClicked(position);
        }
    }
}
