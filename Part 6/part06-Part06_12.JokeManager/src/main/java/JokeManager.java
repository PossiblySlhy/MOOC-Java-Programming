import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokeList;

    public JokeManager() {
        jokeList = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.jokeList.add(joke);
    }

    public String drawJoke() {
        if (this.jokeList.size() == 0) {
            return "Jokes are in short supply.";
        }

        Random draw = new Random();
        int index = draw.nextInt(this.jokeList.size());
        String randJoke = this.jokeList.get(index);
        return randJoke;
    }

    public void printJokes() {
        for (String joke : this.jokeList) {
            System.out.println(joke);
        }
    }
}
