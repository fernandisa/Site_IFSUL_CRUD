
package modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "professor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Professor.findAll", query = "SELECT p FROM Professor p"),
    @NamedQuery(name = "Professor.findBySiape", query = "SELECT p FROM Professor p WHERE p.siape = :siape"),
    @NamedQuery(name = "Professor.findByNome", query = "SELECT p FROM Professor p WHERE p.nome = :nome")})
public class Professor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "siape")
    private String siape;
    @Column(name = "nome")
    private String nome;
    @OneToMany(mappedBy = "siapeprofessor")
    private Collection<Disciplina> disciplinaCollection;

    public Professor() {
    }

    public Professor(String siape) {
        this.siape = siape;
    }

    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @XmlTransient
    public Collection<Disciplina> getDisciplinaCollection() {
        return disciplinaCollection;
    }

    public void setDisciplinaCollection(Collection<Disciplina> disciplinaCollection) {
        this.disciplinaCollection = disciplinaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (siape != null ? siape.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Professor)) {
            return false;
        }
        Professor other = (Professor) object;
        if ((this.siape == null && other.siape != null) || (this.siape != null && !this.siape.equals(other.siape))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Professor[ siape=" + siape + " ]";
    }
    
}
