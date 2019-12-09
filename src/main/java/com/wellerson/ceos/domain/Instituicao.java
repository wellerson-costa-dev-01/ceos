package com.wellerson.ceos.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;


@Entity
public class Instituicao implements Serializable{
  
  private static final long serialVersionUID = 1L;
  
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Integer id;
  private String nomeFantasia;
  private String razaoSocial;
  private String cnpj;
  private Integer ativo;
    
  @ManyToOne
  @JoinColumn(name="tipoinstituicao_id")
  private TipoInstituicao tipoInstituicao;
  
  
  public Instituicao(){
    
  }
  
  public Instituicao(Integer id, String nomeFantasia, String razaoSocial, String cnpj, Integer ativo, TipoInstituicao tipoInstituicao){
    super();
    this.id = id;
    this.nomeFantasia = nomeFantasia;
    this.razaoSocial = razaoSocial;
    this.cnpj = cnpj;
    this.ativo = ativo;
    this.tipoInstituicao = tipoInstituicao;
  }
  
  public Integer getId(){
    return id;
  }
  public void setId(Integer id){
    this.id = id;
  }
  
  public String getNomeFantasia(){
    return nomeFantasia;
  }
  public void setNomeFantasia(String nomeFantasia){
    this.nomeFantasia = nomeFantasia;
  }
  
  public String getRazaoSocial(){
    return razaoSocial;
  }
  public void setRazaoSocial(String razaoSocial){
    this.razaoSocial = razaoSocial;
  }
  
  public String getCnpj(){
    return cnpj;
  }
  public void setCnpj(String cnpj){
    this.cnpj = cnpj;
  }
  
  public Integer getAtivo(){
    return ativo;
  }
  public void setAtivo(Integer ativo){
    this.ativo = ativo;
  }
  
  public void setTipoInstituicao(TipoInstituicao tipoInstituicao){
    this.tipoInstituicao = tipoInstituicao;
  }
  
  public TipoInstituicao getTipoInstituicao(){
    return this.tipoInstituicao;
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
   Instituicao other = (Instituicao) obj;
    if (id == null){
      if(other.id != null)
        return false;
     }else if(!id.equals(other.id))
        return false;
      return true;
    }
  }