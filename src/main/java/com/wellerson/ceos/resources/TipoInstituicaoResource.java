package com.wellerson.ceos.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


import com.wellerson.ceos.domain.TipoInstituicao;
import com.wellerson.ceos.services.TipoInstituicaoService;

@RestController
@RequestMapping(value="/tiposinstituicao")
public class TipoInstituicaoResource{
  
  @Autowired
  private TipoInstituicaoService service;
  
  @RequestMapping(value="/{id}", method=RequestMethod.GET)
  public ResponseEntity<?> find(@PathVariable Integer id){
    
    TipoInstituicao obj = service.buscar(id);
    
    return ResponseEntity.ok().body(obj);
   
  }
}