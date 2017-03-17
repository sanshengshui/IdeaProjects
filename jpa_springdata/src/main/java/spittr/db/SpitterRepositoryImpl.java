package spittr.db;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by jamesmsw on 17-3-17.
 */
public class SpitterRepositoryImpl implements SpitterSweeper {
    @PersistenceContext
    private EntityManager em;
    public int eliteSweep() {
        String update="update Spitter spitter \n" +
                "set spitter.status='Elite' \n" +
                "where spitter.status='Newbie' \n" +
                "and spitter.id in ( \n" +
                "select s from Spitter s where ( \n" +
                " select count(spittles) from s.spittles spittles)>10000 \n" +
                ")";
        return em.createQuery(update).executeUpdate();
    }
}
