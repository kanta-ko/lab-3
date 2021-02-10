import java.util.Scanner;

public class task6{
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        
        System.out.println("Enter X1 and Y1");
        Double Y1 = i.nextDouble();
        Double X1 = i.nextDouble();

        System.out.println("Enter X2 and Y2");
        Double Y2 = i.nextDouble();
        Double X2 = i.nextDouble();

        double distanceX = (X2 - X1) * (X2 - X1);
        double distanceY = (Y2 - Y1) * (Y2 - Y1);
        double distanceXY = distanceX + distanceY;
        double totaldistance = Math.sqrt(distanceXY);

        System.out.println("The distance of the two points is " + totaldistance);
    }

}