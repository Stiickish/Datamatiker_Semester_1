import java.sql.*;
import java.util.ArrayList;


public class DbConnector {

    // database URL
    static final String DB_URL = "jdbc:mysql://localhost/Tournament";

    //  Database credentials
    static final String USER = "Formand";
    static final String PASS = "Qwerty21";

    // Read teams
    public String[] readTeamsData() {
        String[] teams_data = new String[16];
        Connection conn = null;
        Statement stmt = null;

        int resultCounter = 0;

        try {
            //STEP 2: Register JDBC driver
            // Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();


            String sql = "SELECT * FROM Teams";
            ResultSet rs = stmt.executeQuery(sql);

            //STEP 5: Extract data from result set
            while (rs.next()) {
                //Retrieve by column name
                String team = rs.getString("team");
                String player1 = rs.getString("player1");
                String player2 = rs.getString("player2");


                String combinedTeam;
                combinedTeam = team + "," + player1 + "," + player2;

                teams_data[resultCounter] = combinedTeam;
                resultCounter++;

                //teams_data[] = team + "," + player1 + "," + player2;

            }
            //STEP 6: Clean-up environment
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se2) {
            }// nothing we can do
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }//end finally try
        }//end try


        return teams_data;
    }
}
