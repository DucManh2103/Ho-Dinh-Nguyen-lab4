/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

import java.util.Scanner;


public class HoaQua {
    public double giaban;
public String nguongocxuatxu;
public String ngaynhap;
public double soluong;
    public HoaQua(){}
    public double getSolong() {
        return soluong;
    }

    public void setSolong(double solong) {
        this.soluong = solong;
    }


    public HoaQua(double giaban, String nguongocxuatxu, String ngaynhap, double solong) {
        this.giaban = giaban;
        this.nguongocxuatxu = nguongocxuatxu;
        this.ngaynhap = ngaynhap;
        this.soluong = solong;
    }

    public double getGiaban() {
        return giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    public String getNguongocxuatxu() {
        return nguongocxuatxu;
    }

    public void setNguongocxuatxu(String nguongocxuatxu) {
        this.nguongocxuatxu = nguongocxuatxu;
    }

    public String getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }
    void nhap()
    {
    Scanner sc =new Scanner(System.in);
    System.out.println("nhap gia ban");
    giaban =sc.nextDouble();
    System.out.println("nhap so luong");
    soluong = sc.nextDouble();
    System.out.println("nhap nguon goc xuat su");
    nguongocxuatxu=sc.nextLine();
    System.out.println(" nhap ngay nhap");
    ngaynhap = sc.nextLine();
    }
}
class Quacam extends HoaQua
{
    public Quacam(double giaban, String nguongocxuatxu, String ngaynhap, double solong) 
    {
    super(giaban, nguongocxuatxu, ngaynhap, solong);
    }
 public String mausac;
 public String dochuangot;
 public String loaicam;
}
class Quatao extends HoaQua
{
    public Quatao(double giaban, String nguongocxuatxu, String ngaynhap, double solong) {
        super(giaban, nguongocxuatxu, ngaynhap, solong);
    }
    public String mausac;
    public String loaitao;
}
class Camsanh extends Quacam
{
    public Camsanh(double giaban, String nguongocxuatxu, String ngaynhap, double solong) {
        super(giaban, nguongocxuatxu, ngaynhap, solong);
    }
    public String ngot;
}
class CamCaoPhong extends Quacam{

    public CamCaoPhong(double giaban, String nguongocxuatxu, String ngaynhap, double solong) {
        super(giaban, nguongocxuatxu, ngaynhap, solong);
    }
    public String chua;
}
class main
{
 public static void main(String[] arg)
 {
 HoaQua hq = new HoaQua();
 hq.nhap();
 }
    
}
