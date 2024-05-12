package Pokedex;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	Menu(){}
	
	ArrayList<Pokemon> pokemons = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	void iniciar() {
		
		cadastrarPokemonsSistema();
		
		System.out.println("Olá, eu sou a Pokedéx!! :D\n"
				+ "\nEstou aqui para te dar informações importantes sobre os pokémons e avaliar senários de batalha!"
				+ "\nAtualmente os Pokémons conhecidos pela minha base de dados são:");
		if(pokemons.size()>0) {
			listarPokemons();
		}else {
			System.out.printf("Infelizmente você ainda não encontrou nenhum pokémon :[");
		}
		
		int escolha = 0, escolha2 = 0;
		
		
		do {
			System.out.println("\n\nO que você gostaria de fazer?"
				+ "\n[1] Obter informações sobre um dos pokémons já conhecidos"
				+ "\n[2] Simular cenários de batalha"
				+ "\n[3] Descobrir novos pokémons"
				+ "\n[4] Remover pókemons da base de dados"
				+ "\n[5] Sair da pokédex e continuar sua jornada\n\n\n");
			escolha = sc.nextInt();
			
			switch(escolha){
			//int escolha2;
			case 1:
				if(pokemons.size()>0) {
					do {
						System.out.println("Digite o número do pokémon desejado:");
						listarPokemons();
						System.out.println("\n[0] Para voltar");
						escolha2 = sc.nextInt();
						escolha2--;
						if(escolha2 >= 0) {
							informarPokemon(escolha2);
						}
					}while(escolha2>=0);
				}else {
					System.out.printf("Infelizmente você ainda não encontrou nenhum pokémon :[\n\n");
				}
				System.out.println("Voltando...\n\n");
				break;
			case 2:
				Scanner sc2 = new Scanner(System.in);
				Scanner sc3 = new Scanner(System.in);
				int resposta = 0, pontos1 = 0, pontos2 = 0, rounds = 0;
				if(pokemons.size()>1) {
					do {
						rounds = 0;
						System.out.println("Escolha o primeiro pokémon:");
						listarPokemons();
						escolha = sc2.nextInt();
						escolha--;
						Pokemon oponente1 = pokemons.get(escolha);
						System.out.println("Escolha o segundo pokémon:");
						escolha = sc3.nextInt();
						escolha--;
						Pokemon oponente2 = pokemons.get(escolha);
						//BATALHA
						do {
							if(oponente1.getTipo(rounds).equals(oponente2.getFraqueza(rounds))) {
								pontos1++;
							}
							if(oponente2.getTipo(rounds).equals(oponente1.getFraqueza(rounds))) {
								pontos2++;
							}
							rounds++;
						}while(pontos1 == pontos2 && rounds < oponente1.getTipos().size() && rounds < oponente1.getFraquezas().size() && rounds < oponente2.getTipos().size() && rounds < oponente2.getFraquezas().size());
						if(pontos1 > pontos2) {
							System.out.println(oponente1.getNome() + " venceria em uma batalha contra " + oponente2.getNome()
							+ "\n");
						}else {
							if(pontos2 > pontos1) {
								System.out.println(oponente2.getNome() + " venceria em uma batalha contra " + oponente1.getNome()
								+ "\n");
							}else {
								System.out.println(oponente1.getNome() + " vs " + oponente2.getNome()
								+ " gera um EMPATE!\n");
							}
						}
						System.out.println("Deseja iniciar outra batalha?"
								+ "[1] sim"
								+ "[2] não");
						escolha2 = sc3.nextInt();
					}while(escolha2!=2);
				}else {
					System.out.printf("Infelizmente você ainda não possui dados suficieantes para este recurso! :[\n\n");
				}
				System.out.println("Voltando...\n\n");
				break;
			case 3:
				Tipo listaTipos = new Tipo(0);
				String nome, descricao, forma;
				int tipoCod = 0;
				resposta = 0;
				int contador = 1;
				sc2 = new Scanner(System.in);
				sc3 = new Scanner(System.in);
				System.out.println("Digite o nome do pokémon:");
				nome = sc2.next();
				System.out.println("Insira a descrição do pokémon:");
				descricao = sc3.nextLine();
				Pokemon pokemon = new Pokemon(nome, descricao);
				Tipo tipo = new Tipo(0);
				Tipo fraqueza = new Tipo(0);
				do {
					System.out.println("Qual é o tipo do pokémon:");
					listaTipos.listarTodosTipos();
					tipoCod = sc2.nextInt();
					tipo = new Tipo(tipoCod);
					pokemon.cadastrarTipos(tipo);
					System.out.println("O pokémon possui mais um tipo?"
							+ "\n[1] Sim"
							+ "\n[2] Não");
					resposta = sc3.nextInt();
				}while(resposta!=2);
				do {
					System.out.println("Qual é a fraqueza do pokémon:");
					listaTipos.listarTodosTipos();
					tipoCod = sc2.nextInt();
					fraqueza = new Tipo(tipoCod);
					pokemon.cadastrarFraquezas(fraqueza);
					System.out.println("O pokémon possui mais alguma fraqueza?"
							+ "\n[1] Sim"
							+ "\n[2] Não");
					resposta = sc3.nextInt();
				}while(resposta!=2);
				do {
					System.out.println("Qual é a forma " + contador + "  do pokémon:");
					forma = sc2.next();
					pokemon.cadastrarLinhaEvolutiva(forma);
					contador++;
					System.out.println("O pokémon possui mais uma evolução?"
							+ "\n[1] Sim"
							+ "\n[2] Não");
					resposta = sc3.nextInt();
				}while(resposta!=2);
				pokemons.add(pokemon);
				System.out.println("Pokémon adicionado com sucesso!!\n\n");
				break;
			case 4:
				if(pokemons.size()>0) {
					do {
						System.out.println("Qual pokémon deseja apagar da base de dados?");
						listarPokemons();
						System.out.println("\n[0] Para voltar");
						escolha2 = sc.nextInt();
						escolha2--;
						if(escolha2>=0) {
							pokemons.remove(escolha2);
							System.out.println("Pokémon deletado comsucesso!\n\n");
						}
					}while(escolha2>=0);
				}else {
					System.out.printf("Infelizmente você ainda não encontrou nenhum pokémon :[\n\n");

				}
				System.out.println("Voltando...\n\n");
				break;
			case 5:
				System.out.println("Desligando, até logo...\n\n");
				break;
			default:
				System.out.println("Opção inválida!\n\n");
			}
		}while(escolha!=5);
		
	}
	
	void listarPokemons() {
		for(int cont = 0; cont < pokemons.size(); cont++){
			System.out.println("[" + (cont+1) + "] " + pokemons.get(cont).getNome());
		}
	}
	
	void informarPokemon(int resposta) {
		System.out.printf(pokemons.get(resposta).getNome() + "\n" + "Descrição: " + pokemons.get(resposta).getDescricao() + "\n\nTipo: ");
		pokemons.get(resposta).listarTipos();
		System.out.printf("\n\nFraquezas: ");
		pokemons.get(resposta).listarFraquezas();
		System.out.printf("\n\nEvoluções: ");
		pokemons.get(resposta).mostrarLinhaEvolutiva(); System.out.println("\n\n");
	}
	
	void cadastrarPokemons() {
		Tipo listaTipos = new Tipo(0);
		String nome, descricao, forma;
		int tipoCod = 0;
		int resposta = 0;
		int contador = 1;
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Digite o nome do pokémon:");
		nome = sc2.next();
		System.out.println("Insira a descrição do pokémon:");
		descricao = sc3.nextLine();
		Pokemon pokemon = new Pokemon(nome, descricao);
		Tipo tipo = new Tipo(0);
		Tipo fraqueza = new Tipo(0);
		do {
			System.out.println("Qual é o tipo do pokémon:");
			listaTipos.listarTodosTipos();
			tipoCod = sc2.nextInt();
			tipo = new Tipo(tipoCod);
			pokemon.cadastrarTipos(tipo);
			System.out.println("O pokémon possui mais um tipo?"
					+ "\n[1] Sim"
					+ "\n[2] Não");
			resposta = sc3.nextInt();
		}while(resposta!=2);
		do {
			System.out.println("Qual é a fraqueza do pokémon:");
			listaTipos.listarTodosTipos();
			tipoCod = sc2.nextInt();
			fraqueza = new Tipo(tipoCod);
			pokemon.cadastrarFraquezas(fraqueza);
			System.out.println("O pokémon possui mais alguma fraqueza?"
					+ "\n[1] Sim"
					+ "\n[2] Não");
			resposta = sc3.nextInt();
		}while(resposta!=2);
		do {
			System.out.println("Qual é a forma " + contador + "  do pokémon:");
			forma = sc2.next();
			pokemon.cadastrarLinhaEvolutiva(forma);
			contador++;
			System.out.println("O pokémon possui mais uma evolução?"
					+ "\n[1] Sim"
					+ "\n[2] Não");
			resposta = sc3.nextInt();
		}while(resposta!=2);
		sc2.close();
		sc3.close();
	}
	
	void cadastrarPokemonsSistema(){
		//BULBASSAURO
		Pokemon bulbassauro = new Pokemon("Bulbassauro","Bulbassauro pode ser observado cochilando sob a luz do sol. "
				+ "Possui uma semente nas costas. \nAo absorver a luz do sol, a semente cresce progressivamente.");
		Tipo tipo = new Tipo(4); bulbassauro.cadastrarTipos(tipo);
		tipo = new Tipo(7); bulbassauro.cadastrarTipos(tipo);
		// fraquezas 2 5 11 12 
		Tipo fraqueza = new Tipo(2); bulbassauro.cadastrarFraquezas(fraqueza);
		fraqueza = new Tipo(5); bulbassauro.cadastrarFraquezas(fraqueza);
		fraqueza = new Tipo(11); bulbassauro.cadastrarFraquezas(fraqueza);
		fraqueza = new Tipo(12); bulbassauro.cadastrarFraquezas(fraqueza);
		String forma1 = "Bulbassauro", forma2="Ivysaur", forma3 = "Venusaur";
		bulbassauro.cadastrarLinhaEvolutiva(forma1); bulbassauro.cadastrarLinhaEvolutiva(forma2); bulbassauro.cadastrarLinhaEvolutiva(forma3);
		pokemons.add(bulbassauro);
		
		// CHARMANDER
		Pokemon charmander = new Pokemon("Charmander","Charmander, pokémon lagarto, desde seu nascmento charmander possui uma chama que queima na ponta de sua calda. "
				+ "\nEssa chama simboliza sua alegria e saúde. Se ela apagar, charmander morrerá.");
		tipo = new Tipo(2); charmander.cadastrarTipos(tipo);
		// fraquezas 3 9 10
		fraqueza = new Tipo(3); charmander.cadastrarFraquezas(fraqueza);
		fraqueza = new Tipo(9); charmander.cadastrarFraquezas(fraqueza);
		fraqueza = new Tipo(10); charmander.cadastrarFraquezas(fraqueza); 
		forma1 = "Charmander"; forma2="Charmeleon"; forma3 = "Charizard";
		charmander.cadastrarLinhaEvolutiva(forma1); charmander.cadastrarLinhaEvolutiva(forma2); charmander.cadastrarLinhaEvolutiva(forma3);
		pokemons.add(charmander);
		
		Pokemon squirtle  = new Pokemon("Squirtle ","A concha de Squirtle não é apenas usada para proteção."
				+ "\nA forma arredondada da concha e as ranhuras na superfície ajudam minimizar a resistência na água,"
				+ "\npermitindo que este pokémon nade em alta velocidade");
		tipo = new Tipo(3); squirtle .cadastrarTipos(tipo);
		// fraquezas 4 8
		fraqueza = new Tipo(4); squirtle.cadastrarFraquezas(fraqueza);
		fraqueza = new Tipo(8); squirtle.cadastrarFraquezas(fraqueza);
		forma1 = "Squirtle"; forma2="Wartortle"; forma3 = "Blastoise";
		squirtle.cadastrarLinhaEvolutiva(forma1); squirtle.cadastrarLinhaEvolutiva(forma2); squirtle.cadastrarLinhaEvolutiva(forma3);
		pokemons.add(squirtle);
		
		Pokemon pikachu  = new Pokemon("Pikachu ","É da natureza de pikachu armazenar eletricidade."
				+ " Ele se sente estressado de vez enquando, \nse não conseguir descarregar completamente sua eletricidade");
		tipo = new Tipo(8); pikachu .cadastrarTipos(tipo);
		// fraquezas 9
		fraqueza = new Tipo(9); pikachu.cadastrarFraquezas(fraqueza);
		forma1 = "Pichu"; forma2="Pikachu"; forma3 = "Raichu";
		pikachu.cadastrarLinhaEvolutiva(forma1); pikachu.cadastrarLinhaEvolutiva(forma2); pikachu.cadastrarLinhaEvolutiva(forma3);
		pokemons.add(pikachu);
		
		Pokemon pidgey   = new Pokemon("Pidgey ","Pidgey tem um senso de direção extremamente nítido."
				+ "\nEle é capaz de voltar para o seu ninho de forma infalível, por mais longe que esteja.");
		tipo = new Tipo(1); pidgey .cadastrarTipos(tipo);
		tipo = new Tipo(5); pidgey .cadastrarTipos(tipo);
		fraqueza = new Tipo(8); pidgey.cadastrarFraquezas(fraqueza);
		fraqueza = new Tipo(10); pidgey.cadastrarFraquezas(fraqueza);
		fraqueza = new Tipo(12); pidgey.cadastrarFraquezas(fraqueza);
		forma1 = "Pidgey"; forma2="Pidgeotto"; forma3 = "Pidgeot";
		pidgey.cadastrarLinhaEvolutiva(forma1); pidgey.cadastrarLinhaEvolutiva(forma2); pidgey.cadastrarLinhaEvolutiva(forma3);
		pokemons.add(pidgey);
		
		// BUTTERFREE
		Pokemon butterfree = new Pokemon("Butterfree","Butterfree tem lindas asas que são cobertas por pó de escamas brilhantes. "
		+ "\nEste pó é esparzido na atmosfera para criar deslumbrantes padrões no céu.");
		tipo = new Tipo(5); butterfree.cadastrarTipos(tipo);
		tipo = new Tipo(13); butterfree.cadastrarTipos(tipo);
		// fraquezas 2, 5, 8, 10 e 12
		fraqueza = new Tipo(2); butterfree.cadastrarFraquezas(fraqueza);
		fraqueza = new Tipo(5); butterfree.cadastrarFraquezas(fraqueza);
		fraqueza = new Tipo(8); butterfree.cadastrarFraquezas(fraqueza);
		fraqueza = new Tipo(10); butterfree.cadastrarFraquezas(fraqueza);
		fraqueza = new Tipo(12); butterfree.cadastrarFraquezas(fraqueza);
		forma1 = "Caterpie"; forma2="Metapod"; forma3 = "Butterfree";
		butterfree.cadastrarLinhaEvolutiva(forma1); butterfree.cadastrarLinhaEvolutiva(forma2); butterfree.cadastrarLinhaEvolutiva(forma3);
		pokemons.add(butterfree);

		// EKANS
		Pokemon ekans = new Pokemon("Ekans","Ekans é conhecido por ser muito sorrateiro. "
		+ "\nEle pode se esconder silenciosamente em grama alta para se emboscar em suas presas.");
		tipo = new Tipo(7); ekans.cadastrarTipos(tipo);
		// fraquezas 9 e 11
		fraqueza = new Tipo(9); ekans.cadastrarFraquezas(fraqueza);
		fraqueza = new Tipo(11); ekans.cadastrarFraquezas(fraqueza);
		forma1 = "Ekans"; forma2="Arbok";
		ekans.cadastrarLinhaEvolutiva(forma1); ekans.cadastrarLinhaEvolutiva(forma2);
		pokemons.add(ekans);

		// CLEFAIRY
		Pokemon clefairy = new Pokemon("Clefairy","Clefairy é muito dócil e é conhecido por dançar à luz da lua. "
		+ "\nSua dança é tão graciosa que é capaz de fazer pessoas e outros Pokémon se sentirem felizes.");
		tipo = new Tipo(18); clefairy.cadastrarTipos(tipo);
		// fraquezas 7 e 15
		fraqueza = new Tipo(7); clefairy.cadastrarFraquezas(fraqueza);
		fraqueza = new Tipo(15); clefairy.cadastrarFraquezas(fraqueza);
		forma1 = "Clefairy"; forma2="Clefable";
		clefairy.cadastrarLinhaEvolutiva(forma1); clefairy.cadastrarLinhaEvolutiva(forma2);
		pokemons.add(clefairy);

		// MAGNEMITE
		Pokemon magnemite = new Pokemon("Magnemite","Magnemite é atraído por campos magnéticos. "
		+ "\nPode ser encontrado frequentemente em áreas urbanas onde há equipamentos eletrônicos.");
		tipo = new Tipo(8); magnemite.cadastrarTipos(tipo);
		tipo = new Tipo(15); magnemite.cadastrarTipos(tipo);
		// fraquezas 2, 6 e 9
		fraqueza = new Tipo(2); magnemite.cadastrarFraquezas(fraqueza);
		fraqueza = new Tipo(6); magnemite.cadastrarFraquezas(fraqueza);
		fraqueza = new Tipo(9); magnemite.cadastrarFraquezas(fraqueza);
		forma1 = "Magnemite"; forma2="Magneton";
		magnemite.cadastrarLinhaEvolutiva(forma1); magnemite.cadastrarLinhaEvolutiva(forma2);
		pokemons.add(magnemite);

		// GROWLITHE
		Pokemon growlithe = new Pokemon("Growlithe","Growlithe é um fiel parceiro de treinadores. "
		+ "\nEle é conhecido por sua lealdade e coragem, protegendo aqueles que considera seus amigos.");
		tipo = new Tipo(2); growlithe.cadastrarTipos(tipo);
		// fraquezas 3, 9 e 10
		fraqueza = new Tipo(3); growlithe.cadastrarFraquezas(fraqueza);
		fraqueza = new Tipo(9); growlithe.cadastrarFraquezas(fraqueza);
		fraqueza = new Tipo(10); growlithe.cadastrarFraquezas(fraqueza);
		forma1 = "Growlithe"; forma2="Arcanine";
		growlithe.cadastrarLinhaEvolutiva(forma1); growlithe.cadastrarLinhaEvolutiva(forma2);
		pokemons.add(growlithe);

		// ABRA
		Pokemon abra = new Pokemon("Abra","Abra é conhecido por sua habilidade de se teletransportar para escapar de perigos. "
		+ "\nNo entanto, ele frequentemente se teletransporta por acidente devido à sua natureza assustada.");
		tipo = new Tipo(11); abra.cadastrarTipos(tipo);
		// fraquezas 13, 14 e 17
		fraqueza = new Tipo(13); abra.cadastrarFraquezas(fraqueza);
		fraqueza = new Tipo(14); abra.cadastrarFraquezas(fraqueza);
		fraqueza = new Tipo(17); abra.cadastrarFraquezas(fraqueza);
		forma1 = "Abra"; forma2="Kadabra"; forma3="Alakazam";
		abra.cadastrarLinhaEvolutiva(forma1); abra.cadastrarLinhaEvolutiva(forma2); abra.cadastrarLinhaEvolutiva(forma3);
		pokemons.add(abra);

		// VULPIX
		Pokemon vulpix = new Pokemon("Vulpix","Vulpix é um Pokémon de tipo fogo com uma cauda cheia de chamas. "
		+ "\nEle usa essas chamas para se manter aquecido em climas frios.");
		tipo = new Tipo(2); vulpix.cadastrarTipos(tipo);
		// fraquezas 3, 9 e 10
		fraqueza = new Tipo(3); vulpix.cadastrarFraquezas(fraqueza);
		fraqueza = new Tipo(9); vulpix.cadastrarFraquezas(fraqueza);
		fraqueza = new Tipo(10); vulpix.cadastrarFraquezas(fraqueza);
		forma1 = "Vulpix"; forma2="Ninetales";
		vulpix.cadastrarLinhaEvolutiva(forma1); vulpix.cadastrarLinhaEvolutiva(forma2);
		pokemons.add(vulpix);

		// ZUBAT
		Pokemon zubat = new Pokemon("Zubat","Zubat é frequentemente encontrado em cavernas escuras, "
		+ "\nonde ele se move rapidamente com suas asas e usa sua ecolocalização para se orientar.");
		tipo = new Tipo(5); zubat.cadastrarTipos(tipo);
		tipo = new Tipo(7); zubat.cadastrarTipos(tipo);
		// fraquezas 8, 10, 11 e 12
		fraqueza = new Tipo(8); zubat.cadastrarFraquezas(fraqueza);
		fraqueza = new Tipo(10); zubat.cadastrarFraquezas(fraqueza);
		fraqueza = new Tipo(11); zubat.cadastrarFraquezas(fraqueza);
		fraqueza = new Tipo(12); zubat.cadastrarFraquezas(fraqueza);
		forma1 = "Zubat"; forma2="Golbat";
		zubat.cadastrarLinhaEvolutiva(forma1); zubat.cadastrarLinhaEvolutiva(forma2);
		pokemons.add(zubat);

		// ONIX
		Pokemon onix = new Pokemon("Onix","Onix é um Pokémon de rocha extremamente resistente. "
		+ "\nEle pode cavar túneis subterrâneos com facilidade usando seu corpo longo e robusto.");
		tipo = new Tipo(9); onix.cadastrarTipos(tipo);
		tipo = new Tipo(10); onix.cadastrarTipos(tipo);
		// fraquezas 3, 4, 6, 9, 11 e 15
		fraqueza = new Tipo(3); onix.cadastrarFraquezas(fraqueza);
		fraqueza = new Tipo(4); onix.cadastrarFraquezas(fraqueza);
		fraqueza = new Tipo(6); onix.cadastrarFraquezas(fraqueza);
		fraqueza = new Tipo(9); onix.cadastrarFraquezas(fraqueza);
		fraqueza = new Tipo(11); onix.cadastrarFraquezas(fraqueza);
		fraqueza = new Tipo(15); onix.cadastrarFraquezas(fraqueza);
		forma1 = "Onix";
		onix.cadastrarLinhaEvolutiva(forma1);
		pokemons.add(onix);

		// STARYU
		Pokemon staryu = new Pokemon("Staryu","Staryu é um Pokémon marinho que pode regenerar seus membros perdidos rapidamente. "
		+ "\nEle pode sobreviver em águas profundas graças à sua habilidade de respirar por sua pele.");
		tipo = new Tipo(3); staryu.cadastrarTipos(tipo);
		// fraquezas 4 e 8
		fraqueza = new Tipo(4); staryu.cadastrarFraquezas(fraqueza);
		fraqueza = new Tipo(8); staryu.cadastrarFraquezas(fraqueza);
		forma1 = "Staryu"; forma2="Starmie";
		staryu.cadastrarLinhaEvolutiva(forma1); staryu.cadastrarLinhaEvolutiva(forma2);
		pokemons.add(staryu);

		// EEVEE
		Pokemon eevee = new Pokemon("Eevee","Eevee é um Pokémon versátil que pode evoluir para várias formas diferentes, "
		+ "\ndependendo das condições ambientais e dos métodos de treinamento.");
		tipo = new Tipo(1); eevee.cadastrarTipos(tipo);
		// fraqueza 6
		fraqueza = new Tipo(6); eevee.cadastrarFraquezas(fraqueza);
		forma1 = "Eevee"; forma2 = "Vaporeon | Jolteon | Flareon | Espeon | Umbreon | Leafeon | Glaceon | Sylveon";
		eevee.cadastrarLinhaEvolutiva(forma1); eevee.cadastrarLinhaEvolutiva(forma2);
		pokemons.add(eevee);

		// GASTLY
		Pokemon gastly = new Pokemon("Gastly","Gastly é formado de gás tóxico. "
		+ "\nEle pode se esgueirar por fendas e rachaduras nas rochas para surpreender suas presas.");
		tipo = new Tipo(7); gastly.cadastrarTipos(tipo);
		tipo = new Tipo(14); gastly.cadastrarTipos(tipo);
		// fraquezas 9, 11, 14 e 17
		fraqueza = new Tipo(9); gastly.cadastrarFraquezas(fraqueza);
		fraqueza = new Tipo(11); gastly.cadastrarFraquezas(fraqueza);
		fraqueza = new Tipo(14); gastly.cadastrarFraquezas(fraqueza);
		fraqueza = new Tipo(17); gastly.cadastrarFraquezas(fraqueza);
		forma1 = "Gastly"; forma2="Haunter"; forma3="Gengar";
		gastly.cadastrarLinhaEvolutiva(forma1); gastly.cadastrarLinhaEvolutiva(forma2); gastly.cadastrarLinhaEvolutiva(forma3);
		pokemons.add(gastly);

	}

}
