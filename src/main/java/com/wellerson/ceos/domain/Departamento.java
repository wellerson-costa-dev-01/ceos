package com.wellerson.ceos.domain;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
public class Departamento implements Serializable{
  
  private static final long serialVersionUID = 1L;
  
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Integer id;
  private String departamento;
  private String centroCusto;
  private Integer ativo;
  
  @JsonBackReference  
  @ManyToOne
  @JoinColumn(name="instituicao_id")
  private Instituicao instituicao;
  
  @JsonManagedReference
  @OneToMany(mappedBy="departamento")
  private List<Funcionario> funcionarios = new ArrayList<>();
  
  
  public Departamento(){
    
  }
  
  public Departamento(Integer id, String departamento, String centroCusto, Integer ativo, Instituicao instituicao){
    super();
    this.id = id;
    this.departamento = departamento;
    this.centroCusto = centroCusto;
    this.ativo = ativo;
    this.instituicao = instituicao;
  }
  
  public Integer getId(){
    return id;
  }
  public void setId(Integer id){
    this.id = id;
  }
  
  public String getDepartamento(){
    return departamento;
  }
  public void setDepartamento(String departamento){
    this.departamento = departamento;
  }
  
  public String getCentroCusto(){
    return centroCusto;
  }
  public void setCentroCusto(String centroCusto){
    this.centroCusto = centroCusto;
  }
  
   
  public Integer getAtivo(){
    return ativo;
  }
  public void setAtivo(Integer ativo){
    this.ativo = ativo;
  }
  
  public void setInstituicao(Instituicao instituicao){
    this.instituicao = instituicao;
  }
  
  public Instituicao getInstituicao(){
    return this.instituicao;
  }
  
  
  public List<Funcionario> getFuncionarios(){
    return funcionarios;
  }
  
  public void setFuncionarios(List<Funcionario> funcionarios){
    this.funcionarios = funcionarios;
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
   Departamento other = (Departamento) obj;
    if (id == null){
      if(other.id != null)
        return false;
     }else if(!id.equals(other.id))
        return false;
      return true;
    }
  }