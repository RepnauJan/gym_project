package persistence;

import model.Membership;
import util.DBUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class RepositoryTrainer {

    private EntityManager em;

    public RepositoryTrainer() {
        em = DBUtil.getEntityManager();
    }

    public List<Membership> listAllTrainers() {
        return em.createQuery("SELECT * FROM Trainer")
                .getResultList();
    }
}
