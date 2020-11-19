package DataAbstrata;

import java.util.Scanner;


public class Principal1 {
	public static void main(String [] args) {
	
	Scanner sc = new Scanner(System.in);
	Horario h = new Horario();
	
	System.out.println("Informe a quantidade de segs que será trasnformada: ");
	int valor = sc.nextInt();
	h.setSegundo(valor);
	
	System.out.println("\nSão " + h.getHora()+" horas, "  + h.getMinuto()+ " minutos e " + h.getSegundo()+ " segundos.");
		
	}

}