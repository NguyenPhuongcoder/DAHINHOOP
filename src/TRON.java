import java.util.Scanner;
public class TRON extends HINH  {
    private double R;
    public double getR() {
        return R;
    }
    public void setR(double r) {
        R = r;
    }
    public TRON(String tenhinh, double r) {
        super(tenhinh);
        R = r;
    }
    public TRON() {
        super();
    }
    public double tinhChuVi()
    {
        return (2*Math.PI*this.R);
    }
    public double tinhDienTich()
    {
        return (Math.PI*this.R*this.R);
    }
    public void Nhap()
    {
        super.Nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ban kinh R:");
        this.R=sc.nextDouble();
    }
    public void Xuat()
    {
        super.Xuat();
        System.out.println("Ban kinh R:"+this.R);
        System.out.println("Chu vi:"+this.tinhChuVi());
        System.out.println("Dien tich:"+this.tinhDienTich());
    }
}
