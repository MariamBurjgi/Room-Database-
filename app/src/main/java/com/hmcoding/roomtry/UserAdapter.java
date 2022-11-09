package com.hmcoding.roomtry;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

    Context context;
    List<userModel> list;

    public UserAdapter(Context context, List<userModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_layout,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.phone.setText(list.get(position).getPhoneno());
        holder.name.setText(list.get(position).getName());
        holder.address.setText(list.get(position).getAddress());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView name,address,phone;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            phone=itemView.findViewById(R.id.phone);
            address=itemView.findViewById(R.id.address);
            name=itemView.findViewById(R.id.name);
        }
    }


}
