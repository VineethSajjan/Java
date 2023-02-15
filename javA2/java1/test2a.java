import java.util.*;

class Resistor {
    HashMap<String, Integer> color;
    String band1 = "", band2 = "", band3 = "";
    double value = 0.0f;

    public Resistor(String b1, String b2, String b3) {
        band1 = b1;
        band2 = b2;
        band3 = b3;
        color = new HashMap<>();
        color.put("black", 0);
        color.put("brown", 1);
        color.put("red", 2);
        color.put("orange", 3);
        color.put("yellow", 4);
        color.put("green", 5);
        color.put("blue", 6);
        color.put("violet", 7);
        color.put("grey", 8);
        color.put("white", 9);
    }

    public String getResistance() {
        int d1 = color.get(band1);
        int d2 = color.get(band2);
        int d3 = (int) Math.pow(10, color.get(band3));
        String v1 = Integer.toString(d1) + Integer.toString(d2);
        value = Integer.parseInt(v1) * d3;
        value = value / 1000;
        v1 = value + " K ohms";
        return v1;
    }
}

public class test2a {
    public static void main(String args[]) {
        Resistor r1 = new Resistor("red", "black", "orange");
        System.out.println(r1.getResistance());
    }
}