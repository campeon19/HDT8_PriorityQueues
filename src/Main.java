/*
 * 
 * @author: Christian Daniel Perez De Leon
 * Carne: 19710
 * 
 * Ultima fecha de modificacion: 5/04/2020
 * 
 */

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		lectorTXT lector = new lectorTXT();
		ArrayList<String> personas;
		int opcion = 0;
		
		System.out.println("1. Usar VectorHeap");
		System.out.println("2. Usar Java Collection FrameWork");
		int x = scan.nextInt();
		QueueFactory<Paciente> factory = new QueueFactory<Paciente>();
		PriorityQueueInterface<Paciente> pacientes = factory.Queue(x);
		
		personas = lector.leerOracion();
		
		System.out.println("\nLista de pacientes de hoy segun fueron llegando: ");
		for(int i = 0; i < personas.size(); i++) {
			String y = personas.get(i);
			System.out.println(y);
			String[] per = y.split(", ");
			pacientes.add(new Paciente(per[0], per[1], per[2]));
		}
		
		

		while(opcion != 2) {
			
		
			System.out.println("---------- Hospital ----------");
			System.out.println("\nLos pacientes seran atendidos en orden de prioridad conforme usted indique");
			System.out.println("Que desea hacer: ");
			System.out.println("\n1. Atender siguiente paciente");
			System.out.println("2. Salir");
			opcion = scan.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("\nPaciente que esta siendo atendido");
				System.out.println(pacientes.remove());
				System.out.println("\n\n");
				break;
			case 2:
				System.out.println("Feliz dia");
				break;

			default:
				System.out.println("Opcion no valida");
				break;
			}
		
		}

	}

}
