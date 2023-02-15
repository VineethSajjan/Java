import java.util.*;
public class test1c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("has player played for india[y/n]");
        String s = sc.next();
        System.out.println("has player played ipl or not[y\n]");
        String v = sc.next();
        int MOM = sc.nextInt();
        float amount = 0.0f;
        if(s.equals("y")){
            int odi = sc.nextInt();
            int test = sc.nextInt();
            if(test >10 && odi >100){
                amount = amount+50000;
            }
            else if( test >10){
                amount = amount+25000;
            }
            else if(odi>100){
                amount = amount+15000;
            }
            else{
                amount = amount+10000;
            }
        }
        else{
            if(v.equals("y")){
                amount = amount+8000;
            }
            else{
                amount = amount+7000;
            }
        }
        amount = amount+(amount * (MOM * 0.25f));
        System.out.println(amount);
        sc.close();
    }
}