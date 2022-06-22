package com.sahland;
/**
 Класс точек
 */

public class Point {

    private int x, y;
    private int dist;


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "; " + y + ")";
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setDist(int dist) {
        this.dist = dist;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getDist() {
        return dist;
    }

    public int distance(Point a) {
        dist = (int) Math.sqrt(a.x * a.x + a.y * a.y);
        return dist;
    }

}