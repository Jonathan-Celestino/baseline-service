package practicascloud.baselineservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import practicascloud.baselineservice.dto.CalculoDTO;
import practicascloud.baselineservice.dto.EntradaDTO;
import practicascloud.baselineservice.service.CalculadoraService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200", methods= {RequestMethod.POST})
public class BaseController {
	
	@Autowired
    private CalculadoraService calculadoraService;
	
	@PostMapping(value = "/calcular")
	public List<CalculoDTO> crear(@RequestBody(required = true) EntradaDTO nuevo) {
		return calculadoraService.Calcular(nuevo);
	}
}
