package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Recycleradapter extends RecyclerView.Adapter<Recycleradapter.viewHoldere>{
    Context context;
    ArrayList<contactModel> ss;
    Recycleradapter(Context context, ArrayList<contactModel> ss)
    {
        this.context=context;
        this.ss=ss;
    }
    @NonNull
    @Override
    public viewHoldere onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

       View v=  LayoutInflater.from(context).inflate(R.layout.row,parent,false);
        viewHoldere viewholder=new viewHoldere(v);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHoldere holder, int position) {
  holder.imm.setImageResource(ss.get(position).img);
        holder.txtname.setText(ss.get(position).name);
        holder.txtnumber.setText(ss.get(position).number);
    }

    @Override
    public int getItemCount() {
        return ss.size();
    }

    public class viewHoldere extends RecyclerView.ViewHolder
    {
        TextView txtname,txtnumber;
        ImageView imm;
     public viewHoldere(@NonNull View a)
     {
super(a);
      txtname=a.findViewById(R.id.contactname);
       txtnumber=a.findViewById(R.id.contactno);
       imm=a.findViewById(R.id.contactimg);
     }
    }
}
