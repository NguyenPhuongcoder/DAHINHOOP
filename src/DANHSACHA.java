import java.util.Scanner;

public class DANHSACHA {
    private HINH[] list ;
    private int n;

    public DANHSACHA(int n)
    {
        this.n = n;
        list = new HINH[this.n];
    }
    public void NhapHinh(){
        HINH h;
        Scanner sc = new Scanner(System.in);
        char type = ' ';
        char luachon = '1';
        int i = 0;
        while (i<n){
            System.out.println("Nhap 'G/g' hinh tron va 'T/t' hinh tam giac va 'C/c' hinh chu nhat");
            type = sc.nextLine().toLowerCase().charAt(0);
            switch (type){
                case 'g':
                    System.out.println("Nhap vao mot hinh tron:");
                    h = new TRON();
                    h.Nhap();
                    list[i] = h;
                    break;
                case 't':
                    System.out.println("Nhap vao mot hinh tam giac:");
                    h = new TAMGIAC();
                    h.Nhap();
                    list[i] = h;
                    break;
                case 'c':
                    System.out.println("Nhap vao mot hinh chu nhat:");
                    h = new CHUNHAT();
                    h.Nhap();
                    list[i] = h;
                    break;
                default:
                    System.out.println("Nhap sai du lieu!");
                    break;
            }
            System.out.println("Nhap 1 de tiep tuc/nhap ki tu bat ki de thoat:");
            luachon = sc.nextLine().toLowerCase().charAt(0);
            if (luachon!='1')
                break;
            i++;
        }
    }
    public void xuatHinh(){
        for (int i = 0; i < this.n; i++) {
            if (this.list[i]!=null)
             this.list[i].Xuat();
        }
    }
    public void thongke(){
        int couttg = 0;
        int coutcn = 0;
        int couttr = 0;
        for (HINH h : list) {
            if (h instanceof TRON)
                couttr++;
            else if (h instanceof TAMGIAC)
                couttg++;
            else if (h instanceof CHUNHAT)
                coutcn++;
        }
        System.out.println("So hinh tam giac trong hinh :"+couttg);
        System.out.println("So hinh tron trong hinh :"+couttr);
        System.out.println("So hinh chunhat trong hinh :"+coutcn);

    }

}
