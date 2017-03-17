package spittr.db;

import org.springframework.data.jpa.repository.JpaRepository;
import spittr.domain.Spitter;

import java.util.List;

/**
 * Created by jamesmsw on 17-3-17.
 */
public interface SpitterRepository extends JpaRepository<Spitter,Long>,SpitterSweeper {
    Spitter findByUsername(String username);

    List<Spitter> findByUsernameOrFullNameLike(String username, String fullName);
}
