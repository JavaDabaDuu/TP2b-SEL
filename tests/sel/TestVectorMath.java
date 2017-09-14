package sel;

import org.junit.Assert;
import org.junit.Test;

public class TestVectorMath {

	@Test
	public void seInstanciaConDimension() {
		@SuppressWarnings("unused")
		VectorMath vector = new VectorMath(6);
	}

	@Test
	public void levantaArchivo() {
		@SuppressWarnings("unused")
		VectorMath vector = new VectorMath("test/VectorMath/vectorA.in");
	}

	@Test
	public void suma() {
		VectorMath vectorA = new VectorMath("test/VectorMath/vectorA.in");
		VectorMath vectorB = new VectorMath("test/VectorMath/vectorB.in");

		VectorMath suma = vectorA.sumar(vectorB);
		VectorMath sumaAB = new VectorMath("test/VectorMath/sumaAB.in");
		Assert.assertTrue(suma.equals(sumaAB));
	}

	@Test
	public void resta() {
		VectorMath vectorA = new VectorMath("test/VectorMath/vectorA.in");
		VectorMath vectorB = new VectorMath("test/VectorMath/vectorB.in");

		VectorMath resta = vectorA.restar(vectorB);
		VectorMath restaAB = new VectorMath("test/VectorMath/restaAB.in");
		Assert.assertTrue(resta.equals(restaAB));
	}

	@Test
	public void multiplicacionVectores() {
		VectorMath vectorA = new VectorMath("test/VectorMath/vectorA.in");
		VectorMath vectorB = new VectorMath("test/VectorMath/vectorB.in");

		Double producto = vectorA.multiplicar(vectorB);
		Double productoAB = 11464.8459;
		Assert.assertEquals(producto, productoAB);
	}

	@Test
	public void multiplicacionPorUnEscalar() {
		VectorMath vectorA = new VectorMath("test/VectorMath/vectorA.in");

		VectorMath producto = vectorA.multiplicar(2);
		VectorMath vectorAx2 = new VectorMath("test/VectorMath/vectorAx2.in");
		Assert.assertTrue(producto.equals(vectorAx2));
	}
	
	@Test
	public void multiplicionVectorMatriz() {
		VectorMath vectorA = new VectorMath("test/VectorMath/vectorA.in");
		MatrizMath identidad = MatrizMath.identidad(6);
		
		VectorMath producto = vectorA.multiplicar(identidad);
		Assert.assertTrue(vectorA.equals(producto));
	}

	@Test
	public void norma1() {
		VectorMath vectorA = new VectorMath("test/VectorMath/vectorA.in");

		Double norma = vectorA.norma1();
		Double normaA = 2325.23;
		Assert.assertEquals(norma, normaA);
	}

	@Test
	public void norma2() {
		VectorMath vectorA = new VectorMath("test/VectorMath/vectorA.in");

		Double norma = vectorA.norma2();
		Double normaA = 2300.0372851108305;
		Assert.assertEquals(norma, normaA);
	}

	@Test
	public void normaInfinita() {
		VectorMath vectorA = new VectorMath("test/VectorMath/vectorA.in");

		Double norma = vectorA.normaInfinita();
		Double normaA = 2300.0;
		Assert.assertEquals(norma, normaA);
	}

	@Test
	public void cloneAndEquals() {
		VectorMath vectorA = new VectorMath("test/VectorMath/vectorA.in");
		VectorMath clon = vectorA.clone();

		Assert.assertTrue(vectorA.equals(clon));
	}
}
