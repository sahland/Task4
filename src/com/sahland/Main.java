package com.sahland;

import java.util.*;


class SortByDist implements Comparator<Point> {
    public int compare(Point a, Point b)
    {
        return a.getDist() - b.getDist();
    }
}

public class Main {

    public static void printPoints(Point[] p) {
        for (int i = 0; i < p.length; i++) {
            System.out.print("Point: " + p[i].toString());
            System.out.println( " dist: " + p[i].distance(p[i]));
        }
    }

    public static void heapSort(Point[] myArray, int length) {
        Point temp;
        int size = length-1;

        for (int i = (length / 2); i >= 0; i--) {
            heapify(myArray, i, size);
        };
        for(int i = size; i >= 0; i--) {
            temp = myArray[0];
            myArray[0] = myArray[size];
            myArray[size] = temp;
            size--;
            heapify(myArray, 0, size);
        }
    }
    public static void heapify (Point [] myArray, int i, int heapSize) {

        int a = 2*i;
        int b = 2*i+1;
        int largestElement;

        if (a <= heapSize &&  myArray[a].getDist() > myArray[i].getDist()) {
            largestElement = a;
        } else {
            largestElement = i;
        }
        if (b <= heapSize && myArray[b].getDist() > myArray[largestElement].getDist()) {
            largestElement = b;
        }
        if (largestElement != i) {
            Point temp = myArray[i];
            myArray[i] = myArray[largestElement];
            myArray[largestElement] = temp;
            heapify(myArray, largestElement, heapSize);
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите первых N точек для отбора: ");
        int n = in.nextInt();

        Point[] points = new Point[]{
                new Point(5, 0),
                new Point(4, 0),
                new Point(3, 0),
                new Point(0, 6),
                new Point(0, 7),
                new Point(0, 8),
                new Point(0, 9),
                new Point(1, 9),
                new Point(2, 9),
                new Point(3, 9),
                new Point(4, 9),
                new Point(5, 9),
                new Point(6, 9),
                new Point(7, 9),
                new Point(8, 9),
                new Point(9, 9),
                new Point(9, 8),
                new Point(0, 1),
                new Point(0, 2),
                new Point(7, 0),
                new Point(6, 0),
                new Point(2, 0),
                new Point(1, 0)
        };



        System.out.println("Сортировка стандартными средствами java Arrays.sort().");
        System.out.println("Набор точек: ");
        printPoints(points);
        Arrays.sort(points, new SortByDist());

        System.out.println("-------------------------------");

        System.out.println("После сортировки N первых точек: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Point: " + points[i].toString());
        }

        Point[] pointsSecond = new Point[]{
                new Point(5, 0),
                new Point(4, 0),
                new Point(3, 0),
                new Point(0, 6),
                new Point(0, 7),
                new Point(0, 8),
                new Point(0, 9),
                new Point(1, 9),
                new Point(2, 9),
                new Point(3, 9),
                new Point(4, 9),
                new Point(5, 9),
                new Point(6, 9),
                new Point(7, 9),
                new Point(8, 9),
                new Point(9, 9),
                new Point(9, 8),
                new Point(0, 1),
                new Point(0, 2),
                new Point(7, 0),
                new Point(6, 0),
                new Point(2, 0),
                new Point(1, 0)
        };

        System.out.println("-------------------------------");

        System.out.println("Heapsort сортировка.");
        System.out.println("Набор точек: ");
        printPoints(pointsSecond);
        heapSort(pointsSecond, pointsSecond.length);

        System.out.println("-------------------------------");

        System.out.println("После сортировки N первых точек: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Point: " + pointsSecond[i].toString());
        }


    }
}