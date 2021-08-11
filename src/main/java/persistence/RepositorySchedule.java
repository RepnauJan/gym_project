package persistence;

import model.Membership;
import model.Schedule;
import util.DBUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class RepositorySchedule {
    private EntityManager em;

    public RepositorySchedule() {
        em = DBUtil.getEntityManager();
    }

    public List<Schedule> listSchedule() {
        return em.createQuery("SELECT * FROM Schedule")
                .getResultList();
    }
}
