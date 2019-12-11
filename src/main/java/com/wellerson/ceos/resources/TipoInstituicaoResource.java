package com.wellerson.ceos.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import java.util.ArrayList;
import java.util.List;

import java.net.*;


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
  
  @RequestMapping(method=RequestMethod.POST)
  public ResponseEntity<Void> insert(@RequestBody TipoInstituicao obj){
    obj = service.insert(obj);
   URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
			.path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
  }
  
  @RequestMapping(value="/{id}", method=RequestMethod.PUT) 
  public ResponseEntity<Void> update(@RequestBody TipoInstituicao obj,@PathVariable Integer id){
    obj.setId(id);
		obj = service.update(obj);
		return ResponseEntity.noContent().build();
  }
  
  @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
  public ResponseEntity<Void> delete(@PathVariable Integer id){
    service.delete(id);
		return ResponseEntity.noContent().build();
  }
}