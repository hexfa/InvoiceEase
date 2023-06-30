package com.example.invoiceease.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;


@Entity(tableName = "inventory")
public class ItemPrices {

    @PrimaryKey()
    @ColumnInfo(name = "id")
    @SerializedName("_id")
    @NonNull
    private final String id ;

    @ColumnInfo(name = "barcode")
    private final String barcode;

    @ColumnInfo(name = "itemName")
    private final String itemName;

    @ColumnInfo(name = "price")
    private final String price;

    private String total;

    private String quantity;


    public ItemPrices(String id, String barcode, String itemName, String price) {
        this.id = id;
        this.barcode = barcode;
        this.itemName = itemName;
        this.price = price;
        this.total = price;
    }

    public String getId() {
        return id;
    }

    public String getBarcode() {
        return barcode;
    }

    public String getTotal() {
        return total;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public String getPrice() {
        return price;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
