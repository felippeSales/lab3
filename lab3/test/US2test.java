import static org.junit.Assert.*;

import models.CatalogoDisciplinas;
import models.Disciplina;
import models.SPD;

import org.junit.Before;
import org.junit.Test;


public class US2test {

	SPD sistema;
	CatalogoDisciplinas catalogo;

	@Before
	public void setUp(){
		sistema = new SPD();
		catalogo = new CatalogoDisciplinas();
		
		
	}

	@Test
	public void deveAcharDisciplinas() {
		
		assertEquals(catalogo.disciplinaIndice("Programação I"), 0); 
		
		assertEquals(catalogo.disciplinaIndice("Cálculo I"), 4);
	}

	
	@Test
	public void deveAdicionarDisciplinas() {

		try{
			sistema.addDisciplinasPeriodo(1, new Disciplina("test",4));
		}catch(Exception e){			
			System.out.println(e.getMessage());
		}

		assertEquals(sistema.getPeriodos().get(1).getTotalCreditos(), 4);


		try{
			sistema.addDisciplinasPeriodo(4, new Disciplina("test",4));
		}catch(Exception e){			
			System.out.println(e.getMessage());
		}

		assertEquals(sistema.getPeriodos().get(4).getTotalCreditos(), 4);
		
		try{
			sistema.addDisciplinaPeriodo(4, "Programação I");
		}catch(Exception e){			
			System.out.println(e.getMessage());
		}
		
		assertEquals(sistema.getPeriodos().get(4).getTotalCreditos(), 8);
		
		try{
			sistema.addDisciplinaPeriodo(4, "Teoria dos Grafos");
		}catch(Exception e){			
			System.out.println(e.getMessage());
		}
		
		assertEquals(sistema.getPeriodos().get(4).getTotalCreditos(), 10);
		
	}

	@Test
	public void naoDeveAdiconarDisciplina(){
		try{
			for(int i = 0; i < 9; i++){
				sistema.addDisciplinasPeriodo(1, new Disciplina("test",4));
			}			
		}catch(Exception e){
			assertEquals(e.getMessage(), "Limite de Creditos no periodo excedido.");
		}
	}
}
