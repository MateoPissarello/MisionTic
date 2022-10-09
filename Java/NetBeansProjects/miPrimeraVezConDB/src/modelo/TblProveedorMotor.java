/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author mateo
 */
@Entity
@Table(name = "tbl_proveedor_motor")
@NamedQueries({
    @NamedQuery(name = "TblProveedorMotor.findAll", query = "SELECT t FROM TblProveedorMotor t"),
    @NamedQuery(name = "TblProveedorMotor.findByProCodigo", query = "SELECT t FROM TblProveedorMotor t WHERE t.proCodigo = :proCodigo"),
    @NamedQuery(name = "TblProveedorMotor.findByProNombre", query = "SELECT t FROM TblProveedorMotor t WHERE t.proNombre = :proNombre"),
    @NamedQuery(name = "TblProveedorMotor.findByProDireccion", query = "SELECT t FROM TblProveedorMotor t WHERE t.proDireccion = :proDireccion"),
    @NamedQuery(name = "TblProveedorMotor.findByProTelefono", query = "SELECT t FROM TblProveedorMotor t WHERE t.proTelefono = :proTelefono")})
public class TblProveedorMotor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "pro_codigo")
    private Integer proCodigo;
    @Column(name = "pro_nombre")
    private String proNombre;
    @Column(name = "pro_direccion")
    private String proDireccion;
    @Column(name = "pro_telefono")
    private String proTelefono;
    @OneToMany(mappedBy = "proCodigo")
    private List<TblMotocicleta> tblMotocicletaList;

    public TblProveedorMotor() {
    }

    public TblProveedorMotor(Integer proCodigo) {
        this.proCodigo = proCodigo;
    }

    public Integer getProCodigo() {
        return proCodigo;
    }

    public void setProCodigo(Integer proCodigo) {
        this.proCodigo = proCodigo;
    }

    public String getProNombre() {
        return proNombre;
    }

    public void setProNombre(String proNombre) {
        this.proNombre = proNombre;
    }

    public String getProDireccion() {
        return proDireccion;
    }

    public void setProDireccion(String proDireccion) {
        this.proDireccion = proDireccion;
    }

    public String getProTelefono() {
        return proTelefono;
    }

    public void setProTelefono(String proTelefono) {
        this.proTelefono = proTelefono;
    }

    public List<TblMotocicleta> getTblMotocicletaList() {
        return tblMotocicletaList;
    }

    public void setTblMotocicletaList(List<TblMotocicleta> tblMotocicletaList) {
        this.tblMotocicletaList = tblMotocicletaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (proCodigo != null ? proCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblProveedorMotor)) {
            return false;
        }
        TblProveedorMotor other = (TblProveedorMotor) object;
        if ((this.proCodigo == null && other.proCodigo != null) || (this.proCodigo != null && !this.proCodigo.equals(other.proCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.TblProveedorMotor[ proCodigo=" + proCodigo + " ]";
    }
    
}
