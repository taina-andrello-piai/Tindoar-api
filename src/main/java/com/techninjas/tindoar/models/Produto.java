package com.techninjas.tindoar.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Produto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProduto;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn
	private Usuario user;
	
	@OneToMany(mappedBy="produto")
	private List<Doacao> doacao = new ArrayList<>();
	
	private String nome;
	
	private String estado;
	
	private String status;
	
	private String categoria;
	
	private String cidade;
	
	private String fotos;
	
	private String descricao;
	
	private LocalDateTime dataCadastro;

	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getFotos() {
		return fotos;
	}

	public void setFotos(String fotos) {
		this.fotos = fotos;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDateTime dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public List<Doacao> getDoacao() {
		return doacao;
	}

	public void setDoacao(List<Doacao> doacao) {
		this.doacao = doacao;
	}

	public Produto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produto(Integer idProduto, Usuario user, String nome, String estado, String status, String categoria,
			String cidade, String fotos, String descricao, LocalDateTime dataCadastro) {
		super();
		this.idProduto = idProduto;
		this.user = user;
		this.nome = nome;
		this.estado = estado;
		this.status = status;
		this.categoria = categoria;
		this.cidade = cidade;
		this.fotos = fotos;
		this.descricao = descricao;
		this.dataCadastro = dataCadastro;
	}

	@Override
	public int hashCode() {
		return Objects.hash(getIdProduto());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!(obj instanceof Produto)) return false;
		if (getClass() != obj.getClass()) return false;
		Produto other = (Produto) obj;
		return getIdProduto().equals(other.getIdProduto());
	}
	
	
	
}
