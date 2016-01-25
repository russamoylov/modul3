package flowers;


public class NegativeNumberException extends Exception {
    private int numberOfFlowers;

    public NegativeNumberException(int ageNumberOfFlowers) {
        this.numberOfFlowers = ageNumberOfFlowers;
    }

    public int getNumberOfFlowers() {
        return numberOfFlowers;
    }
}



