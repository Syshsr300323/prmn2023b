package lecture02;
import java.util.Scanner;
public class prac1 {
    public static void main(String[] args) {

        String number = "B2220250";
        Scanner scan = new Scanner(System.in);
        System.out.println("学籍番号を入力してください。：");

        Gakuseki check = new Gakuseki();
        check.number = scan.next();
        check.numbercheck(number);
    }
}
