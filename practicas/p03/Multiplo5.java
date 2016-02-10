import java.util.Scanner;
public class Multiplo5 {
public static void main (String []args){
	Scanner entrada = new Scanner (System.in);
	int a, b, num, suma = 0;
    String numeros = "";

	System.out.println("\n-Suma de dos multiplos de 5- \n\nDame el valor de a:");
     a = entrada.nextInt();


 if (a % 5 == 0 && a >= 5) {
 	 	System.out.println("Introduce el valor de b");
 	b = entrada.nextInt ();
 	 if (b % 5 == 0 && b >= 5){

 	if (a != b){
 		num = a;
 		a = b;

 		suma = a + num;
 	}
 
 }

 } else {
 	System.out.println("Ingresa nuevamente un numero siendo multiplo de 5:");
 	return;
 }

 System.out.println ("El resultado de la suma es: "+suma);
}
	
}