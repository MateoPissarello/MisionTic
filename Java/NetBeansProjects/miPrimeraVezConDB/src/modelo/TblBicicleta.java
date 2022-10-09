/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author mateo
 */
@Entity
@Table(name = "tbl_bicicleta")
@NamedQueries({
    @NamedQuery(name = "TblBicicleta.findAll", query = "SELECT t FROM TblBicicleta t"),
    @NamedQuery(name = "TblBicicleta.findByBicReferencia", query = "SELECT t FROM TblBicicleta t WHERE t.bicReferencia = :bicReferencia"),
    @NamedQuery(name = "TblBicicleta.findByBicPrecio", query = "SELECT t FROM TblBicicleta t WHERE t.bicPrecio = :bicPrecio"),
    @NamedQuery(name = "TblBicicleta.findByBicAnioConstruccion", query = "SELECT t FROM TblBicicleta t WHERE t.bicAnioConstruccion = :bicAnioConstruccion")})
public class TblBicicleta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "bic_referencia")
    private Integer bicReferencia;
    @Column(name = "bic_precio")
    private Integer bicPrecio;
    @Column(name = "bic_anio_construccion")
    private Integer bicAnioConstruccion;
    @JoinColumn(name = "fab_codigo", referencedColumnName = "fab_codigo")
    @ManyToOne
    private TblFabricante fabCodigo;

    public TblBicicleta() {
    }

    public TblBicicleta(Integer bicReferencia) {
        this.bicReferencia = bicReferencia;
    }

    public Integer getBicReferencia() {
        return bicReferencia;
    }

    public void setBicReferencia(Integer bicReferencia) {
        this.bicReferencia = bicReferencia;
    }

    public Integer getBicPrecio() {
        return bicPrecio;
    }

    public void setBicPrecio(Integer bicPrecio) {
        this.bicPrecio = bicPrecio;
    }

    public Integer getBicAnioConstruccion() {
        return bicAnioConstruccion;
    }

    public void setBicAnioConstruccion(Integer bicAnioConstruccion) {
        this.bicAnioConstruccion = bicAnioConstruccion;
    }

    public TblFabricante getFabCodigo() {
        return fabCodigo;
    }

    public void setFabCodigo(TblFabricante fabCodigo) {
        this.fabCodigo = fabCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bicReferencia != null ? bicReferencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblBicicleta)) {
            return false;
        }
        TblBicicleta other = (TblBicicleta) object;
        if ((this.bicReferencia == null && other.bicReferencia != null) || (this.bicReferencia != null && !this.bicReferencia.equals(other.bicReferencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.TblBicicleta[ bicReferencia=" + bicReferencia + " ]";
    }
    
}
