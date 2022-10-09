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
@Table(name = "tbl_motocicleta")
@NamedQueries({
    @NamedQuery(name = "TblMotocicleta.findAll", query = "SELECT t FROM TblMotocicleta t"),
    @NamedQuery(name = "TblMotocicleta.findByMotReferencia", query = "SELECT t FROM TblMotocicleta t WHERE t.motReferencia = :motReferencia"),
    @NamedQuery(name = "TblMotocicleta.findByMotPrecio", query = "SELECT t FROM TblMotocicleta t WHERE t.motPrecio = :motPrecio"),
    @NamedQuery(name = "TblMotocicleta.findByMotAutonomia", query = "SELECT t FROM TblMotocicleta t WHERE t.motAutonomia = :motAutonomia"),
    @NamedQuery(name = "TblMotocicleta.findByMotTipo", query = "SELECT t FROM TblMotocicleta t WHERE t.motTipo = :motTipo")})
public class TblMotocicleta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "mot_referencia")
    private Integer motReferencia;
    @Column(name = "mot_precio")
    private Integer motPrecio;
    @Column(name = "mot_autonomia")
    private Integer motAutonomia;
    @Column(name = "mot_tipo")
    private String motTipo;
    @JoinColumn(name = "fab_codigo", referencedColumnName = "fab_codigo")
    @ManyToOne
    private TblFabricante fabCodigo;
    @JoinColumn(name = "pro_codigo", referencedColumnName = "pro_codigo")
    @ManyToOne
    private TblProveedorMotor proCodigo;

    public TblMotocicleta() {
    }

    public TblMotocicleta(Integer motReferencia) {
        this.motReferencia = motReferencia;
    }

    public Integer getMotReferencia() {
        return motReferencia;
    }

    public void setMotReferencia(Integer motReferencia) {
        this.motReferencia = motReferencia;
    }

    public Integer getMotPrecio() {
        return motPrecio;
    }

    public void setMotPrecio(Integer motPrecio) {
        this.motPrecio = motPrecio;
    }

    public Integer getMotAutonomia() {
        return motAutonomia;
    }

    public void setMotAutonomia(Integer motAutonomia) {
        this.motAutonomia = motAutonomia;
    }

    public String getMotTipo() {
        return motTipo;
    }

    public void setMotTipo(String motTipo) {
        this.motTipo = motTipo;
    }

    public TblFabricante getFabCodigo() {
        return fabCodigo;
    }

    public void setFabCodigo(TblFabricante fabCodigo) {
        this.fabCodigo = fabCodigo;
    }

    public TblProveedorMotor getProCodigo() {
        return proCodigo;
    }

    public void setProCodigo(TblProveedorMotor proCodigo) {
        this.proCodigo = proCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (motReferencia != null ? motReferencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblMotocicleta)) {
            return false;
        }
        TblMotocicleta other = (TblMotocicleta) object;
        if ((this.motReferencia == null && other.motReferencia != null) || (this.motReferencia != null && !this.motReferencia.equals(other.motReferencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.TblMotocicleta[ motReferencia=" + motReferencia + " ]";
    }
    
}
