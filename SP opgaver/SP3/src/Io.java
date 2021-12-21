import javax.sound.sampled.Control;
import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class Io {


    private final static String READ_LOCATION = "DATABASE";

    public boolean createNewTournamentFile(String name, int year, int day, int month, int gameTime) {
        try {
            File createNewTournament = new File("src/" + name + ".txt");
            String path = createNewTournament.getAbsolutePath();
            System.out.println(path);
            BufferedWriter writeOut = new BufferedWriter(new FileWriter(createNewTournament));
            writeOut.write("The tournament " + name + " starts on: " + year + "-" + day + "-" + month + "-" + gameTime);
            writeOut.close();
            return true;
        } catch (IOException e) {
            System.out.println(e);
            return false;
        }
    }

    public static void startTheTournament(String name) {

        if (READ_LOCATION == "DATABASE") {
            DbConnector db = new DbConnector();
            String[] temp = db.readTeamsData();

            for (String s : temp) { //Run through our Arraylist
                String[] teamValues = s.split(",");
                ArrayList<Player> player = new ArrayList<>();
                Player player1 = new Player(teamValues[1]);
                Player player2 = new Player(teamValues[2]);
                player.add(player1);
                player.add(player2);

                Team t = new Team(teamValues[0], player);
                Controller control = new Controller();
                control.participatingTeams.add(t);
                player.clear();

            }

        }

        try {
            File loadFile = new File("src/" + name + ".txt");
            Scanner readFile = new Scanner(loadFile);

            while (readFile.hasNextLine()) {
                String[] teamValues = readFile.nextLine().split(",");
                ArrayList<Player> player = new ArrayList<>();
                Player player1 = new Player(teamValues[2]);
                Player player2 = new Player(teamValues[3]);
                player.add(player1);
                player.add(player2);

                Team t = new Team(teamValues[0], player); // Creates a team with a team name and an array of players
                Main.control.participatingTeams.add(t);
                player.clear();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
