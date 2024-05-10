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
	
	Tipo(EnumTipo tipo){
		this.tipo = tipo;
	}
	
}
