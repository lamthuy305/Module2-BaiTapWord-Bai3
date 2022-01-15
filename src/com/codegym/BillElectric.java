package com.codegym;

public class BillElectric extends Customer {
    private int chiSoCu;
    private int chiSoMoi;

    public BillElectric() {
    }


    public BillElectric(String name, String address, String maSoCongTo, int chiSoCu, int chiSoMoi) {
        super(name, address, maSoCongTo);
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;

    }

    public double getSoTienPhaiTra() {
        return (this.chiSoMoi - this.chiSoCu) * 750;
    }

    public int getChiSoCu() {
        return chiSoCu;
    }

    public void setChiSoCu(int chiSoCu) {
        this.chiSoCu = chiSoCu;
    }

    public int getChiSoMoi() {
        return chiSoMoi;
    }

    public void setChiSoMoi(int chiSoMoi) {
        this.chiSoMoi = chiSoMoi;
    }


    @Override
    public String toString() {
        return super.getName() + ", " + super.getAddress() + ", " + super.getMaSoCongTo() + ", " + this.chiSoCu + ", " + this.chiSoMoi + ", " + getSoTienPhaiTra();
    }
}
