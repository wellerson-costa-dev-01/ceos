package com.wellerson.ceos.services;

import com.wellerson.ceos.services.exceptions.*;

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
    return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + TipoInstituicao.class.getName()));
  }
  
  public TipoInstituicao insert(TipoInstituicao obj){
    obj.setId(null);
    return repo.save(obj);
  }
  
  public TipoInstituicao update(TipoInstituicao obj){
    buscar(obj.getId());
    return repo.save(obj);
  }
  
  public void delete(Integer id){
    buscar(id);
		repo.deleteById(id);
	}
  
  
}