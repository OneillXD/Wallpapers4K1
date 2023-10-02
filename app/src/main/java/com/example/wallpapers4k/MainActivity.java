package com.example.wallpapers4k;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import com.example.wallpapers4k.categories.CategoriesAdapter;
import com.example.wallpapers4k.categories.CategoriesList;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private final List<CategoriesList>categoriesLists = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView categoriesRecyclerView = findViewById(R.id.categoriesRecyclerview);
        categoriesRecyclerView.setHasFixedSize(true);
        categoriesRecyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this,2));


        AssetManager assetManager = getAssets();

        try {
            InputStream bmwIs = assetManager.open("bmw.jpg");
            Bitmap autoCategoryImg = BitmapFactory.decodeStream(bmwIs);

            InputStream animeIs = assetManager.open("anime1.jpg");
            Bitmap animeCategoryImg = BitmapFactory.decodeStream(animeIs);

            InputStream dcIs = assetManager.open("joker.jpg");
            Bitmap dcCategoryImg = BitmapFactory.decodeStream(dcIs);

            InputStream marcaIs = assetManager.open("bap.jpg");
            Bitmap marcaCategoryImg = BitmapFactory.decodeStream(marcaIs);

            InputStream videoIs = assetManager.open("cod.jpg");
            Bitmap videoCategoryImg = BitmapFactory.decodeStream(videoIs);

            CategoriesList autoCategory = new CategoriesList("auto",autoCategoryImg);
            categoriesLists.add(autoCategory);
            CategoriesList animeCategory = new CategoriesList("anime",animeCategoryImg);
            categoriesLists.add(animeCategory);
            CategoriesList dcCategory = new CategoriesList("dc",dcCategoryImg);
            categoriesLists.add(dcCategory);
            CategoriesList marcaCategory = new CategoriesList("marca",marcaCategoryImg);
            categoriesLists.add(marcaCategory);
            CategoriesList videoCategory = new CategoriesList("video",videoCategoryImg);
            categoriesLists.add(videoCategory);

            categoriesRecyclerView.setAdapter(new CategoriesAdapter(MainActivity.this,categoriesLists));




        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}