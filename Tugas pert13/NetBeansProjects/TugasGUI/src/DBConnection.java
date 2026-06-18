import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public Connection getConnection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            con = DriverManager.getConnection("jdbc:mysql://localhost/pbo", "root", "");
            System.out.println("Koneksi Sukses!");
            return con;
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver tidak ditemukan: " + ex.getMessage());
            return null;
        } catch (SQLException ex) {
            System.out.println("Koneksi Gagal: " + ex.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        DBConnection tes = new DBConnection();
        tes.getConnection();
    }
}