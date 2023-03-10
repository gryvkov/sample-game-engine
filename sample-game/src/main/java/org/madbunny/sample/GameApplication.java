package org.madbunny.sample;

import org.madbunny.vsrat2d.api.*;

public class GameApplication {
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;
    private static final String WINDOW_TITLE = "Sample Game";

    public static void main(String[] args) {
        var game = new GameCore(WINDOW_WIDTH, WINDOW_HEIGHT);
        new Application()
                .setWindowWidth(WINDOW_WIDTH)
                .setWindowHeight(WINDOW_HEIGHT)
                .setWindowTitle(WINDOW_TITLE)
                .setInitializer(game::initialize)
                .run(game::update);
        System.exit(0);
    }
}
