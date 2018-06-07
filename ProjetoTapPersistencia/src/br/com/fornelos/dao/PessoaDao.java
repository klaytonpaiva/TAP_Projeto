package br.com.fornelos.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import br.com.fornelos.util.ConnectionUtil;
import br.com.fornelos.entities.Pessoa;

public class PessoaDao {
	
	private static Connection conn;
	public PessoaDao() throws SQLException{
		
		
	}
	public void inserir(Pessoa pessoa) throws SQLException{
		ConnectionUtil conexao = new ConnectionUtil();
		Connection conn = conexao.getConnection();
		String query = "insert into Pessoa(nome,tipo)values(?,?)";
		PreparedStatement stmt;
		stmt = conn.prepareStatement(query);
		stmt.setString(1, pessoa.getNomePessoa());
		stmt.setString(3, pessoa.getTipoPessoa());
		stmt.execute();
			
	}
	
	
	 public List<Pessoa> listar()  throws SQLException {
		 ConnectionUtil conexao = new ConnectionUtil();
		 Connection conn = conexao.getConnection();
		       String query = "SELECT * FROM Pessoa";
		       PreparedStatement stmt;
		       stmt = conn.prepareStatement(query);
		       System.out.println(stmt);
		       ResultSet  rs = stmt.executeQuery();
		       List<Pessoa> pessoas = new ArrayList<Pessoa>();
		       while (rs.next()) {
		           Pessoa pessoa = new Pessoa();
		           pessoa.setNomePessoa(rs.getString("nome"));
		           pessoa.setTipoPessoa(rs.getString("tipo"));
		           pessoas.add(pessoa); 
		       }
		       rs.close();
		       return pessoas;
		    }
	 
	 
	 public List<Pessoa> listarOrdemAlfabetica()  throws SQLException {
		 ConnectionUtil conexao = new ConnectionUtil();
		 Connection conn = conexao.getConnection();
		       String query = "SELECT * FROM Pessoa order by nome";
		       PreparedStatement stmt;
		       stmt = conn.prepareStatement(query);
		       System.out.println(stmt);
		       ResultSet  rs = stmt.executeQuery();
		       List<Pessoa> pessoas = new ArrayList<Pessoa>();
		       while (rs.next()) {
		           Pessoa pessoa = new Pessoa();
		           pessoa.setNomePessoa(rs.getString("nomePessoa"));
		           pessoa.setTipoPessoa(rs.getString("tipoPessoa"));
		           pessoas.add(pessoa); 
		       }
		       rs.close();
		       return pessoas;
		    }
	 
	 public void excluir (String CPF) throws SQLException{
		 ConnectionUtil conexao = new ConnectionUtil();
		 Connection conn = conexao.getConnection();
	       String query = "DELETE FROM Pessoa WHERE CPF_CNPJ = ?";
	       PreparedStatement stmt;
	       stmt = conn.prepareStatement(query);
	       stmt.setString(1,CPF);
	       System.out.println(stmt);
	       stmt.execute();
	      }
	 
	 
	 
	 public void alterar(Pessoa pessoa) throws SQLException {
		 
		 ConnectionUtil conexao = new ConnectionUtil();
		 Connection conn = conexao.getConnection();
		 
		 String query = "UPDATE pessoa set Pessoa.nome = ?";			
		 PreparedStatement stmt = null;
			
			try {
				   stmt = conn.prepareStatement(query);
			       stmt.setString(1, pessoa.getNomePessoa());
			       System.out.println(stmt);
			       stmt.execute();

			}catch (SQLException e) {
				e.printStackTrace();
			}catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				stmt.close();
				conn.close();
			}
		}

	 
	 public boolean consultaPessoa(String nomePessoa) throws SQLException {
		 ConnectionUtil conexao = new ConnectionUtil();
		 Connection conn = conexao.getConnection();
			PreparedStatement stmt = null;
			ResultSet rs = null;
			String sql = "SELECT * FROM pessoa WHERE nomePesspa = ? ";

			try {
				stmt = (PreparedStatement)conn.prepareStatement(sql);
				stmt.setString(1, nomePessoa);

				rs = stmt.executeQuery();

				if (rs.next()) {
					return true;
				}

			}catch (SQLException e) {
				e.printStackTrace();
			}finally {
				stmt.close();
				rs.close();
			}
			return false;
	 
	 }
	 
	 public Pessoa consultar(String CPF) throws SQLException {
		 ConnectionUtil conexao = new ConnectionUtil();
		 Connection conn = conexao.getConnection();
			PreparedStatement stmt = null;
			ResultSet rs = null;
			String sql = "SELECT * FROM pessoa WHERE CPF_CNPJ = ? ";
			Pessoa pessoa = new Pessoa();

			try {
				stmt = (PreparedStatement)conn.prepareStatement(sql);
				stmt.setString(1, CPF);

				rs = stmt.executeQuery();

				if (rs.next()) {
					pessoa.setNomePessoa(rs.getString("nomePessoa"));
					
					return pessoa;
				}

			}catch (SQLException e) {
				e.printStackTrace();
			}finally {
				
				stmt.close();
				rs.close();
			}
			
			return null;
	 }
		 
	}
	 
	 
		 
	 
	 


	



