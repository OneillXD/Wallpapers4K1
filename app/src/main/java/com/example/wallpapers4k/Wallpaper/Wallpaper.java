package com.example.wallpapers4k.Wallpaper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.wallpapers4k.R;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Wallpaper extends AppCompatActivity {
    private final List<WallpaperList> wallpaperLists =new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallpaper);
        final ImageView backBtn = findViewById(R.id.backBtn);
        final TextView categoryName = findViewById(R.id.categoryName);
        final RecyclerView wallpaperRecyclerView = findViewById(R.id.wallpaperRecyclerView);



        final String getCategory =getIntent().getStringExtra("category");
        categoryName.setText(getCategory);

        wallpaperRecyclerView.setLayoutManager(new GridLayoutManager(Wallpaper.this , 2));
        wallpaperRecyclerView.setItemViewCacheSize(20);
        wallpaperRecyclerView.setDrawingCacheEnabled(true);

        AssetManager assetManager = getAssets();

        ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setCancelable(false);
        progressDialog.setMessage("loading....");
        progressDialog.show();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                if(getCategory.equals("auto")){

                        InputStream bmwIs_1 = assetManager.open("bmw.jpg");
                    Bitmap bmwImg = BitmapFactory.decodeStream(bmwIs_1);

                    InputStream bmwIs_2 = assetManager.open("audi.jpg");
                    Bitmap bmwImg2 = BitmapFactory.decodeStream(bmwIs_2);

                    InputStream bmwIs_3 = assetManager.open("hyundai.jpg");
                    Bitmap bmwImg3 = BitmapFactory.decodeStream(bmwIs_3);

                    InputStream bmwIs_4 = assetManager.open("nissan.jpg");
                    Bitmap bmwImg4 = BitmapFactory.decodeStream(bmwIs_4);

                    InputStream bmwIs_5 = assetManager.open("mercedes.jpg");
                    Bitmap bmwImg5 = BitmapFactory.decodeStream(bmwIs_5);

                    InputStream bmwIs_6 = assetManager.open("t.jpg");
                    Bitmap bmwImg6 = BitmapFactory.decodeStream(bmwIs_6);

                    InputStream bmwIs_7 = assetManager.open("xd.jpg");
                    Bitmap bmwImg7 = BitmapFactory.decodeStream(bmwIs_7);

                    InputStream bmwIs_8 = assetManager.open("vista.jpg");
                    Bitmap bmwImg8 = BitmapFactory.decodeStream(bmwIs_8);

                    InputStream bmwIs_9 = assetManager.open("nave1.jpg");
                    Bitmap bmwImg9 = BitmapFactory.decodeStream(bmwIs_9);

                    InputStream bmwIs_10 = assetManager.open("gtr.jpg");
                    Bitmap bmwImg10 = BitmapFactory.decodeStream(bmwIs_10);

                    InputStream bmwIs_11 = assetManager.open("speed.jpg");
                    Bitmap bmwImg11 = BitmapFactory.decodeStream(bmwIs_11);

                    InputStream bmwIs_12 = assetManager.open("fast.jpg");
                    Bitmap bmwImg12 = BitmapFactory.decodeStream(bmwIs_12);


                    //add data
                    WallpaperList wallpaperList = new WallpaperList("bmw.jpg", bmwImg);
                    wallpaperLists.add(wallpaperList);

                    WallpaperList wallpaperList2 = new WallpaperList("audi.jpg", bmwImg2);
                    wallpaperLists.add(wallpaperList2);

                    WallpaperList wallpaperList3 = new WallpaperList("hyundai.jpg", bmwImg3);
                    wallpaperLists.add(wallpaperList3);

                    WallpaperList wallpaperList4 = new WallpaperList("nissan.jpg", bmwImg4);
                    wallpaperLists.add(wallpaperList4);

                    WallpaperList wallpaperList5 = new WallpaperList("mercedes.jpg", bmwImg5);
                    wallpaperLists.add(wallpaperList5);

                    WallpaperList wallpaperList6 = new WallpaperList("t.jpg", bmwImg6);
                    wallpaperLists.add(wallpaperList6);

                    WallpaperList wallpaperList7 = new WallpaperList("bmw.jpg", bmwImg7);
                    wallpaperLists.add(wallpaperList7);

                    WallpaperList wallpaperList8 = new WallpaperList("vista.jpg", bmwImg8);
                    wallpaperLists.add(wallpaperList8);

                    WallpaperList wallpaperList9 = new WallpaperList("nave1.jpg", bmwImg9);
                    wallpaperLists.add(wallpaperList9);

                    WallpaperList wallpaperList10 = new WallpaperList("gtr.jpg", bmwImg10);
                    wallpaperLists.add(wallpaperList10);

                    WallpaperList wallpaperList11 = new WallpaperList("speed.jpg", bmwImg11);
                    wallpaperLists.add(wallpaperList11);

                    WallpaperList wallpaperList12 = new WallpaperList("fast.jpg", bmwImg12);
                    wallpaperLists.add(wallpaperList12);












                } else if (getCategory.equals("video")) {
                    InputStream videoIs1 = assetManager.open("god.jpg");
                    Bitmap videoImg = BitmapFactory.decodeStream(videoIs1);

                    InputStream videoIs2 = assetManager.open("danger.jpg");
                    Bitmap videoImg2 = BitmapFactory.decodeStream(videoIs2);

                    InputStream videoIs3 = assetManager.open("fe.jpg");
                    Bitmap videoImg3 = BitmapFactory.decodeStream(videoIs3);

                    InputStream videoIs4 = assetManager.open("not.jpg");
                    Bitmap videoImg4 = BitmapFactory.decodeStream(videoIs4);

                    InputStream videoIs5 = assetManager.open("cod.jpg");
                    Bitmap videoImg5 = BitmapFactory.decodeStream(videoIs5);

                    InputStream videoIs6 = assetManager.open("red.jpg");
                    Bitmap videoImg6 = BitmapFactory.decodeStream(videoIs6);

                    InputStream videoIs7 = assetManager.open("word.jpg");
                    Bitmap videoImg7 = BitmapFactory.decodeStream(videoIs7);

                    InputStream videoIs8 = assetManager.open("x.jpg");
                    Bitmap videoImg8 = BitmapFactory.decodeStream(videoIs8);

                    InputStream videoIs9 = assetManager.open("mario.jpg");
                    Bitmap videoImg9 = BitmapFactory.decodeStream(videoIs9);

                    InputStream videoIs10 = assetManager.open("triangulo.jpg");
                    Bitmap videoImg10 = BitmapFactory.decodeStream(videoIs10);

                    InputStream videoIs11 = assetManager.open("sol.jpg");
                    Bitmap videoImg11 = BitmapFactory.decodeStream(videoIs11);

                    InputStream videoIs13 = assetManager.open("crash.jpg");
                    Bitmap videoImg13 = BitmapFactory.decodeStream(videoIs13);

                    WallpaperList videoList1 = new WallpaperList("god.jpg",videoImg);
                    wallpaperLists.add(videoList1);

                    WallpaperList videoList2 = new WallpaperList("danger.jpg",videoImg2);
                    wallpaperLists.add(videoList2);

                    WallpaperList videoList3 = new WallpaperList("fe.jpg",videoImg3);
                    wallpaperLists.add(videoList3);

                    WallpaperList videoList4 = new WallpaperList("not.jpg",videoImg4);
                    wallpaperLists.add(videoList4);

                    WallpaperList videoList5 = new WallpaperList("cod.jpg",videoImg5);
                    wallpaperLists.add(videoList5);

                    WallpaperList videoList6 = new WallpaperList("red.jpg",videoImg6);
                    wallpaperLists.add(videoList6);

                    WallpaperList videoList7 = new WallpaperList("word.jpg",videoImg7);
                    wallpaperLists.add(videoList7);

                    WallpaperList videoList8 = new WallpaperList("x.jpg",videoImg8);
                    wallpaperLists.add(videoList8);

                    WallpaperList videoList9 = new WallpaperList("mario.jpg",videoImg9);
                    wallpaperLists.add(videoList9);

                    WallpaperList videoList10 = new WallpaperList("triangulo.jpg",videoImg10);
                    wallpaperLists.add(videoList10);

                    WallpaperList videoList11 = new WallpaperList("sol.jpg",videoImg11);
                    wallpaperLists.add(videoList11);

                    WallpaperList videoList13 = new WallpaperList("crash.jpg",videoImg13);
                    wallpaperLists.add(videoList13);





                } else if (getCategory.equals("anime")) {
                    InputStream animeIs1 = assetManager.open("anime1.jpg");
                    Bitmap animeImg1 = BitmapFactory.decodeStream(animeIs1);
                    InputStream animeIs2 = assetManager.open("nice.jpg");
                    Bitmap animeImg2 = BitmapFactory.decodeStream(animeIs2);
                    InputStream animeIs3 = assetManager.open("dead.jpg");
                    Bitmap animeImg3 = BitmapFactory.decodeStream(animeIs3);
                    InputStream animeIs4 = assetManager.open("app.jpg");
                    Bitmap animeImg4 = BitmapFactory.decodeStream(animeIs4);
                    InputStream animeIs5 = assetManager.open("sake.jpg");
                    Bitmap animeImg5 = BitmapFactory.decodeStream(animeIs5);
                    InputStream animeIs6 = assetManager.open("jaja.jpg");
                    Bitmap animeImg6 = BitmapFactory.decodeStream(animeIs6);
                    InputStream animeIs7 = assetManager.open("nose.jpg");
                    Bitmap animeImg7 = BitmapFactory.decodeStream(animeIs7);
                    InputStream animeIs8 = assetManager.open("china.jpg");
                    Bitmap animeImg8 = BitmapFactory.decodeStream(animeIs8);
                    InputStream animeIs9 = assetManager.open("win.jpg");
                    Bitmap animeImg9 = BitmapFactory.decodeStream(animeIs9);
                    InputStream animeIs10 = assetManager.open("tp.jpg");
                    Bitmap animeImg10 = BitmapFactory.decodeStream(animeIs10);
                    InputStream animeIs11 = assetManager.open("supre.jpg");
                    Bitmap animeImg11 = BitmapFactory.decodeStream(animeIs11);
                    InputStream animeIs12 = assetManager.open("good.jpg");
                    Bitmap animeImg12 = BitmapFactory.decodeStream(animeIs12);
                    InputStream animeIs13 = assetManager.open("naruto.jpg");
                    Bitmap animeImg13 = BitmapFactory.decodeStream(animeIs13);
                    InputStream animeIs14 = assetManager.open("bas.jpg");
                    Bitmap animeImg14 = BitmapFactory.decodeStream(animeIs14);
                    InputStream animeIs15 = assetManager.open("guia.jpg");
                    Bitmap animeImg15 = BitmapFactory.decodeStream(animeIs15);


                    WallpaperList animeList1 = new WallpaperList("anime.jpg",animeImg1);
                    wallpaperLists.add(animeList1);
                    WallpaperList animeList2 = new WallpaperList("nice.jpg",animeImg2);
                    wallpaperLists.add(animeList2);
                    WallpaperList animeList3 = new WallpaperList("dead.jpg",animeImg3);
                    wallpaperLists.add(animeList3);
                    WallpaperList animeList4 = new WallpaperList("app.jpg",animeImg4);
                    wallpaperLists.add(animeList4);
                    WallpaperList animeList5 = new WallpaperList("jaja.jpg",animeImg5);
                    wallpaperLists.add(animeList5);
                    WallpaperList animeList6 = new WallpaperList("nose.jpg",animeImg6);
                    wallpaperLists.add(animeList6);
                    WallpaperList animeList8 = new WallpaperList("china.jpg",animeImg8);
                    wallpaperLists.add(animeList8);
                    WallpaperList animeList9 = new WallpaperList("win.jpg",animeImg9);
                    wallpaperLists.add(animeList9);
                    WallpaperList animeList10 = new WallpaperList("tp.jpg",animeImg10);
                    wallpaperLists.add(animeList10);
                    WallpaperList animeList11 = new WallpaperList("supre.jpg",animeImg11);
                    wallpaperLists.add(animeList11);
                    WallpaperList animeList12 = new WallpaperList("good.jpg",animeImg12);
                    wallpaperLists.add(animeList12);
                    WallpaperList animeList13 = new WallpaperList("naruto.jpg",animeImg13);
                    wallpaperLists.add(animeList13);
                    WallpaperList animeList14 = new WallpaperList("bas.jpg",animeImg14);
                    wallpaperLists.add(animeList14);
                    WallpaperList animeList15 = new WallpaperList("guia.jpg",animeImg15);
                    wallpaperLists.add(animeList15);


                } else if (getCategory.equals("dc")) {
                    InputStream dcIs1 = assetManager.open("joker.jpg");
                    Bitmap dcImg1 = BitmapFactory.decodeStream(dcIs1);
                    InputStream dcIs2 = assetManager.open("coringa.jpg");
                    Bitmap dcImg2 = BitmapFactory.decodeStream(dcIs2);
                    InputStream dcIs3 = assetManager.open("bat.jpg");
                    Bitmap dcImg3 = BitmapFactory.decodeStream(dcIs3);
                    InputStream dcIs4 = assetManager.open("flash.jpg");
                    Bitmap dcImg4 = BitmapFactory.decodeStream(dcIs4);
                    InputStream dcIs5 = assetManager.open("tunas.jpg");
                    Bitmap dcImg5 = BitmapFactory.decodeStream(dcIs5);
                    InputStream dcIs6 = assetManager.open("ds.jpg");
                    Bitmap dcImg6 = BitmapFactory.decodeStream(dcIs6);
                    InputStream dcIs7 = assetManager.open("wal.jpg");
                    Bitmap dcImg7 = BitmapFactory.decodeStream(dcIs7);
                    InputStream dcIs8 = assetManager.open("seri.jpg");
                    Bitmap dcImg8 = BitmapFactory.decodeStream(dcIs8);
                    InputStream dcIs9 = assetManager.open("bati.jpg");
                    Bitmap dcImg9 = BitmapFactory.decodeStream(dcIs9);
                    InputStream dcIs10 = assetManager.open("dw.jpg");
                    Bitmap dcImg10 = BitmapFactory.decodeStream(dcIs10);
                    InputStream dcIs11 = assetManager.open("robin.jpg");
                    Bitmap dcImg11 = BitmapFactory.decodeStream(dcIs11);
                    InputStream dcIs12 = assetManager.open("linterna.jpg");
                    Bitmap dcImg12 = BitmapFactory.decodeStream(dcIs12);


                    WallpaperList dcList1 = new WallpaperList("joker.jpg",dcImg1);
                    wallpaperLists.add(dcList1);
                    WallpaperList dcList2 = new WallpaperList("coringa.jpg",dcImg2);
                    wallpaperLists.add(dcList2);
                    WallpaperList dcList3 = new WallpaperList("bat.jpg",dcImg3);
                    wallpaperLists.add(dcList3);
                    WallpaperList dcList4 = new WallpaperList("flash.jpg",dcImg4);
                    wallpaperLists.add(dcList4);
                    WallpaperList dcList5 = new WallpaperList("tunas.jpg",dcImg5);
                    wallpaperLists.add(dcList5);
                    WallpaperList dcList6 = new WallpaperList("ds.jpg",dcImg6);
                    wallpaperLists.add(dcList6);
                    WallpaperList dcList7 = new WallpaperList("wal.jpg",dcImg7);
                    wallpaperLists.add(dcList7);
                    WallpaperList dcList8 = new WallpaperList("seri.jpg",dcImg8);
                    wallpaperLists.add(dcList8);
                    WallpaperList dcList9 = new WallpaperList("bati.jpg",dcImg9);
                    wallpaperLists.add(dcList9);
                    WallpaperList dcList10 = new WallpaperList("dw.jpg",dcImg10);
                    wallpaperLists.add(dcList10);
                    WallpaperList dcList11 = new WallpaperList("robin.jpg",dcImg11);
                    wallpaperLists.add(dcList11);
                    WallpaperList dcList12 = new WallpaperList("literna.jpg",dcImg12);
                    wallpaperLists.add(dcList12);



                } else if (getCategory.equals("marca")) {
                    InputStream marcaIs1 = assetManager.open("bap7.jpg");
                    Bitmap marcaImg1 = BitmapFactory.decodeStream(marcaIs1);
                    InputStream marcaIs2 = assetManager.open("bap.jpg");
                    Bitmap marcaImg2 = BitmapFactory.decodeStream(marcaIs2);
                    InputStream marcaIs3 = assetManager.open("bulls.jpg");
                    Bitmap marcaImg3 = BitmapFactory.decodeStream(marcaIs3);
                    InputStream marcaIs4 = assetManager.open("bulls5.jpg");
                    Bitmap marcaImg4 = BitmapFactory.decodeStream(marcaIs4);
                    InputStream marcaIs5 = assetManager.open("jordan.jpg");
                    Bitmap marcaImg5 = BitmapFactory.decodeStream(marcaIs5);
                    InputStream marcaIs6 = assetManager.open("jordan2.jpg");
                    Bitmap marcaImg6 = BitmapFactory.decodeStream(marcaIs6);
                    InputStream marcaIs7 = assetManager.open("jordan3.jpg");
                    Bitmap marcaImg7 = BitmapFactory.decodeStream(marcaIs7);
                    InputStream marcaIs8 = assetManager.open("re.jpg");
                    Bitmap marcaImg8 = BitmapFactory.decodeStream(marcaIs8);
                    InputStream marcaIs9 = assetManager.open("de.jpg");
                    Bitmap marcaImg9 = BitmapFactory.decodeStream(marcaIs9);
                    InputStream marcaIs10 = assetManager.open("gang.jpg");
                    Bitmap marcaImg10 = BitmapFactory.decodeStream(marcaIs10);

                    WallpaperList marcaList1 = new WallpaperList("bap7.jpg",marcaImg1);
                    wallpaperLists.add(marcaList1);
                    WallpaperList marcaList2 = new WallpaperList("bap.jpg",marcaImg2);
                    wallpaperLists.add(marcaList2);
                    WallpaperList marcaList3 = new WallpaperList("bulls.jpg",marcaImg3);
                    wallpaperLists.add(marcaList3);
                    WallpaperList marcaList4 = new WallpaperList("bulls7.jpg",marcaImg4);
                    wallpaperLists.add(marcaList4);
                    WallpaperList marcaList5 = new WallpaperList("jordan.jpg",marcaImg5);
                    wallpaperLists.add(marcaList5);
                    WallpaperList marcaList6 = new WallpaperList("jordan2.jpg",marcaImg6);
                    wallpaperLists.add(marcaList6);
                    WallpaperList marcaList7 = new WallpaperList("jordan3.jpg",marcaImg7);
                    wallpaperLists.add(marcaList7);
                    WallpaperList marcaList8 = new WallpaperList("re.jpg",marcaImg8);
                    wallpaperLists.add(marcaList8);
                    WallpaperList marcaList9 = new WallpaperList("de.jpg",marcaImg9);
                    wallpaperLists.add(marcaList9);
                    WallpaperList marcaList10 = new WallpaperList("gang.jpg",marcaImg10);
                    wallpaperLists.add(marcaList10);


                }

                    runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        progressDialog.dismiss();

                        wallpaperRecyclerView.setAdapter(new WallpapersAdapter(Wallpaper.this,wallpaperLists));

                    }
                });
                }
                    catch (IOException e) {
                        throw new RuntimeException(e);
                }

            }
        }).start();

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}