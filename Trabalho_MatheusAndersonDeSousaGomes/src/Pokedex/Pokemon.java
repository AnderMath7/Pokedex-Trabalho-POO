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

	void cadastrarTipos(int cod){
		switch(cod) {
		case 1:
			Tipo tipo = new Tipo(EnumTipo.NORMAL);
			tipos.add(tipo);
			break;
		case 2:
			tipo = new Tipo(EnumTipo.FOGO);
			tipos.add(tipo);
			//this.tipo = EnumTipo.FOGO;
			break;
		case 3:
			tipo = new Tipo(EnumTipo.ÁGUA);
			tipos.add(tipo);
			break;
		case 4:
			tipo = new Tipo(EnumTipo.GRAMA);
			tipos.add(tipo);
			break;
		case 5:
			tipo = new Tipo(EnumTipo.VOADOR);
			tipos.add(tipo);
			break;
		case 6:
			tipo = new Tipo(EnumTipo.LUTADOR);
			tipos.add(tipo);
			break;
		case 7:
			tipo = new Tipo(EnumTipo.VENENO);
			tipos.add(tipo);
			break;
		case 8:
			tipo = new Tipo(EnumTipo.ELÉTRICO);
			tipos.add(tipo);
			break;
		case 9:
			tipo = new Tipo(EnumTipo.TERRA);
			tipos.add(tipo);
			break;
		case 10:
			tipo = new Tipo(EnumTipo.PEDRA);
			tipos.add(tipo);
			break;
		case 11:
			tipo = new Tipo(EnumTipo.PSÍQUICO);
			tipos.add(tipo);
			break;
		case 12:
			tipo = new Tipo(EnumTipo.GELO);
			tipos.add(tipo);
			break;
		case 13:
			tipo = new Tipo(EnumTipo.INSETO);
			tipos.add(tipo);
			break;
		case 14:
			tipo = new Tipo(EnumTipo.FANTASMA);
			tipos.add(tipo);
			break;
		case 15:
			tipo = new Tipo(EnumTipo.FERRO);
			tipos.add(tipo);
			break;
		case 16:
			tipo = new Tipo(EnumTipo.DRAGÃO);
			tipos.add(tipo);
			break;
		case 17:
			tipo = new Tipo(EnumTipo.SOMBRIO);
			tipos.add(tipo);
			break;
		case 18:
			tipo = new Tipo(EnumTipo.FADA);
			tipos.add(tipo);
			break;
		case 19:
			tipo = new Tipo(EnumTipo.LENDÁRIO);
			tipos.add(tipo);
			break;
		}
	}
	
	void listarTipos(){
		for(int cont = 0; cont < tipos.size(); cont++) {
			System.out.printf("%s ",tipos.get(cont));
		}

	}
	
	void cadastrarFraquezas(int cod){
		switch(cod) {
		case 1:
			Tipo fraqueza = new Tipo(EnumTipo.NORMAL);
			fraquezas.add(fraqueza);
			break;
		case 2:
			fraqueza = new Tipo(EnumTipo.FOGO);
			fraquezas.add(fraqueza);
			break;
		case 3:
			fraqueza = new Tipo(EnumTipo.ÁGUA);
			fraquezas.add(fraqueza);
			break;
		case 4:
			fraqueza = new Tipo(EnumTipo.GRAMA);
			fraquezas.add(fraqueza);
			break;
		case 5:
			fraqueza = new Tipo(EnumTipo.VOADOR);
			fraquezas.add(fraqueza);
			break;
		case 6:
			fraqueza = new Tipo(EnumTipo.LUTADOR);
			fraquezas.add(fraqueza);
			break;
		case 7:
			fraqueza = new Tipo(EnumTipo.VENENO);
			fraquezas.add(fraqueza);
			break;
		case 8:
			fraqueza = new Tipo(EnumTipo.ELÉTRICO);
			fraquezas.add(fraqueza);
			break;
		case 9:
			fraqueza = new Tipo(EnumTipo.TERRA);
			fraquezas.add(fraqueza);
			break;
		case 10:
			fraqueza = new Tipo(EnumTipo.PEDRA);
			fraquezas.add(fraqueza);
			break;
		case 11:
			fraqueza = new Tipo(EnumTipo.PSÍQUICO);
			fraquezas.add(fraqueza);
			break;
		case 12:
			fraqueza = new Tipo(EnumTipo.GELO);
			fraquezas.add(fraqueza);
			break;
		case 13:
			fraqueza = new Tipo(EnumTipo.INSETO);
			fraquezas.add(fraqueza);
			break;
		case 14:
			fraqueza = new Tipo(EnumTipo.FANTASMA);
			fraquezas.add(fraqueza);
			break;
		case 15:
			fraqueza = new Tipo(EnumTipo.FERRO);
			fraquezas.add(fraqueza);
			break;
		case 16:
			fraqueza = new Tipo(EnumTipo.DRAGÃO);
			fraquezas.add(fraqueza);
			break;
		case 17:
			fraqueza = new Tipo(EnumTipo.SOMBRIO);
			fraquezas.add(fraqueza);
			break;
		case 18:
			fraqueza = new Tipo(EnumTipo.FADA);
			fraquezas.add(fraqueza);
			break;
		case 19:
			fraqueza = new Tipo(EnumTipo.LENDÁRIO);
			fraquezas.add(fraqueza);
			break;
		}
	}
	
	void listarFraquezas(){
		for(int cont = 0; cont < fraquezas.size(); cont++) {
			System.out.printf("%s ",fraquezas.get(cont));
		}
	
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
