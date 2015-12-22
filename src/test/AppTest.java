package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import evolutionary_algorithms.complement.Probability;
import evolutionary_algorithms.complement.Range;

public class AppTest {
	
	/**
	 * Definimos dos variables de tipo Probability y otra de Range para realizar las pruebas
	 */
	Probability t_probabilidad;
	Probability t_probabilidad2;
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
	
	/**
	 * Test que verifica que el objeto t_range no sea null
	 */
	@Test
	public void test2() {
		assertNotNull("Prueba2: Comprobar que no sea null",t_range);
	}
	
	/**
	 * Función que se ejecuta después del test y añade a setData el objeto t_probabilidad y unos valores maximos y minimos
	 */
	@After
	public void After1() {
		t_probabilidad2 = t_probabilidad;
		t_range.setData(t_probabilidad);
		t_range.setMin((float)1.15);
		t_range.setMax((float)2.50);
	}
	
	/**
	 * Test que verifica que el objeto t_probabilidad2 es el mismo que contiene el objeto t_range
	 */
	@Test
	public void Test3() {
		assertEquals("Prueba3: comprobar que los objetos son iguales",t_probabilidad2,t_range.getData());
	}

}
