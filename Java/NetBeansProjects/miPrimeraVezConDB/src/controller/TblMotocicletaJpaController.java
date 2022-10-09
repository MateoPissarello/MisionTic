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
import modelo.TblFabricante;
import modelo.TblMotocicleta;
import modelo.TblProveedorMotor;

/**
 *
 * @author mateo
 */
public class TblMotocicletaJpaController implements Serializable {

    public TblMotocicletaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(TblMotocicleta tblMotocicleta) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            TblFabricante fabCodigo = tblMotocicleta.getFabCodigo();
            if (fabCodigo != null) {
                fabCodigo = em.getReference(fabCodigo.getClass(), fabCodigo.getFabCodigo());
                tblMotocicleta.setFabCodigo(fabCodigo);
            }
            TblProveedorMotor proCodigo = tblMotocicleta.getProCodigo();
            if (proCodigo != null) {
                proCodigo = em.getReference(proCodigo.getClass(), proCodigo.getProCodigo());
                tblMotocicleta.setProCodigo(proCodigo);
            }
            em.persist(tblMotocicleta);
            if (fabCodigo != null) {
                fabCodigo.getTblMotocicletaList().add(tblMotocicleta);
                fabCodigo = em.merge(fabCodigo);
            }
            if (proCodigo != null) {
                proCodigo.getTblMotocicletaList().add(tblMotocicleta);
                proCodigo = em.merge(proCodigo);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(TblMotocicleta tblMotocicleta) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            TblMotocicleta persistentTblMotocicleta = em.find(TblMotocicleta.class, tblMotocicleta.getMotReferencia());
            TblFabricante fabCodigoOld = persistentTblMotocicleta.getFabCodigo();
            TblFabricante fabCodigoNew = tblMotocicleta.getFabCodigo();
            TblProveedorMotor proCodigoOld = persistentTblMotocicleta.getProCodigo();
            TblProveedorMotor proCodigoNew = tblMotocicleta.getProCodigo();
            if (fabCodigoNew != null) {
                fabCodigoNew = em.getReference(fabCodigoNew.getClass(), fabCodigoNew.getFabCodigo());
                tblMotocicleta.setFabCodigo(fabCodigoNew);
            }
            if (proCodigoNew != null) {
                proCodigoNew = em.getReference(proCodigoNew.getClass(), proCodigoNew.getProCodigo());
                tblMotocicleta.setProCodigo(proCodigoNew);
            }
            tblMotocicleta = em.merge(tblMotocicleta);
            if (fabCodigoOld != null && !fabCodigoOld.equals(fabCodigoNew)) {
                fabCodigoOld.getTblMotocicletaList().remove(tblMotocicleta);
                fabCodigoOld = em.merge(fabCodigoOld);
            }
            if (fabCodigoNew != null && !fabCodigoNew.equals(fabCodigoOld)) {
                fabCodigoNew.getTblMotocicletaList().add(tblMotocicleta);
                fabCodigoNew = em.merge(fabCodigoNew);
            }
            if (proCodigoOld != null && !proCodigoOld.equals(proCodigoNew)) {
                proCodigoOld.getTblMotocicletaList().remove(tblMotocicleta);
                proCodigoOld = em.merge(proCodigoOld);
            }
            if (proCodigoNew != null && !proCodigoNew.equals(proCodigoOld)) {
                proCodigoNew.getTblMotocicletaList().add(tblMotocicleta);
                proCodigoNew = em.merge(proCodigoNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = tblMotocicleta.getMotReferencia();
                if (findTblMotocicleta(id) == null) {
                    throw new NonexistentEntityException("The tblMotocicleta with id " + id + " no longer exists.");
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
            TblMotocicleta tblMotocicleta;
            try {
                tblMotocicleta = em.getReference(TblMotocicleta.class, id);
                tblMotocicleta.getMotReferencia();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tblMotocicleta with id " + id + " no longer exists.", enfe);
            }
            TblFabricante fabCodigo = tblMotocicleta.getFabCodigo();
            if (fabCodigo != null) {
                fabCodigo.getTblMotocicletaList().remove(tblMotocicleta);
                fabCodigo = em.merge(fabCodigo);
            }
            TblProveedorMotor proCodigo = tblMotocicleta.getProCodigo();
            if (proCodigo != null) {
                proCodigo.getTblMotocicletaList().remove(tblMotocicleta);
                proCodigo = em.merge(proCodigo);
            }
            em.remove(tblMotocicleta);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<TblMotocicleta> findTblMotocicletaEntities() {
        return findTblMotocicletaEntities(true, -1, -1);
    }

    public List<TblMotocicleta> findTblMotocicletaEntities(int maxResults, int firstResult) {
        return findTblMotocicletaEntities(false, maxResults, firstResult);
    }

    private List<TblMotocicleta> findTblMotocicletaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(TblMotocicleta.class));
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

    public TblMotocicleta findTblMotocicleta(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(TblMotocicleta.class, id);
        } finally {
            em.close();
        }
    }

    public int getTblMotocicletaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<TblMotocicleta> rt = cq.from(TblMotocicleta.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
