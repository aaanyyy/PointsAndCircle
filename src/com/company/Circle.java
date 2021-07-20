package com.company;

 class Circle {
     Point Center;
     double r;

      Circle(Point center, double r) {
         Center = new Point(center);
         this.r = r;
     }


     boolean isInsite(Point PointToCheck)
     {
         if(r>PointToCheck.distanceTo(Center))
             return true;
         else return false;
     }

     void IsInsite(ArrayOfPoints PointsToCheck)
     {
         for(int i=0;i<PointsToCheck.getSize();i++)
         {
             Point TmpPoint=PointsToCheck.getPoint(i);
             if(isInsite(TmpPoint))
                 System.out.printf("The point x=%f;y=%f is inside of the circle\n",TmpPoint.x,TmpPoint.y);
             else
                 System.out.printf("The point x=%f;y=%f is outside of the circle\n",TmpPoint.x,TmpPoint.y);

         }
     }

}
