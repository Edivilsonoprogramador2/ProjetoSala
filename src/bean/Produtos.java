package bean;
// Generated 04/12/2024 10:52:46 by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Produtos generated by hbm2java
 */
@Entity
@Table(name="produtos"
    ,catalog="aulas"
)
public class Produtos  implements java.io.Serializable {


     private int idprodutos;
     private String nome;
     private double valorUnitario;
     private int grupo;

    public Produtos() {
    }

	
    public Produtos(int idprodutos) {
        this.idprodutos = idprodutos;
    }
    public Produtos(int idprodutos, String nome, double valorUnitario, int grupo) {
       this.idprodutos = idprodutos;
       this.nome = nome;
       this.valorUnitario = valorUnitario;
       this.grupo = grupo;
    }
   
     @Id 

    
    @Column(name="idprodutos", unique=true, nullable=false)
    public int getIdprodutos() {
        return this.idprodutos;
    }
    
    public void setIdprodutos(int idprodutos) {
        this.idprodutos = idprodutos;
    }

    
    @Column(name="nome", length=60)
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    @Column(name="valorUnitario", precision=10)
    public double getValorUnitario() {
        return this.valorUnitario;
    }
    
    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    
    @Column(name="grupo")
    public int getGrupo() {
        return this.grupo;
    }
    
    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString(){
        return this.getNome();
    }
    
    public boolean equals(Object object) {
        if (object instanceof Vendedor) {
            Produtos produtos = (Produtos) object;
            if (produtos.getIdprodutos()== this.getIdprodutos()) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }

}


