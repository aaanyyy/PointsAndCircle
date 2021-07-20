package com.company;

class Point {
    double x;
    double y;
    public static final Point ORIGIN=new Point(0,0);


    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    Point(Point p)
    {
        x=p.x;
        y=p.y;
    }
    double distanceToOrigin()
    {
        return distanceTo(ORIGIN);
    }
    double distanceTo(Point p)
    {
        double dx=p.x-x;
        double dy=p.y-y;
        return Math.sqrt(dx*dx+dy*dy);
    }
}
