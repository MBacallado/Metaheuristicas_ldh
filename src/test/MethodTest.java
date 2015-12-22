package test;

/**
 * Clase definida para crear el metodo estatico getMinimo
 * @author ManuelAlejandro
 *
 */
public class MethodTest {
	
	/**
	 * Metodo que recoge dos numeros floats y devuelve true si num1 es menor que num2
	 * @param num1: Valor mínimo esperado.
	 * @param num2  Valor máximo esperado.
	 * @return true si num1 < num2
	 */
	public static boolean getMinimo(float num1,float num2){
		if(num1 < num2){
			return true;
		}else{
			return false;
		}
	}
}
