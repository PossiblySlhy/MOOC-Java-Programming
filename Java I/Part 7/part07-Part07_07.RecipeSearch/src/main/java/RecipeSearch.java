import java.nio.file.Paths;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File to read: ");
        String file = scanner.nextLine();
        System.out.println("");

        RecipeService service = new RecipeService(file);

        System.out.println("Commands:\n" +
                "list - lists the recipes\n" +
                "stop - stops the program\n" +
                "find name - searches recipes by name\n" +
                "find cooking time - searches recipes by cooking time\n" +
                "find ingredient - searches recipes by ingredient\n");

        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            System.out.println("");

            if (command.equals("stop")) {
                break;
            } else if (command.equals("list")) {
                service.listRecipes();
                System.out.println("");
            } else if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String name = scanner.nextLine();
                System.out.println(service.nameSearch(name));
            } else if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int time = Integer.parseInt(scanner.nextLine());
                System.out.println(service.timeSearch(time));
            } else if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                System.out.println(service.ingredientSearch(ingredient));
            }
        }
    }

}
