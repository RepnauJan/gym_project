package persistence;

import util.DBUtil;

import javax.persistence.EntityManager;
import javax.swing.text.html.parser.Entity;
import java.util.List;

public class RepositoryEvaluation {

    private EntityManager em;

    public RepositoryEvaluation() {
        em = DBUtil.getEntityManager();
    }

    public List<Object[]> maxAndMinMemberEvaluation() {
        String sql = "SELECT member_id, score, comment " +
                "FROM evaluation " +
                "WHERE score = (SELECT MIN(score) FROM evaluation)" +
                "UNION ALL " +
                "SELECT member_id, score, comment " +
                "FROM evaluation " +
                "WHERE score = (SELECT MAX(score) FROM evaluation)";
        return em.createQuery(sql).getResultList();
    }
}
