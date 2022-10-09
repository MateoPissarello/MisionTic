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
@Table(name = "tbl_cliente")
@NamedQueries({
    @NamedQuery(name = "TblCliente.findAll", query = "SELECT t FROM TblCliente t"),
    @NamedQuery(name = "TblCliente.findByCliAlias", query = "SELECT t FROM TblCliente t WHERE t.cliAlias = :cliAlias"),
    @NamedQuery(name = "TblCliente.findByCliNombre", query = "SELECT t FROM TblCliente t WHERE t.cliNombre = :cliNombre"),
    @NamedQuery(name = "TblCliente.findByCliApellido", query = "SELECT t FROM TblCliente t WHERE t.cliApellido = :cliApellido"),
    @NamedQuery(name = "TblCliente.findByCliEmail", query = "SELECT t FROM TblCliente t WHERE t.cliEmail = :cliEmail"),
    @NamedQuery(name = "TblCliente.findByCliCelular", query = "SELECT t FROM TblCliente t WHERE t.cliCelular = :cliCelular"),
    @NamedQuery(name = "TblCliente.findByCliFechaNacimiento", query = "SELECT t FROM TblCliente t WHERE t.cliFechaNacimiento = :cliFechaNacimiento"),
    @NamedQuery(name = "TblCliente.findByCliContrasenia", query = "SELECT t FROM TblCliente t WHERE t.cliContrasenia = :cliContrasenia")})
public class TblCliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cli_alias")
    private String cliAlias;
    @Column(name = "cli_nombre")
    private String cliNombre;
    @Column(name = "cli_apellido")
    private String cliApellido;
    @Column(name = "cli_email")
    private String cliEmail;
    @Column(name = "cli_celular")
    private String cliCelular;
    @Column(name = "cli_fecha_nacimiento")
    private Integer cliFechaNacimiento;
    @Column(name = "cli_contrasenia")
    private String cliContrasenia;
    @OneToMany(mappedBy = "cliAlias")
    private List<TblIntencionCompra> tblIntencionCompraList;

    public TblCliente() {
    }

    public TblCliente(String cliAlias) {
        this.cliAlias = cliAlias;
    }

    public String getCliAlias() {
        return cliAlias;
    }

    public void setCliAlias(String cliAlias) {
        this.cliAlias = cliAlias;
    }

    public String getCliNombre() {
        return cliNombre;
    }

    public void setCliNombre(String cliNombre) {
        this.cliNombre = cliNombre;
    }

    public String getCliApellido() {
        return cliApellido;
    }

    public void setCliApellido(String cliApellido) {
        this.cliApellido = cliApellido;
    }

    public String getCliEmail() {
        return cliEmail;
    }

    public void setCliEmail(String cliEmail) {
        this.cliEmail = cliEmail;
    }

    public String getCliCelular() {
        return cliCelular;
    }

    public void setCliCelular(String cliCelular) {
        this.cliCelular = cliCelular;
    }

    public Integer getCliFechaNacimiento() {
        return cliFechaNacimiento;
    }

    public void setCliFechaNacimiento(Integer cliFechaNacimiento) {
        this.cliFechaNacimiento = cliFechaNacimiento;
    }

    public String getCliContrasenia() {
        return cliContrasenia;
    }

    public void setCliContrasenia(String cliContrasenia) {
        this.cliContrasenia = cliContrasenia;
    }

    public List<TblIntencionCompra> getTblIntencionCompraList() {
        return tblIntencionCompraList;
    }

    public void setTblIntencionCompraList(List<TblIntencionCompra> tblIntencionCompraList) {
        this.tblIntencionCompraList = tblIntencionCompraList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cliAlias != null ? cliAlias.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblCliente)) {
            return false;
        }
        TblCliente other = (TblCliente) object;
        if ((this.cliAlias == null && other.cliAlias != null) || (this.cliAlias != null && !this.cliAlias.equals(other.cliAlias))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.TblCliente[ cliAlias=" + cliAlias + " ]";
    }
    
}
