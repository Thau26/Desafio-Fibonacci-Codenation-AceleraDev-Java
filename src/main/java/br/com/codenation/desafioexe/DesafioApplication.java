package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {


	public static List<Integer> fibonacci() {
        List<Integer> serieFibonacci = new ArrayList<>();
		serieFibonacci.add(0);
		serieFibonacci.add(1);
		for(int i=0; serieFibonacci.get(serieFibonacci.size() - 1)<350; i++){
			serieFibonacci.add(serieFibonacci.get(i)+serieFibonacci.get(i+1));
		}
		return serieFibonacci;
	}

	public static Boolean isFibonacci(Integer a) {
		return fibonacci().contains(a);
	}

}