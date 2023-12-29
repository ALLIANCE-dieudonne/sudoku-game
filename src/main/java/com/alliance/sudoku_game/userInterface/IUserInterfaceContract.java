package com.alliance.sudoku_game.userInterface;

import com.alliance.sudoku_game.problemDomain.SudokuGame;

public interface IUserInterfaceContract {
  interface EventListener {
    void onSudokuInput(int x, int y, int input);

    void onDialogClick();
  }

  interface View {
    void setListener(IUserInterfaceContract.EventListener listener);

    void updateSquare(int x, int y, int input);

    void updateBoard(SudokuGame sudokuGame);

    void showDialog(String message);

    void showError(String message);
  }
}
