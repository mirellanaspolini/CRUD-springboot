package br.univille.novostalentos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 1000, nullable = false)
    private String nome;
    @Column(length = 3000)
    private String endereco;
    private String sexo;
    // @Temporal(value = TemporalType.DATE)
    // private Date dataNascimento;
    
    // public Date getDataNascimento() {
    //     return dataNascimento;
    // }
    // public void setDataNascimento(Date dataNascimento) {
    //     this.dataNascimento = dataNascimento;
    // }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
