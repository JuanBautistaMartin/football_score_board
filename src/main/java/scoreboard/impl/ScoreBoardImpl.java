package scoreboard.impl;

import exception.GameValidationException;
import scoreboard.ScoreBoard;
import scoreboard.domain.Game;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ScoreBoardImpl implements ScoreBoard {

  private static final int INITIAL_SCORE = 0;
  private final Set<Game> inMemoryStore = new HashSet<>();

  @Override
  public Game startGame(Game game) {
    Objects.requireNonNull(game, "Game cannot be null!");

    this.validateGameTeams(game);

    game.getHomeTeam().setScore(INITIAL_SCORE);
    game.getAwayTeam().setScore(INITIAL_SCORE);

    inMemoryStore.add(game);

    return game;
  }

  private void validateGameTeams(Game game) {
    if(game.getHomeTeam() == null || game.getAwayTeam() == null) {
      throw new GameValidationException("Game teams cannot be null!");
    } else if(game.getHomeTeam().getName().isBlank() || game.getAwayTeam().getName().isBlank()) {
      throw new GameValidationException("Team names cannot be null!");
    }
  }

  private void setInitialScoreToGame(Game game) {
    game.getHomeTeam().setScore(INITIAL_SCORE);
    game.getAwayTeam().setScore(INITIAL_SCORE);
  }

}
