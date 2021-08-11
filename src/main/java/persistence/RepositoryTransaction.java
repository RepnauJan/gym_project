package persistence;

import model.Membership;
import util.DBUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class RepositoryTransaction {

    private EntityManager em;

    public RepositoryTransaction() {
        em = DBUtil.getEntityManager();
    }

    public List<Membership> listAllTransactions() {
        return em.createQuery("SELECT * FROM Transaction")
                .getResultList();
    }
}