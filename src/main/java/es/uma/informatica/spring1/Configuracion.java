package es.uma.informatica.spring1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

import es.uma.informatica.spring1.domain.Factura;

@Configurable
public class Configuracion {
	
	@Bean
	public CalculadorOfertas crearCalculadorOfertas(){
		List<Oferta> ofertas = new ArrayList<>();
		ofertas.add(new Oferta3x2());
		ofertas.add(new Descuento20Porciento("Queso"));
		
		CalculadorOfertas calculador = new CalculadorOfertas(ofertas);
		
		return calculador;
	}
	
	@Bean
	public Factura crearFactura(){
		return new Factura();
	}
}
