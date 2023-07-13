package modelDTO.outplayer;

import lombok.ToString;

@ToString
public class OutPlayer {

    private final int outPlayerId;
    private final String outPlayerName;
    private final String outPlayerPosition;
    private final String outPlayerCreatedAt;

    public OutPlayer(int outPlayerId, String outPlayerName, String outPlayerPosition, String outPlayerCreatedAt) {
        this.outPlayerId = outPlayerId;
        this.outPlayerName = outPlayerName;
        this.outPlayerPosition = outPlayerPosition;
        this.outPlayerCreatedAt = outPlayerCreatedAt;
    }
}
