/*
 *Programa para calcular el area y volumen de un cilindro
 *@autor Gil Axel Gutierrez Lara
 *@version 1.0
 **/

public class Cilindro{
    public static void main(String[] args){
	/*
	 *Valores necesarios para calcular el area y volumen de un cilindro
	 *@param radio El parametro que representa el radio del cilindro
	 *@param altura El parametro que representa la altura del cilindro
	 *@param pi El parametro que representa el valor del numero Pi
	 **/
	int radio = 10;
     	int altura = 20;
       	double pi = 3.14159;

       	/*Metodos que devuelve el valor del area
	 *@return area del cilindro
	 **/
	//Formula que devuelve el valor del area del cilindro
	double area = (2*pi*radio*altura)+ 2*pi*radio*radio;
	/*Metodos que devuelve el valor del volumen
	 *@return volumen del cilindro
	 **/
	//Formula que devuelve el valor del volumen del cilindro
	double volumen = pi*radio*radio*altura;

	/*
	 *@return Cadena de texto con el valor del Area
	 *@param area
	 **/
	System.out.println("El area de un cilindro es: " + area + "cm^2");
	/*
	 *@return Cadena de texto con el valor del volumen
	 *@param volumen
	 **/
	System.out.println("El volumen de un cilindro es: " + volumen + "cm^2");
        }
}
