package scoreboard.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import scoreboard.enums.TeamType;

@Getter
@Setter
@SuperBuilder
public class AwayTeam extends Team {

  private static final TeamType TYPE = TeamType.AWAY;

}
