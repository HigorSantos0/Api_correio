package br.com.flo.correios.model;

public enum Status {
	NEED_SETUP,    //Precisa baixar o CSV dos correios
	SETUP_RUNNING, // Está baixando / Salvando no banco
	READY; 		   // Serviço está apto para ser consumido
}
