package com.example.invoiceease.model;

import com.google.gson.annotations.SerializedName;

public class UserDetails{
    public String _id;
    public String fname;
    public String lname;
    public String email;
    public String mobileNumber;
    public String address;
    @SerializedName("Date")
    public String date;

    public UserDetails(String _id, String fname, String lname, String email, String mobileNumber, String address, String date) {
        this._id = _id;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.address = address;
        this.date = date;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
