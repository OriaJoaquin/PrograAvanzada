package app;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.junit.Assert;

public class TestMonticulo {
	Monticulo m;
	Monticulo m2;
	
	
	@Before
	public void setUp() {
		try {
			m = new Monticulo(5);
			m2 = new Monticulo(2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void queInserteBien() {
		Assert.assertEquals(1, m.agregarAMonticulo(5));
		Assert.assertEquals(1, m.agregarAMonticulo(10));
		Assert.assertEquals(1, m.agregarAMonticulo(8));
		Assert.assertEquals(1, m.agregarAMonticulo(7));
		Assert.assertEquals(1, m.agregarAMonticulo(4));
		Assert.assertEquals(0, m.agregarAMonticulo(3));
	}
	
	
	@Test
	public void queSaqueBien() {
		Assert.assertEquals(1, m.agregarAMonticulo(10));
		Assert.assertEquals(1, m.agregarAMonticulo(5));
		Assert.assertEquals(10, m.sacarDeMonticulo());
		//Assert.assertEquals(5, m.sacarDeMonticulo());
		//Assert.assertEquals(0, m.sacarDeMonticulo());
	}
	
	@After
	public void mostrarResutados() {
		m.mostrar();
		System.out.println("==============");
	}
}
