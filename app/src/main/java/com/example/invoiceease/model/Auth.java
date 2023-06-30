package com.example.invoiceease.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class Auth implements Parcelable {

    @SerializedName("_id")
    private String email;

    private String password;




    public static final Creator<Auth> CREATOR = new Creator<Auth>() {
        @Override
        public Auth createFromParcel(Parcel in) {
            return new Auth(in);
        }

        @Override
        public Auth[] newArray(int size) {
            return new Auth[size];
        }
    };

    public Auth(Parcel in) {
        this.email = in.readString();
        this.password = in.readString();
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }


    public Auth(String email, String password) {
        this.email = email;
        this.password = password;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(email);
        parcel.writeString(password);
    }
}
