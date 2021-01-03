package br.com.zup.zupbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import br.com.zup.zupbank.model.Person;

public interface NewHolderRepository extends JpaRepository<Person, Long>{

}
