import java.util.Scanner;

public class task4{
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);

        System.out.println("input initial velocity: ");
        double initialvelocity = i.nextDouble();

        System.out.println("Input final velocity: ");
        double finalvelocity = i.nextDouble();

        System.out.println("input time it took to reach final velocity: ");
        double time = i.nextDouble();

        double acceleration = (finalvelocity - initialvelocity)/time; 

        System.out.println("The average acceleration is:" + acceleration + " m/s^2");
    }
}