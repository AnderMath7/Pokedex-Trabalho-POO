package Pokedex;
import java.util.ArrayList;

public class Menu {
	Menu(){}
	
	
	
	void iniciar() {
		ArrayList<Pokemon> pokemons = new ArrayList<>();
		Pokemon bulbassauro = new Pokemon("Bulbassauro","Bulbassauro pode ser observado cochilando sob a luz do sol. Possui uma semente nas costas. Ao absorver a luz do sol, a semente cresce progressivamente.");
		Tipo bulbassauro1 = new Tipo(4); Tipo bulbassauro2 = new Tipo(7); Tipo fraquezaBulbassauro1 = new Tipo(2); Tipo fraquezaBulbassauro2 = new Tipo(12);
		bulbassauro.cadastrarTipos(bulbassauro1); bulbassauro.cadastrarTipos(bulbassauro2);
		
		
		
		System.out.println("Olá, eu sou a Pokedéx!! :D"
				+ "\nEstou aqui para te dar informações importantes sobre os pokémons e avaliar senários de batalha!"
				+ "\nAtualmente os Pokémons conhecidos pela minha base de dados são: \n");
	}
	

}
