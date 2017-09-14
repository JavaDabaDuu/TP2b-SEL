package sel;

import org.junit.Test;

public class TestSEL {

	// Todos los métodos de la clase SEL son testeados con el caso del SCI
	@Test
	public void levantaArchivo() {
		@SuppressWarnings("unused")
		SEL sel = new SEL("test/SEL/01_SistemaCompatibleDeterminado/entrada/sel.in");
	}

	@Test
	public void resuelveSistema() {
		SEL sel = new SEL("test/SEL/01_SistemaCompatibleDeterminado/entrada/sel.in");
		sel.resolver();
	}

	@Test
	public void calculaErrorSolucion() {
		SEL sel = new SEL("test/SEL/01_SistemaCompatibleDeterminado/entrada/sel.in");
		sel.resolver();
		sel.calcularErrorSolucion();
	}
	
	@Test
	public void mostrarSolucion() {
		SEL sel = new SEL("test/SEL/01_SistemaCompatibleDeterminado/entrada/sel.in");
		sel.resolver();
		sel.mostrarSolucion();
	}

	@Test
	public void escribeSolucionEnArchivo() {
		SEL sel = new SEL("test/SEL/01_SistemaCompatibleDeterminado/entrada/sel.in");
		sel.resolver();
		sel.escribirSolucionEnArchivo("test/SEL/01_SistemaCompatibleDeterminado/salida/solucion.out");
	}
	
	// Con estos dos métodos se testean los casos de los sistemas SCI y SI
	@Test(expected = MatrizMathException.class)
	public void sistemaCompatibleIndeterminado() {
		SEL sel = new SEL("test/SEL/02_SistemaCompatibleIndeterminado/entrada/sel.in");
		sel.resolver();
		sel.escribirSolucionEnArchivo("test/SEL/02_SistemaCompatibleIndeterminado/salida/solucion.out");
	}
	
	@Test(expected = MatrizMathException.class)
	public void sistemaIncompatible() {
		SEL sel = new SEL("test/SEL/03_SistemaIncompatible/entrada/sel.in");
		sel.resolver();
		sel.escribirSolucionEnArchivo("test/SEL/03_SistemaIncompatible/salida/solucion.out");
	}
}
