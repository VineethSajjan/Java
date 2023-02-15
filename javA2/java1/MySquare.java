import java.util.*;
class MyRectangle {
    public int v1x, v1y, v2x, v2y;
    public MyRectangle(int ver1x, int ver1y, int ver2x, int ver2y) {
        v1x = ver1x;
        v1y = ver1y;
        v2x = ver2x;
        v2y = ver2y;
    }
    public int area() { return Math.abs((v1x - v2x) * (v2y - v1y)); }
    public MyRectangle overlap(MyRectangle rect) {
        int x1 = Math.max(v1x, rect.v1x);
        int y1 = Math.max(v1y, rect.v1y);
        int x2 = Math.min(v2x, rect.v2x);
        int y2 = Math.min(v2y, rect.v2y);
        if (x1 > x2 || y1 > y2) return new MyRectangle(0, 0, 0, 0);
        else return new MyRectangle(x1, y1, x2, y2);
    }
}
class MySquare extends MyRectangle {
    public int xcor, ycor, length;
    public MySquare(int xcord, int ycord, int leng) {
        super(xcord, ycord, xcord + leng, ycord + leng);
        xcor = xcord;
        ycor = ycord;
        length = leng;
    }
    public int area() { return length * length; }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, len;
        x = sc.nextInt();
        y = sc.nextInt();
        len = sc.nextInt();
        MySquare m = new MySquare(x, y, len);
        System.out.println(m.area());
        sc.close();
    }
}
