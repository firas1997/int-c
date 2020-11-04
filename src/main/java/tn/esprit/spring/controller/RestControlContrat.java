package tn.esprit.spring.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.Contrat;
import tn.esprit.spring.services.IContratService;



@RestController
public class RestControlContrat {

	 @Autowired
	 IContratService contratService;
	 
	 private static final Logger l = LogManager.getLogger(RestControlContrat.class);


	 // http://localhost:8081/SpringMVC/servlet/retrieve-all-Contrats
	 @GetMapping("/retrieve-all-Contrats")
	 @ResponseBody
	 public List<Contrat> getContrats() {
	 l.info("In  retrieveAllContrats : "); 		
	 List<Contrat> list = contratService.retrieveAllContrats();
	 l.info("Out of retrieveAllContrats."); 
	 return list;
	 }
	//http://localhost:8081/SpringMVC/servlet/retrieve-contrat/3
	 @GetMapping("/retrieve-contrat/{contrat-id}")
	 @ResponseBody
	 public Contrat retrieveContrat(@PathVariable("contrat-id") String contratId) {
		 l.info("In  retrieveAllContrats : "); 
		 l.info("Out of retrieveAllContrats.");
	 return contratService.retrieveContrat(contratId);
	   
	 
	 }

	 // Ajouter User : http://localhost:8081/SpringMVC/servlet/add-contrat
	 @PostMapping("/add-contrat")
	 @ResponseBody
	 public Contrat addContrat(@RequestBody Contrat c) {
		 l.info("In  addContrat : " + c);
		 l.debug("ajout de contrat");
		 Contrat contrat = contratService.addContrat(c);
		 l.info("Out of  addContrat. ");
	 return contrat;
	 }
	//http://localhost:8081/SpringMVC/servlet/remove-Contrat/{Contrat-id}
	 @DeleteMapping("/remove-Contrat/{Contrat-id}")
	 @ResponseBody
	 public void removeContrat(@PathVariable("contrat-id") String contratId) {
		 contratService.deleteContrat(contratId);
	 }

	 // http://localhost:8081/SpringMVC/servlet/modify-contrat
	 @PutMapping("/modify-contrat")
	 @ResponseBody
	 public Contrat modifyContrat(@RequestBody Contrat contrat) {
		 l.info("In  modifyContrat : " );
		 l.info("Out of  modifyContrat. ");
	 return contratService.updateContrat(contrat);
	 
	 }

}
