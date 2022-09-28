import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double Pi = 3.14, r, alan, çevre, aci;
      Scanner in = new Scanner(System.in);

      System.out.print("Dairenin Yarıçapını Giriniz:");
    r = in.nextDouble();
    alan = (Pi * r * r);
    çevre = (2 * Pi * r);

    System.out.println("Alan :"+alan);
    System.out.println("Çevre:"+çevre);

System.out.print("Açı değerini Giriniz:");
aci = in.nextDouble();
double formul = (Pi * (r*r) * aci) / 360;
System.out.print(formul);










    }
}
