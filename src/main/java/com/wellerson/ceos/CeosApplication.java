package com.wellerson.ceos;


import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.wellerson.ceos.repositories.TipoInstituicaoRepository;
import com.wellerson.ceos.repositories.InstituicaoRepository;
import com.wellerson.ceos.repositories.DepartamentoRepository;
import com.wellerson.ceos.repositories.FuncionarioRepository;

import com.wellerson.ceos.domain.TipoInstituicao;
import com.wellerson.ceos.domain.Instituicao;
import com.wellerson.ceos.domain.Departamento;
import com.wellerson.ceos.domain.Funcionario;


@SpringBootApplication
public class CeosApplication implements CommandLineRunner {
  
  @Autowired
  private TipoInstituicaoRepository tipoInstituicaoRepository;
  
  @Autowired
  private InstituicaoRepository instituicaoRepository;
  
  @Autowired
  private DepartamentoRepository departamentoRepository;
  
  @Autowired
  private FuncionarioRepository funcionarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(CeosApplication.class, args);
	}
  
  @Override
  public void run(String... args) throws Exception{
    
    TipoInstituicao tipoInst1 = new TipoInstituicao(null,"Centro Universitário",1);
    TipoInstituicao tipoInst2 = new TipoInstituicao(null,"Faculdade",1);
    
    Instituicao inst1 = new Instituicao(null, "Una","Una","000",1,tipoInst1);
    tipoInst1.getInstituicoes().addAll(Arrays.asList(inst1));
    
    Departamento dep1 = new Departamento(null,"Informa´tica","1234",1,inst1);
    inst1.getDepartamentos().addAll(Arrays.asList(dep1));
    
    Funcionario func1 = new Funcionario(null,"Machado de Assis","123","456",1,dep1);
    dep1.getFuncionarios().addAll(Arrays.asList(func1));
    
    tipoInstituicaoRepository.saveAll(Arrays.asList(tipoInst1, tipoInst2));
    
    instituicaoRepository.saveAll(Arrays.asList(inst1));
    
    departamentoRepository.saveAll(Arrays.asList(dep1));
    
    funcionarioRepository.saveAll(Arrays.asList(func1));
    
  }

}
