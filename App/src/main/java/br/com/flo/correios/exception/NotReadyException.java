package br.com.flo.correios.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.SERVICE_UNAVAILABLE, reason = "Instalando serviço. Por favor, aguarde de 3 a 5 minutos." ) //503
public class NotReadyException extends Exception{
	

}
