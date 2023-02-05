package practicascloud.baselineservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EntradaDTO {
	
	private float inversionInicial;
	@Builder.Default
	private float aportacionAnual = 0;
	@Builder.Default
	private float incrementoAnual = 0;
	private Integer anosInversion;
	private float rendimiento;

}
