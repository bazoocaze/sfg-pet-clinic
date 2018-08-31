/**
 * 
 */
package br.jasf.sfgpetclinic.services;

import java.util.Set;

import br.jasf.sfgpetclinic.model.Vet;

/**
 * @author jose
 *
 */
public interface VetService {

	Vet findById(Long id);

	Vet save(Vet vet);

	Set<Vet> findAll();
}
