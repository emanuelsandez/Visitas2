package cl.eash;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Visitas2 {
	public static void main(String[] args) {

		List<Integer> visitasDiarias = Arrays.stream(args).mapToInt(Integer::parseInt).boxed()
				.collect(Collectors.toList());
		// Captura de datos desde la consola

		int promedio = promedio(visitasDiarias);
		System.out.println(promedio);
	}

	public static int promedio(List<Integer> visitasDiarias) {

		int totalVisitas = visitasDiarias.stream().reduce(0, (a, b) -> a + b);
		// Suma de cantidad de visitas

		return totalVisitas / visitasDiarias.size();
	}
}