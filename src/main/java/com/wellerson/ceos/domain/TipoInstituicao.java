package com.wellerson.ceos.domain;

import java.io.Serializable;

public class TipoInstituicao implements Serializable{
  private static final long serialVersionUID = 1L;
  private Integer id;
  private String nome;
  private Integer ativo;
  
  public TipoInstituicao(){
    
  }
  
  public TipoInstituicao(Integer id, String nome, Integer ativo){
    super();
    this.id = id;
    this.nome = nome;
    this.ativo = ativo;
  }
  
  public Integer getId(){
    return id;
  }
  public void setId(Integer id){
    this.id = id;
  }
  
  public String getNome(){
    return nome;
  }
  public void setNome(String nome){
    this.nome = nome;
  }
  
  public Integer getAtivo(){
    return ativo;
  }
  public void setAtivo(Integer ativo){
    this.ativo = ativo;
  }
  
  @Override
  public int hashCode(){
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(Object obj){
    if(this == obj)
      return true;
    if(obj == null)
      return false;
    if(getClass() != obj.getClass())
      return false;
    TipoInstituicao other = (TipoInstituicao) obj;
    if (id == null){
      if(other.id != null)
        return false;
     }else if(!id.equals(other.id))
        return false;
      return true;
    }
  }