package com.alliance.sudoku_game;

import com.alliance.sudoku_game.buildLogic.SudokuBuildLogic;
import com.alliance.sudoku_game.userInterface.IUserInterfaceContract;
import com.alliance.sudoku_game.userInterface.UserInterfaceImpl;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class SudokuApplication extends Application {
  private IUserInterfaceContract.View uiImpl;

  @Override
  public void start(Stage stage) throws IOException {
    uiImpl = new UserInterfaceImpl(stage);
    try {
      SudokuBuildLogic.build(uiImpl);
    } catch (IOException e) {
      e.printStackTrace();
      throw e;
    }

  }

  public static void main(String[] args) {
    launch(args);
  }
}
