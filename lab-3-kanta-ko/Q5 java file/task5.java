import java.util.Scanner;

public class task5{
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);

        System.out.println("Input fuel cost per Litre:");
        Double cost = i.nextDouble();

        System.out.println("Input distance traveled in km: ");
        Double distance = i.nextDouble();

        System.out.println("Input fuel economy per 100km");
        Double economy = i.nextDouble();

        double fcost = distance * economy/100 * cost;

        System.out.println("The cost of a " + distance + " km trip with fuel economy of " + economy + "/100km, and an average fuel cost of $" + cost + " Litre is: " + fcost);

    }
}