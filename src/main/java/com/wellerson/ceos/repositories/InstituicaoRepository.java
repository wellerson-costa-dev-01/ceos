package com.wellerson.ceos.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.wellerson.ceos.domain.Instituicao;

@Repository
public interface InstituicaoRepository extends JpaRepository<Instituicao,Integer>{
  
}