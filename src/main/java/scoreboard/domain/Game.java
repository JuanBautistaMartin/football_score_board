package scoreboard.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Game {
  private HomeTeam homeTeam;
  private AwayTeam awayTeam;

  @Override
  public String toString() {
    return homeTeam.toString() + " - " + awayTeam.toString();
  }
}
