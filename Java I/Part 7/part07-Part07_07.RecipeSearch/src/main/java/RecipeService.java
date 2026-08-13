import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeService {
    private ArrayList<Recipe> recipes;

    public RecipeService(String filename) {
        this.recipes = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(Paths.get(filename))) {
            while (fileScanner.hasNextLine()) {
                String name = fileScanner.nextLine();
                int cookingTime = Integer.parseInt(fileScanner.nextLine());

                ArrayList<String> ingredients = new ArrayList<>();
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();

                    if (line.isEmpty()) {
                        break; // empty line signals end of current recipe
                    }

                    ingredients.add(line);
                }

                this.recipes.add(new Recipe(name, cookingTime, ingredients));
            }
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public void listRecipes() {
        System.out.println("Recipes:");
        for (Recipe recipe : this.recipes) {
            System.out.println(recipe.toString());
        }
    }

    public String nameSearch(String name) {
        StringBuilder result = new StringBuilder();

        for (Recipe recipe : this.recipes) {
            if (recipe.getName().contains(name)) {
                result.append(recipe.toString()).append("\n");
            }
        }

        if (result.length() == 0) {
            return "Recipe not found.\n";
        }

        return result.toString();
    }

    public String timeSearch(int time) {
        StringBuilder result = new StringBuilder();

        for (Recipe recipe : this.recipes) {
            if (recipe.getCookingTime() <= time) {
                result.append(recipe.toString()).append("\n");
            }
        }

        if (result.length() == 0) {
            return "Recipe not found.\n";
        }

        return result.toString();
    }

    public String ingredientSearch(String ingredient) {
        StringBuilder result = new StringBuilder();

        for (Recipe recipe : this.recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                result.append(recipe.toString()).append("\n");
            }
        }

        if (result.length() == 0) {
            return "Recipe not found.\n";
        }

        return result.toString();
    }
}
