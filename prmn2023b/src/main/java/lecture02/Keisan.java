package lecture02;

public class Keisan {
    int[] num = new int[5];
    int x = 0;

    void sum(){
        for(int i = 0 ; i <num.length ;i++){
            x += num[i];
        }
        System.out.println("合計値: " + x );
    }

    void judge(){
        if(x >= 100){
            System.out.println("great!!");
        }
        else if(x >= 50 ){
            System.out.println("big");
        }
        else{
            System.out.println("small");
        }


    }
}
