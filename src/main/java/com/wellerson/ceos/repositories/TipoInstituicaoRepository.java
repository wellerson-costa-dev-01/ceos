package com.wellerson.ceos.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.wellerson.ceos.domain.TipoInstituicao;

@Repository
public interface TipoInstituicaoRepository extends JpaRepository<TipoInstituicao,Integer>{
  
}