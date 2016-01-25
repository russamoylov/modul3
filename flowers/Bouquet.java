package flowers;


import java.util.Scanner;

public class Bouquet extends Flower {


    public static void main(String[] args) {
        System.out.println("Hello, please enter how many flowers you want to see in the bouquet:");
        final Scanner scanner = new Scanner(System.in);

        final String userInput = scanner.next();


        try {

            final int numberOfFlowers = Integer.parseInt(userInput);

            if (numberOfFlowers < 3){
                throw new NegativeNumberException(numberOfFlowers);
            }
            System.out.println("Your number of flowers in the bouquet is: " + numberOfFlowers);
        } catch (NumberFormatException ex){
            System.out.println("[Error]: Number of flowers should be an integer number!");
        }
        catch (NegativeNumberException e){
            System.out.println("[Error: Entered number of flowers in the bouquet is "+e.getNumberOfFlowers()+" Number of flowers should be >= 3]");
        }

    }
    Rose roseFlower;
    Chamomile chamomileFlower;
    Tulip tulipFlower;
    Aster asterFlower;

    public Bouquet (Rose roseFlower, Chamomile chamomileFlower, Tulip tulipFlower, Aster asterFlower){
        this.asterFlower = asterFlower;
        this.chamomileFlower = chamomileFlower;
        this.tulipFlower = tulipFlower;
        this.roseFlower = roseFlower;


    }
}
