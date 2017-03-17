package spittr.db;

import spittr.domain.Spittle;

import java.util.List;

/**
 * Created by jamesmsw on 17-3-17.
 */
public interface SpittleRepositoryCustom {
    List<Spittle> findRecent();
    List<Spittle> findRecent(int count);
}
