package com.example.invoiceease.model;

import com.google.gson.annotations.SerializedName;

public class BusinessDetail {
    @SerializedName("_id")
    public String businessEmail;
    @SerializedName("AllTotal")
    public int allTotal;
    @SerializedName("MonthlyTotal")
    public int monthlyTotal;

    public BusinessDetail(String businessEmail, int allTotal, int monthlyTotal) {
        this.businessEmail = businessEmail;
        this.allTotal = allTotal;
        this.monthlyTotal = monthlyTotal;
    }

    public String getBusinessEmail() {
        return businessEmail;
    }

    public void setBusinessEmail(String businessEmail) {
        this.businessEmail = businessEmail;
    }

    public int getAllTotal() {
        return allTotal;
    }

    public void setAllTotal(int allTotal) {
        this.allTotal = allTotal;
    }

    public int getMonthlyTotal() {
        return monthlyTotal;
    }

    public void setMonthlyTotal(int monthlyTotal) {
        this.monthlyTotal = monthlyTotal;
    }
}
