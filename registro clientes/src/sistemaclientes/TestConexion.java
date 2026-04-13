import java.sql.Connection;
import com.clientes.dao.Conexion;

public class TestConexion {

    public static void main(String[] args) {

        Connection con = Conexion.getConexion();

        if (con != null) {
            System.out.println("✅ Conexión exitosa a MySQL");
        } else {
            System.out.println("❌ Error de conexión");
        }
    }
}