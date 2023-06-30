package com.example.invoiceease.model;

import com.google.gson.annotations.SerializedName;

public class Report {
    @SerializedName("_id")
    private String id;

    private String InvoiceID;

    @SerializedName("reportTime")
    private String date;


    private String customerName;
    private String customerNumber;

    @SerializedName("reportBy")
    private String clientEmail;


    private String businessName;
    private String businessNumber;

    @SerializedName("reportTo")
    private String businessEmail;

    @SerializedName("reportReason")
    private String reason;


    public Report(String id, String invoiceID, String date, String customerName, String customerNumber, String clientEmail, String businessName, String businessNumber, String businessEmail, String reason) {
        this.id = id;
        InvoiceID = invoiceID;
        this.date = date;
        this.customerName = customerName;
        this.customerNumber = customerNumber;
        this.clientEmail = clientEmail;
        this.businessName = businessName;
        this.businessNumber = businessNumber;
        this.businessEmail = businessEmail;
        this.reason = reason;
    }


    public String getInvoiceID() {
        return InvoiceID;
    }

    public void setInvoiceID(String invoiceID) {
        InvoiceID = invoiceID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getClientName() {
        return customerName;
    }

    public void setClientName(String clientName) {
        this.customerName = clientName;
    }

    public String getClientPhone() {
        return customerNumber;
    }

    public void setClientPhone(String clientPhone) {
        this.customerNumber = clientPhone;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessPhone() {
        return businessNumber;
    }

    public void setBusinessPhone(String businessPhone) {
        this.businessNumber = businessPhone;
    }

    public String getBusinessEmail() {
        return businessEmail;
    }

    public void setBusinessEmail(String businessEmail) {
        this.businessEmail = businessEmail;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
