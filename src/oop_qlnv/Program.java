/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop_qlnv;

import java.util.Arrays;
import java.util.Scanner;
import javax.swing.plaf.synth.Region;
import oop_qlnv.NhanVien;
import oop_qlnv.NhanVien_BanHang;
import oop_qlnv.NhanVien_BanTG;
import oop_qlnv.NhanVien_KeToan;
import oop_qlnv.NhanVien_KiThuat;
import oop_qlnv.QuanLy;

/**
 *
 * @author Acer
 */
public class Program {

    public static void menu() {
        System.out.println("\n==================== Menu chuong trinh ======================");
        System.out.println("| 1. Nhap danh sach nhanh vien                               |");
        System.out.println("| 2. Xuat danh sach nhan vien                                |");
        System.out.println("| 3. Tim nhan vien theo ma nhan vien                         |");
        System.out.println("| 4. Xoa nhan vien theo ma nhan vien                         |");
        System.out.println("| 5. Cap nhat thong tin nhan vien theo ma nhan vien          |");
        System.out.println("| 6. Xuat nhan vien theo khoang luong                        |");
        System.out.println("| 7. Sap xep nhan vien theo ho va ten                        |");
        System.out.println("| 8. Sap xep nhan vien theo thu nhap                         |");
        System.out.println("| 9. Xuat 5 nhan vien co thu nhap cao nhat                   |");
        System.out.println("| 0. Thoat                                                   |");
        System.out.println("==============================================================");
        System.out.print("Moi ban chon: ");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.setProperty("console.encoding", "UTF-8");
        OOP_QLNV ql = new OOP_QLNV();
        int option;
        while (true) {
            Scanner sc = new Scanner(System.in);
            menu();
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:
                    System.out.println("----------Nhap Danh Sach Nhan Vien----------");
                    ql.enterEmployeeList();
                    break;
                case 2:
                    System.out.println("----------Thong Tin Nhan Vien----------");
                    ql.displayEmployeeList();
                    break;
                case 3:
                    ql.findEmployeeById();
                    break;
                case 4:
                    ql.deleteEmployeeById();
                    break;
                case 5:
                    ql.updateEmployeeInfoById();
                    break;
                case 6:
                    ql.displayEmployeeListBySalaryRange();
                    break;
                case 7:
                    ql.sortEmployeesByName();
                    break;
                case 8:
                    ql.sortEmployeesByIncome();
                    break;
                case 9:
                    ql.displayTop5EmployeesByIncome();
                    break;
                case 0:
                    System.out.println("Cam On đa su dung!!!");
                    System.exit(0);
                default:
                    System.out.println("Lua chon cua ban khong ton tai!!! Moi Nhap Lai");
                    break;
            }
        }
    }

}