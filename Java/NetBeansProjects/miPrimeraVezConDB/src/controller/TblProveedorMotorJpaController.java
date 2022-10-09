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
import modelo.TblMotocicleta;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import modelo.TblProveedorMotor;

/**
 *
 * @author mateo
 */
public class TblProveedorMotorJpaController implements Serializable {

    public TblProveedorMotorJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(TblProveedorMotor tblProveedorMotor) throws PreexistingEntityException, Exception {
        if (tblProveedorMotor.getTblMotocicletaList() == null) {
            tblProveedorMotor.setTblMotocicletaList(new ArrayList<TblMotocicleta>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<TblMotocicleta> attachedTblMotocicletaList = new ArrayList<TblMotocicleta>();
            for (TblMotocicleta tblMotocicletaListTblMotocicletaToAttach : tblProveedorMotor.getTblMotocicletaList()) {
                tblMotocicletaListTblMotocicletaToAttach = em.getReference(tblMotocicletaListTblMotocicletaToAttach.getClass(), tblMotocicletaListTblMotocicletaToAttach.getMotReferencia());
                attachedTblMotocicletaList.add(tblMotocicletaListTblMotocicletaToAttach);
            }
            tblProveedorMotor.setTblMotocicletaList(attachedTblMotocicletaList);
            em.persist(tblProveedorMotor);
            for (TblMotocicleta tblMotocicletaListTblMotocicleta : tblProveedorMotor.getTblMotocicletaList()) {
                TblProveedorMotor oldProCodigoOfTblMotocicletaListTblMotocicleta = tblMotocicletaListTblMotocicleta.getProCodigo();
                tblMotocicletaListTblMotocicleta.setProCodigo(tblProveedorMotor);
                tblMotocicletaListTblMotocicleta = em.merge(tblMotocicletaListTblMotocicleta);
                if (oldProCodigoOfTblMotocicletaListTblMotocicleta != null) {
                    oldProCodigoOfTblMotocicletaListTblMotocicleta.getTblMotocicletaList().remove(tblMotocicletaListTblMotocicleta);
                    oldProCodigoOfTblMotocicletaListTblMotocicleta = em.merge(oldProCodigoOfTblMotocicletaListTblMotocicleta);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findTblProveedorMotor(tblProveedorMotor.getProCodigo()) != null) {
                throw new PreexistingEntityException("TblProveedorMotor " + tblProveedorMotor + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(TblProveedorMotor tblProveedorMotor) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            TblProveedorMotor persistentTblProveedorMotor = em.find(TblProveedorMotor.class, tblProveedorMotor.getProCodigo());
            List<TblMotocicleta> tblMotocicletaListOld = persistentTblProveedorMotor.getTblMotocicletaList();
            List<TblMotocicleta> tblMotocicletaListNew = tblProveedorMotor.getTblMotocicletaList();
            List<TblMotocicleta> attachedTblMotocicletaListNew = new ArrayList<TblMotocicleta>();
            for (TblMotocicleta tblMotocicletaListNewTblMotocicletaToAttach : tblMotocicletaListNew) {
                tblMotocicletaListNewTblMotocicletaToAttach = em.getReference(tblMotocicletaListNewTblMotocicletaToAttach.getClass(), tblMotocicletaListNewTblMotocicletaToAttach.getMotReferencia());
                attachedTblMotocicletaListNew.add(tblMotocicletaListNewTblMotocicletaToAttach);
            }
            tblMotocicletaListNew = attachedTblMotocicletaListNew;
            tblProveedorMotor.setTblMotocicletaList(tblMotocicletaListNew);
            tblProveedorMotor = em.merge(tblProveedorMotor);
            for (TblMotocicleta tblMotocicletaListOldTblMotocicleta : tblMotocicletaListOld) {
                if (!tblMotocicletaListNew.contains(tblMotocicletaListOldTblMotocicleta)) {
                    tblMotocicletaListOldTblMotocicleta.setProCodigo(null);
                    tblMotocicletaListOldTblMotocicleta = em.merge(tblMotocicletaListOldTblMotocicleta);
                }
            }
            for (TblMotocicleta tblMotocicletaListNewTblMotocicleta : tblMotocicletaListNew) {
                if (!tblMotocicletaListOld.contains(tblMotocicletaListNewTblMotocicleta)) {
                    TblProveedorMotor oldProCodigoOfTblMotocicletaListNewTblMotocicleta = tblMotocicletaListNewTblMotocicleta.getProCodigo();
                    tblMotocicletaListNewTblMotocicleta.setProCodigo(tblProveedorMotor);
                    tblMotocicletaListNewTblMotocicleta = em.merge(tblMotocicletaListNewTblMotocicleta);
                    if (oldProCodigoOfTblMotocicletaListNewTblMotocicleta != null && !oldProCodigoOfTblMotocicletaListNewTblMotocicleta.equals(tblProveedorMotor)) {
                        oldProCodigoOfTblMotocicletaListNewTblMotocicleta.getTblMotocicletaList().remove(tblMotocicletaListNewTblMotocicleta);
                        oldProCodigoOfTblMotocicletaListNewTblMotocicleta = em.merge(oldProCodigoOfTblMotocicletaListNewTblMotocicleta);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = tblProveedorMotor.getProCodigo();
                if (findTblProveedorMotor(id) == null) {
                    throw new NonexistentEntityException("The tblProveedorMotor with id " + id + " no longer exists.");
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
            TblProveedorMotor tblProveedorMotor;
            try {
                tblProveedorMotor = em.getReference(TblProveedorMotor.class, id);
                tblProveedorMotor.getProCodigo();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tblProveedorMotor with id " + id + " no longer exists.", enfe);
            }
            List<TblMotocicleta> tblMotocicletaList = tblProveedorMotor.getTblMotocicletaList();
            for (TblMotocicleta tblMotocicletaListTblMotocicleta : tblMotocicletaList) {
                tblMotocicletaListTblMotocicleta.setProCodigo(null);
                tblMotocicletaListTblMotocicleta = em.merge(tblMotocicletaListTblMotocicleta);
            }
            em.remove(tblProveedorMotor);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<TblProveedorMotor> findTblProveedorMotorEntities() {
        return findTblProveedorMotorEntities(true, -1, -1);
    }

    public List<TblProveedorMotor> findTblProveedorMotorEntities(int maxResults, int firstResult) {
        return findTblProveedorMotorEntities(false, maxResults, firstResult);
    }

    private List<TblProveedorMotor> findTblProveedorMotorEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(TblProveedorMotor.class));
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

    public TblProveedorMotor findTblProveedorMotor(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(TblProveedorMotor.class, id);
        } finally {
            em.close();
        }
    }

    public int getTblProveedorMotorCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<TblProveedorMotor> rt = cq.from(TblProveedorMotor.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
