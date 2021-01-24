package interfacesHeranca;

public interface BancoDados extends SqlDCL,SqlDML, SqlDDL {
	
	void abrirConexao();
	void fecharConexao();

}
