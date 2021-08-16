import java.util.Scanner;
import matematik.DortIslem;
import matematik.*; //hepsini import et anlamına gelir.

public class Main {

    public static void main(String[] args) {
	// write your code here

        /*Scanner scanner= new Scanner(System.in);
        System.out.println("Name: ");
        String name =scanner.nextLine();
        System.out.println("Hello "+name);*/

        DortIslem dortIslem= new DortIslem();
        int sum =dortIslem.topla(5,8);
        System.out.println(sum);
    }
}
