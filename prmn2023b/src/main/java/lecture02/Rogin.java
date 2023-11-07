package lecture02;
import java.util.Scanner;
public class Rogin {
    String[][] a = new String[][]{{"B2220000", "B2221111", "B2222222", "B2223333", "B2224444"},
            {"aaaaa", "bbbbb", "ccccc", "ddddd", "eeeee"}};
    String mynumber;
    String password;

    void rogincheck(){
        Scanner scan = new Scanner(System.in);
        System.out.println("学籍番号を入力してください。");
        mynumber = scan.next();
        for(int i = 0 ; i < 5; i++){
            if(a[0][i].equals(mynumber)){
                System.out.println("パスワードを入力してください。");
                password = scan.next();
                if (a[1][i].equals(password)) {
                    System.out.println("ログイン完了");
                } else {
                    System.out.println("不正なアクセス");
                }
            }
        }
        if(password == null){
                System.out.println("error!!");
                System.exit(0);
            }
        }

    }



