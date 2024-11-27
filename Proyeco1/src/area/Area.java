package area;
	import java.util.Scanner;
public class Area {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dame el radio de un círculo: ");
		double radio = entrada.nextDouble();
		
		double area = Math.PI*Math.pow(radio,2);
		System.out.println("El círculo con radio: " + radio + " tiene un área de: " + area);
		entrada.close();
	}

}
