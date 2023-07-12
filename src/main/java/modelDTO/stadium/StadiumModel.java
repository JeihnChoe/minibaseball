package modelDTO.stadium;

import lombok.Builder;

public class StadiumModel {
    private final int stadiumId;
    private final String stadiumName;
    private final String stadiumCreatedAt;

    @Builder
    public StadiumModel(int stadiumId, String stadiumName, String stadiumCreatedAt) {
        this.stadiumId = stadiumId;
        this.stadiumName = stadiumName;
        this.stadiumCreatedAt = stadiumCreatedAt;
    }
}
