
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File");
        String file = scanner.nextLine();
        System.out.println("Team:");
        String favoriteTeam = scanner.nextLine();

        int matchCount = 0;
        int winCount = 0;
        int lossCount = 0;

        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();

                String[] rowData = row.split(",");
                String team1 = rowData[0];
                String team2 = rowData[1];
                int team1Score = Integer.parseInt(rowData[2]);
                int team2Score = Integer.parseInt(rowData[3]);

                // Check team names and increment match count if match is found
                if (team1.equals(favoriteTeam) || team2.equals(favoriteTeam)) {
                    matchCount++;
                }

                if (team1.equals(favoriteTeam)) {
                    if (team1Score > team2Score) {
                        winCount++;
                    } else {
                        lossCount++;
                    }
                } else if (team2.equals(favoriteTeam)) {
                    if (team2Score > team1Score) {
                        winCount++;
                    } else {
                        lossCount++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Games: " + matchCount);
        System.out.println("Wins: " + winCount);
        System.out.println("Losses: " + lossCount);
    }
}
