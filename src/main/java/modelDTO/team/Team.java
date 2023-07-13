package modelDTO.team;

import lombok.Builder;
import lombok.ToString;

@ToString
public class Team {
    private final int teamId;
    private final String teamName;
    private final String teamCreatedAt;

    @Builder
    public Team(int teamId, String teamName, String teamCreatedAt) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.teamCreatedAt = teamCreatedAt;
    }
}
