package spittr.db;

import org.springframework.data.jpa.repository.JpaRepository;
import spittr.domain.Spittle;

import java.util.List;

/**
 * Created by jamesmsw on 17-3-17.
 */
public interface SpittleRepositroy  extends JpaRepository<Spittle,Long>,SpittleRepositoryCustom{
    List<Spittle> findBySpitterId(long spitterId);
}
