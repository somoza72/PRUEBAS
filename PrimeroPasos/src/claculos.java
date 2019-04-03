
public class claculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double raiz=Math.sqrt(14);
		System.out.println(raiz);
		double num1=7.85;
		double num2=8.55;
		double num;
		num=raiz+num1+num2;
		int resutado=(int)Math.round(num);
		System.out.println(resutado);
		int potencia= (int)Math.pow(num1,num2);
		System.out.println("la potencia de "+ num1+ " elevadoa  " + num2 + " es "+ potencia);
		double producto= num1*num2*resutado;
		int resultado= (int) Math.round(producto);
		System.out.println(resultado);
		double division=num1/num2-num;
		int resdivision= (int) Math.round(division);
		System.out.println(" esta operacion es " + resdivision);
		
		
		
		
		
		
		
		
		
		
		
	}

}
