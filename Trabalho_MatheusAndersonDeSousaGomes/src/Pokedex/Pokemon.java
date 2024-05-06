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

	void cadastrarTipos(Tipo tipo){
		tipos.add(tipo);
	}
	
	void listarTipos(){
		for(int cont = 0; cont < tipos.size(); cont++) {
			System.out.printf("%s\n",tipos.get(cont));
		}
		System.out.println("\n");
	}
	
	void cadastrarFraquezas(Tipo tipo){
		fraquezas.add(tipo);
	}
	
	void listarFraquezas(){
		for(int cont = 0; cont < fraquezas.size(); cont++) {
			System.out.printf("%s\n",fraquezas.get(cont));
		}
		System.out.println("\n");
	}
	
	void cadastrarLinhaEvolutiva(String evolucao) {
		evolucoes.add(evolucao);
	}
}
