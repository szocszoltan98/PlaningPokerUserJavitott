package com.example.planingpokeruser;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class GroupsList extends ArrayAdapter<Groups> {

    private Activity context;
    private List<Groups> groupsList;

    public GroupsList(Activity context, List<Groups> groupsList){
        super(context,R.layout.list_layout,groupsList);
        this.context=context;
        this.groupsList=groupsList;
    }
/*
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

       /* View listViewItem = inflater.inflate(R.layout.list_layout, null, true);

        TextView textViewName=(TextView)listViewItem.findViewById(R.id.txt_name);
        TextView textViewName2=(TextView)listViewItem.findViewById(R.id.txt_name2);

        Groups groups = groupsList.get(position);

        textViewName.setText(groups.getGroupname());
        textViewName2.setText(groups.getGroupname());
        return listViewItem;
    }*/
}
