package digytal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import digytal.jdbc.connection.FabricaConexao;
import digytal.model.Cadastro;
import digytal.util.JDBCUtil;
import digytal.util.TipoOperacao;

public class CadastroDao {
	private Connection cnn;
	private final String TABELA="tab_cadastro";
	private final String CAMPOS[]={"nome","telefone"};
	
	public CadastroDao() {
		FabricaConexao fc = new FabricaConexao();
		cnn = fc.criarConexao();
	}
	public void incluir(Cadastro cadastro) {
		insertUpdate(TipoOperacao.INSERT, cadastro);
	}
	public void alterar(Cadastro cadastro) {
		insertUpdate(TipoOperacao.UPDATE, cadastro);
	}
	
	public void excluir(Integer id) {
		try {
			//String sql= "DELETE tab_cadastro WHERE id = ? ";
			String sql = JDBCUtil.delete(TABELA, "id"); 
			PreparedStatement st = cnn.prepareStatement(sql);
			st.setInt(1, id);
			st.executeUpdate();
			st.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public List<Cadastro> listar() {
		List<Cadastro> lista = new ArrayList<Cadastro>();
		try {
			//String sql= "SELECT * FROM tab_cadastro";
			String sql = JDBCUtil.select(TABELA); 
			
			PreparedStatement st = cnn.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				Cadastro c = converter(rs);
				lista.add(c);
			}
			
			st.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lista;
	}
	public Cadastro buscar(Integer id) {
		Cadastro c = null;
		try {
			//String sql= "SELECT * FROM tab_cadastro WHERE id = ?";
			String sql = JDBCUtil.select(TABELA,"id"); 
			PreparedStatement st = cnn.prepareStatement(sql);
			st.setInt(1, id);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				c = converter(rs);
			}
			
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return  c;
	}
	
	private Cadastro converter(ResultSet rs) throws SQLException{
		Cadastro cadastro = new Cadastro();
		cadastro.setId(rs.getInt("id"));
		cadastro.setNome(rs.getString("nome"));
		cadastro.setTelefone(rs.getLong("telefone"));
		return cadastro;
	}
	private void insertUpdate(TipoOperacao tipo, Cadastro cadastro) {
		try {
			//String sql= "UPDATE tab_cadastro SET nome = ?, telefone = ? WHERE id = ? ";
			String sql = JDBCUtil.insertUpdate(tipo,TABELA, CAMPOS); 
			PreparedStatement st = cnn.prepareStatement(sql);
			
			st.setString(1, cadastro.getNome());
			st.setLong(2, cadastro.getTelefone());
			
			if(tipo==TipoOperacao.UPDATE)
				st.setInt(3, cadastro.getId());
			
			st.executeUpdate();
			st.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
