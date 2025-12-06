package com.comp2042.game.application;

import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;


public class StartPanel extends BorderPane {

    public StartPanel() {
        final Label StartLabel = new Label("Tetris");
        StartLabel.getStyleClass().add("StartStyle");
        setCenter(StartLabel);
    }

}
