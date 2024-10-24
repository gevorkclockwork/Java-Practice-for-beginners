package day17;

public enum ChessPiece {
    PAWN_WHITE("♙", 1),
    KNIGHT_WHITE("♘", 3),
    BISHOP_WHITE("♗", 3.5),
    ROOK_WHITE("♖", 5),
    QUEEN_WHITE("♕", 9),
    KING_WHITE("♔", 100),
    PAWN_BLACK("♟", 1),
    KNIGHT_BLACK("♞", 3),
    BISHOP_BLACK("♝", 3.5),
    ROOK_BLACK("♜", 5),
    QUEEN_BLACK("♛", 9),
    KING_BLACK("♚", 100),
    EMPTY("_", -1);

    private String figureDesignation;
    private double figureValue;

    ChessPiece(String figureDesignation, double figureValue) {
        this.figureDesignation = figureDesignation;
        this.figureValue = figureValue;
    }

    public String getFigureDesignation() {
        return figureDesignation;
    }


}
