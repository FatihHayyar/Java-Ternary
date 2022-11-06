package day07Ternary;

public class Nestetternary01 {
    public static void main(String[] args) {
        //verilen yil artik (leap year) yil mi?
        int yil= 1800;
       String kontrol= yil%100==0 ? (yil%400==0 ? "leap year":"degildir"):"degildir";
        System.out.println("kontrol = " + kontrol);


    }
}
