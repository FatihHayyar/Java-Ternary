package day07Ternary;

public class NestedTernary {
    public static void main(String[] args) {

        //2. 8  ve den fazla ise ilk harf i
        //3. 8 den az ise ilk harf k yazdir

String psw="ifgt657";
String kontrol=psw.length()<8 ? ( psw.charAt(0)=='k' ? "gecerli":"gecersiz") : (psw.charAt(0)=='i' ? "gecerli":"gecersiz");
        System.out.println("kontrol = " + kontrol);



    }
}
