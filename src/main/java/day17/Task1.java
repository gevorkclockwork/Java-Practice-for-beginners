package day17;

import java.util.Arrays;

import static day17.ChessPiece.PAWN_WHITE;
import static day17.ChessPiece.ROOK_BLACK;

public class Task1 {
    public static void main(String[] args) {

        ChessPiece[] chessPieces = {PAWN_WHITE,PAWN_WHITE,PAWN_WHITE,PAWN_WHITE, ROOK_BLACK,ROOK_BLACK,ROOK_BLACK,ROOK_BLACK};

//        for (int i = 0; i < 4; i++) {
//            chessPieces[i] = PAWN_WHITE;
//        }
//
//        for (int i = 4; i < 8; i++) {
//            chessPieces[i] = ROOK_BLACK;
//        }

        for (ChessPiece chessPiece : chessPieces) {
            System.out.print(chessPiece.getFigureDesignation() + " ");
        }




    }
}