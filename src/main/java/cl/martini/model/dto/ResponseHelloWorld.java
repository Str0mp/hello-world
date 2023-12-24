package cl.martini.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseHelloWorld {

	private String message;
	private int statusCode;
	private boolean estadoOperacion;
}
