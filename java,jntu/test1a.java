import java.util.*;
public class test1a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1;i<=N;i++){
            if(i*(i+1) <=N ){
                System.out.println(i*(i+1));
            }
        }
        sc.close();
    }
}
