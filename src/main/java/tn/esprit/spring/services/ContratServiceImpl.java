package tn.esprit.spring.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Contrat;
import tn.esprit.spring.repository.ContratRepository;


@Service
public class ContratServiceImpl implements IContratService {


	@Autowired
	ContratRepository contratRepository;

	
	private static final Logger L = LogManager.getLogger(ContratServiceImpl.class);

	@Override
	public List<Contrat> retrieveAllContrats() {
		List<Contrat> contrats = (List<Contrat>) contratRepository.findAll();
		
		for (Contrat contrat : contrats){
			L.info("contrat +++ :" + contrat);
		}
		return contrats;
	}

	@Override
	public Contrat addContrat(Contrat c) {
		Contrat contrat =contratRepository.save(c);
		return contrat;
		
	}

	@Override
	public void deleteContrat(String id) {
		contratRepository.deleteById((int) Long.parseLong(id));
		
	}

	@Override
	public Contrat updateContrat(Contrat c) {
		Contrat contrat =contratRepository.save(c);
		return contrat;
	}

	@Override
	public Contrat retrieveContrat(String id) {
	return	contratRepository.findById((int) Long.parseLong(id)).orElse(null);
		
	}



}
