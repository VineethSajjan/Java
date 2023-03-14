import java.util.*;
public class reversesentance {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a[] = sc.nextLine().split(" ");
        StringBuilder sb = new StringBuilder();
        Stack<String> st = new Stack<>();
        for(int i=0;i<a.length;i++){
            st.push(a[i]);
        }
        for(int j=0;j<a.length;j++){
            sb.append(st.pop()+" ");
        }
        System.out.print(sb);
        sc.close();
    }

}
