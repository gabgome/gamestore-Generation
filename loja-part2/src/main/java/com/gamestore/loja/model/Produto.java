package com.gamestore.loja.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(max = 100)
	private String nome;
	
	@NotNull
	@Size(max = 255)
	private String descricao;
	
	@NotNull
	private int anolancamento;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getAnolancamento() {
		return anolancamento;
	}

	public void setAnolancamento(int anolancamento) {
		this.anolancamento = anolancamento;
	}

	public Categoria getcategoria() {
		return categoria;
	}

	public void setcategoria(Categoria categoria) {
		this.categoria = categoria;
	}
		
}
