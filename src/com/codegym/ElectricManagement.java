package com.codegym;

public class ElectricManagement {
    private BillElectric[] billElectrics = new BillElectric[0];

    public BillElectric[] getBillElectrics() {
        return billElectrics;
    }

    public void setBillElectrics(BillElectric[] billElectrics) {
        this.billElectrics = billElectrics;
    }

    public int size() {
        return this.billElectrics.length;
    }

    public void displayAllManagement() {
        for (int i = 0; i < this.billElectrics.length; i++) {
            System.out.println(billElectrics[i]);
        }
    }

    public void addNewBillElectric(int index, BillElectric billElectric) {
        BillElectric[] newBillElectrics = new BillElectric[this.billElectrics.length + 1];
        for (int i = 0; i < newBillElectrics.length; i++) {
            if (i < index) {
                newBillElectrics[i] = this.billElectrics[i];
            } else if (index == i) {
                newBillElectrics[i] = billElectric;
            } else {
                newBillElectrics[i] = this.billElectrics[i - 1];
            }
        }
        this.billElectrics = newBillElectrics;
    }

    public void updateBillElectric(int index, BillElectric billElectric) {
        this.billElectrics[index] = billElectric;
    }

    public void removeBillElectric(int index) {
        BillElectric[] newBillElectric = new BillElectric[this.billElectrics.length - 1];
        for (int i = 0; i < newBillElectric.length; i++) {
            if (i < index) {
                newBillElectric[i] = this.billElectrics[i];
            } else {
                newBillElectric[i] = this.billElectrics[i + 1];
            }
        }
        this.billElectrics = newBillElectric;
    }

    public int timKiem(String name) {
        int index = -1;
        for (int i = 0; i < size(); i++) {
            if (this.billElectrics[i].getName().equals(name)) {
                index = i;
            }
        }
        return index;
    }

    public double tinhTienDien(int index) {
        return this.billElectrics[index].getSoTienPhaiTra();
    }
}
