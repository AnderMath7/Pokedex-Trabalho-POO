package Pokedex;
import java.util.ArrayList;

import Pokedex.Tipo.EnumTipo;

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

	void cadastrarTipos(Tipo tipo){
		tipos.add(tipo);
	}
	
	void listarTipos(){
		int cont = 0;
		for(cont = 0; cont < (tipos.size() - 1); cont++) {
			System.out.printf("%s, ",tipos.get(cont).tipo);
		}
		System.out.printf("%s ",tipos.get(cont).tipo);
	}
	
	
	
	public EnumTipo getTipo(int index) {
		return tipos.get(index).tipo;
	}
	
	public ArrayList<Tipo> getTipos() {
		return tipos;
	}

	void cadastrarFraquezas(Tipo fraqueza){
		fraquezas.add(fraqueza);
		
	}
	
	void listarFraquezas(){
		int cont = 0;
		for(cont = 0; cont < (fraquezas.size() - 1); cont++) {
			System.out.printf("%s, ",fraquezas.get(cont).tipo);
		}
		System.out.printf("%s ",fraquezas.get(cont).tipo);
	}
	
	public EnumTipo getFraqueza(int index) {
		return fraquezas.get(index).tipo;
	}
	
	public ArrayList<Tipo> getFraquezas() {
		return fraquezas;
	}
	
	void cadastrarLinhaEvolutiva(String evolucao) {
		evolucoes.add(evolucao);
	}
	
	void mostrarLinhaEvolutiva() {
		int cont = 0;
		for(cont = 0; cont < (evolucoes.size() - 1); cont++) {
			System.out.printf("%s --> ",evolucoes.get(cont));
		}
		System.out.printf("%s",evolucoes.get(cont));
	}
}
