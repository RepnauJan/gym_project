package persistence;

import model.Gym;
import util.DBUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class RepositoryGym {

    private EntityManager em;

    public RepositoryGym() {
        em = DBUtil.getEntityManager();
    }

    public List<Gym> listAllGyms() {
        return em.createQuery("SELECT count(m) FROM Restaurant m")
                .getResultList();
    }

    public Gym findGymById(int id) {
        return em.find(Gym.class, id);
    }
}
