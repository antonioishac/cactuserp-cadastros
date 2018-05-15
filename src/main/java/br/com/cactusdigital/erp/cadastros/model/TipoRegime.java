package br.com.cactusdigital.erp.cadastros.model;

/**
 * @author Antonio
 *
 */
public enum TipoRegime {

	LUCRO_REAL("Lucro Real"), LUCRO_PRESUMIDO("Lucro Presumido"), SIMPLES_NACIONAL("Simples Nacional");

	private String descricao;

	TipoRegime(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	public static TipoRegime parse(String param) {
		for (TipoRegime tipoRegime : TipoRegime.values()) {
			if (tipoRegime.descricao.equalsIgnoreCase(param)) {
				return tipoRegime;
			}
		}
		return null;
	}

}
