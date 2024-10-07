import java.util.ArrayList;
import java.util.Scanner;

public class DANHSACH {
    private ArrayList<HINH> list;

    public DANHSACH(){
        list = new ArrayList<>();
    }
    public void NhapHinh(){
        HINH h = null;
        Scanner sc = new Scanner(System.in);
        char type = ' ';
        char luachon = '1';
        while(luachon=='1'){
            System.out.println("Nhap 'G/g' hinh tron va 'T/t' hinh tam giac va 'C/c' hinh chu nhat ");
            type = sc.nextLine().toLowerCase().charAt(0);
            switch (type){
                case 'g':
                    System.out.println("Nhap vao danh sach mot hinh tron:");
                    h = new TRON();
                    h.Nhap();
                    break;
                case 't':
                    System.out.println("Nhap vao danh sach mot hinh tam giac:");
                    h = new TAMGIAC();
                    h.Nhap();
                    break;
                case 'c':
                    System.out.println("Nhap vao danh sach mot hinh tam giac:");
                    h = new CHUNHAT();
                    h.Nhap();
                    break;
                default:
                    System.out.println("Nhap sai ky tu!");
                    break;
            }
            if(h!=null){
                list.add(h);
            }
            System.out.println("Nhap 1 de tiep tuc/ nhap ki tu bat ky de thoat:");
            luachon = sc.nextLine().toLowerCase().charAt(0);
        }
    }
    public void xuatHinh(){
        for(HINH h:list)
            h.Xuat();
    }
    public void Thongke() {
        int couttg = 0;
        int coutcn = 0;
        int couttr = 0;
//        for(int i = 0;i<list.size();i++){
//            if(list.get(i) instanceof TRON)
//                couttr++;
//            else if (list.get(i) instanceof  CHUNHAT)
//                coutcn++;
//            else if (list.get(i) instanceof TAMGIAC)
//                couttg++;
//        }
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
