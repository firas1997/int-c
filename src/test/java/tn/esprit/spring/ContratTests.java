package tn.esprit.spring;


import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Contrat;
import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.services.IContratService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ContratTests {
	@Autowired
	IContratService cs;
	
	/*@Test
	public void contextLoads() {
	//	Employe e = new Employe("jamie", "Kent", "jamie.ken@gmail.com","kent",true, Role.INGENIEUR);
		Contrat c1 = new Contrat(5, new Date() , "ffffdf",1500 );
		cs.addContrat(c1); 
		
	}*/
	
	@Test
	public void contextLoadsdelete(){
		cs.deleteContrat("1");
	}
	 
	/*@Test
	public void contextLoadsaffichage(){
		//cs.retrieveAllContrats();
		cs.retrieveContrat("1");
	}*/
	
	
}
