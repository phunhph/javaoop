package Assginment;

import java.util.ArrayList;
import java.util.Scanner;

public class danhsach {
  private ArrayList<NhanVien> list = new ArrayList<>();
  public void nhap(){
      do{
          Scanner sc = new Scanner(System.in);
          System.out.print("Ma nhan vien: ");
          String mnv = sc.nextLine();
          if(mnv==null||mnv.equals("")){
                System.out.println("Da nhap xong danh sach.");
                break;
            }
          System.out.print("Ten nhan vien: ");
          String name = sc.nextLine();
          System.out.print("Luong co ban: ");
          double luongcb = sc.nextDouble();
          System.out.print("Nhap ban: ");
          String ban = new Scanner(System.in).nextLine();
          if("hanh chinh".equals(ban)){
              System.out.print("Nhap ngay cong: ");
              Double ngayl=sc.nextDouble();
              double luong=luongcb*ngayl;
          }else{
              System.out.print("Nhap luong kinh doanh: ");
              Double luongkd=sc.nextDouble();
              double luong=luongcb*luongkd;
          }
          list.add(new NhanVien(mnv, name, luongcb, ban, luongcb, luongcb, luongcb));
      }while (true);
  }
  
  public  void xuat(){
        System.out.println("----------------------DANH SACH NHAN VIEN-----------------------------");
        System.out.println("Nhan vien kinh doanh luong = luong co ban x luong kinh doang");
        System.out.println("Nhan vien hanh chinh luong = luong co ban x ngay cong");
        for(NhanVien nv:list){
            System.out.println("Ma nhan vien: "+nv.getMnv()+" Ten Nhan vien: "+nv.getName()+"."+" Ban: "+nv.getBan()+" Luong co ban: "+nv.getLuongcb()+" Luong: "+nv.getluong());
        }
    }
  
  public void timkiem(){
      System.out.print("Nhap ma nhan vien can tim kiem: ");
      String ma = new Scanner(System.in).nextLine();
      for(NhanVien tim:list){
          if(tim.getMnv().equals(ma)){
              System.out.println("Da tim dươc nhan vien voi ma so: "+ma);
              System.out.println("Da hien thị nhan vien.");
              System.out.println("Ma nhan vien: "+tim.getMnv()+" Ten Nhan vien: "+tim.getName()+"."+" Ban: "+tim.getBan()+" Luong co ban: "+tim.getLuongcb()+" Luong: "+tim.getluong());
          }else{
              System.out.println("Khong tim thay nhan vien voi ma so: "+ma);
          }
      }
  }
  
  public void xoanv(){
      System.out.println("Nhập");
  }
  
  public void menu(){
      int check = 0;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("+-----------------------MENU------------------------+");
            System.out.println("1. Nhập danh sách nhân viên từ bàn phím.");
            System.out.println("2. Xuất danh sách nhân viên ra màn hình.");
            System.out.println("3. Tìm và hiển thị nhân viên theo mã nhập từ bàn phím.");
            System.out.println("4. Xóa nhân viên theo mã nhập từ bàn phím.");
            System.out.println("5. Cập nhật thông tin nhân viên theo mã nhập từ bàn phím.");
            System.out.println("6. Sắp xếp nhân viên theo họ và tên.");
            System.out.println("7. Sắp xếp nhân viên theo thu nhập.");
            System.out.println("8. Xuất 5 nhân viên có thu nhập cao nhất.");
            System.out.println("9 Thoat");
            System.out.println("+---------------------------------------------------+");
            System.out.printf("Vui long chon chuc nang: ");

            int chucNang = sc.nextInt();
            switch (chucNang) {
                case 1: {
                    nhap();
                    break;
                }
                case 2: {
                    xuat();
                    break;
                }
                case 3: {
                    timkiem();
                    break;
                }
                case 4: {
                    xoanv();
                    break;
                }
                case 5:{
                    break;
                }
                case 6:{
                    break;
                }
                case 7:{
                    break;
                }
                case 8:{
                    break;
                }
                case 9: {
                    System.out.println("xac nhan thoat 1 ");
                    check=sc.nextInt();
                    if (check== 1)
                    System.out.println("Da thoat menu chuc nang.");
                    break; 
                }
                default: {
                    System.out.println("Khong co chuc nang nay.");
                }
            }
        } while (check != 1); 
  }
}
