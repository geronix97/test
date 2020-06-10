import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OperacionsDebug {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub

		int numero1, numero2, resultOperacio;
		char operacio;

		BufferedReader teclat = new BufferedReader(new InputStreamReader(
				System.in));

		numero1 = getNumero1(teclat);
		numero2 = getNumero2(teclat);

		System.out.println("Quina operaci� vols realitzar(0-Resta/1-Suma/2-Divisi�/3-Multiplicaci�):");
		operacio = (char) (teclat.read());

		resultOperacio = doOperacio(operacio, numero1, numero2);
		
		if (operacio == '0') {
			System.out.printf("La suma de %d m�s %d �s %d \n", numero1, numero2, resultOperacio);
		} else if (operacio == '1') {
			System.out.printf("La resta de %d menys %d �s %d \n", numero1, numero2,	resultOperacio);
		} 
		else if (operacio =='2'){
			System.out.printf("La multiplicaci� de %d per %d �s %d \n", numero1, numero2, resultOperacio);
		}
		else if (operacio =='3'){
					System.out.printf("La divisi� de %d entre %d �s %d \n", numero1, numero2, resultOperacio);
		}
		else { System.out.printf("L'operaci� no �s v�lida");}	
	}

	private static int getNumero1(BufferedReader teclat) throws Exception, IOException {
		// TODO Auto-generated method stub
		System.out.println("Introdueix el primer n�mero:");
		return Integer.parseInt(teclat.readLine());
	}

	private static int getNumero2(BufferedReader teclat) throws Exception, IOException {
		// TODO Auto-generated method stub
		System.out.println("Introdueix el segon n�mero:");
		return Integer.parseInt(teclat.readLine());
	}

	private static int doOperacio(char operacio, int numero1, int numero2) {

		if (operacio == '0') {
			return numero1 + numero2;
		} else if (operacio == '1') {
			return numero1 - numero2;
		} 
		else if (operacio =='2'){
			return numero1 * numero2;
		}
		else if (operacio =='3'){
			return numero1 / numero2;
		}
		else{
			return -2;
		}
		
	}
}
