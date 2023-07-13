package com.epam.rd.autotasks.triangle;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) throws IllegalArgumentException {
        if (isDegenerate(a, b, c)) {
            throw new IllegalArgumentException("The triangle is degenerate.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() throws IllegalArgumentException {
        double area = 0.5 * Math.abs((a.getX() * (b.getY() - c.getY()) + b.getX() * (c.getY() - a.getY())
                + c.getX() * (a.getY() - b.getY())));
        return area;
    }

    public Point centroid() throws IllegalArgumentException {
        double x = (a.getX() + b.getX() + c.getX()) / 3;
        double y = (a.getY() + b.getY() + c.getY()) / 3;
        return new Point(x, y);
    }

    private boolean isDegenerate(Point a, Point b, Point c) throws IllegalArgumentException {
        return (a.getX() == b.getX() && b.getX() == c.getX()) || (a.getY() == b.getY() && b.getY() == c.getY());
    }
}

