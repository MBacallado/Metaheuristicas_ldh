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
	 * Función que se ejecuta después del test y añade a t_probabilidad2 el valor de la instancia t_probabilidad y a setData t_probabilidad
	 */
	@After
	public void After1() {
		t_probabilidad2 = t_probabilidad;
		t_range.setData(t_probabilidad);
	}
	
	/**
	 * Test que verifica que el objeto t_probabilidad2 es el mismo que contiene el objeto t_range
	 */
	@Test
	public void Test3() {
		assertEquals("Prueba3: comprobar que los objetos son iguales",t_probabilidad2,t_range.getData());
	}
	
	/**
	 * Test que verifica que la variable min de t_range es menor que max de t_range
	 */
	@Test
	public void Test4() {
		t_range.setMin((float)1.15);
		t_range.setMax((float)2.50);
		assertTrue("Prueba 4: Comprobar que el getMin es menor que getMax", MethodTest.getMinimo(t_range.getMin(),t_range.getMax()));
	}

}
