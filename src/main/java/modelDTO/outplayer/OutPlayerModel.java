package modelDTO.outplayer;

public class OutPlayerModel {

    private final int outPlayerId;
    private final String outPlayerName;
    private final String outPlayerPosition;
    private final String outPlayerCreatedAt;

    public OutPlayerModel(int outPlayerId, String outPlayerName, String outPlayerPosition, String outPlayerCreatedAt) {
        this.outPlayerId = outPlayerId;
        this.outPlayerName = outPlayerName;
        this.outPlayerPosition = outPlayerPosition;
        this.outPlayerCreatedAt = outPlayerCreatedAt;
    }
}
