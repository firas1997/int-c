package tn.esprit.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.services.IEmployeService;
@RunWith(SpringRunner.class)
@SpringBootTest
public class TimesheetApplicationTests {
	@Autowired
	IEmployeService es ;
	
	@Test
	public void contextLoads() {
		Employe em = new Employe(9,"rejeb1","firas1","firas.rejeb@gmail.tn","fifi" ,false ,Role.TECHNICIEN); 
		es.ajouterEmploye(em);
	}

}
