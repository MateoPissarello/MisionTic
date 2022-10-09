/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author mateo
 */
@Entity
@Table(name = "tbl_intencion_compra")
@NamedQueries({
    @NamedQuery(name = "TblIntencionCompra.findAll", query = "SELECT t FROM TblIntencionCompra t"),
    @NamedQuery(name = "TblIntencionCompra.findByIntCodigo", query = "SELECT t FROM TblIntencionCompra t WHERE t.intCodigo = :intCodigo"),
    @NamedQuery(name = "TblIntencionCompra.findByIntConsulta", query = "SELECT t FROM TblIntencionCompra t WHERE t.intConsulta = :intConsulta"),
    @NamedQuery(name = "TblIntencionCompra.findByIntFechaRegistro", query = "SELECT t FROM TblIntencionCompra t WHERE t.intFechaRegistro = :intFechaRegistro")})
public class TblIntencionCompra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "int_codigo")
    private Integer intCodigo;
    @Column(name = "int_consulta")
    private String intConsulta;
    @Column(name = "int_fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date intFechaRegistro;
    @JoinColumn(name = "cli_alias", referencedColumnName = "cli_alias")
    @ManyToOne
    private TblCliente cliAlias;

    public TblIntencionCompra() {
    }

    public TblIntencionCompra(Integer intCodigo) {
        this.intCodigo = intCodigo;
    }

    public Integer getIntCodigo() {
        return intCodigo;
    }

    public void setIntCodigo(Integer intCodigo) {
        this.intCodigo = intCodigo;
    }

    public String getIntConsulta() {
        return intConsulta;
    }

    public void setIntConsulta(String intConsulta) {
        this.intConsulta = intConsulta;
    }

    public Date getIntFechaRegistro() {
        return intFechaRegistro;
    }

    public void setIntFechaRegistro(Date intFechaRegistro) {
        this.intFechaRegistro = intFechaRegistro;
    }

    public TblCliente getCliAlias() {
        return cliAlias;
    }

    public void setCliAlias(TblCliente cliAlias) {
        this.cliAlias = cliAlias;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (intCodigo != null ? intCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblIntencionCompra)) {
            return false;
        }
        TblIntencionCompra other = (TblIntencionCompra) object;
        if ((this.intCodigo == null && other.intCodigo != null) || (this.intCodigo != null && !this.intCodigo.equals(other.intCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.TblIntencionCompra[ intCodigo=" + intCodigo + " ]";
    }
    
}
