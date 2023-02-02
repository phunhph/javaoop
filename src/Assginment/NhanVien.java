package Assginment;

public class NhanVien {
    private String mnv;
    private String name;
    private double luongcb;
    private double luongkd;
    private double ngayl;
    private String ban;

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    private double luong;
    double getluong(){
        if("Hanh chinh".equals(ban)){
            return luongcb*ngayl;
        }else{
            return luongcb*luongkd;
        }
    }

    public String getMnv() {
        return mnv;
    }

    public void setMnv(String mnv) {
        this.mnv = mnv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLuongcb() {
        return luongcb;
    }

    public void setLuongcb(double luongcb) {
        this.luongcb = luongcb;
    }

    public double getLuongkd() {
        return luongkd;
    }

    public void setLuongkd(double luongkd) {
        this.luongkd = luongkd;
    }

    public double getNgayl() {
        return ngayl;
    }

    public void setNgayl(double ngayl) {
        this.ngayl = ngayl;
    }

    public String getBan() {
        return ban;
    }

    public void setBan(String ban) {
        this.ban = ban;
    }
    
  
    public NhanVien(){
        
    }
    public NhanVien(String mnv, String name, double luongcb,String ban,double ngayl,double luongkd,double luong){
        this.mnv=mnv;
        this.name=name;
        this.luongcb=luongcb;
        this.luongkd=luongkd;
        this.ban=ban;
        this.ngayl=ngayl;
    }
}
