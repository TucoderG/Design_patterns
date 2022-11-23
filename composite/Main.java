package composite;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		Componente carpetaRoot = new Carpeta("Root");
		
		Componente carpetaJuegos = new Carpeta("Juegos");
		Componente carpetaPeliculas = new Carpeta("Peliculas");
		Componente carpetaFotos = new Carpeta("Fotos");
		
		carpetaRoot.addComponente(carpetaJuegos);
		carpetaRoot.addComponente(carpetaPeliculas);
		carpetaRoot.addComponente(carpetaFotos);
		
		
		Componente Foto1 = new Archivo("Foto.png");
		Componente Foto2 = new Archivo("Foto2.png");
		Componente Foto3 = new Archivo("Foto3.png");
		
		Componente Juego1 = new Archivo("LoL.exe");
		Componente Juego2 = new Archivo("CsGo.exe");
		Componente Juego3 = new Archivo("Issac.exe");
		
		carpetaFotos.addComponente(Foto1);
		carpetaFotos.addComponente(Foto2);
		carpetaFotos.addComponente(Foto3);
		
		carpetaJuegos.addComponente(Juego1);
		carpetaJuegos.addComponente(Juego2);
		carpetaJuegos.addComponente(Juego3);
		
		
		
		List<Componente> componentes = new ArrayList<>();
		List<Componente> componente1 = new ArrayList<>();
		
		componentes = ((Carpeta)carpetaRoot).getComponentes();
		
		for(int i = 0; i < componentes.size(); i++) {
			System.out.println(componentes.get(i));
			if(componentes.get(i) instanceof Carpeta) {
				componente1 = ((Carpeta)componentes.get(i)).getComponentes();
				for(int j = 0; j < componente1.size(); j++) {
					System.out.println(componente1.get(j));
				}
				
			}
		}

		
	}

}
