package com.example.invoiceease.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Dashboard {
    @SerializedName("_id")
    public String email;
    @SerializedName("MonthlyTotalAll")
    public int monthlyTotalAll;
    @SerializedName("AllTimeTotal")
    public int allTimeTotal;
    public String encryptedQr;
    public UserDetails userDetails;
    public int reportCount;
    public ArrayList<BusinessDetail> businessDetails;


    public Dashboard(String email, int monthlyTotalAll, int allTimeTotal, String encryptedQr, UserDetails userDetails, ArrayList<BusinessDetail> businessDetails, int reportCount) {
        this.email = email;
        this.monthlyTotalAll = monthlyTotalAll;
        this.allTimeTotal = allTimeTotal;
        this.encryptedQr = encryptedQr;
        this.userDetails = userDetails;
        this.businessDetails = businessDetails;
        this.reportCount = reportCount;
    }

    public int getReportCount() {
        return reportCount;
    }

    public void setReportCount(int reportCount) {
        this.reportCount = reportCount;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMonthlyTotalAll() {
        return monthlyTotalAll;
    }

    public void setMonthlyTotalAll(int monthlyTotalAll) {
        this.monthlyTotalAll = monthlyTotalAll;
    }

    public int getAllTimeTotal() {
        return allTimeTotal;
    }

    public void setAllTimeTotal(int allTimeTotal) {
        this.allTimeTotal = allTimeTotal;
    }

    public String getEncryptedQr() {
        return encryptedQr;
    }

    public void setEncryptedQr(String encryptedQr) {
        this.encryptedQr = encryptedQr;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    public ArrayList<BusinessDetail> getBusinessDetails() {
        return businessDetails;
    }

    public void setBusinessDetails(ArrayList<BusinessDetail> businessDetails) {
        this.businessDetails = businessDetails;
    }
}
