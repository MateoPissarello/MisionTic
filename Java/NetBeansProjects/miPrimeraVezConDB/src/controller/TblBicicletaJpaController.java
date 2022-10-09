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
import modelo.TblBicicleta;
import modelo.TblFabricante;

/**
 *
 * @author mateo
 */
public class TblBicicletaJpaController implements Serializable {

    public TblBicicletaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(TblBicicleta tblBicicleta) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            TblFabricante fabCodigo = tblBicicleta.getFabCodigo();
            if (fabCodigo != null) {
                fabCodigo = em.getReference(fabCodigo.getClass(), fabCodigo.getFabCodigo());
                tblBicicleta.setFabCodigo(fabCodigo);
            }
            em.persist(tblBicicleta);
            if (fabCodigo != null) {
                fabCodigo.getTblBicicletaList().add(tblBicicleta);
                fabCodigo = em.merge(fabCodigo);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(TblBicicleta tblBicicleta) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            TblBicicleta persistentTblBicicleta = em.find(TblBicicleta.class, tblBicicleta.getBicReferencia());
            TblFabricante fabCodigoOld = persistentTblBicicleta.getFabCodigo();
            TblFabricante fabCodigoNew = tblBicicleta.getFabCodigo();
            if (fabCodigoNew != null) {
                fabCodigoNew = em.getReference(fabCodigoNew.getClass(), fabCodigoNew.getFabCodigo());
                tblBicicleta.setFabCodigo(fabCodigoNew);
            }
            tblBicicleta = em.merge(tblBicicleta);
            if (fabCodigoOld != null && !fabCodigoOld.equals(fabCodigoNew)) {
                fabCodigoOld.getTblBicicletaList().remove(tblBicicleta);
                fabCodigoOld = em.merge(fabCodigoOld);
            }
            if (fabCodigoNew != null && !fabCodigoNew.equals(fabCodigoOld)) {
                fabCodigoNew.getTblBicicletaList().add(tblBicicleta);
                fabCodigoNew = em.merge(fabCodigoNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = tblBicicleta.getBicReferencia();
                if (findTblBicicleta(id) == null) {
                    throw new NonexistentEntityException("The tblBicicleta with id " + id + " no longer exists.");
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
            TblBicicleta tblBicicleta;
            try {
                tblBicicleta = em.getReference(TblBicicleta.class, id);
                tblBicicleta.getBicReferencia();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tblBicicleta with id " + id + " no longer exists.", enfe);
            }
            TblFabricante fabCodigo = tblBicicleta.getFabCodigo();
            if (fabCodigo != null) {
                fabCodigo.getTblBicicletaList().remove(tblBicicleta);
                fabCodigo = em.merge(fabCodigo);
            }
            em.remove(tblBicicleta);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<TblBicicleta> findTblBicicletaEntities() {
        return findTblBicicletaEntities(true, -1, -1);
    }

    public List<TblBicicleta> findTblBicicletaEntities(int maxResults, int firstResult) {
        return findTblBicicletaEntities(false, maxResults, firstResult);
    }

    private List<TblBicicleta> findTblBicicletaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(TblBicicleta.class));
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

    public TblBicicleta findTblBicicleta(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(TblBicicleta.class, id);
        } finally {
            em.close();
        }
    }

    public int getTblBicicletaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<TblBicicleta> rt = cq.from(TblBicicleta.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
