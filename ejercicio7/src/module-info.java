package ejercicios;

import java.util.Scanner;


public class ejercicio7 {
	
//Método estático que toma tres parámetros
public static int calcularMinutos(String dia, int hora, int minutos) {

//Esta variable se utilizará para almacenar la cantidad de minutos restantes hasta el fin de semana.
int minutosRestantes = 0;
		
//Calcular el total de minutos 
//Suma el valor de hora * 60 (para convertir las horas en minutos) + el valor de minutos.
int minutosTotal = (hora*60) + minutos;
		
// Calcular los minutos totales del viernes a las 15:00
int minutosViernes = (15 * 60);
		
//El toLowerCase, por si el usuario ingresa un día en mayúscula, lo convierte a minuscula
switch (dia.toLowerCase()) {
case "lunes":		//4 días para el viernes * 24 horas al día * 60 minutos
minutosRestantes = ((4*24*60) + minutosViernes) - minutosTotal;
break; 
case "martes":			//3 dias para el viernes * 24 horas al dia * 60 mins
minutosRestantes = ((3*24*60) + minutosViernes) - minutosTotal;
break; 
case "miercoles":		//2 dias para el viernes * 24 horas al dia * 60 mins
minutosRestantes = ((2*24*60) + minutosViernes) - minutosTotal;
break; 
case "jueves":			//1 dias para el viernes * 24 horas al dia * 60 mins
minutosRestantes = ((1*24*60) + minutosViernes) - minutosTotal;
break; 
case "viernes":
minutosRestantes = minutosViernes - minutosTotal;
break; 
default: //Por si escriben mal el día 
System.out.println("Dia inválido. Por favor, ingrese un dia correcto");
break;
			
} //Fin del switch
		
return minutosRestantes;
		
} //Fin de calcularMinutos


public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
//Pedir al usuario ingresar un dia de la semana
System.out.println("Ingrese un dia de la semana (Lunes - Viernes): ");
String dia = input.nextLine(); 
		
		
System.out.println("Ingrese una hora(Formato 24 hrs): ");
int hora = input.nextInt();
		
//Verificar por si el usuario ingresa mal la hora
if(hora<=0 || hora>=25) {
System.out.println("Hora Invalida");
}else{ //Si lo ingresa bien, pide los minutos
	
	
System.out.println("Ingrese los minutos: ");
int minutos = input.nextInt();

//Si ingresan los minutos menores que 0
if(minutos <0) { //imprime que fue invalido su ingreso
System.out.println("Minutos invalidos");
}else {
				
//Si la hora y los minutos son correctos:
//Inicializar una variable a la funcion 
int minutosTotal = calcularMinutos(dia, hora, minutos);
				
//Y imprime los mintos que faltan para el fin de semana
System.out.println("Faltan " + minutosTotal + " minutos para el fin de semana ");
} //Fin del else
} //fin del else
			
	
//Cerrar el Scanner
input.close();

} //Fin del main

}