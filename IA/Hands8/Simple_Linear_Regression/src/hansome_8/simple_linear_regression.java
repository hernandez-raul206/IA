package hansome_8;

public class simple_linear_regression {

	public simple_linear_regression(int x[], int y[]) {
		data_set date = new data_set();
		
		double mediax=0;
		double mediay=0;
		for(int i=0;i<=date.x.length-1;i++) {
			mediax+=date.x[i];
			mediay+=date.y[i];
		}//end for
		mediax=mediax/date.x.length;
		mediay=mediay/date.y.length;
		int mediax2= (int) Math.floor(mediax);
		int mediay2= (int) Math.floor(mediay);
		
		System.out.print("media de x: "+mediax2);
		System.out.print("\n");
		System.out.print("media de y: "+mediay2);
		System.out.print("\n");
		double productos=0, cuadrados=0;
		for(int i=0;i<=date.x.length-1;i++){
			productos+= (date.x[i]-mediax) * (date.y[i]-mediay);
			cuadrados+= Math.pow((date.x[i]-mediax),2);
		}//end for
		System.out.print("Productos: "+productos);
		System.out.print("\n");
		System.out.print("cuadrados: "+cuadrados);
		System.out.print("\n");
		
		
		double B1 = productos/cuadrados;
		double B0 = mediay - (B1*mediax);
		
		double powx = 0, powy = 0, R2=0;
		for(int i=0;i<=date.x.length-1;i++) {
			powx += Math.pow((date.x[i]-mediax),2);
			powy += Math.pow((date.y[i]-mediay),2);
		}//end for
		R2 = productos/(Math.sqrt(powx) * (Math.sqrt(powy))); 
		R2=Math.pow(R2,2);
		System.out.print("B0: "+B0+"\n");
		System.out.print("B1: "+B1+"\n");
		System.out.print("R2: "+R2+"\n");
		System.out.print("Formlua para prediccion B0+B1*Xi = "+B0+" + "+B1+" (Xi)\n");
		double prediction=0;
		prediction = B0+(B1*50);
		System.out.print("La prediccion es : "+prediction);
		
		
	}//end simple_linear_regression
}//end class simple_linear_regression
