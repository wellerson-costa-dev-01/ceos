package com.wellerson.ceos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wellerson.ceos.domain.Instituicao;
import com.wellerson.ceos.repositories.InstituicaoRepository;

import java.util.Optional;


@Service
public class InstituicaoService{
  
  @Autowired
  private InstituicaoRepository repo;
  
  public Instituicao buscar(Integer id){
    Optional<Instituicao> obj = repo.findById(id);
    return obj.orElse(null);
  }
  
}