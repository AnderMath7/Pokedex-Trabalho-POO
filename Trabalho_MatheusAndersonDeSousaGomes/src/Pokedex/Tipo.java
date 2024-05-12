package Pokedex;

public class Tipo {
	enum EnumTipo {
		NORMAL,
		FOGO,
		ÁGUA,
		GRAMA,
		VOADOR,
		LUTADOR,
		VENENO,
		ELÉTRICO,
		TERRA,
		PEDRA,
		PSÍQUICO,
		GELO,
		INSETO,
		FANTASMA,
		FERRO,
		DRAGÃO,
		SOMBRIO,
		FADA,
		LENDÁRIO
	}
	
	EnumTipo tipo;
	
	Tipo(int codigo){
		switch(codigo) {
		case 1:
			this.tipo = EnumTipo.NORMAL;
			break;
		case 2:
			this.tipo = EnumTipo.FOGO;
			break;
		case 3:
			this.tipo = EnumTipo.ÁGUA;
			break;
		case 4:
			this.tipo = EnumTipo.GRAMA;
			break;
		case 5:
			this.tipo = EnumTipo.VOADOR;
			break;
		case 6:
			this.tipo = EnumTipo.LUTADOR;
			break;
		case 7:
			this.tipo = EnumTipo.VENENO;
			break;
		case 8:
			this.tipo = EnumTipo.ELÉTRICO;
			break;
		case 9:
			this.tipo = EnumTipo.TERRA;
			break;
		case 10:
			this.tipo = EnumTipo.PEDRA;
			break;
		case 11:
			this.tipo = EnumTipo.PSÍQUICO;
			break;
		case 12:
			this.tipo = EnumTipo.GELO;
			break;
		case 13:
			this.tipo = EnumTipo.INSETO;
			break;
		case 14:
			this.tipo = EnumTipo.FANTASMA;
			break;
		case 15:
			this.tipo = EnumTipo.FERRO;
			break;
		case 16:
			this.tipo = EnumTipo.DRAGÃO;
			break;
		case 17:
			this.tipo = EnumTipo.SOMBRIO;
			break;
		case 18:
			this.tipo = EnumTipo.FADA;
			break;
		case 19:
			this.tipo = EnumTipo.LENDÁRIO;
			break;
		}
	
	}
	
	void listarTodosTipos() {
		for(int cont = 1; cont <= 19; cont++) {
			switch(cont) {
			case 1:
				System.out.println("[" + cont + "] " + EnumTipo.NORMAL);
				break;
			case 2:
				System.out.println("[" + cont + "] " + EnumTipo.FOGO);
				break;
			case 3:
				System.out.println("[" + cont + "] " + EnumTipo.ÁGUA);
				break;
			case 4:
				System.out.println("[" + cont + "] " + EnumTipo.GRAMA);
				break;
			case 5:
				System.out.println("[" + cont + "] " + EnumTipo.VOADOR);
				break;
			case 6:
				System.out.println("[" + cont + "] " + EnumTipo.LUTADOR);
				break;
			case 7:
				System.out.println("[" + cont + "] " + EnumTipo.VENENO);
				break;
			case 8:
				System.out.println("[" + cont + "] " + EnumTipo.ELÉTRICO);
				break;
			case 9:
				System.out.println("[" + cont + "] " + EnumTipo.TERRA);
				break;
			case 10:
				System.out.println("[" + cont + "] " + EnumTipo.PEDRA);
				break;
			case 11:
				System.out.println("[" + cont + "] " + EnumTipo.PSÍQUICO);
				break;
			case 12:
				System.out.println("[" + cont + "] " + EnumTipo.GELO);
				break;
			case 13:
				System.out.println("[" + cont + "] " + EnumTipo.INSETO);
				break;
			case 14:
				System.out.println("[" + cont + "] " + EnumTipo.FANTASMA);
				break;
			case 15:
				System.out.println("[" + cont + "] " + EnumTipo.FERRO);
				break;
			case 16:
				System.out.println("[" + cont + "] " + EnumTipo.DRAGÃO);
				break;
			case 17:
				System.out.println("[" + cont + "] " + EnumTipo.SOMBRIO);
				break;
			case 18:
				System.out.println("[" + cont + "] " + EnumTipo.FADA);
				break;
			case 19:
				System.out.println("[" + cont + "] " + EnumTipo.LENDÁRIO);
				break;
			}
		}
	}
}
