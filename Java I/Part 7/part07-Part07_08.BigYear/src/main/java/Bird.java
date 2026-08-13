public class Bird {
    private String engName;
    private String latName;
    private int observations;

    public Bird(String engName, String latName) {
        this.engName = engName;
        this.latName = latName;
        this.observations = 0;
    }

    public String getEngName() {
        return this.engName;
    }

    public String getLatName() {
        return this.latName;
    }

    public int getObservations() {
        return this.observations;
    }

    public void observed() {
        this.observations++;
    }

    public String toString() {
        return this.engName + " (" + this.latName + "): " + this.observations + " observations";
    }
}
