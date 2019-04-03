import javax.swing.*;
public class entrada_ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre_usuario= JOptionPane.showInputDialog(" introcude tu nombre, por favor ");
		String edad=JOptionPane.showInputDialog("  Introduce tu edad");
		int edad_usuario=Integer.parseInt(edad);
		edad_usuario++;
				
				
		System.out.println(" Que pasa tio,  " +  nombre_usuario + "  el año que viene tienes " + edad + " años");
		
		
	}

}
