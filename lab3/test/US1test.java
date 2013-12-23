import static org.junit.Assert.*;

import models.Disciplina;
import models.SPD;

import org.junit.Test;
import org.junit.Before;

public class US1test {

	SPD sistema;
	
	@Before
	public void setUp(){
		sistema = new SPD();
	}
			
	@Test
	public void deveTerOprimeiroPeriodo() {
		assert(this.sistema.getPeriodos().size() >= 1);
		assertTrue(sistema.getPeriodos().get(0).getDisciplinas().contains(new Disciplina("Programação I", 4)));
		assertTrue(sistema.getPeriodos().get(0).getDisciplinas().contains(new Disciplina("Álgebra Vetorial e Geometria Analítica", 4)));
		assertTrue(sistema.getPeriodos().get(0).getDisciplinas().contains(new Disciplina("Cálculo I", 4)));
		assertTrue(sistema.getPeriodos().get(0).getDisciplinas().contains(new Disciplina("Leitura e Produção de Textos", 4)));
		assertTrue(sistema.getPeriodos().get(0).getDisciplinas().contains(new Disciplina("Introdução a Computação", 4)));
		assertTrue(sistema.getPeriodos().get(0).getDisciplinas().contains(new Disciplina("Lab. de Programação I", 4)));
	}	
	
	@Test
	public void deveCalcularOtotalDeCréditosDoPeriodo(){
		assertEquals(24, sistema.getPeriodos().get(0).getTotalCreditos());
	}
	
}
