package com.alliance.sudoku_game.buildLogic;

import com.alliance.sudoku_game.computationLogic.GameLogic;
import com.alliance.sudoku_game.persistance.LocalStorageImpl;
import com.alliance.sudoku_game.problemDomain.IStorage;
import com.alliance.sudoku_game.problemDomain.SudokuGame;
import com.alliance.sudoku_game.userInterface.IUserInterfaceContract;
import com.alliance.sudoku_game.userInterface.logic.ControlLogic;

import java.io.IOException;

public class SudokuBuildLogic {
  public static void build(IUserInterfaceContract.View userInterface) throws IOException {
    SudokuGame initialState;
    IStorage storage = new LocalStorageImpl();

    try {
      initialState = storage.getGameData();
    } catch (IOException e) {
      initialState = GameLogic.getNewGame();
      storage.updateGameData(initialState);
    }

    IUserInterfaceContract.EventListener uiLogic = new ControlLogic(storage, userInterface);

    userInterface.setListener(uiLogic);
    userInterface.updateBoard(initialState);
  }
}
