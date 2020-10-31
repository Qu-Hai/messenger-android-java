package com.example.appchat_hk5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.card.MaterialCardView;

import java.util.LinkedList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ListContentAdapter extends RecyclerView.Adapter<ListContentAdapter.ContentViewHolder> {
    final LinkedList<String> mListContent;
    LayoutInflater mInflater;
    public ListContentAdapter(Context context, LinkedList<String> mListContent) {
        mInflater = LayoutInflater.from(context);
        this.mListContent = mListContent;
    }

    @NonNull
    @Override
    public ContentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.list_content,parent,false);
        return new ContentViewHolder(itemView,this);
    }

    @Override
    public void onBindViewHolder(@NonNull ContentViewHolder holder, int position) {
        String currentObj = this.mListContent.get(position);
    }

    @Override
    public int getItemCount() {
        return this.mListContent.size();
    }

    public class ContentViewHolder extends RecyclerView.ViewHolder {
        public final MaterialCardView cvListContent;
        public final CircleImageView imgAvatar;
        public final TextView txtName;
        public final TextView txtSubContent;
        public final TextView txtTime;
        final ListContentAdapter mAdapter;
        public ContentViewHolder(@NonNull View itemView, ListContentAdapter mAdapter) {
            super(itemView);
            this.mAdapter = mAdapter;
            this.cvListContent = itemView.findViewById(R.id.cvListContent);
            this.imgAvatar = itemView.findViewById(R.id.imgAvatar);
            this.txtName = itemView.findViewById(R.id.txtName);
            this.txtSubContent = itemView.findViewById(R.id.txtSubContent);
            this.txtTime = itemView.findViewById(R.id.txtTime);
        }
    }
}
