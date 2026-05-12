import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalTime;
import java.time.LocalDate;

public class Set {
    int setId;
    Date date;
    Time start;
    Time end;
    int length;
    String exercise;
    String mgroup;
    int weightLb;
    int reps;

    public void addToDb() {
        
        Connection conn = "";
        String insertString = "INSERT INTO iliftSets VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement insert = null;

        try {
            insert = conn.prepareStatement(insertString);
            
            insert.setInt(1, setId);
            insert.setDate(2, date);
            insert.setTime(3, start);
            insert.setTime(4, end);
            insert.setInt(5, length);
            insert.setString(6, exercise);
            insert.setString(7, mgroup);
            insert.setInt(8, weightLb);
            insert.setInt(9, reps);

            insert.executeUpdate();

        } catch (SQLException ex) {
            if (insert != null) {
                try {
                    insert.close();
                } catch (SQLException sqlEx) { } // ignore

                insert = null;
            }
        }

    }
}