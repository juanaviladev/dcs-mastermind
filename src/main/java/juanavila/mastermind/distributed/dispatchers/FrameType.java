package juanavila.mastermind.distributed.dispatchers;

public enum FrameType {
    START,
    STATE,
    UNDO,
    REDO,
    UNDOABLE,
    REDOABLE,
    CLOSE,
    NEW_GAME,
    IS_FINISHED,
	PROPOSAL,
	ATTEMPTS,
	GET_PROPOSED_COMBINATION,
	GET_RESULT,
    IS_WINNER,
    IS_LOOSER;

    public static FrameType parser(String string) {
        for (FrameType frameType : FrameType.values()) {
            if (frameType.name().equals(string)) {
                return frameType;
            }
        }
        return null;
    }
}
