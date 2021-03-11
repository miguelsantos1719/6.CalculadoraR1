package es;

/**
 * A classe Calculadora contém métodos para realizar as operações aritméticas básicas com números reais.
 * 
 * <ul>
 * <li>somar</li>
 * <li>subtrair</li>
 * <li>multiplicar</li>
 * <li>dividir</li>
 * </ul>
 * 
 * @author miguelsantos
 *
 */
public class Calculadora {
	
	/**
	 * Calcula e retorna a soma de dois números reais.
	 * 
	 * @param operando1 valor do primeiro operando 
	 * @param operando2 valor do segundo operando 
	 * @return retorna o resultado da soma dos dois operandos.
	 */
	public static double somar( double operando1, double operando2) {
		return operando1 + operando2;
	}
	
	
	/**
	 * Calcula e retorna a subtração de dois números reais.
	 * 
	 * @param operando1 valor do primeiro operando
	 * @param operando2 valor do segundo operando
	 * @return retorna o resultado da subtração dos dois operandos.
	 */
	public static double subtrair( double operando1, double operando2) {
		return operando1 - operando2;
	}
	
	
	/**
	 * Calcula e retorna a multplicação de dois números reais.
	 * 
	 * @param operando1 valor do primeiro operando 
	 * @param operando2 valor do segundo operando 
	 * @return retorna o resultado da multiplicação dos dois operandos.
	 */
	public static double multiplicar( double operando1, double operando2) {
		return operando1 * operando2;
	}
	
	
	/**
	 * Calcula e retorna a divisão de dois números reais.
	 * 
	 * @param operando1 valor do primeiro operando 
	 * @param operando2 valor do segundo operando 
	 * @return retorna o resultado da divisão dos dois operandos.
	 */
	public static double dividir( double operando1, double operando2) {
		return operando1 / operando2;
	}
}