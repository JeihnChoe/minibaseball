package modelDTO.team;

import lombok.Builder;

public class TeamModel {
    private final int teamId;
    private final String teamName;
    private final String teamCreatedAt;

    @Builder
    public TeamModel(int teamId, String teamName, String teamCreatedAt) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.teamCreatedAt = teamCreatedAt;
    }
}
