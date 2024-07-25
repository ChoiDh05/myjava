package markerTest;

import java.util.Iterator;

public class Lab {
public void checkKinds(Animal[] arAnimal) {
	for (int i = 0; i < arAnimal.length; i++) {
		if(arAnimal[i] instanceof CarnivoreMarker) {
			System.out.println("육식동물");
		}else if(arAnimal[i] instanceof HerbivoreMarker) {
			System.out.println("초식동물");
		}
	}
}
}
