package abstractFactory;

public class Main {

	public static void main(String[] args) {
		
		
		LaboratorioAbstractFactory lafjava = new LaboratorioJava();
		
		Laboratorio labo1 = new Laboratorio(lafjava);
		
		System.out.println(labo1);
		
		LaboratorioAbstractFactory lafc = new LaboratorioC();
		
		Laboratorio labo2 = new Laboratorio(lafc);
		
		System.out.println(labo2);
		
	}

}
