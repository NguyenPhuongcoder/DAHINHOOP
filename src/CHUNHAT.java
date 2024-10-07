import java.util.Scanner;

public class CHUNHAT extends HINH {
    private int ChieuDai;
    private int ChieuRong;
    private String MauVien;
    private String MauNen;

    public void setChieuDai(int ChieuDai){
        this.ChieuDai = ChieuDai;
    }
    public void setChieuRong(int ChieuRong){
        this.ChieuRong = ChieuRong;
    }
    public void SetMauNen(String MauNen){
        this.MauNen = MauNen;
    }
    public void SetMauVien(String MauVien){
        this.MauVien = MauVien;
    }
    public int getChieuRong() {
        return ChieuRong;
    }
    public int getChieuDai(){
        return ChieuDai;
    }
    public String getMauVien(){
        return MauVien;
    }
    public String getMauNen(){
        return MauNen;
    }

    @Override
    public double tinhChuVi() {
        return (ChieuDai+ChieuRong)/2.0;
    }

    @Override
    public double tinhDienTich() {
        return ChieuRong*ChieuDai;
    }

    public CHUNHAT(){
    }
    public CHUNHAT(String tenhinh,int ChieuDai, String MauNen, String MauVien, int ChieuRong){
        super(tenhinh);
        this.ChieuDai = ChieuDai;
        this.MauVien = MauVien;
        this.MauNen = MauNen;
        this.ChieuRong = ChieuRong;
    }
    public CHUNHAT(CHUNHAT cn){
        this.ChieuRong = cn.ChieuRong;
        this.ChieuDai = cn.ChieuDai;
        this.MauNen = cn.MauNen;
        this.MauVien = cn.MauVien;
    }
    public void Nhap(){
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap chieu dai:");
        ChieuDai = sc.nextInt();
        System.out.print("nhap chieu rong:");
        ChieuRong = sc.nextInt();
        sc.nextLine();
        System.out.print("nhap mau nen:");
        MauNen = sc.nextLine();
        System.out.print("nhap mau vien:");
        MauVien = sc.nextLine();
    }
    public void Xuat(){
        super.Xuat();
        System.out.println("Chieu dai cua hinh"+ChieuDai);
        System.out.println("Chieu rong cua hinh"+ChieuRong);
        System.out.println("Mau nen cua hinh"+MauNen);
        System.out.println("MauVien cua hinh"+MauVien);
    }
}
