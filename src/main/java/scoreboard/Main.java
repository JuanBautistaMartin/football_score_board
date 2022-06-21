package scoreboard;

import scoreboard.domain.AwayTeam;
import scoreboard.domain.Game;
import scoreboard.domain.HomeTeam;
import scoreboard.impl.ScoreBoardImpl;

public class Main {

  private static final ScoreBoard scoreBoard = new ScoreBoardImpl();

  public static void main(String[] args) {

    Game gameUruguayItaly = Game.builder()
      .homeTeam(HomeTeam.builder().name("Uruguay").build())
      .awayTeam(AwayTeam.builder().name("Italy").build())
      .build();

    // Starting first game
    gameUruguayItaly = scoreBoard.startGame(gameUruguayItaly);
    System.out.println(gameUruguayItaly.toString());
  }

}
