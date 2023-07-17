package ejercicios;

/*
 * 
 * - Crear un programa en `Java` que realice lo siguiente:

- Input
  - Solicitar por consola una palabra o frase

- Output
  - Mostrar por consola el texto ingresado de forma invertida.

--- 

Input:
```
Hola Generation
```
Output:
``` 
noitareneG aloH
 * 
 * */
import java.util.Scanner;

public class ejercicio6 {
	
	
	public static void main(String[] args) {
		
		System.out.println("Ingrese una palabra o frase");
		//Pedirle al usuario que ingrese una palabra o frase
		Scanner palabra = new Scanner(System.in);
		//Lee la línea de entrada del usuario y la asigna a la variable input de tipo String.
		String input = palabra.nextLine();
		//inicialo una cadena vacía que se utilizará para almacenar la versión invertida de la palabra o frase ingresada por el usuario.
		String inverso = "";
		
		//bucle for que recorre la cadena input de atrás hacia adelante, comenzando desde el último carácter hasta el primero.
		for (int i=input.length()-1; i >=0; i--) {
			// Obtener el carácter en el índice i de la cadena de input y añade el carácter actual a la cadena invertida
			inverso += input.charAt(i);
		} //Fin del for
		
		//Imprime la cadena inverso ingresada por el usuario.
		System.out.println(inverso);
		
		palabra.close(); //Cerrar el Scanner
	} //fin de main

}