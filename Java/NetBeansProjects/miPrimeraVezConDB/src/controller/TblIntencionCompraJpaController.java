/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import controller.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import modelo.TblCliente;
import modelo.TblIntencionCompra;

/**
 *
 * @author mateo
 */
public class TblIntencionCompraJpaController implements Serializable {

    public TblIntencionCompraJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(TblIntencionCompra tblIntencionCompra) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            TblCliente cliAlias = tblIntencionCompra.getCliAlias();
            if (cliAlias != null) {
                cliAlias = em.getReference(cliAlias.getClass(), cliAlias.getCliAlias());
                tblIntencionCompra.setCliAlias(cliAlias);
            }
            em.persist(tblIntencionCompra);
            if (cliAlias != null) {
                cliAlias.getTblIntencionCompraList().add(tblIntencionCompra);
                cliAlias = em.merge(cliAlias);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(TblIntencionCompra tblIntencionCompra) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            TblIntencionCompra persistentTblIntencionCompra = em.find(TblIntencionCompra.class, tblIntencionCompra.getIntCodigo());
            TblCliente cliAliasOld = persistentTblIntencionCompra.getCliAlias();
            TblCliente cliAliasNew = tblIntencionCompra.getCliAlias();
            if (cliAliasNew != null) {
                cliAliasNew = em.getReference(cliAliasNew.getClass(), cliAliasNew.getCliAlias());
                tblIntencionCompra.setCliAlias(cliAliasNew);
            }
            tblIntencionCompra = em.merge(tblIntencionCompra);
            if (cliAliasOld != null && !cliAliasOld.equals(cliAliasNew)) {
                cliAliasOld.getTblIntencionCompraList().remove(tblIntencionCompra);
                cliAliasOld = em.merge(cliAliasOld);
            }
            if (cliAliasNew != null && !cliAliasNew.equals(cliAliasOld)) {
                cliAliasNew.getTblIntencionCompraList().add(tblIntencionCompra);
                cliAliasNew = em.merge(cliAliasNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = tblIntencionCompra.getIntCodigo();
                if (findTblIntencionCompra(id) == null) {
                    throw new NonexistentEntityException("The tblIntencionCompra with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            TblIntencionCompra tblIntencionCompra;
            try {
                tblIntencionCompra = em.getReference(TblIntencionCompra.class, id);
                tblIntencionCompra.getIntCodigo();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tblIntencionCompra with id " + id + " no longer exists.", enfe);
            }
            TblCliente cliAlias = tblIntencionCompra.getCliAlias();
            if (cliAlias != null) {
                cliAlias.getTblIntencionCompraList().remove(tblIntencionCompra);
                cliAlias = em.merge(cliAlias);
            }
            em.remove(tblIntencionCompra);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<TblIntencionCompra> findTblIntencionCompraEntities() {
        return findTblIntencionCompraEntities(true, -1, -1);
    }

    public List<TblIntencionCompra> findTblIntencionCompraEntities(int maxResults, int firstResult) {
        return findTblIntencionCompraEntities(false, maxResults, firstResult);
    }

    private List<TblIntencionCompra> findTblIntencionCompraEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(TblIntencionCompra.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public TblIntencionCompra findTblIntencionCompra(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(TblIntencionCompra.class, id);
        } finally {
            em.close();
        }
    }

    public int getTblIntencionCompraCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<TblIntencionCompra> rt = cq.from(TblIntencionCompra.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
