package com.company;

public class ArrayOfPoints {

    Point[] PointList;
    ArrayOfPoints()
    {
        PointList=null;
    }
    void add(Point p)
    {
        int size=getSize();
        if(size==0) {
            PointList = new Point[1];
            PointList[0] = new Point(p);
        }
        else
        {
            Point[] TmpList=new Point[size+1];
            for(int i=0;i<size;i++)
            {
                TmpList[i]=new Point(PointList[i]);
            }
            PointList=TmpList;
            PointList[size]=new Point(p);
        }

    }
    int getSize()
    {
        if(PointList==null) return 0;
        else return PointList.length;
    }
    Point getPoint(int index)
    {
        if ((index>=0) &&(index<getSize()))
        return new Point(PointList[index]);
        else
            return null;
    }
}
