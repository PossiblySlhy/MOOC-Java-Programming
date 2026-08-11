public class Timer {
    private int hundredths;
    private int seconds;

    public Timer() {
        this.hundredths = 0;
        this.seconds = 0;
    }

    public String toString() {
        String timer = String.format("%02d", this.seconds) + ":" + String.format("%02d", this.hundredths);
        return timer;
    }

    public void advance() {
        this.hundredths++;

        if (this.hundredths == 100) {
            this.seconds++;
            this.hundredths = 0;
        }

        if (this.seconds == 60) {
            this.seconds = 0;
        }
    }
}
