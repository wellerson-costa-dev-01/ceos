package com.wellerson.ceos.resources;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(value="/tiposinstituicao")
public class TipoInstituicaoResource{
  
  @RequestMapping(method=RequestMethod.GET)
  public String listar(){
    return "Rest está funcionando!";
  }
}