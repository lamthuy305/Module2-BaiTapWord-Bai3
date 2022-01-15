package com.codegym;

public class Customer {
    private String name;
    private String address;
    private String maSoCongTo;

    public Customer() {
    }

    public Customer(String name, String address, String maSoCongTo) {
        this.name = name;
        this.address = address;
        this.maSoCongTo = maSoCongTo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMaSoCongTo() {
        return maSoCongTo;
    }

    public void setMaSoCongTo(String maSoCongTo) {
        this.maSoCongTo = maSoCongTo;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.address + ", " + this.maSoCongTo;
    }
}
