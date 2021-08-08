package persistence;

import model.Members;
import util.DBUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class RepositoryMembers {

    private EntityManager em;

    public  RepositoryMembers() {
        em = DBUtil.getEntityManager();
    }

    @SuppressWarnings("unchecked")
    public List<Members> listAllMembers() {
        return  em.createQuery("SELECT f from Members as f order by f.firstname asc")
                .getResultList();
    }

    public Members findMemberById(int id) {
        return em.find(Members.class, id);
    }
}
