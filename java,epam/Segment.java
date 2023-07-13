
//package com.epam.rd.autotasks.segments;

import java.util.Objects;

public class Segment {
    private final Point start;
    private final Point end;

    public Segment(Point start, Point end) throws IllegalArgumentException {
        if (start.getX()==end.getX() && start.getY()==end.getY())
            throw new IllegalArgumentException("Start and end points are the same");
        if (start==null || end==null)
            throw new IllegalArgumentException("Start or end points are null");
        this.start = start;
        this.end = end;
    }

    public double length() throws IllegalArgumentException {
        double dx = end.getX() - start.getX();
        double dy = end.getY() - start.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public Point middle() throws IllegalArgumentException {
        double mx = (start.getX() + end.getX()) / 2;
        double my = (start.getY() + end.getY()) / 2;
        return new Point(mx, my);
    }

    public Point intersection(Segment another) throws IllegalArgumentException {
        double x1 = start.getX();
        double y1 = start.getY();
        double x2 = end.getX();
        double y2 = end.getY();
        double x3 = another.start.getX();
        double y3 = another.start.getY();
        double x4 = another.end.getX();
        double y4 = another.end.getY();
        double denom = (y4 - y3) * (x2 - x1) - (x4 - x3) * (y2 - y1);
        if (denom == 0) return null;
        double ua = ((x4 - x3) * (y1 - y3) - (y4 - y3) * (x1 - x3)) / denom;
        double ub = ((x2 - x1) * (y1 - y3) - (y2 - y1) * (x1 - x3)) / denom;
        if (ua >= 0 && ua <= 1 && ub >= 0 && ub <= 1) {
            double x = x1 + ua * (x2 - x1);
            double y = y1 + ua * (y2 - y1);
            return new Point(x, y);
        }
        return null;
    }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Segment segment = (Segment) o;
        return Objects.equals(start, segment.start) && Objects.equals(end, segment.end);
    }
    @Override public int hashCode() { return Objects.hash(start, end); }
    @Override public String toString() { return "Segment{" + "start=" + start + ", end=" + end + '}'; }
}
