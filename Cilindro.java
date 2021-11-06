public class Cilindro{
    public static void main(String[] args){
	int radio = 10;
	int altura = 20;
	int x = 2;
	double pi = 3.14159;
	double area = (x*pi*radio*altura)+ x*pi*radio*radio;
	double volumen = pi*radio*radio*altura;

	System.out.println("El area de un cilindro es: " + area + "cm^2");
	System.out.println("El volumen de un cilindro es: " + volumen + "cm^2");
        }
}
