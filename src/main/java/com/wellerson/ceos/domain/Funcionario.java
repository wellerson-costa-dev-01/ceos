package com.wellerson.ceos.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
public class Funcionario implements Serializable{
  
  private static final long serialVersionUID = 1L;
  
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Integer id;
  private String nome;
  private String cpf;
  private String matricula;
  private Integer ativo;
  
  @JsonBackReference  
  @ManyToOne
  @JoinColumn(name="departamento_id")
  private Departamento departamento;
  
  
  public Funcionario(){
    
  }
  
  public Funcionario(Integer id, String nome, String cpf, String matricula, Integer ativo, Departamento departamento){
    super();
    this.id = id;
    this.nome = nome;
    this.cpf = cpf;
    this.matricula = matricula;
    this.ativo = ativo;
    this.departamento = departamento;
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
  
  public String getCpf(){
    return cpf;
  }
  public void setCpf(String cpf){
    this.cpf = cpf;
  }
  
  public String getMatricula(){
    return matricula;
  }
  public void setMatricula(String matricula){
    this.matricula = matricula;
  }
   
  public Integer getAtivo(){
    return ativo;
  }
  public void setAtivo(Integer ativo){
    this.ativo = ativo;
  }
  
  public void setDepartamento(Departamento departamento){
    this.departamento = departamento;
  }
  
  public Departamento getDepartamento(){
    return this.departamento;
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
   Funcionario other = (Funcionario) obj;
    if (id == null){
      if(other.id != null)
        return false;
     }else if(!id.equals(other.id))
        return false;
      return true;
    }
  }