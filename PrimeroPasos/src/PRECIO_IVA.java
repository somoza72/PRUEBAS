
public class PRECIO_IVA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double precio,iva,preciototal, precioventa;
		precio=23;
		iva=11.5;
		preciototal=precio+ precio*iva/100;
		precioventa= precio+ precio*20/100;
		
		System.out.println(" el precio del producto con iva es " + preciototal + " y el precio de venta sera " + precioventa);
		
				
		
	}

}
