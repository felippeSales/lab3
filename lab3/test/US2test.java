import static org.junit.Assert.*;

import models.Disciplina;
import models.SPD;

import org.junit.Before;
import org.junit.Test;


public class US2test {

	SPD sistema;

	@Before
	public void setUp(){
		sistema = new SPD();
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
	}

	@Test
	public void naoDeveAdiconarDisciplina(){
		try{
			for(int i = 0; i < 9; i++){
				sistema.addDisciplinasPeriodo(1, new Disciplina("test",4));
			}			
		}catch(Exception e){
			assertEquals(e.getMessage(), "Total de créditos excedito");
		}
	}
}
