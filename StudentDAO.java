import java.sql.*;

public class StudentDAO {

    public void addStudent(Student s) {
        String query = "INSERT INTO students VALUES (?, ?, ?)";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setInt(1, s.getId());
            ps.setString(2, s.getName());
            ps.setDouble(3, s.getMarks());
            ps.executeUpdate();

            System.out.println("Student added to DB!");
        } catch (Exception e) {
            System.out.println("Error adding student.");
        }
    }

    public void viewStudents() {
        String query = "SELECT * FROM students";
        try (Connection con = DBConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(query)) {

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " | " +
                    rs.getString("name") + " | " +
                    rs.getDouble("marks")
                );
            }
        } catch (Exception e) {
            System.out.println("Error fetching data.");
        }
    }

    public void updateStudent(int id, String name, double marks) {
        String query = "UPDATE students SET name=?, marks=? WHERE id=?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setString(1, name);
            ps.setDouble(2, marks);
            ps.setInt(3, id);
            ps.executeUpdate();

            System.out.println("Student updated!");
        } catch (Exception e) {
            System.out.println("Error updating student.");
        }
    }

    public void deleteStudent(int id) {
        String query = "DELETE FROM students WHERE id=?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setInt(1, id);
            ps.executeUpdate();

            System.out.println("Student deleted!");
        } catch (Exception e) {
            System.out.println("Error deleting student.");
        }
    }
}
