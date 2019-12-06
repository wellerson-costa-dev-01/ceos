package com.wellerson.ceos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wellerson.ceos.domain.TipoInstituicao;
import com.wellerson.ceos.repositories.TipoInstituicaoRepository;

import java.util.Optional;


@Service
public class TipoInstituicaoService{
  
  @Autowired
  private TipoInstituicaoRepository repo;
  
  public TipoInstituicao buscar(Integer id){
    Optional<TipoInstituicao> obj = repo.findById(id);
    return obj.orElse(null);
  }
  
}