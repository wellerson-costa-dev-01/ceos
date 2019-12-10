package com.wellerson.ceos.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.wellerson.ceos.domain.Departamento;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento,Integer>{
  
}