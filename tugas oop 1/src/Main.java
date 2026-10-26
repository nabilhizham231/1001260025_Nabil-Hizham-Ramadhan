class Menu0025 {
    private String nama;
    private double harga;

 public Menu0025(String nama, double harga) {
     this.nama= nama;
     this.harga= harga;
 }

 public void tampilkanData() {
     System.out.println("Nama Menu:"+nama);
     System.out.println("Harga Menu:"+harga);
 }
}
public class Main {
    public static void main(String[]args){
        Menu0025 m1 = new Menu0025("Kopi Susu",25000);
        Menu0025 m2 = new Menu0025("Cappuccino",20000);
        Menu0025 m3 = new Menu0025("Matcha",18000);

        System.out.println("===MENU KAFE===");
        m1.tampilkanData();
        m2.tampilkanData();
        m3.tampilkanData();


    }
}