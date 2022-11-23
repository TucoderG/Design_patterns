package flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyFactory {
	
	private static FlyFactory fly;
	private Map<String, Fly> mapaFly = new HashMap<String, Fly>();
	
	private FlyFactory() {
		
	}
	public static FlyFactory getInstance() {
		
		if(fly == null) {
			fly = new FlyFactory();
		}
		return fly;
	}
	
	
	
	public Fly getFly(String key) {
		
		Fly fly = mapaFly.get(key);
		
		if(fly == null) {
			
			if(key.equals("dragon")) {
				fly = new FlyDragon();
				
			}else if(key.equals("caballero")) {
				fly = new FlyCaballero();
			}
				mapaFly.put(key, fly);
		}
		
		return fly;
		
	}


	public Map<String, Fly> getMapaFly() {
		return mapaFly;
	}

}
