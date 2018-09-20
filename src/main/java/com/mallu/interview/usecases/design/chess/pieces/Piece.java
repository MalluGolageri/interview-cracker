package com.mallu.interview.usecases.design.chess.pieces;

import com.mallu.interview.usecases.design.chess.game.PiecesEnum;

public interface Piece {

    public PiecesEnum getType();

    public boolean isValidMove(int x, int y);

    public int[][] drawPath(int startX, int startY, int finalX, int finalY);
}
