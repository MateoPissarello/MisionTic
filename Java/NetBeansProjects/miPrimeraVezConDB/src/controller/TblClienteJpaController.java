/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import controller.exceptions.NonexistentEntityException;
import controller.exceptions.PreexistingEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import modelo.TblIntencionCompra;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import modelo.TblCliente;

/**
 *
 * @author mateo
 */
public class TblClienteJpaController implements Serializable {

    public TblClienteJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(TblCliente tblCliente) throws PreexistingEntityException, Exception {
        if (tblCliente.getTblIntencionCompraList() == null) {
            tblCliente.setTblIntencionCompraList(new ArrayList<TblIntencionCompra>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<TblIntencionCompra> attachedTblIntencionCompraList = new ArrayList<TblIntencionCompra>();
            for (TblIntencionCompra tblIntencionCompraListTblIntencionCompraToAttach : tblCliente.getTblIntencionCompraList()) {
                tblIntencionCompraListTblIntencionCompraToAttach = em.getReference(tblIntencionCompraListTblIntencionCompraToAttach.getClass(), tblIntencionCompraListTblIntencionCompraToAttach.getIntCodigo());
                attachedTblIntencionCompraList.add(tblIntencionCompraListTblIntencionCompraToAttach);
            }
            tblCliente.setTblIntencionCompraList(attachedTblIntencionCompraList);
            em.persist(tblCliente);
            for (TblIntencionCompra tblIntencionCompraListTblIntencionCompra : tblCliente.getTblIntencionCompraList()) {
                TblCliente oldCliAliasOfTblIntencionCompraListTblIntencionCompra = tblIntencionCompraListTblIntencionCompra.getCliAlias();
                tblIntencionCompraListTblIntencionCompra.setCliAlias(tblCliente);
                tblIntencionCompraListTblIntencionCompra = em.merge(tblIntencionCompraListTblIntencionCompra);
                if (oldCliAliasOfTblIntencionCompraListTblIntencionCompra != null) {
                    oldCliAliasOfTblIntencionCompraListTblIntencionCompra.getTblIntencionCompraList().remove(tblIntencionCompraListTblIntencionCompra);
                    oldCliAliasOfTblIntencionCompraListTblIntencionCompra = em.merge(oldCliAliasOfTblIntencionCompraListTblIntencionCompra);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findTblCliente(tblCliente.getCliAlias()) != null) {
                throw new PreexistingEntityException("TblCliente " + tblCliente + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(TblCliente tblCliente) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            TblCliente persistentTblCliente = em.find(TblCliente.class, tblCliente.getCliAlias());
            List<TblIntencionCompra> tblIntencionCompraListOld = persistentTblCliente.getTblIntencionCompraList();
            List<TblIntencionCompra> tblIntencionCompraListNew = tblCliente.getTblIntencionCompraList();
            List<TblIntencionCompra> attachedTblIntencionCompraListNew = new ArrayList<TblIntencionCompra>();
            for (TblIntencionCompra tblIntencionCompraListNewTblIntencionCompraToAttach : tblIntencionCompraListNew) {
                tblIntencionCompraListNewTblIntencionCompraToAttach = em.getReference(tblIntencionCompraListNewTblIntencionCompraToAttach.getClass(), tblIntencionCompraListNewTblIntencionCompraToAttach.getIntCodigo());
                attachedTblIntencionCompraListNew.add(tblIntencionCompraListNewTblIntencionCompraToAttach);
            }
            tblIntencionCompraListNew = attachedTblIntencionCompraListNew;
            tblCliente.setTblIntencionCompraList(tblIntencionCompraListNew);
            tblCliente = em.merge(tblCliente);
            for (TblIntencionCompra tblIntencionCompraListOldTblIntencionCompra : tblIntencionCompraListOld) {
                if (!tblIntencionCompraListNew.contains(tblIntencionCompraListOldTblIntencionCompra)) {
                    tblIntencionCompraListOldTblIntencionCompra.setCliAlias(null);
                    tblIntencionCompraListOldTblIntencionCompra = em.merge(tblIntencionCompraListOldTblIntencionCompra);
                }
            }
            for (TblIntencionCompra tblIntencionCompraListNewTblIntencionCompra : tblIntencionCompraListNew) {
                if (!tblIntencionCompraListOld.contains(tblIntencionCompraListNewTblIntencionCompra)) {
                    TblCliente oldCliAliasOfTblIntencionCompraListNewTblIntencionCompra = tblIntencionCompraListNewTblIntencionCompra.getCliAlias();
                    tblIntencionCompraListNewTblIntencionCompra.setCliAlias(tblCliente);
                    tblIntencionCompraListNewTblIntencionCompra = em.merge(tblIntencionCompraListNewTblIntencionCompra);
                    if (oldCliAliasOfTblIntencionCompraListNewTblIntencionCompra != null && !oldCliAliasOfTblIntencionCompraListNewTblIntencionCompra.equals(tblCliente)) {
                        oldCliAliasOfTblIntencionCompraListNewTblIntencionCompra.getTblIntencionCompraList().remove(tblIntencionCompraListNewTblIntencionCompra);
                        oldCliAliasOfTblIntencionCompraListNewTblIntencionCompra = em.merge(oldCliAliasOfTblIntencionCompraListNewTblIntencionCompra);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = tblCliente.getCliAlias();
                if (findTblCliente(id) == null) {
                    throw new NonexistentEntityException("The tblCliente with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            TblCliente tblCliente;
            try {
                tblCliente = em.getReference(TblCliente.class, id);
                tblCliente.getCliAlias();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tblCliente with id " + id + " no longer exists.", enfe);
            }
            List<TblIntencionCompra> tblIntencionCompraList = tblCliente.getTblIntencionCompraList();
            for (TblIntencionCompra tblIntencionCompraListTblIntencionCompra : tblIntencionCompraList) {
                tblIntencionCompraListTblIntencionCompra.setCliAlias(null);
                tblIntencionCompraListTblIntencionCompra = em.merge(tblIntencionCompraListTblIntencionCompra);
            }
            em.remove(tblCliente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<TblCliente> findTblClienteEntities() {
        return findTblClienteEntities(true, -1, -1);
    }

    public List<TblCliente> findTblClienteEntities(int maxResults, int firstResult) {
        return findTblClienteEntities(false, maxResults, firstResult);
    }

    private List<TblCliente> findTblClienteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(TblCliente.class));
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

    public TblCliente findTblCliente(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(TblCliente.class, id);
        } finally {
            em.close();
        }
    }

    public int getTblClienteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<TblCliente> rt = cq.from(TblCliente.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
