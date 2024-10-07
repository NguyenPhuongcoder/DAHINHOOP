import java.util.Scanner;
public abstract class HINH {
    protected String tenhinh;
    public String getTenhinh() {
        return tenhinh;
    }
    public abstract double tinhChuVi();
    public abstract double tinhDienTich();
    public void setTenhinh(String tenhinh) {
        this.tenhinh = tenhinh;
    }
    public HINH() {//hàm khởi tạo không đối
    }
    public HINH(String tenhinh) {//hàm khởi tạo có đối
        this.tenhinh = tenhinh;
    }
    public HINH(HINH h) {//hàm khởi tạo sao chép
        this.tenhinh = h.tenhinh;
    }
    public void Xuat()
    {
        System.out.println("Ten hinh:"+this.tenhinh);
    }
    public void Nhap()
    {
        System.out.print("Nhap Ten hinh:");
        Scanner sc=new Scanner(System.in);
        this.tenhinh=sc.nextLine();
    }
}
