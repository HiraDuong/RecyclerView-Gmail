package com.example.recyclerview_gmail;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.UserViewHolder> {
    private Context mContext;
    private List<User> mListUser;

    public Adapter(Context mContext) {
        this.mContext = mContext;
    }

    public  void setData(List<User> list){
        this.mListUser = list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user,parent,false);
        return new UserViewHolder(view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User user = mListUser.get(position);
        if(user == null){
            return;
        }
        holder.imgUser.setImageResource(user.getResourceId());
        holder.nameUser.setText(user.getName());
        holder.subText.setText(user.getSubText());
    }

    @Override
    public int getItemCount() {
        if(mListUser!= null){
            return mListUser.size();
        }
        return 0;
    }

    public class UserViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgUser;
        private TextView nameUser;
        private TextView subText;
        public UserViewHolder(@NonNull View itemView) {
            super(itemView);

            imgUser = itemView.findViewById(R.id.user_avt);
            nameUser = itemView.findViewById(R.id.user_name);
            subText = itemView.findViewById(R.id.subText);
        }
    }
}
