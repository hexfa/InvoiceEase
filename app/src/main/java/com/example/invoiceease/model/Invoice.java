package com.example.invoiceease.model;

import androidx.room.Ignore;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Invoice {

    @SerializedName("_id")
    private String invoiceId;

    @SerializedName("invoiceTotalitems")
    private ArrayList<ItemPrices> totalItems;

    @SerializedName("invoiceNumber")
    private int invoiceNumber;

    @SerializedName("invoiceDate")
    private String Date;

    @SerializedName("invoiceAmount")
    private double Total;

    @SerializedName("finalPrice")
    private double finalPrice;

    @SerializedName("invoiceTitle")
    private String Title;

    @SerializedName("invoiceDescription")
    private String Description;

    private double discount;

    @SerializedName("invoiceIGST")
    private double IGST;

    @SerializedName("invoiceCGST")
    private double CGST;

    @SerializedName("invoiceSGST")
    private double SGST;

    @SerializedName("invoiceUTGST")
    private double UTGST;

    @SerializedName("invoiceSentTo")
    private String SentTo;

    @SerializedName("invoiceSentBy")
    private String SentBy;

    @SerializedName("invoicePaymentMode")
    private String PaymentMode;

    @SerializedName("invoicePDF")
    private String pdfLink;

    @SerializedName("invoiceReport")
    private String Report;

    @SerializedName("roundoff")
    private double roundOff;

    private String city;

    private String invoiceTime;

    private String businessName;

    private String businessAddress;

    private String businessContactNo;

    private String gstNumber;

    @Ignore
    private boolean isExpanded;

    @Ignore
    private Invoice invoices;

    public Invoice(ArrayList<ItemPrices> totalItems, int invoiceNumber,
                   double total, String title, String description, double discount, double finalPrice, double IGST,
                   double CGST, double SGST, double UTGST, String sentTo, String sentBy, String paymentMode,
                   double roundOff, String city, String businessAddress, String  gstNumber, String businessContactNo) {

        this.totalItems = totalItems;
        this.invoiceNumber = invoiceNumber;
        Total = total;
        Title = title;
        Description = description;
        this.discount = discount;
        this.finalPrice = finalPrice;
        this.IGST = IGST;
        this.CGST = CGST;
        this.SGST = SGST;
        this.UTGST = UTGST;
        SentTo = sentTo;
        SentBy = sentBy;
        PaymentMode = paymentMode;
        this.roundOff = roundOff;
        this.city = city;
        this.businessAddress = businessAddress;
        this.businessContactNo = businessContactNo;
        this.gstNumber = gstNumber;
    }

    @Ignore
    public Invoice(ArrayList<ItemPrices> totalItems, int invoiceNumber,
                   double total, String title, String description, double discount, double finalPrice, double IGST,
                   double CGST, double SGST, double UTGST, String sentTo, String sentBy, String paymentMode,
                   double roundOff, String city, String invoiceTime, String businessName, String businessAddress,
                   String businessContactNo, String gstNumber){

        this.totalItems = totalItems;
        this.invoiceNumber = invoiceNumber;
        Total = total;
        Title = title;
        Description = description;
        this.discount = discount;
        this.finalPrice = finalPrice;
        this.IGST = IGST;
        this.CGST = CGST;
        this.SGST = SGST;
        this.UTGST = UTGST;
        SentTo = sentTo;
        SentBy = sentBy;
        PaymentMode = paymentMode;
        this.roundOff = roundOff;
        this.city = city;
        this.invoiceTime = invoiceTime;
        this.businessName = businessName;
        this.businessAddress = businessAddress;
        this.businessContactNo = businessContactNo;
        this.gstNumber = gstNumber;
    }

    public Invoice(ArrayList<ItemPrices> totalItems, double total, double discount, double IGST, double CGST, double SGST, double UTGST, String paymentMode, double finalPrice, double roundOff) {
        this.totalItems = totalItems;
        Total = total;
        this.discount = discount;
        this.IGST = IGST;
        this.CGST = CGST;
        this.SGST = SGST;
        this.UTGST = UTGST;
        PaymentMode = paymentMode;
        this.finalPrice = finalPrice;
        this.roundOff = roundOff;
    }


    public boolean isExpanded() {
        return isExpanded;
    }

    public void setExpanded(boolean expanded) {
        isExpanded = expanded;
    }

    public String getGstNumber() {
        return gstNumber;
    }

    public void setGstNumber(String gstNumber) {
        this.gstNumber = gstNumber;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessAddress() {
        return businessAddress;
    }

    public void setBusinessAddress(String businessAddress) {
        this.businessAddress = businessAddress;
    }

    public String getBusinessContactNo() {
        return businessContactNo;
    }

    public void setBusinessContactNo(String businessContactNo) {
        this.businessContactNo = businessContactNo;
    }

    public String getInvoiceTime() {
        return invoiceTime;
    }

    public void setInvoiceTime(String invoiceTime) {
        this.invoiceTime = invoiceTime;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public ArrayList<ItemPrices> getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(ArrayList<ItemPrices> totalItems) {
        this.totalItems = totalItems;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double total) {
        Total = total;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public double getIGST() {
        return IGST;
    }

    public void setIGST(double IGST) {
        this.IGST = IGST;
    }

    public double getCGST() {
        return CGST;
    }

    public void setCGST(double CGST) {
        this.CGST = CGST;
    }

    public double getSGST() {
        return SGST;
    }

    public void setSGST(double SGST) {
        this.SGST = SGST;
    }

    public double getUTGST() {
        return UTGST;
    }

    public void setUTGST(double UTGST) {
        this.UTGST = UTGST;
    }

    public String getSentTo() {
        return SentTo;
    }

    public void setSentTo(String sentTo) {
        SentTo = sentTo;
    }

    public String getSentBy() {
        return SentBy;
    }

    public void setSentBy(String sentBy) {
        SentBy = sentBy;
    }

    public String getPaymentMode() {
        return PaymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        PaymentMode = paymentMode;
    }

    public String getPdfLink() {
        return pdfLink;
    }

    public void setPdfLink(String pdfLink) {
        this.pdfLink = pdfLink;
    }

    public String getReport() {
        return Report;
    }

    public void setReport(String report) {
        Report = report;
    }

    public double getRoundOff() {
        return roundOff;
    }

    public void setRoundOff(double roundOff) {
        this.roundOff = roundOff;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
