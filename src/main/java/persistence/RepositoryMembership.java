package persistence;

import model.Membership;
import util.DBUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class RepositoryMembership {

    private EntityManager em;

    public RepositoryMembership() {
        em = DBUtil.getEntityManager();
    }

    public List<Membership> listAllAvailableMemberships() {
        return em.createQuery("SELECT count(r) FROM Membership r")
                .getResultList();
    }


}
