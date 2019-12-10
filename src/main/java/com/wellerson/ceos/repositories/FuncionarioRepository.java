package com.wellerson.ceos.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.wellerson.ceos.domain.Funcionario;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario,Integer>{
  
}