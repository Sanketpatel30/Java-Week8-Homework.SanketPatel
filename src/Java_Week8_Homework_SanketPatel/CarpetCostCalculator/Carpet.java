package Java_Week8_Homework_SanketPatel.CarpetCostCalculator;

public class Carpet {
    double cost;

    public Carpet(double cost){
        this.cost = cost < 0 ? 0 : cost;
    }
    public double getCost(){
        return cost;
    }
}
