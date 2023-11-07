package lecture02;
import java.util.Scanner;
public class prac2 {
    public static void main(String[] args) {
        Keisan keisan = new Keisan();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < keisan.num.length; i++) {
            System.out.println("数字" + i + "つ目: ");
            keisan.num[i] = scan.nextInt();
            System.out.println();
        }
        keisan.sum();
        keisan.judge();
    }


}
