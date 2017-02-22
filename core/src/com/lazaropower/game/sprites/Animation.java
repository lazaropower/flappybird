package com.lazaropower.game.sprites;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Array;

/**
 * Created by Lazaro on 04/02/2017.
 */

public class Animation {
    private Array<TextureRegion> frames;
    private float maxFrameTime;
    private float currentFrameTime;
    private int frameCount; //number of frames in an animation
    private int frame; //current frame what we're actually in

    public Animation(TextureRegion region, int frameCount, float cycleTime){
        frames = new Array<TextureRegion>();
        int frameWidth = region.getRegionWidth() / frameCount;
        for(int i = 0; i < frameCount; i++){
            frames.add(new TextureRegion(region, i * frameWidth, 0, frameWidth, region.getRegionHeight()));
        }
        this.frameCount = frameCount;
        maxFrameTime = cycleTime / frameCount;
        frame = 0;
    }


    public void update(float dt) {
        currentFrameTime += dt;
        if (currentFrameTime > maxFrameTime){
            frame++;
            currentFrameTime = 0;
        }
        if (frame >= frameCount)
            frame = 0;
    }

    public TextureRegion getFrame(){
        return frames.get(frame);
    }
}
