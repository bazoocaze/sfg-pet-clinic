package br.jasf.sfgpetclinic.services.map;

import java.util.Set;

import br.jasf.sfgpetclinic.model.Owner;
import br.jasf.sfgpetclinic.services.OwnerService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}
	
	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Owner save(Owner object) {
		return super.save(object.getId(), object);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
	
	@Override
	public void delete(Owner object) {
		super.delete(object);
	}

}