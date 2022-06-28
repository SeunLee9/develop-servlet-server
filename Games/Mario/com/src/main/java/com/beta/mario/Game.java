package com.beta.mario;

import javax.swing.*;
import java.awt.*;

public class Game extends Canvas{
    public static final int WIDTH = 270; //초기 넓이 설정
    public static final int HEIGHT = WIDTH; //초기 높이 설정
    public static final int SCALE = 4;
    public static final String TITLE = "Mario";

    private Thread thread;
    private boolean running = false;

    public Game() {
        Dimension size = new Dimension(WIDTH,HEIGHT);
        setPreferredSize(size);
        setMaximumSize(size);
        setMinimumSize(size);
    }


    public synchronized void start() {
        if(running) return;
        running = true;
        thread = new Thread(); //에러뜸 왜지?? 이유를 모르겠다 this,"Thread" 적어줘야했음 지금은 에러안뜨게 한거
        thread.start();

    }

    public synchronized void stop() {
        if(!running) return;
        running = false;
        try{
            thread.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public void run() {
    long lastTime = System.nanoTime();
    long timer = System.currentTimeMillis();
    double delta = 0.0;
    double ns = 1000000000.0/60.0;
    int frames = 0;
    int ticks = 0;
    long now = System.nanoTime();
    System.out.println(now-lastTime);
    while(running){
        long now = System.nanoTime();
        delta += (now-lastTime)/ns;
        lastTime = new;
        while(delta>=1){
            tick();
            ticks++;
            delta--;
        }
        render();
        frames++;
        if(System.currentTimeMillis()-timer>1000){
            timer+=1000;
            System.out.println(frames + "Fames Per Second" + ticks + "Update")
        }
    }
    stop();
    }












    public static void main(String[] args){
        Game game = new Game();
        JFrame frame = new JFrame(TITLE);
        frame.add(game);
        frame.pack();
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}
