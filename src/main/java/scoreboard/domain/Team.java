package scoreboard.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@SuperBuilder
public class Team {
  private String name;
  private int score;

  @Override
  public String toString() {
    return name + " " + score;
  }
}
