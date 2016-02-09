public class Ejercicio3_1 {
	 public static void main(String []args){

	int a = 10, b = 3, c = 1, d, e;
	boolean f;
	float x, y;

    y = (float) a/b;
 // está operación la subi porque se viciaba con las anteriores.
	x = a/b;
	f = c == a && a < b && a < c;
/* Agregue f como variable boleana ya c es entera y al tener operadores
* de relacion y lógicos el resultado es boleano; así como también le 
* di la redacción adecuada para que la máquina entendiece que hacer.*/
	d = a + b++;
	e = ++a - b;

	System.out.println(x);
	System.out.println(f);
	System.out.println(d);
	System.out.println(e);
	System.out.println(y);
	}
}