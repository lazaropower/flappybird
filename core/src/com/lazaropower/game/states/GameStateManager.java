package com.lazaropower.game.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Stack;

/**
 * Created by Lazaro on 04/02/2017.
 */

public class GameStateManager {
    private Stack<State> states; //stack of states.

    public GameStateManager(){
        states = new Stack<State>();
    }

    public void push(State state){
        states.push(state);
    }

    public void pop(){
        states.pop().dispose();
    }

    public void set(State state){
        states.pop();
        states.push(state);
    }

    public void update(float dt){
        states.peek().update(dt);
    }

    public void render(SpriteBatch sb){
        states.peek().render(sb);
    }
}
