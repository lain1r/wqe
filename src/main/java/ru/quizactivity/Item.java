package ru.quizactivity;

import android.widget.ImageView;

public class Item {
    private int amount;
    private String name;
    private ImageView icon;
    private String date;

    public Item(int amount, String name, ImageView icon, String date) {
        this.amount = amount;
        this.name = name;
        this.icon = icon;
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ImageView getIcon() {
        return icon;
    }

    public void setIcon(ImageView icon) {
        this.icon = icon;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}


