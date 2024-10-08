package com.roua.vetements.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roua.vetements.entities.Genre;
import com.roua.vetements.entities.Vetement;
import com.roua.vetements.repos.VetementRepository;

@Service
public class VetementServiceImpl implements VetementService {
    @Autowired
    VetementRepository vetementRepository;

    @Override
    public Vetement saveVetement(Vetement v) {
        return vetementRepository.save(v);
    }

    @Override
    public Vetement updateVetement(Vetement v) {
        return vetementRepository.save(v);
    }

    @Override
    public void deleteVetement(Vetement v) {
        vetementRepository.delete(v);
    }

    @Override
    public void deleteVetementById(Long id) {  
        vetementRepository.deleteById(id);
    }

    @Override
    public Vetement getVetement(Long id) {
        return vetementRepository.findById(id).get();
    }

    @Override
    public List<Vetement> getAllVetements() {
        return vetementRepository.findAll();
    }

	@Override
	public List<Vetement> findByNomVetement(String nom) {
		
		   return vetementRepository.findByNomVetement(nom);
	}

	@Override
	public List<Vetement> findByNomVetementContains(String nom) {
		return  vetementRepository.findByNomVetementContains(nom);
	}

	@Override
	public List<Vetement> findByNomPrix(String nom, Double prix) {
		return  vetementRepository.findByNomPrix(nom, prix);
	}

	@Override
	public List<Vetement> findByGenre(Genre genre) {
		
		return vetementRepository.findByGenre(genre);
	}

	@Override
	public List<Vetement> findByGenreIdGenre(Long id) {
		
		return vetementRepository.findByGenreIdGenre(id);
	}

	@Override
	public List<Vetement> findByOrderByNomVetementAsc() {
		return vetementRepository.findByOrderByNomVetementAsc();
	}

	@Override
	public List<Vetement> trierVetementsNomsPrix() {
		return vetementRepository.trierVetementsNomsPrix();
		
	}
}
