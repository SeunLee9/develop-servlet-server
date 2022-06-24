package com.beta.mario;

import java.awt.*;

public class Game extends Canvas{
    public static final int WIDTH = 270; //초기 넓이 설정
    public static final int HEIGHT = WIDTH; //초기 높이 설정
    public static final int SCALE = 4;

    public Game() {
        Dimension size = new Dimension(WIDTH,HEIGHT);
        setPreferredSize(size);
        setMaximumSize(size);
        setMinimumSize(size);
    }
}
