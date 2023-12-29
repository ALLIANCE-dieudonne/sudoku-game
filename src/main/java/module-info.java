module com.alliance.sudoku_game {
  requires javafx.controls;
  requires javafx.fxml;

  requires org.kordamp.bootstrapfx.core;

  opens com.alliance.sudoku_game to javafx.fxml;
  exports com.alliance.sudoku_game;
}
