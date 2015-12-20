package flowers;


public class Bouquet extends Flower {


    public static void main(String[] args) {

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
