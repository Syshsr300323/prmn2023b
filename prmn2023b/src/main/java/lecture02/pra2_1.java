package lecture02;
import java.util.Scanner;
public class pra2_1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("氏名を入力してください。");
        String name1 = scan.next();
        System.out.println("学籍番号下7桁を入力してください。");
        int num = scan.nextInt();

        System.out.println("氏名 : " + name1 + "\n学籍番号:b" + num);
    }
}
