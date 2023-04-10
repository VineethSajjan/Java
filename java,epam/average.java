import java.util.Scanner;

class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c=0,v=1,s=0;
        do{
            v=sc.nextInt();
            s+=v;
            if(v!=0){
                c++;
            }
        }while(v!=0);

        System.out.println(s/c);
        sc.close();
    }

}
