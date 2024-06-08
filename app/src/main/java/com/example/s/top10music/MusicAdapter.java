package com.example.s.top10music;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by S on 16/08/2017.
 */

public class MusicAdapter extends ArrayAdapter {
    List list =new ArrayList();

    public MusicAdapter( Context context,int resource) {
        super(context, resource);
    }

    static class DataHandeler{
        ImageView poster;
        TextView title;
        TextView views;

    }
    public void add(Object object){
        super.add(object);
        list.add(object);

    }
    public int getCount(){
        return  this.list.size();
    }

    public Object getItem(int position)
    {
        return this.list.get(position);
    }

    public View getView(int position, View convertView, ViewGroup parent)
    {
        View row;
        row = convertView;
        DataHandeler handeler=new DataHandeler();
        if(convertView==null)
        {
            LayoutInflater inflater= (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            row=inflater.inflate(R.layout.row_layout,parent,false);
            handeler.poster= (ImageView) row.findViewById(R.id.music_poster);
            handeler.title= (TextView) row.findViewById(R.id.music_title);
            handeler.views= (TextView) row.findViewById(R.id.music_views);

            row.setTag(handeler);
        }
        else {
            handeler= (DataHandeler) row.getTag();

        }
        MusicDataProvider dataprovider;
        dataprovider= (MusicDataProvider) this.getItem(position);
        handeler.poster.setImageResource(dataprovider.getMusic_poster_ressource());
        handeler.title.setText(dataprovider.getMusic_title());
        handeler.views.setText(dataprovider.getMusic_views());

        return row;
    }
}
