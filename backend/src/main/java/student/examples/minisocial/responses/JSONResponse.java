package student.examples.minisocial.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import student.examples.minisocial.responses.enums.ResponseStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JSONResponse{

	private ResponseStatus status;
	
	private Object data;
	
	
}
