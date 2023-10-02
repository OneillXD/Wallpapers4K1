package com.example.wallpapers4k.Wallpaper;

import android.graphics.Bitmap;

public class WallpaperList {
    private String fileName;
    private Bitmap bitmap;

    public WallpaperList(String fileName, Bitmap bitmap) {
        this.fileName = fileName;
        this.bitmap = bitmap;
    }

    public String getFileName() {
        return fileName;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }
}
