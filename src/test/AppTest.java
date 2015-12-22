package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import evolutionary_algorithms.complement.Probability;
import evolutionary_algorithms.complement.Range;

public class AppTest {
	
	/**
	 * Definimos una variable de tipo Probability y otra de Range para realizar las pruebas
	 */
	Probability t_probabilidad;
	Range t_range;
	
	@Before
	public void Before1(){
		t_probabilidad = new Probability();
		t_probabilidad.setProbability((float)3.55);
		
		t_range = new Range();
	}

	/**
	 * Test que verifica si la probabilidad es 3.55.
	 */
	
	@Test
	public void test1() {
		assertEquals("Prueba1: Primera prueba comprobando que la probabilidad es 3.55", (float)3.55, t_probabilidad.getProbability(), (float)3.55);
	}

}
