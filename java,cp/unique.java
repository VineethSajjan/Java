/*Shyam has given a positive number 'N'.
Now his sir has given a homework to print all numbers with unique digits below 'N'

Sample Test Case-1

input = 100
output = 1 2 3 4 5 6 7 8 9 10 12 13 14 15 16 17 18 19 20 21 23 24 25 26 27 28 29 30 31 32 34 35 36 37 38 39 40 41 42 43 
45 46 47 48 49 50 51 52 53 54 56 57 58 59 60 61 62 63 64 65 67 68 69 70 71 72 73 74 75 76 78 79 80 81 82 83 84 85 86 87 89 90 91 92 93 94 95 96 97 98

Sample Test Case-2
input = 10
output = 1 2 3 4 5 6 7 8 9 10
  */
  import java.util.*;
  public class unique{
      static boolean check(int k){
          int c[]=new int[10];
          while(k>0){
              int r=k%10;
              if(c[r]==1){
                  return false;
              }
              c[r]=1;
              k=k/10;
          }
          return true;
          
      }
      public static void main (String[] args) {
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          List<Integer>ls=new ArrayList<>();
          for(int i=1;i<=n;i++){
              if(i<=10){
                  ls.add(i);
              }
              else if(check(i)){
                  ls.add(i);
              }
          }
          System.out.print("output = ");
          for(int i:ls){
              System.out.print(i+" ");
        }
        sc.close();
    }
  }
  