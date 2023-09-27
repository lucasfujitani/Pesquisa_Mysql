import java.sql.*;
import com.mysql.cj.jdbc.Driver;

public class Main {
    public static void main(String[] args) {
buscarUsuarios();

        }
        public static void buscarUsuarios(){

        try{
            Driver driver = new Driver();
            DriverManager.registerDriver(driver);

            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "password");
            PreparedStatement stmt = c.prepareStatement("SELECT * FROM customer");
            stmt.executeQuery();

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                rs.next();
                String nome = rs.getString("first_name");
                String email = rs.getString("email");

                System.out.println("Nome: " + nome);
                System.out.println("Email: " + email);

            }
c.close();

        }catch (SQLException  e){
            e.printStackTrace();
        }
        }
    }
