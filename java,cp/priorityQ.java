import java.util.*;
class priorityQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        for(int i=0;i<3;i++){
            arr[i]= sc.nextInt();
        }
        System.out.print(count(arr));
        sc.close();
    }
    public static int count(int arr[]){
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        int c = 0,t1=0,t2=0;
        for(int i:arr){
            q.add(i);
        }
        while(q.peek()!=0){
            t1=q.remove();
            t2=q.remove();
            if(t2!=0){
                q.add(t1-1);
                q.add(t2-1);
                c++;
            }
            else return c+t1;
        }
        return c;
    }
}

