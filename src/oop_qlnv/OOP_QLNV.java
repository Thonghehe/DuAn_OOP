/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_qlnv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
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
public class OOP_QLNV {

    ArrayList<NhanVien> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    String pick;
    public void enterEmployeeList() {
        System.out.println("Moi Ban Nhap so nhan vien: ");
        System.out.println("1-NV Hanh Chinh  2-NV Ban Hang 3-NV Ke Toan 4-NV Ban Thoi Gian 5-NV Ki Thuat 6-NV Quan Ly");
        int option = Integer.parseInt(sc.nextLine());
        switch (option) {
            case 1:
                do{
                NhanVien nv = new NhanVien();
                nv.nhap();
                nv.setPhongBan("Nhan Vien");
                list.add(nv);
                    System.out.print("Ban muon nhap tien Y/N: ");
                    pick = sc.nextLine();
                    if(pick.equalsIgnoreCase("N")){
                break;
            }
                }while(true);
                break;
            case 2:
                do{
                NhanVien_BanHang nvBH = new NhanVien_BanHang();
                nvBH.nhap();
                nvBH.setPhongBan("Phong Sales");
                list.add(nvBH);
                System.out.print("Ban muon nhap tien Y/N: ");
                    pick = sc.nextLine();
                    if(pick.equalsIgnoreCase("N")){
                break;
            }
                }while(true);
                break;
            case 3:
                do{
                NhanVien_KeToan nvKT = new NhanVien_KeToan();
                nvKT.nhap();
                nvKT.setPhongBan("Phong Ke Toan");
                list.add(nvKT);
                System.out.print("Ban muon nhap tien Y/N: ");
                    pick = sc.nextLine();
                    if(pick.equalsIgnoreCase("N")){
                break;
            }
                }while(true);
                break;
            case 4:
                do{
                NhanVien_BanTG nvPT = new NhanVien_BanTG();
                nvPT.nhap();
                nvPT.setPhongBan("Nhan Vien Ban Thoi Gian");
                list.add(nvPT);
                System.out.print("Ban muon nhap tien Y/N: ");
                    pick = sc.nextLine();
                    if(pick.equalsIgnoreCase("N")){
                break;
            }
                }while(true);
                break;
            case 5:
                do{
                NhanVien_KiThuat nvKthuat = new NhanVien_KiThuat();
                nvKthuat.nhap();
                nvKthuat.setPhongBan("Phong Ki Thuat");
                list.add(nvKthuat);
                System.out.print("Ban muon nhap tien Y/N: ");
                    pick = sc.nextLine();
                    if(pick.equalsIgnoreCase("N")){
                break;
            }
                }while(true);
                break;
            case 6:
                do{
                QuanLy nvQL = new QuanLy();
                nvQL.nhap();
                nvQL.setPhongBan("Quan Ly");
                list.add(nvQL);
                System.out.print("Ban muon nhap tien Y/N: ");
                    pick = sc.nextLine();
                    if(pick.equalsIgnoreCase("N")){
                break;
            }
                }while(true);
                break;
            default:
                System.out.println("Option khong ton tai Moi ban chon lai");
                break;
        }
    }

    public void displayEmployeeList() {
        System.out.println("+------------+--------------------------+----------------------+--------------------------------+------------+----------+------------+");
        System.out.println("|   maNV     |       ten                |         email        |    phongBan                    |   luong    |  thueTn  |  tongLuong |");
        System.out.println("+------------+--------------------------+----------------------+--------------------------------+------------+----------+------------+");
        for (NhanVien nhanVien : list) {
            System.out.printf("| %-10s | %-24s | %-20s | %-30s | %-10.2f | %-8.2f | %-10.2f |\n",
                    nhanVien.getMaNV(), nhanVien.getTen(), nhanVien.getEmail(),
                    nhanVien.getPhongBan(), nhanVien.getLuong(), nhanVien.getThue(), nhanVien.calculatePay());
        }
        System.out.println("+------------+--------------------------+----------------------+--------------------------------+------------+----------+------------+");
    }

    public void findEmployeeById() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien can tim: ");
        String ID = sc.nextLine();
        Boolean check = false;
        for (NhanVien nhanVien : list) {
            if (nhanVien.getMaNV().toLowerCase().contains(ID.toLowerCase())) {
                System.out.println("+------------+--------------------------+----------------------+--------------------------------+------------+----------+------------+");
                System.out.println("|   maNV     |       ten                |         email        |    phongBan                    |   luong    |  thueTn  |  tongLuong |");
                System.out.println("+------------+--------------------------+----------------------+--------------------------------+------------+----------+------------+");
                System.out.printf("| %-10s | %-24s | %-20s | %-30s | %-10.2f | %-8.2f | %-10.2f |\n",
                        nhanVien.getMaNV(), nhanVien.getTen(), nhanVien.getEmail(),
                        nhanVien.getPhongBan(), nhanVien.getLuong(), nhanVien.getThue(), nhanVien.calculatePay());
                System.out.println("+------------+--------------------------+----------------------+--------------------------------+------------+----------+------------+");
                check = true;
                break;
            }
        }

        if (check == false) {
            System.out.println("Nhan vien khong ton tai !");
        }
    }

    public void deleteEmployeeById() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien can xoa: ");
        String ID = sc.nextLine();
        Boolean check = false;
        for (NhanVien nv : list) {
            if (ID.equalsIgnoreCase(nv.getMaNV())) {
                list.remove(nv);
                check = true;
                break;
            }
        }

        if (check == false) {
            System.out.println("Nhan vien khong ton tai !");
        } else {
            System.out.println("Nhan vien da bi xoa !");
        }
    }

    public void updateEmployeeInfoById() {
        System.out.println("Nhap ma nhan vien can cap nhat: ");
        String ID = sc.nextLine();
        for (NhanVien nv : list) {
            if (nv.getMaNV().equalsIgnoreCase(ID)) {
                System.out.println("--------------------------Cap Nhat Lai Thong Tin --------------------------");
                nv.nhap();
            }
        }
        displayEmployeeList();
    }

    public void displayEmployeeListBySalaryRange() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Xuat danh sach nhan vien theo luong");
        System.out.print("Nhap luong can duoi: ");
        double min = sc.nextDouble();
        System.out.print("Nhap luong can tren: ");
        double max = sc.nextDouble();
        for (NhanVien nv : list) {
            if (nv.getLuong() >= min && nv.getLuong() <= max) {
                /*for (NhanVien nv : list) {
                    System.out.printf("Ma nhan vien: %s | Ho ten: %s | Phong ban: %s | Luong: %.2f\n", nv.getMaNV(), nv.getTen(), nv.getPhongBan(), nv.getLuong());
                }*/
                nv.xuat();
            }
        }
    }

    public void sortEmployeesByName() {
        Comparator<NhanVien> comp = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien nv1, NhanVien nv2) {
                return nv1.getTen().compareTo(nv2.getTen());
            }
        };
        Collections.sort(list, comp);
        displayEmployeeList();
    }

    public void sortEmployeesByIncome() {
        Comparator<NhanVien> comp = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien nv1, NhanVien nv2) {
                if (nv1.calculatePay() > nv2.calculatePay()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };
        Collections.sort(list, comp);
        displayEmployeeList();
    }

    public void displayTop5EmployeesByIncome() {
        Collections.sort(list, (a, b) -> (int) (b.calculatePay()- a.calculatePay()));
        if (list.size() < 5) {
            for (int i = 0; i < list.size(); i++) {
                list.get(i).xuat();
            }
        } else {
            for (int i = 0; i < 5; i++) {
                list.get(i).xuat();
            }
        }
    }

}