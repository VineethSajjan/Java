import java.util.*;
public class GoDutch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bill = sc.nextInt();
        int friends = sc.nextInt();
        int upbill = bill+(10*(bill/100));
        if(bill<0){
            System.out.println("Bill total amount cannot be negative");
        }
        else if(friends<=0){
            System.out.println("Number of friends cannot be negative or zero");
        }
        else{
            System.out.println(upbill/friends);
        }
        sc.close();
    }
}

