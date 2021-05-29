package com.ngsolutions.collabrativetask.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ngsolutions.collabrativetask.R;
import com.ngsolutions.collabrativetask.models.MainTaskModel;

import java.util.ArrayList;

public class MainTaskAdapter extends RecyclerView.Adapter{

    ArrayList<MainTaskModel> maintaskmodels;
    Context context;
    public MainTaskAdapter(ArrayList<MainTaskModel> maintaskmodels, Context context)
    {
        this.maintaskmodels = maintaskmodels;
        this.context = context;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.normaltask,parent,false);
        return  new MyTasks(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MainTaskModel mainTaskModel = maintaskmodels.get(position);
        ((MyTasks) holder).DateNTime.setText(mainTaskModel.getDate());
        ((MyTasks) holder).Title.setText(mainTaskModel.getTitle());
    }

    @Override
    public int getItemCount() {
        return maintaskmodels.size();
    }

    public class MyTasks extends RecyclerView.ViewHolder {
        TextView DateNTime, Title;
        ImageButton optionBtn;
        public MyTasks(@NonNull View itemView) {
            super(itemView);
            DateNTime = itemView.findViewById(R.id.DateNTimeNormal);
            Title = itemView.findViewById(R.id.TaskTitleNormal);
            optionBtn = itemView.findViewById(R.id.TaskOptionNormal);

        }
    }
}
