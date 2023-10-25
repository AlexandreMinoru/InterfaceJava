package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class conectaBanco {
	
	private final static String url = "jdbc:mysql://localhost:3306/pi";
	private final static String username ="root";
	private final static String password = "P@$$w0rd";
	private static Connection con;
	private Statement stmt;
	private Resultset rs;
	private String nome, telefone;
	
	
	public conectaBanco() {
		
	}

	public static void main(String[] args) {
		conectaBanco banco = new conectaBanco();
		banco.openDB();
		banco.closeDB();

	}

	public void closeDB() {
		try {
			con.close();
		}catch(Exception e) {
			System.out.println("não foi possível fechar a conexão");
			System.exit(1);
		}
		
	}

	public Connection openDB() {
		try {
			con = DriverManager.getConnection(url, username, password);
			stmt = con.createStatement();
			System.out.println("Conexão estabelecidad com sucesso");
			return con;
		}catch(Exception e){
			System.out.println("não foi possível conectar");
			System.exit(1);
		}
		return null;
	}

	public void fechaConexao(Connection cn, Statement stmt, ResultSet rs2) throws SQLException {
		if(con!= null) {
			cn.close();
		}if(stmt != null) {
			stmt.close();
		}if(rs2 != null) {
			rs2.close();
		}
		
	}

}
