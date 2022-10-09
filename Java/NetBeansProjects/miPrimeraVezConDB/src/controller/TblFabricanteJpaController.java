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
import modelo.TblBicicleta;
import modelo.TblFabricante;

/**
 *
 * @author mateo
 */
public class TblFabricanteJpaController implements Serializable {

    public TblFabricanteJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(TblFabricante tblFabricante) throws PreexistingEntityException, Exception {
        if (tblFabricante.getTblMotocicletaList() == null) {
            tblFabricante.setTblMotocicletaList(new ArrayList<TblMotocicleta>());
        }
        if (tblFabricante.getTblBicicletaList() == null) {
            tblFabricante.setTblBicicletaList(new ArrayList<TblBicicleta>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<TblMotocicleta> attachedTblMotocicletaList = new ArrayList<TblMotocicleta>();
            for (TblMotocicleta tblMotocicletaListTblMotocicletaToAttach : tblFabricante.getTblMotocicletaList()) {
                tblMotocicletaListTblMotocicletaToAttach = em.getReference(tblMotocicletaListTblMotocicletaToAttach.getClass(), tblMotocicletaListTblMotocicletaToAttach.getMotReferencia());
                attachedTblMotocicletaList.add(tblMotocicletaListTblMotocicletaToAttach);
            }
            tblFabricante.setTblMotocicletaList(attachedTblMotocicletaList);
            List<TblBicicleta> attachedTblBicicletaList = new ArrayList<TblBicicleta>();
            for (TblBicicleta tblBicicletaListTblBicicletaToAttach : tblFabricante.getTblBicicletaList()) {
                tblBicicletaListTblBicicletaToAttach = em.getReference(tblBicicletaListTblBicicletaToAttach.getClass(), tblBicicletaListTblBicicletaToAttach.getBicReferencia());
                attachedTblBicicletaList.add(tblBicicletaListTblBicicletaToAttach);
            }
            tblFabricante.setTblBicicletaList(attachedTblBicicletaList);
            em.persist(tblFabricante);
            for (TblMotocicleta tblMotocicletaListTblMotocicleta : tblFabricante.getTblMotocicletaList()) {
                TblFabricante oldFabCodigoOfTblMotocicletaListTblMotocicleta = tblMotocicletaListTblMotocicleta.getFabCodigo();
                tblMotocicletaListTblMotocicleta.setFabCodigo(tblFabricante);
                tblMotocicletaListTblMotocicleta = em.merge(tblMotocicletaListTblMotocicleta);
                if (oldFabCodigoOfTblMotocicletaListTblMotocicleta != null) {
                    oldFabCodigoOfTblMotocicletaListTblMotocicleta.getTblMotocicletaList().remove(tblMotocicletaListTblMotocicleta);
                    oldFabCodigoOfTblMotocicletaListTblMotocicleta = em.merge(oldFabCodigoOfTblMotocicletaListTblMotocicleta);
                }
            }
            for (TblBicicleta tblBicicletaListTblBicicleta : tblFabricante.getTblBicicletaList()) {
                TblFabricante oldFabCodigoOfTblBicicletaListTblBicicleta = tblBicicletaListTblBicicleta.getFabCodigo();
                tblBicicletaListTblBicicleta.setFabCodigo(tblFabricante);
                tblBicicletaListTblBicicleta = em.merge(tblBicicletaListTblBicicleta);
                if (oldFabCodigoOfTblBicicletaListTblBicicleta != null) {
                    oldFabCodigoOfTblBicicletaListTblBicicleta.getTblBicicletaList().remove(tblBicicletaListTblBicicleta);
                    oldFabCodigoOfTblBicicletaListTblBicicleta = em.merge(oldFabCodigoOfTblBicicletaListTblBicicleta);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findTblFabricante(tblFabricante.getFabCodigo()) != null) {
                throw new PreexistingEntityException("TblFabricante " + tblFabricante + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(TblFabricante tblFabricante) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            TblFabricante persistentTblFabricante = em.find(TblFabricante.class, tblFabricante.getFabCodigo());
            List<TblMotocicleta> tblMotocicletaListOld = persistentTblFabricante.getTblMotocicletaList();
            List<TblMotocicleta> tblMotocicletaListNew = tblFabricante.getTblMotocicletaList();
            List<TblBicicleta> tblBicicletaListOld = persistentTblFabricante.getTblBicicletaList();
            List<TblBicicleta> tblBicicletaListNew = tblFabricante.getTblBicicletaList();
            List<TblMotocicleta> attachedTblMotocicletaListNew = new ArrayList<TblMotocicleta>();
            for (TblMotocicleta tblMotocicletaListNewTblMotocicletaToAttach : tblMotocicletaListNew) {
                tblMotocicletaListNewTblMotocicletaToAttach = em.getReference(tblMotocicletaListNewTblMotocicletaToAttach.getClass(), tblMotocicletaListNewTblMotocicletaToAttach.getMotReferencia());
                attachedTblMotocicletaListNew.add(tblMotocicletaListNewTblMotocicletaToAttach);
            }
            tblMotocicletaListNew = attachedTblMotocicletaListNew;
            tblFabricante.setTblMotocicletaList(tblMotocicletaListNew);
            List<TblBicicleta> attachedTblBicicletaListNew = new ArrayList<TblBicicleta>();
            for (TblBicicleta tblBicicletaListNewTblBicicletaToAttach : tblBicicletaListNew) {
                tblBicicletaListNewTblBicicletaToAttach = em.getReference(tblBicicletaListNewTblBicicletaToAttach.getClass(), tblBicicletaListNewTblBicicletaToAttach.getBicReferencia());
                attachedTblBicicletaListNew.add(tblBicicletaListNewTblBicicletaToAttach);
            }
            tblBicicletaListNew = attachedTblBicicletaListNew;
            tblFabricante.setTblBicicletaList(tblBicicletaListNew);
            tblFabricante = em.merge(tblFabricante);
            for (TblMotocicleta tblMotocicletaListOldTblMotocicleta : tblMotocicletaListOld) {
                if (!tblMotocicletaListNew.contains(tblMotocicletaListOldTblMotocicleta)) {
                    tblMotocicletaListOldTblMotocicleta.setFabCodigo(null);
                    tblMotocicletaListOldTblMotocicleta = em.merge(tblMotocicletaListOldTblMotocicleta);
                }
            }
            for (TblMotocicleta tblMotocicletaListNewTblMotocicleta : tblMotocicletaListNew) {
                if (!tblMotocicletaListOld.contains(tblMotocicletaListNewTblMotocicleta)) {
                    TblFabricante oldFabCodigoOfTblMotocicletaListNewTblMotocicleta = tblMotocicletaListNewTblMotocicleta.getFabCodigo();
                    tblMotocicletaListNewTblMotocicleta.setFabCodigo(tblFabricante);
                    tblMotocicletaListNewTblMotocicleta = em.merge(tblMotocicletaListNewTblMotocicleta);
                    if (oldFabCodigoOfTblMotocicletaListNewTblMotocicleta != null && !oldFabCodigoOfTblMotocicletaListNewTblMotocicleta.equals(tblFabricante)) {
                        oldFabCodigoOfTblMotocicletaListNewTblMotocicleta.getTblMotocicletaList().remove(tblMotocicletaListNewTblMotocicleta);
                        oldFabCodigoOfTblMotocicletaListNewTblMotocicleta = em.merge(oldFabCodigoOfTblMotocicletaListNewTblMotocicleta);
                    }
                }
            }
            for (TblBicicleta tblBicicletaListOldTblBicicleta : tblBicicletaListOld) {
                if (!tblBicicletaListNew.contains(tblBicicletaListOldTblBicicleta)) {
                    tblBicicletaListOldTblBicicleta.setFabCodigo(null);
                    tblBicicletaListOldTblBicicleta = em.merge(tblBicicletaListOldTblBicicleta);
                }
            }
            for (TblBicicleta tblBicicletaListNewTblBicicleta : tblBicicletaListNew) {
                if (!tblBicicletaListOld.contains(tblBicicletaListNewTblBicicleta)) {
                    TblFabricante oldFabCodigoOfTblBicicletaListNewTblBicicleta = tblBicicletaListNewTblBicicleta.getFabCodigo();
                    tblBicicletaListNewTblBicicleta.setFabCodigo(tblFabricante);
                    tblBicicletaListNewTblBicicleta = em.merge(tblBicicletaListNewTblBicicleta);
                    if (oldFabCodigoOfTblBicicletaListNewTblBicicleta != null && !oldFabCodigoOfTblBicicletaListNewTblBicicleta.equals(tblFabricante)) {
                        oldFabCodigoOfTblBicicletaListNewTblBicicleta.getTblBicicletaList().remove(tblBicicletaListNewTblBicicleta);
                        oldFabCodigoOfTblBicicletaListNewTblBicicleta = em.merge(oldFabCodigoOfTblBicicletaListNewTblBicicleta);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = tblFabricante.getFabCodigo();
                if (findTblFabricante(id) == null) {
                    throw new NonexistentEntityException("The tblFabricante with id " + id + " no longer exists.");
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
            TblFabricante tblFabricante;
            try {
                tblFabricante = em.getReference(TblFabricante.class, id);
                tblFabricante.getFabCodigo();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tblFabricante with id " + id + " no longer exists.", enfe);
            }
            List<TblMotocicleta> tblMotocicletaList = tblFabricante.getTblMotocicletaList();
            for (TblMotocicleta tblMotocicletaListTblMotocicleta : tblMotocicletaList) {
                tblMotocicletaListTblMotocicleta.setFabCodigo(null);
                tblMotocicletaListTblMotocicleta = em.merge(tblMotocicletaListTblMotocicleta);
            }
            List<TblBicicleta> tblBicicletaList = tblFabricante.getTblBicicletaList();
            for (TblBicicleta tblBicicletaListTblBicicleta : tblBicicletaList) {
                tblBicicletaListTblBicicleta.setFabCodigo(null);
                tblBicicletaListTblBicicleta = em.merge(tblBicicletaListTblBicicleta);
            }
            em.remove(tblFabricante);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<TblFabricante> findTblFabricanteEntities() {
        return findTblFabricanteEntities(true, -1, -1);
    }

    public List<TblFabricante> findTblFabricanteEntities(int maxResults, int firstResult) {
        return findTblFabricanteEntities(false, maxResults, firstResult);
    }

    private List<TblFabricante> findTblFabricanteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(TblFabricante.class));
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

    public TblFabricante findTblFabricante(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(TblFabricante.class, id);
        } finally {
            em.close();
        }
    }

    public int getTblFabricanteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<TblFabricante> rt = cq.from(TblFabricante.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
