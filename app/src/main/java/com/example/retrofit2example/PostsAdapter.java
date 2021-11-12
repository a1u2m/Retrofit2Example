package com.example.retrofit2example;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.ViewHolder> {

    private List<PostModel> posts;

    public PostsAdapter(List<PostModel> posts) {
        this.posts = posts;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        PostModel post = posts.get(position);
        holder.post.setText(Html.fromHtml(post.getElementPureHtml(), Html.FROM_HTML_MODE_LEGACY));
        holder.site.setText(post.getSite());
    }

    @Override
    public int getItemCount() {
        if (posts == null) return 0;
        return posts.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        AppCompatTextView post;
        AppCompatTextView site;

        public ViewHolder(View itemView) {
            super(itemView);
            post = itemView.findViewById(R.id.post);
            site = itemView.findViewById(R.id.site);
        }
    }

}
