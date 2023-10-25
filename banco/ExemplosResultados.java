package banco;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class ExemplosResultados {

	public static void main(String[] args) {
		try {
			conectaBanco conexao = new conectaBanco();
			Connection cn = conexao.openDB();
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM alunos");
			
			while(rs.next()) {
				int id = rs.getInt("alunoId");
				String nome = rs.getString("nome");
				String telefone = rs.getString("telefone");
				double nota = rs.getDouble("nota");
				Aluno aluno = new Aluno(id, nome, telefone, nota);
				System.out.println(aluno);
			}
			conexao.fechaConexao(cn,null,rs);
		} catch (Exception e) {
			System.out.println("Falha ao conectar");
			e.printStackTrace();
		}

	}

}
