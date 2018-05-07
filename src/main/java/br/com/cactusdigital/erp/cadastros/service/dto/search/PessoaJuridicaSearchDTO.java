package br.com.cactusdigital.erp.cadastros.service.dto.search;

import java.util.Date;

public class PessoaJuridicaSearchDTO {
	
	private Long codigo;	
	private String cnpj;	
	private String nomeFantasia;
	private String inscricaoMunicipal;	
	private String inscricaoEstadual;	
	private Date dataConstituicao;
	private String dsTipoRegime;
	private String tipoCrt;
	private String suframa;	
	private String nomePessoa;
	
	public PessoaJuridicaSearchDTO(Long codigo, String cnpj, String nomeFantasia, String inscricaoMunicipal,
			String inscricaoEstadual, Date dataConstituicao, String dsTipoRegime, String tipoCrt, String suframa,
			String nomePessoa) {
		super();
		this.codigo = codigo;
		this.cnpj = cnpj;
		this.nomeFantasia = nomeFantasia;
		this.inscricaoMunicipal = inscricaoMunicipal;
		this.inscricaoEstadual = inscricaoEstadual;
		this.dataConstituicao = dataConstituicao;
		this.dsTipoRegime = dsTipoRegime;
		this.tipoCrt = tipoCrt;
		this.suframa = suframa;
		this.nomePessoa = nomePessoa;
	}

	/**
	 * @return the codigo
	 */
	public Long getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}

	/**
	 * @param cnpj the cnpj to set
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	/**
	 * @return the nomeFantasia
	 */
	public String getNomeFantasia() {
		return nomeFantasia;
	}

	/**
	 * @param nomeFantasia the nomeFantasia to set
	 */
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	/**
	 * @return the inscricaoMunicipal
	 */
	public String getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}

	/**
	 * @param inscricaoMunicipal the inscricaoMunicipal to set
	 */
	public void setInscricaoMunicipal(String inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
	}

	/**
	 * @return the inscricaoEstadual
	 */
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	/**
	 * @param inscricaoEstadual the inscricaoEstadual to set
	 */
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	/**
	 * @return the dataConstituicao
	 */
	public Date getDataConstituicao() {
		return dataConstituicao;
	}

	/**
	 * @param dataConstituicao the dataConstituicao to set
	 */
	public void setDataConstituicao(Date dataConstituicao) {
		this.dataConstituicao = dataConstituicao;
	}

	/**
	 * @return the dsTipoRegime
	 */
	public String getDsTipoRegime() {
		return dsTipoRegime;
	}

	/**
	 * @param dsTipoRegime the dsTipoRegime to set
	 */
	public void setDsTipoRegime(String dsTipoRegime) {
		this.dsTipoRegime = dsTipoRegime;
	}

	/**
	 * @return the tipoCrt
	 */
	public String getTipoCrt() {
		return tipoCrt;
	}

	/**
	 * @param tipoCrt the tipoCrt to set
	 */
	public void setTipoCrt(String tipoCrt) {
		this.tipoCrt = tipoCrt;
	}

	/**
	 * @return the suframa
	 */
	public String getSuframa() {
		return suframa;
	}

	/**
	 * @param suframa the suframa to set
	 */
	public void setSuframa(String suframa) {
		this.suframa = suframa;
	}

	/**
	 * @return the nome
	 */
	public String getNomePessoa() {
		return nomePessoa;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}
	
}
