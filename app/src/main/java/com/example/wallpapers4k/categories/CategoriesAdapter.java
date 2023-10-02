package com.example.wallpapers4k.categories;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wallpapers4k.R;
import com.example.wallpapers4k.Wallpaper.Wallpaper;

import java.util.List;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.MyViewHolder> {
    private final Context context;
    private final List<CategoriesList>list;

    public CategoriesAdapter(Context context, List<CategoriesList> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public CategoriesAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.categories_adapter_layout, null));
    }

    @Override
    public void onBindViewHolder(@NonNull CategoriesAdapter.MyViewHolder holder, int position) {
        CategoriesList List1 = list.get(position);
        holder.categoryName.setText(List1.getName());
        holder.categoryImg.setImageBitmap(List1.getBitmap());

        holder.categoryImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context, Wallpaper.class).putExtra("category" ,List1.getName()));


            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {
        private final TextView categoryName;
        private final ImageView categoryImg;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            categoryName = itemView.findViewById(R.id.categoryName);
            categoryImg =itemView.findViewById(R.id.categoryImg);

        }
    }

}
