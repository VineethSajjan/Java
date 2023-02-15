import java.util.*;
class Employee{
    int exp;
    String name;
    Employee(String n,int e){
        name = n;
        exp = e;
    }
}
public class test8a {
    public static void main(String[] args) {
        ArrayList<Employee> l = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("no of employee:");
        int n = sc.nextInt();
        System.out.println("employee details:");
        for(int i=0;i<n;i++){
            l.add(new Employee(sc.next(),sc.nextInt()));
        }
        Collections.sort(l,(a,b)->{return a.exp-b.exp;});
        System.out.println("sorted by experience:");
        for(Employee e:l){
            System.out.println(e.name+" "+e.exp);
        }
        sc.close();
    }
}
