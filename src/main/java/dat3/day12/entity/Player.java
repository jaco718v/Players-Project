package dat3.day12.entity;

import jakarta.persistence.*;

@Entity(name = "football_players")
public class Player {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  int id;
  @Column(name = "player_name", nullable = false)
  String name;

  public Player() {
  }

  public Player(String name) {
    this.name = name;
  }


  public int getId() {
    return id;
  }


  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }
}

