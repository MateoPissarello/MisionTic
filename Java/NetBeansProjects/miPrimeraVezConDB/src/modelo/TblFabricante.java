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
@Table(name = "tbl_fabricante")
@NamedQueries({
    @NamedQuery(name = "TblFabricante.findAll", query = "SELECT t FROM TblFabricante t"),
    @NamedQuery(name = "TblFabricante.findByFabCodigo", query = "SELECT t FROM TblFabricante t WHERE t.fabCodigo = :fabCodigo"),
    @NamedQuery(name = "TblFabricante.findByFabNombre", query = "SELECT t FROM TblFabricante t WHERE t.fabNombre = :fabNombre"),
    @NamedQuery(name = "TblFabricante.findByFabDireccion", query = "SELECT t FROM TblFabricante t WHERE t.fabDireccion = :fabDireccion"),
    @NamedQuery(name = "TblFabricante.findByFabTelefono", query = "SELECT t FROM TblFabricante t WHERE t.fabTelefono = :fabTelefono")})
public class TblFabricante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "fab_codigo")
    private Integer fabCodigo;
    @Basic(optional = false)
    @Column(name = "fab_nombre")
    private String fabNombre;
    @Column(name = "fab_direccion")
    private String fabDireccion;
    @Column(name = "fab_telefono")
    private String fabTelefono;
    @OneToMany(mappedBy = "fabCodigo")
    private List<TblMotocicleta> tblMotocicletaList;
    @OneToMany(mappedBy = "fabCodigo")
    private List<TblBicicleta> tblBicicletaList;

    public TblFabricante() {
    }

    public TblFabricante(Integer fabCodigo) {
        this.fabCodigo = fabCodigo;
    }

    public TblFabricante(Integer fabCodigo, String fabNombre) {
        this.fabCodigo = fabCodigo;
        this.fabNombre = fabNombre;
    }

    public Integer getFabCodigo() {
        return fabCodigo;
    }

    public void setFabCodigo(Integer fabCodigo) {
        this.fabCodigo = fabCodigo;
    }

    public String getFabNombre() {
        return fabNombre;
    }

    public void setFabNombre(String fabNombre) {
        this.fabNombre = fabNombre;
    }

    public String getFabDireccion() {
        return fabDireccion;
    }

    public void setFabDireccion(String fabDireccion) {
        this.fabDireccion = fabDireccion;
    }

    public String getFabTelefono() {
        return fabTelefono;
    }

    public void setFabTelefono(String fabTelefono) {
        this.fabTelefono = fabTelefono;
    }

    public List<TblMotocicleta> getTblMotocicletaList() {
        return tblMotocicletaList;
    }

    public void setTblMotocicletaList(List<TblMotocicleta> tblMotocicletaList) {
        this.tblMotocicletaList = tblMotocicletaList;
    }

    public List<TblBicicleta> getTblBicicletaList() {
        return tblBicicletaList;
    }

    public void setTblBicicletaList(List<TblBicicleta> tblBicicletaList) {
        this.tblBicicletaList = tblBicicletaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fabCodigo != null ? fabCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblFabricante)) {
            return false;
        }
        TblFabricante other = (TblFabricante) object;
        if ((this.fabCodigo == null && other.fabCodigo != null) || (this.fabCodigo != null && !this.fabCodigo.equals(other.fabCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.TblFabricante[ fabCodigo=" + fabCodigo + " ]";
    }
    
}
