package com.mallu.interview.usecases.design.chess;

import com.mallu.interview.usecases.design.chess.game.PiecesEnum;
import com.mallu.interview.usecases.design.chess.pieces.Piece;

public class Pawn implements Piece {
    @Override
    public PiecesEnum getType() {
        return null;
    }

    @Override
    public boolean isValidMove(int x, int y) {
        return false;
    }

    @Override
    public int[][] drawPath(int startX, int startY, int finalX, int finalY) {
        return new int[0][];
    }
}
