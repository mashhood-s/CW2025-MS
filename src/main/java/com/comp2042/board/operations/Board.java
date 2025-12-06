package com.comp2042.board.operations;

import com.comp2042.Score;
import com.comp2042.ViewData;

public interface Board {

    boolean moveBrickDown();

    boolean dropBrick();

    boolean moveBrickLeft();

    boolean moveBrickRight();

    boolean rotateLeftBrick();

    boolean createNewBrick();

    int[][] getBoardMatrix();

    ViewData getViewData();

    void mergeBrickToBackground();

    ClearRow clearRows();

    Score getScore();

    void newGame();
}
