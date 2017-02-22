package com.lazaropower.game.states;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

/**
 * Created by Lazaro on 04/02/2017.
 */

public abstract class State {
    protected OrthographicCamera cam;
    protected Vector3 mouse;
    protected GameStateManager gsm;

    protected State(GameStateManager gsm){
        cam = new OrthographicCamera();
        this.gsm = gsm;
        mouse = new Vector3();
    }

    protected abstract void handleInput();
    public abstract void update(float dt); //dt = delta time. Difference between one frame rendered in the next frame rendered.
    public abstract void render(SpriteBatch sb); //sb = container for everything that we need to render to the screen.
    public abstract void dispose();
}
