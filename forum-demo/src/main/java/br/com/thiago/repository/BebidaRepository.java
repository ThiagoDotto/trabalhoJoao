package br.com.thiago.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.thiago.model.Bebida;

@Repository
public interface BebidaRepository extends JpaRepository<Bebida, Long>{

}
