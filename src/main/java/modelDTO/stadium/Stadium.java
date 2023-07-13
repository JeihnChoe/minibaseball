package modelDTO.stadium;

import lombok.Builder;
import lombok.ToString;

@ToString
public class Stadium {
    private final int stadiumId;
    private final String stadiumName;
    private final String stadiumCreatedAt;

    @Builder
    public Stadium(int stadiumId, String stadiumName, String stadiumCreatedAt) {
        this.stadiumId = stadiumId;
        this.stadiumName = stadiumName;
        this.stadiumCreatedAt = stadiumCreatedAt;
    }
}
