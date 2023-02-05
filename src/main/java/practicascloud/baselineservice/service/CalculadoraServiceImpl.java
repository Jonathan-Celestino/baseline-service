package practicascloud.baselineservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import practicascloud.baselineservice.dto.CalculoDTO;
import practicascloud.baselineservice.dto.EntradaDTO;


@Service
public class CalculadoraServiceImpl implements CalculadoraService {

	@Override
	public List<CalculoDTO> Calcular(EntradaDTO datos) {
		List<CalculoDTO> calculoDTO = new ArrayList<>(); 
		for (int i = 0; i < datos.getAnosInversion(); i++) {
			float valorInicial = i == 0 ? datos.getInversionInicial() : 
				calculoDTO.get(i - 1).getSaldoFinal();
			float aportacion = (float) (i == 0 ? datos.getAportacionAnual() : 
				Math.ceil ((calculoDTO.get(i - 1).getAportacion() * 
						(1 + (datos.getIncrementoAnual()/100)))));
			CalculoDTO calculo = new CalculoDTO();
			calculo.setAno(i + 1);
			calculo.setSaldoInicial(valorInicial);
			calculo.setAportacion(aportacion);
			float rendimiento = (valorInicial + aportacion) * (datos.getRendimiento() / 100);
			calculo.setRendimiento((float) Math.ceil (rendimiento));
			calculo.setSaldoFinal((float) Math.ceil (valorInicial + aportacion + rendimiento));
			calculoDTO.add(calculo);
		}
		return calculoDTO;
	}

}
