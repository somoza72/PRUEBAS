
public class manipula_cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre="Ernesto somoza yuste";
				System.out.println( " mi nombre es " + nombre);
		System.out.println( " Mi nombre tiene "+ nombre.length()+ " letras");
		System.out.println( "la primera letra de  "+ nombre + " es la " + nombre.charAt(0));
		int ultima_letra= nombre.length();
		System.out.println(" La ultima letra de " + nombre + " es " + nombre.charAt(ultima_letra-1));
	}

}
