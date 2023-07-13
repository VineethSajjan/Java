import java.util.*;

class RestaurantManagementSystem {
    private Map<Integer, Boolean> tables;
    private Map<Integer, List<String>> orders;

    public RestaurantManagementSystem(int numberOfTables) {
        tables = new HashMap<>();
        orders = new HashMap<>();
        for (int i = 1; i <= numberOfTables; i++) {
            tables.put(i, false);
            orders.put(i, new ArrayList<>());
        }
    }

    public void displayTables() {
        System.out.println("Table Status:");
        for (Map.Entry<Integer, Boolean> entry : tables.entrySet()) {
            int tableNumber = entry.getKey();
            boolean isOccupied = entry.getValue();
            String status = isOccupied ? "Occupied" : "Available";
            System.out.println("Table " + tableNumber + ": " + status);
        }
    }

    public int assignTable() {
        for (Map.Entry<Integer, Boolean> entry : tables.entrySet()) {
            int tableNumber = entry.getKey();
            boolean isOccupied = entry.getValue();

            if (!isOccupied) {
                tables.put(tableNumber, true);
                return tableNumber;
            }
        }

        return -1;
    }

    public void addOrder(List<Integer> al, String item) {
        List<String> l = new ArrayList<>();
        orders.put(al.size(), l);
        System.out.println(item + " added to Table " + al.size());
    }

    public double generateBill(List<Integer> l,int tableNumber) {
        //List<String> tableOrders = orders.get(tableNumber);

        if (!l.contains(tableNumber)) {
            System.out.println("No orders found for Table " + tableNumber);
            return 0;
        }

        System.out.println("Bill for Table " + tableNumber + ":");
        double price = 0.0;

        for (Map.Entry<Integer, List<String>> entry : orders.entrySet()) {
             price = calculatePrice(entry.getValue());
             System.out.println("Total: $" + price);
             return 0;
        }


        orders.put(tableNumber, new ArrayList<>());

        tables.put(tableNumber, false);
        return price;
    }

    private double calculatePrice(List<String> l) {
        double total=0;
        for(String item:l){
            if (item.equalsIgnoreCase("pizza")) {
                total=total+100.0;
            } else if (item.equalsIgnoreCase("coffee")) {
                total=total+20;
            }
            total=total+200;
        }
        return 100;
    }
}

class A{
    public int i;
}

public class Nowfloats{
    public static void main(String[] args) {
        A a = new  A();
        A b = a;

        a.i=9;
        System.out.println(b.i);
 
        a = null;
        System.out.println(b.i);
    }
}
