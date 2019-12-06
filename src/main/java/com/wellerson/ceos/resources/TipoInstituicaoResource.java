package com.wellerson.ceos.resources;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import com.wellerson.ceos.domain.TipoInstituicao;

@RestController
@RequestMapping(value="/tiposinstituicao")
public class TipoInstituicaoResource{
  
  @RequestMapping(method=RequestMethod.GET)
  public List<TipoInstituicao> listar(){
    
    TipoInstituicao tipoInst1 = new TipoInstituicao(1,"Centro Universitário",1);
    TipoInstituicao tipoInst2 = new TipoInstituicao(2,"Universidade",1);
    
    List<TipoInstituicao> lista = new ArrayList<>();
    lista.add(tipoInst1);
    lista.add(tipoInst2);
    
    return lista;
   
  }
}