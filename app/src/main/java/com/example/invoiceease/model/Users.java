package com.example.invoiceease.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;


public class Users implements Parcelable {

    @SerializedName("fname")
    private String firstName;

    @SerializedName("lname")
    private String lastName;

    private String email;
    private String mobileNumber;
    private String address;
    private boolean isVerified;

    public boolean isVerified() {
        return isVerified;
    }

    @SerializedName("_id")
    private String id;

    public Users( String id,String firstName, String lastName, String email, String mobileNumber, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.address = address;
        this.id = id;
    }

    protected Users(Parcel in) {
        firstName = in.readString();
        lastName = in.readString();
        email = in.readString();
        mobileNumber = in.readString();
        address = in.readString();
        id = in.readString();
    }

    public static final Creator<Users> CREATOR = new Creator<Users>() {
        @Override
        public Users createFromParcel(Parcel in) {
            return new Users(in);
        }

        @Override
        public Users[] newArray(int size) {
            return new Users[size];
        }
    };

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }


    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getId() {
        return id;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(firstName);
        parcel.writeString(lastName);
        parcel.writeString(email);
        parcel.writeString(mobileNumber);
        parcel.writeString(address);
        parcel.writeString(id);
    }
}
