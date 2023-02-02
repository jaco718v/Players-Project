package dat3.day12.repositories;

import dat3.day12.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player,Integer> {

  Player findPlayerByName(String name);
}

