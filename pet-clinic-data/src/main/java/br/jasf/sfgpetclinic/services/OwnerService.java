package br.jasf.sfgpetclinic.services;

import br.jasf.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

	Owner findByLastName(String lastName);

}
