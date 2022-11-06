package day07Ternary;

public class Ternary03 {
    public static void main(String[] args) {
        //iki sayidan ayni isaretli olanlari carp aksi halde carpma
        int e=-12,f=-6;
        Object islem=(e>0&&f>0)||(e<0&&f<0) ? e*f:"islem yapamam";//farkli data tipi olursa object kullanilir
        System.out.println("islem = " + islem);





    }
}
