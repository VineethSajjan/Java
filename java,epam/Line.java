package com.epam.rd.autotasks.intersection;

import java.util.*;

public class Line {
    int k;
    int b;
    public Line(int k, int b) {
        this.k = k;
        this.b = b;
    }

    public Point intersection(Line other) {
        if (this.k == other.k && this.b == other.b) return null;
        if (this.k == other.k) return null;
        int x = (other.b - this.b) / (this.k - other.k);
        int y = this.k * x + this.b;
        return new Point(x, y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Line line = (Line) o;
        return k == line.k && b == line.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(k, b);
    }
}
