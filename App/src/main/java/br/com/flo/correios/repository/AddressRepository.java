package br.com.flo.correios.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.flo.correios.model.Address;

public interface AddressRepository extends CrudRepository<Address, String>{

}
