package Pokedex;
import java.util.ArrayList;

public class Menu {
	Menu(){}
	
	ArrayList<Pokemon> pokemons = new ArrayList<>();
	
	void iniciar() {
		
		cadastrarPokemons();
		
		System.out.printf(pokemons.get(0).getNome() + "\n" + "Descrição: " + pokemons.get(0).getDescricao() + "\n Tipo: ");
		pokemons.get(0).listarTipos();
		System.out.printf("\nFraquezas: ");
		pokemons.get(0).listarFraquezas();
		System.out.printf("\nEvoluções: ");
		pokemons.get(0).mostrarLinhaEvolutiva();
		
		
		System.out.println("Olá, eu sou a Pokedéx!! :D"
				+ "\nEstou aqui para te dar informações importantes sobre os pokémons e avaliar senários de batalha!"
				+ "\nAtualmente os Pokémons conhecidos pela minha base de dados são: \n");
	}
	
	void cadastrarPokemons(){
		//BULBASSAURO
		Pokemon bulbassauro = new Pokemon("Bulbassauro","Bulbassauro pode ser observado cochilando sob a luz do sol. Possui uma semente nas costas. Ao absorver a luz do sol, a semente cresce progressivamente.");
		// fraquezas 2 5 11 12 
		bulbassauro.cadastrarTipos(4); bulbassauro.cadastrarTipos(7);
		bulbassauro.cadastrarFraquezas(2); bulbassauro.cadastrarFraquezas(5); bulbassauro.cadastrarFraquezas(11); bulbassauro.cadastrarFraquezas(12);
		String forma1 = "Bulbassauro", forma2="Ivysaur", forma3 = "Venusaur";
		bulbassauro.cadastrarLinhaEvolutiva(forma1); bulbassauro.cadastrarLinhaEvolutiva(forma2); bulbassauro.cadastrarLinhaEvolutiva(forma3);
		pokemons.add(bulbassauro);
		
		// CHARMANDER
		Pokemon charmander = new Pokemon("Charmander","Charmander, pokémon lagarto, desde seu nascmento charmander possui uma chama que queima na ponta de sua calda. Essa chama simboliza sua alegria e saúde. Se ela apagar, charmander morrerá.");
		// fraquezas 3 9 10
		charmander.cadastrarTipos(2);
		charmander.cadastrarFraquezas(3); charmander.cadastrarFraquezas(9); charmander.cadastrarFraquezas(10); 
		forma1 = "Charmander"; forma2="Charmeleon"; forma3 = "Charizard";
		charmander.cadastrarLinhaEvolutiva(forma1); charmander.cadastrarLinhaEvolutiva(forma2); charmander.cadastrarLinhaEvolutiva(forma3);
		pokemons.add(charmander);
		/*
		Pokemon bulbassauro = new Pokemon("Bulbassauro","Bulbassauro pode ser observado cochilando sob a luz do sol. Possui uma semente nas costas. Ao absorver a luz do sol, a semente cresce progressivamente.");
		Tipo bulbassauro1 = new Tipo(4); Tipo bulbassauro2 = new Tipo(7);
		// fraquezas 2 5 11 12 
		Tipo fraquezaBul1 = new Tipo(2); Tipo fraquezaBul2 = new Tipo(5); Tipo fraquezaBul3 = new Tipo(11); Tipo fraquezaBul4 = new Tipo(12);
		bulbassauro.cadastrarTipos(bulbassauro1); bulbassauro.cadastrarTipos(bulbassauro2);
		bulbassauro.cadastrarFraquezas(fraquezaBul1); bulbassauro.cadastrarFraquezas(fraquezaBul2);
		bulbassauro.cadastrarFraquezas(fraquezaBul3); bulbassauro.cadastrarFraquezas(fraquezaBul4);
		String forma1 = "Bulbassauro", forma2="Ivysaur", forma3 = "Venusaur";
		bulbassauro.cadastrarLinhaEvolutiva(forma1); bulbassauro.cadastrarLinhaEvolutiva(forma2); bulbassauro.cadastrarLinhaEvolutiva(forma3);
		pokemons.add(bulbassauro);*/
		/*
		Pokemon bulbassauro = new Pokemon("Bulbassauro","Bulbassauro pode ser observado cochilando sob a luz do sol. Possui uma semente nas costas. Ao absorver a luz do sol, a semente cresce progressivamente.");
		Tipo bulbassauro1 = new Tipo(4); Tipo bulbassauro2 = new Tipo(7);
		// fraquezas 2 5 11 12 
		Tipo fraquezaBul1 = new Tipo(2); Tipo fraquezaBul2 = new Tipo(5); Tipo fraquezaBul3 = new Tipo(11); Tipo fraquezaBul4 = new Tipo(12);
		bulbassauro.cadastrarTipos(bulbassauro1); bulbassauro.cadastrarTipos(bulbassauro2);
		bulbassauro.cadastrarFraquezas(fraquezaBul1); bulbassauro.cadastrarFraquezas(fraquezaBul2);
		bulbassauro.cadastrarFraquezas(fraquezaBul3); bulbassauro.cadastrarFraquezas(fraquezaBul4);
		String forma1 = "Bulbassauro", forma2="Ivysaur", forma3 = "Venusaur";
		bulbassauro.cadastrarLinhaEvolutiva(forma1); bulbassauro.cadastrarLinhaEvolutiva(forma2); bulbassauro.cadastrarLinhaEvolutiva(forma3);
		pokemons.add(bulbassauro);*/
		/*
		Pokemon bulbassauro = new Pokemon("Bulbassauro","Bulbassauro pode ser observado cochilando sob a luz do sol. Possui uma semente nas costas. Ao absorver a luz do sol, a semente cresce progressivamente.");
		Tipo bulbassauro1 = new Tipo(4); Tipo bulbassauro2 = new Tipo(7);
		// fraquezas 2 5 11 12 
		Tipo fraquezaBul1 = new Tipo(2); Tipo fraquezaBul2 = new Tipo(5); Tipo fraquezaBul3 = new Tipo(11); Tipo fraquezaBul4 = new Tipo(12);
		bulbassauro.cadastrarTipos(bulbassauro1); bulbassauro.cadastrarTipos(bulbassauro2);
		bulbassauro.cadastrarFraquezas(fraquezaBul1); bulbassauro.cadastrarFraquezas(fraquezaBul2);
		bulbassauro.cadastrarFraquezas(fraquezaBul3); bulbassauro.cadastrarFraquezas(fraquezaBul4);
		String forma1 = "Bulbassauro", forma2="Ivysaur", forma3 = "Venusaur";
		bulbassauro.cadastrarLinhaEvolutiva(forma1); bulbassauro.cadastrarLinhaEvolutiva(forma2); bulbassauro.cadastrarLinhaEvolutiva(forma3);
		pokemons.add(bulbassauro);*/
		/*
		Pokemon bulbassauro = new Pokemon("Bulbassauro","Bulbassauro pode ser observado cochilando sob a luz do sol. Possui uma semente nas costas. Ao absorver a luz do sol, a semente cresce progressivamente.");
		Tipo bulbassauro1 = new Tipo(4); Tipo bulbassauro2 = new Tipo(7);
		// fraquezas 2 5 11 12 
		Tipo fraquezaBul1 = new Tipo(2); Tipo fraquezaBul2 = new Tipo(5); Tipo fraquezaBul3 = new Tipo(11); Tipo fraquezaBul4 = new Tipo(12);
		bulbassauro.cadastrarTipos(bulbassauro1); bulbassauro.cadastrarTipos(bulbassauro2);
		bulbassauro.cadastrarFraquezas(fraquezaBul1); bulbassauro.cadastrarFraquezas(fraquezaBul2);
		bulbassauro.cadastrarFraquezas(fraquezaBul3); bulbassauro.cadastrarFraquezas(fraquezaBul4);
		String forma1 = "Bulbassauro", forma2="Ivysaur", forma3 = "Venusaur";
		bulbassauro.cadastrarLinhaEvolutiva(forma1); bulbassauro.cadastrarLinhaEvolutiva(forma2); bulbassauro.cadastrarLinhaEvolutiva(forma3);
		pokemons.add(bulbassauro);*/
		/*
		Pokemon bulbassauro = new Pokemon("Bulbassauro","Bulbassauro pode ser observado cochilando sob a luz do sol. Possui uma semente nas costas. Ao absorver a luz do sol, a semente cresce progressivamente.");
		Tipo bulbassauro1 = new Tipo(4); Tipo bulbassauro2 = new Tipo(7);
		// fraquezas 2 5 11 12 
		Tipo fraquezaBul1 = new Tipo(2); Tipo fraquezaBul2 = new Tipo(5); Tipo fraquezaBul3 = new Tipo(11); Tipo fraquezaBul4 = new Tipo(12);
		bulbassauro.cadastrarTipos(bulbassauro1); bulbassauro.cadastrarTipos(bulbassauro2);
		bulbassauro.cadastrarFraquezas(fraquezaBul1); bulbassauro.cadastrarFraquezas(fraquezaBul2);
		bulbassauro.cadastrarFraquezas(fraquezaBul3); bulbassauro.cadastrarFraquezas(fraquezaBul4);
		String forma1 = "Bulbassauro", forma2="Ivysaur", forma3 = "Venusaur";
		bulbassauro.cadastrarLinhaEvolutiva(forma1); bulbassauro.cadastrarLinhaEvolutiva(forma2); bulbassauro.cadastrarLinhaEvolutiva(forma3);
		pokemons.add(bulbassauro);*/
		/*
		Pokemon bulbassauro = new Pokemon("Bulbassauro","Bulbassauro pode ser observado cochilando sob a luz do sol. Possui uma semente nas costas. Ao absorver a luz do sol, a semente cresce progressivamente.");
		Tipo bulbassauro1 = new Tipo(4); Tipo bulbassauro2 = new Tipo(7);
		// fraquezas 2 5 11 12 
		Tipo fraquezaBul1 = new Tipo(2); Tipo fraquezaBul2 = new Tipo(5); Tipo fraquezaBul3 = new Tipo(11); Tipo fraquezaBul4 = new Tipo(12);
		bulbassauro.cadastrarTipos(bulbassauro1); bulbassauro.cadastrarTipos(bulbassauro2);
		bulbassauro.cadastrarFraquezas(fraquezaBul1); bulbassauro.cadastrarFraquezas(fraquezaBul2);
		bulbassauro.cadastrarFraquezas(fraquezaBul3); bulbassauro.cadastrarFraquezas(fraquezaBul4);
		String forma1 = "Bulbassauro", forma2="Ivysaur", forma3 = "Venusaur";
		bulbassauro.cadastrarLinhaEvolutiva(forma1); bulbassauro.cadastrarLinhaEvolutiva(forma2); bulbassauro.cadastrarLinhaEvolutiva(forma3);
		pokemons.add(bulbassauro); */
		/*
		Pokemon bulbassauro = new Pokemon("Bulbassauro","Bulbassauro pode ser observado cochilando sob a luz do sol. Possui uma semente nas costas. Ao absorver a luz do sol, a semente cresce progressivamente.");
		Tipo bulbassauro1 = new Tipo(4); Tipo bulbassauro2 = new Tipo(7);
		// fraquezas 2 5 11 12 
		Tipo fraquezaBul1 = new Tipo(2); Tipo fraquezaBul2 = new Tipo(5); Tipo fraquezaBul3 = new Tipo(11); Tipo fraquezaBul4 = new Tipo(12);
		bulbassauro.cadastrarTipos(bulbassauro1); bulbassauro.cadastrarTipos(bulbassauro2);
		bulbassauro.cadastrarFraquezas(fraquezaBul1); bulbassauro.cadastrarFraquezas(fraquezaBul2);
		bulbassauro.cadastrarFraquezas(fraquezaBul3); bulbassauro.cadastrarFraquezas(fraquezaBul4);
		String forma1 = "Bulbassauro", forma2="Ivysaur", forma3 = "Venusaur";
		bulbassauro.cadastrarLinhaEvolutiva(forma1); bulbassauro.cadastrarLinhaEvolutiva(forma2); bulbassauro.cadastrarLinhaEvolutiva(forma3);
		pokemons.add(bulbassauro);*/
		/*
		Pokemon bulbassauro = new Pokemon("Bulbassauro","Bulbassauro pode ser observado cochilando sob a luz do sol. Possui uma semente nas costas. Ao absorver a luz do sol, a semente cresce progressivamente.");
		Tipo bulbassauro1 = new Tipo(4); Tipo bulbassauro2 = new Tipo(7);
		// fraquezas 2 5 11 12 
		Tipo fraquezaBul1 = new Tipo(2); Tipo fraquezaBul2 = new Tipo(5); Tipo fraquezaBul3 = new Tipo(11); Tipo fraquezaBul4 = new Tipo(12);
		bulbassauro.cadastrarTipos(bulbassauro1); bulbassauro.cadastrarTipos(bulbassauro2);
		bulbassauro.cadastrarFraquezas(fraquezaBul1); bulbassauro.cadastrarFraquezas(fraquezaBul2);
		bulbassauro.cadastrarFraquezas(fraquezaBul3); bulbassauro.cadastrarFraquezas(fraquezaBul4);
		String forma1 = "Bulbassauro", forma2="Ivysaur", forma3 = "Venusaur";
		bulbassauro.cadastrarLinhaEvolutiva(forma1); bulbassauro.cadastrarLinhaEvolutiva(forma2); bulbassauro.cadastrarLinhaEvolutiva(forma3);
		pokemons.add(bulbassauro);*/
		/*
		Pokemon bulbassauro = new Pokemon("Bulbassauro","Bulbassauro pode ser observado cochilando sob a luz do sol. Possui uma semente nas costas. Ao absorver a luz do sol, a semente cresce progressivamente.");
		Tipo bulbassauro1 = new Tipo(4); Tipo bulbassauro2 = new Tipo(7);
		// fraquezas 2 5 11 12 
		Tipo fraquezaBul1 = new Tipo(2); Tipo fraquezaBul2 = new Tipo(5); Tipo fraquezaBul3 = new Tipo(11); Tipo fraquezaBul4 = new Tipo(12);
		bulbassauro.cadastrarTipos(bulbassauro1); bulbassauro.cadastrarTipos(bulbassauro2);
		bulbassauro.cadastrarFraquezas(fraquezaBul1); bulbassauro.cadastrarFraquezas(fraquezaBul2);
		bulbassauro.cadastrarFraquezas(fraquezaBul3); bulbassauro.cadastrarFraquezas(fraquezaBul4);
		String forma1 = "Bulbassauro", forma2="Ivysaur", forma3 = "Venusaur";
		bulbassauro.cadastrarLinhaEvolutiva(forma1); bulbassauro.cadastrarLinhaEvolutiva(forma2); bulbassauro.cadastrarLinhaEvolutiva(forma3);
		pokemons.add(bulbassauro);*/
		/*
		Pokemon bulbassauro = new Pokemon("Bulbassauro","Bulbassauro pode ser observado cochilando sob a luz do sol. Possui uma semente nas costas. Ao absorver a luz do sol, a semente cresce progressivamente.");
		Tipo bulbassauro1 = new Tipo(4); Tipo bulbassauro2 = new Tipo(7);
		// fraquezas 2 5 11 12 
		Tipo fraquezaBul1 = new Tipo(2); Tipo fraquezaBul2 = new Tipo(5); Tipo fraquezaBul3 = new Tipo(11); Tipo fraquezaBul4 = new Tipo(12);
		bulbassauro.cadastrarTipos(bulbassauro1); bulbassauro.cadastrarTipos(bulbassauro2);
		bulbassauro.cadastrarFraquezas(fraquezaBul1); bulbassauro.cadastrarFraquezas(fraquezaBul2);
		bulbassauro.cadastrarFraquezas(fraquezaBul3); bulbassauro.cadastrarFraquezas(fraquezaBul4);
		String forma1 = "Bulbassauro", forma2="Ivysaur", forma3 = "Venusaur";
		bulbassauro.cadastrarLinhaEvolutiva(forma1); bulbassauro.cadastrarLinhaEvolutiva(forma2); bulbassauro.cadastrarLinhaEvolutiva(forma3);
		pokemons.add(bulbassauro);*/
		/*
		Pokemon bulbassauro = new Pokemon("Bulbassauro","Bulbassauro pode ser observado cochilando sob a luz do sol. Possui uma semente nas costas. Ao absorver a luz do sol, a semente cresce progressivamente.");
		Tipo bulbassauro1 = new Tipo(4); Tipo bulbassauro2 = new Tipo(7);
		// fraquezas 2 5 11 12 
		Tipo fraquezaBul1 = new Tipo(2); Tipo fraquezaBul2 = new Tipo(5); Tipo fraquezaBul3 = new Tipo(11); Tipo fraquezaBul4 = new Tipo(12);
		bulbassauro.cadastrarTipos(bulbassauro1); bulbassauro.cadastrarTipos(bulbassauro2);
		bulbassauro.cadastrarFraquezas(fraquezaBul1); bulbassauro.cadastrarFraquezas(fraquezaBul2);
		bulbassauro.cadastrarFraquezas(fraquezaBul3); bulbassauro.cadastrarFraquezas(fraquezaBul4);
		String forma1 = "Bulbassauro", forma2="Ivysaur", forma3 = "Venusaur";
		bulbassauro.cadastrarLinhaEvolutiva(forma1); bulbassauro.cadastrarLinhaEvolutiva(forma2); bulbassauro.cadastrarLinhaEvolutiva(forma3);
		pokemons.add(bulbassauro);*/
		/*
		Pokemon bulbassauro = new Pokemon("Bulbassauro","Bulbassauro pode ser observado cochilando sob a luz do sol. Possui uma semente nas costas. Ao absorver a luz do sol, a semente cresce progressivamente.");
		Tipo bulbassauro1 = new Tipo(4); Tipo bulbassauro2 = new Tipo(7);
		// fraquezas 2 5 11 12 
		Tipo fraquezaBul1 = new Tipo(2); Tipo fraquezaBul2 = new Tipo(5); Tipo fraquezaBul3 = new Tipo(11); Tipo fraquezaBul4 = new Tipo(12);
		bulbassauro.cadastrarTipos(bulbassauro1); bulbassauro.cadastrarTipos(bulbassauro2);
		bulbassauro.cadastrarFraquezas(fraquezaBul1); bulbassauro.cadastrarFraquezas(fraquezaBul2);
		bulbassauro.cadastrarFraquezas(fraquezaBul3); bulbassauro.cadastrarFraquezas(fraquezaBul4);
		String forma1 = "Bulbassauro", forma2="Ivysaur", forma3 = "Venusaur";
		bulbassauro.cadastrarLinhaEvolutiva(forma1); bulbassauro.cadastrarLinhaEvolutiva(forma2); bulbassauro.cadastrarLinhaEvolutiva(forma3);
		pokemons.add(bulbassauro);*/
		/*
		Pokemon bulbassauro = new Pokemon("Bulbassauro","Bulbassauro pode ser observado cochilando sob a luz do sol. Possui uma semente nas costas. Ao absorver a luz do sol, a semente cresce progressivamente.");
		Tipo bulbassauro1 = new Tipo(4); Tipo bulbassauro2 = new Tipo(7);
		// fraquezas 2 5 11 12 
		Tipo fraquezaBul1 = new Tipo(2); Tipo fraquezaBul2 = new Tipo(5); Tipo fraquezaBul3 = new Tipo(11); Tipo fraquezaBul4 = new Tipo(12);
		bulbassauro.cadastrarTipos(bulbassauro1); bulbassauro.cadastrarTipos(bulbassauro2);
		bulbassauro.cadastrarFraquezas(fraquezaBul1); bulbassauro.cadastrarFraquezas(fraquezaBul2);
		bulbassauro.cadastrarFraquezas(fraquezaBul3); bulbassauro.cadastrarFraquezas(fraquezaBul4);
		String forma1 = "Bulbassauro", forma2="Ivysaur", forma3 = "Venusaur";
		bulbassauro.cadastrarLinhaEvolutiva(forma1); bulbassauro.cadastrarLinhaEvolutiva(forma2); bulbassauro.cadastrarLinhaEvolutiva(forma3);
		pokemons.add(bulbassauro);*/
		/*
		Pokemon bulbassauro = new Pokemon("Bulbassauro","Bulbassauro pode ser observado cochilando sob a luz do sol. Possui uma semente nas costas. Ao absorver a luz do sol, a semente cresce progressivamente.");
		Tipo bulbassauro1 = new Tipo(4); Tipo bulbassauro2 = new Tipo(7);
		// fraquezas 2 5 11 12 
		Tipo fraquezaBul1 = new Tipo(2); Tipo fraquezaBul2 = new Tipo(5); Tipo fraquezaBul3 = new Tipo(11); Tipo fraquezaBul4 = new Tipo(12);
		bulbassauro.cadastrarTipos(bulbassauro1); bulbassauro.cadastrarTipos(bulbassauro2);
		bulbassauro.cadastrarFraquezas(fraquezaBul1); bulbassauro.cadastrarFraquezas(fraquezaBul2);
		bulbassauro.cadastrarFraquezas(fraquezaBul3); bulbassauro.cadastrarFraquezas(fraquezaBul4);
		String forma1 = "Bulbassauro", forma2="Ivysaur", forma3 = "Venusaur";
		bulbassauro.cadastrarLinhaEvolutiva(forma1); bulbassauro.cadastrarLinhaEvolutiva(forma2); bulbassauro.cadastrarLinhaEvolutiva(forma3);
		pokemons.add(bulbassauro);*/
	}

}
