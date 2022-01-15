package com.codegym;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = -1;
        ElectricManagement electricManagement = new ElectricManagement();
        do {
            menu();
            System.out.print("Nhập sự lựa chọn của bạn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("---Danh sách biên lai---");
                    electricManagement.displayAllManagement();
                    break;
                }
                case 2: {
                    System.out.println("---Thêm thông tin biên lai---");
                    System.out.println("Nhập vị trí muốn thêm:");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    if (index < 0 || index > electricManagement.size()) {
                        System.out.println("Vị trí thêm vào không hợp lệ");
                    } else {
                        BillElectric billElectric = getBill();
                        electricManagement.addNewBillElectric(index, billElectric);
                    }
                    break;
                }
                case 3: {
                    System.out.println("---Chỉnh sửa thông tin biên lai---");
                    System.out.println("Nhập vị trí muốn sửa:");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    if (index < 0 || index >= electricManagement.size()) {
                        System.out.println("Vị trí sửa vào không hợp lệ");
                    } else {
                        BillElectric billElectric = getBill();
                        electricManagement.updateBillElectric(index, billElectric);
                    }
                    break;
                }
                case 4: {
                    System.out.println("---Xóa thông tin biên lai---");
                    System.out.println("Nhập vị trí muốn xóa:");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    if (index < 0 || index >= electricManagement.size()) {
                        System.out.println("Vị trí xóa vào không hợp lệ");
                    } else {
                        electricManagement.removeBillElectric(index);
                    }
                    break;
                }

                case 5: {
                    scanner.nextLine();
                    System.out.println("---Tra cứu tiền điện phải trả---");
                    System.out.println("Nhập tên hộ sử dụng điện cần tra cứu: ");
                    String name = scanner.nextLine();
                    int index = electricManagement.timKiem(name);
                    if (index == -1) {
                        System.out.println("Không có tên hộ sử dụng");
                    } else {
                        System.out.println("Số tiền phải trả: " + electricManagement.tinhTienDien(index));
                    }
                }
                case 0: {
                    System.out.println("---Bạn đã thoát Menu---");
                }
                default: {
                    System.out.println("Lựa chọn của bạn không hợp lệ, mời nhập lại ...");
                }
            }
        } while (choice != 0);
    }

    private static BillElectric getBill() {
        Customer customer = getCustomer();
        System.out.println("Nhập chỉ số công tơ cũ");
        int chiSoCu = scanner.nextInt();
        System.out.println("Nhập chỉ số công tơ mới");
        int chiSoMoi = scanner.nextInt();
        return new BillElectric(customer.getName(), customer.getAddress(), customer.getMaSoCongTo(), chiSoCu, chiSoMoi);
    }

    private static Customer getCustomer() {
        System.out.println("Nhập thông tin hộ sử dụng điện");
        System.out.println("Nhập tên hộ sử dụng điện:");
        String name = scanner.nextLine();
        System.out.println("Nhập địa chỉ:");
        String address = scanner.nextLine();
        System.out.println("Nhập mã số công tơ:");
        String maSoCongTo = scanner.nextLine();
        return new Customer(name, address, maSoCongTo);
    }

    private static void menu() {
        System.out.println("---Menu quản lý tiền điện---");
        System.out.println("1. Hiển thị thông tin biên lai");
        System.out.println("2. Thêm thông tin biên lai");
        System.out.println("3. Cập nhật thông tin biên lai");
        System.out.println("4. Xóa thông tin biên lai");
        System.out.println("5. Tính tiền điện theo biên lai");
        System.out.println("0. Thoát chương trình");
    }
}
