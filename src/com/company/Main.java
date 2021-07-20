package com.company;

import java.util.Scanner;
import java.util.logging.SocketHandler;



public class Main {

    public static void main(String[] args) {
        double tmpX;
        double tmpY;
        double tmpR;
        Scanner sc=new Scanner(System.in);
        ArrayOfPoints PointList=new ArrayOfPoints();
        addPoint(PointList,sc);
        int scanned;
        while(true)
        {
            System.out.println("Do you want to add another point? (1 - yes, 2- no)\n");
            scanned=sc.nextInt();
            sc.nextLine();
            if(scanned==2)
                break;
            else if (scanned!=1) System.out.println("Please press 1 or 2\n");
            else
            {
                addPoint(PointList,sc);

            }
        }

        System.out.println("Pleas enter coordinates of center of circle\nx=");
        tmpX=sc.nextInt();
        sc.nextLine();
        System.out.println("=y");
        tmpY=sc.nextInt();
        sc.nextLine();
        Point Center =new Point(tmpX,tmpY);
        System.out.println("Pleas enter radius of the circle\nR=");
        tmpR=sc.nextInt();
        sc.nextLine();
        Circle circle=new Circle(Center,tmpR);
        circle.IsInsite(PointList);



    }

    static void addPoint(ArrayOfPoints PointList, Scanner sc)
    {
        double tmpX;
        double tmpY;
        System.out.print("Enter coordinates of a point\nx=");
        //System.out.println("x=");
        tmpX=sc.nextInt();
        sc.nextLine();
        System.out.print("y=");
        tmpY=sc.nextInt();
        sc.nextLine();
        PointList.add(new Point(tmpX,tmpY));
    }

}
