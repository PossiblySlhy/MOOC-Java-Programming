public class Fitbyte {
    private int age;
    private int restingRate;

    public Fitbyte(int age, int restingRate) {
        this.age = age;
        this.restingRate = restingRate;
    }

    public double targetHeartRate(double percentageOfMaximum) {
        double maximumRate = 206.3 - (0.711 * this.age);
        double target = ((maximumRate - this.restingRate) * (percentageOfMaximum) + this.restingRate);
        return target;
    }
}
