import java.util.*;
public class Entrada_ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada= new Scanner (System.in);
		System.out.println(" introduce tu nombre , ");
		String nombre_usuario= entrada.nextLine();
		System.out.println("introcude tu edad, y no me emientas");
		int edad= entrada.nextInt();
		System.out.println(" Hola " + nombre_usuario + " dentro de 5 años tendras "+ ( edad +5) + " mas años que yo");
	}

}
