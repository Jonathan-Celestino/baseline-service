package practicascloud.baselineservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CalculoDTO {

	private Integer ano;
	private float saldoInicial;
	private float aportacion;
	private float rendimiento;
	private float saldoFinal; 
}
