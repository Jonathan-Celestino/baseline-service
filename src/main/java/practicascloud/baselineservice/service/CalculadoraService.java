package practicascloud.baselineservice.service;

import java.util.List;

import practicascloud.baselineservice.dto.CalculoDTO;
import practicascloud.baselineservice.dto.EntradaDTO;

public interface CalculadoraService {

	List<CalculoDTO> Calcular(EntradaDTO datos);
}
