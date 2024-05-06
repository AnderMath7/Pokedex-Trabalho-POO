package Pokedex;
import java.util.ArrayList;

public class Pokemon {
	private String nome;
	private String descricao;
	private ArrayList<Tipo> tipos = new ArrayList<>();
	private ArrayList<Tipo> fraquezas = new ArrayList<>();
	private ArrayList<String> evolucoes = new ArrayList<>();
	
	Pokemon(String nome, String descricao){
		this.nome = nome;
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}


	public String getDescricao() {
		return descricao;
	}

	cadastrarTipos(Tipo tipo){
		tipos.add(tipo);
	}
	
	
}
