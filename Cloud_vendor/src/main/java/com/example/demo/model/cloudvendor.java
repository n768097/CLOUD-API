package com.example.demo.model;
// model we define attributes
public class cloudvendor {

    private String vendorId;
    private String vendorName;
    private String vendorAddess;
    private  String vendorPhone;

    public cloudvendor() {
    }


    public cloudvendor(String vendorId, String vendorName, String vendorAddess, String vendorPhone) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorAddess = vendorAddess;
        this.vendorPhone = vendorPhone;
    }
    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorAddess() {
        return vendorAddess;
    }

    public void setVendorAddess(String vendorAddess) {
        this.vendorAddess = vendorAddess;
    }

    public String getVendorPhone() {
        return vendorPhone;
    }

    public void setVendorPhone(String vendorPhone) {
        this.vendorPhone = vendorPhone;
    }

}
