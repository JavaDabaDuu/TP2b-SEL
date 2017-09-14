package sel;

import org.junit.Assert;
import org.junit.Test;

import sel.MatrizMath;

public class TestMatrizMath {

	@Test
	public void seInstanciaConDimensiones() {
		@SuppressWarnings("unused")
		MatrizMath matriz = new MatrizMath(4, 3);
	}

	@Test
	public void seInstanciaConMatriz() {
		double[][] mat = { { 3, 1, 2 }, { 3, 9, 5 }, { 1, 7, 6 } };
		@SuppressWarnings("unused")
		MatrizMath matriz = new MatrizMath(3, 3, mat);
	}

	@Test
	public void levantaArchivo() {
		@SuppressWarnings("unused")
		MatrizMath matriz = new MatrizMath("test/MatrizMath/matrizA.in");
	}

	@Test
	public void suma() {
		MatrizMath matrizA = new MatrizMath("test/MatrizMath/matrizA.in");
		MatrizMath matrizB = new MatrizMath("test/MatrizMath/matrizB.in");

		MatrizMath suma = matrizA.sumar(matrizB);
		MatrizMath sumaAB = new MatrizMath("test/MatrizMath/sumaAB.in");
		Assert.assertTrue(suma.equals(sumaAB));
	}

	@Test
	public void resta() {
		MatrizMath matrizA = new MatrizMath("test/MatrizMath/matrizA.in");
		MatrizMath matrizB = new MatrizMath("test/MatrizMath/matrizB.in");

		MatrizMath resta = matrizA.restar(matrizB);
		MatrizMath restaAB = new MatrizMath("test/MatrizMath/restaAB.in");
		Assert.assertTrue(resta.equals(restaAB));
	}

	@Test
	public void multiplicionMatrices() {
		MatrizMath matrizA = new MatrizMath("test/MatrizMath/matrizA.in");
		MatrizMath matrizB = new MatrizMath("test/MatrizMath/matrizB.in");

		MatrizMath producto = matrizA.multiplicar(matrizB);
		MatrizMath productoAB = new MatrizMath("test/MatrizMath/matrizAxB.in");
		Assert.assertTrue(producto.equals(productoAB));
	}

	@Test
	public void multiplicionPorUnEscalar() {
		MatrizMath matrizA = new MatrizMath("test/MatrizMath/matrizA.in");

		MatrizMath producto = matrizA.multiplicar(2);
		MatrizMath matrizAx2 = new MatrizMath("test/MatrizMath/matrizAx2.in");
		Assert.assertTrue(producto.equals(matrizAx2));
	}

	@Test
	public void multiplicionMatrizVector() {
		MatrizMath identidad = MatrizMath.identidad(6);
		VectorMath vectorA = new VectorMath("test/VectorMath/vectorA.in");

		VectorMath producto = identidad.multiplicar(vectorA);
		Assert.assertTrue(vectorA.equals(producto));
	}

	@Test
	public void norma1() {
		MatrizMath matrizA = new MatrizMath("test/MatrizMath/matrizA.in");

		Double norma = matrizA.norma1();
		Double normaA = 20.0;
		Assert.assertEquals(norma, normaA);
	}

	@Test
	public void norma2() {
		MatrizMath matrizA = new MatrizMath("test/MatrizMath/matrizA.in");

		Double norma = matrizA.norma2();
		Double normaA = 126.0;
		Assert.assertEquals(norma, normaA);
	}

	@Test
	public void normaInfinita() {
		MatrizMath matrizA = new MatrizMath("test/MatrizMath/matrizA.in");

		Double norma = matrizA.normaInfinita();
		Double normaA = 9.0;
		Assert.assertEquals(norma, normaA);
	}

	@Test
	public void cloneEquals() {
		MatrizMath matrizA = new MatrizMath("test/MatrizMath/matrizA.in");
		MatrizMath clon = matrizA.clone();

		Assert.assertTrue(matrizA.equals(clon));
	}

	@Test
	public void identidad() {
		MatrizMath identidad = MatrizMath.identidad(3);
		MatrizMath identidadOrden3 = new MatrizMath("test/MatrizMath/identidadOrden3.in");

		Assert.assertTrue(identidad.equals(identidadOrden3));
	}

	@Test
	public void determinante() {
		MatrizMath matrizA = new MatrizMath("test/MatrizMath/matrizA.in");

		Double determinante = matrizA.determinante();
		Double determinanteA = -2.0;

		Assert.assertTrue(determinante.equals(determinanteA));
	}

	@Test
	public void inversa() {
		MatrizMath matrizA = new MatrizMath("test/MatrizMath/matrizA.in");

		MatrizMath inversa = matrizA.inversa();
		MatrizMath inversaA = new MatrizMath("test/MatrizMath/matrizAinversa.in");
		Assert.assertTrue(inversa.equals(inversaA));
	}

	@Test
	public void calcularErrorAlInvertir() {
		MatrizMath matrizA = new MatrizMath("test/MatrizMath/matrizA.in");
		matrizA.errorAlInvertir();
	}

	@Test
	public void potencia() {
		double[][] mat = { { 3, 1, 2 }, { 3, 9, 5 }, { 1, 7, 6 } };
		MatrizMath matriz = new MatrizMath(3, 3, mat);
		MatrizMath potencia = matriz.potencia(5);
		double[][] pot = { { 27651.0, 83765.0, 58026.0 }, { 111583.0, 337665.0, 233801.0 },
				{ 98869.0, 299379.0, 207202.0 } };
		MatrizMath potenciaCorrecta = new MatrizMath(3, 3, pot);
		Assert.assertTrue(potenciaCorrecta.equals(potencia));
	}
}
