import java.util.Scanner;
public class TAMGIAC extends HINH{
    private double A;
    private double B;
    private double C;
    public double getA() {
        return A;
    }
    public void setA(double a) {
        A = a;
    }
    public double getB() {
        return B;
    }
    public void setB(double b) {
        B = b;
    }
    public double getC() {
        return C;
    }
    public void setC(double c) {
        C = c;
    }
    public TAMGIAC()
    {
        super();
    }
    public TAMGIAC(String tenhinh, double a, double b, double c) {
        super(tenhinh);
        this.A = a;
        this.B = b;
        this.C = c;
    }
    public double tinhChuVi()
    {
        return (A+B+C);
    }
    public double tinhDienTich()
    { double P=this.tinhChuVi()/2;
        return Math.sqrt(P*(P-A)*(P-B)*(P-C));
    }
    public void Nhap()
    {
        super.Nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap canh A:");
        this.A=sc.nextDouble();
        System.out.println("Nhap canh B:");
        this.B=sc.nextDouble();
        System.out.println("Nhap canh C:");
        this.C=sc.nextDouble();
    }
    public void Xuat()
    {
        super.Xuat();
        System.out.println("Canh A:"+this.A);
        System.out.println("Canh B:"+this.B);
        System.out.println("Canh C:"+this.C);
        System.out.printf("Chu vi: %.2f",this.tinhChuVi());
        System.out.printf("\nDien tich: %.2f\n",this.tinhDienTich());
    }
}