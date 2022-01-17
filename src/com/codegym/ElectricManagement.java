package com.codegym;

import java.util.ArrayList;
import java.util.List;

public class ElectricManagement {
    private List<BillElectric> billElectrics = new ArrayList<>();

    public int size() {
        return this.billElectrics.size();
    }

    public void displayAllManagement() {
        for (int i = 0; i < this.billElectrics.size(); i++) {
            System.out.println(billElectrics.get(i));
        }
    }

    public void addNewBillElectric(int index, BillElectric billElectric) {
        billElectrics.add(index, billElectric);
    }

    public void updateBillElectric(int index, BillElectric billElectric) {
        billElectrics.set(index, billElectric);
    }

    public void removeBillElectric(int index) {
        billElectrics.remove(index);
    }

    public int timKiem(String name) {
        int index = -1;
        for (int i = 0; i < size(); i++) {
            if (this.billElectrics.get(i).getName().equals(name)) {
                index = i;
            }
        }
        return index;
    }

    public double tinhTienDien(int index) {
        return billElectrics.get(index).getSoTienPhaiTra();
    }
}
