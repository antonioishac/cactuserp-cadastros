package br.com.cactusdigital.erp.cadastros.model;

public enum TipoSexo {
	
	MASCULINO("Masculino"), FEMININO("Feminino");
	
	private String descricao;
	
	TipoSexo(String descricao){
		this.descricao = descricao;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}	
}
