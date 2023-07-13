package modelDTO.player;

import lombok.ToString;

@ToString
public class Player {
    private final int playerID;
    private final String playerName;
    private final String playerPosition;
    private final String playerCreatedAt;

    public Player(int playerID, String playerName, String playerPosition, String playerCreatedAt) {
        this.playerID = playerID;
        this.playerName = playerName;
        this.playerPosition = playerPosition;
        this.playerCreatedAt = playerCreatedAt;

    }
}
