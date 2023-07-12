package modelDTO.player;

public class PlayerModel {
    private final int playerID;
    private final String playerName;
    private final String playerPosition;
    private final String playerCreatedAt;

    public PlayerModel(int playerID, String playerName, String playerPosition, String playerCreatedAt) {
        this.playerID = playerID;
        this.playerName = playerName;
        this.playerPosition = playerPosition;
        this.playerCreatedAt = playerCreatedAt;

    }
}
