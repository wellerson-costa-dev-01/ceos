package com.wellerson.ceos;


import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wellerson.ceos.repositories.TipoInstituicaoRepository;
import com.wellerson.ceos.domain.TipoInstituicao;


@SpringBootApplication
public class CeosApplication implements CommandLineRunner {
  
  @Autowired
  private TipoInstituicaoRepository tipoInstituicaoRepository;
  

	public static void main(String[] args) {
		SpringApplication.run(CeosApplication.class, args);
	}
  
  @Override
  public void run(String... args) throws Exception{
    
    TipoInstituicao tipoInst1 = new TipoInstituicao(null,"Centro Universitário",1);
    TipoInstituicao tipoInst2 = new TipoInstituicao(null,"Faculdade",1);
    
    tipoInstituicaoRepository.saveAll(Arrays.asList(tipoInst1, tipoInst2));
    
  }

}
