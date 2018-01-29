package de.android.ayrathairullin.states;


import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import de.android.ayrathairullin.FlappyDemo;

public class MenuState extends State{
    private Texture background;
    private Texture playBtn;

    public MenuState(GameStateManager gsm) {
        super(gsm);
        background = new Texture("bg.png");
        playBtn = new Texture("playbtn.png");
    }

    @Override
    protected void handleInput() {

    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(background, 0, 0, FlappyDemo.WIDTH, FlappyDemo.HEIGHT);
        sb.draw(playBtn, FlappyDemo.WIDTH / 2 - playBtn.getWidth() / 2,
                FlappyDemo.HEIGHT / 2 - playBtn.getHeight() / 2);
        sb.end();
    }

    @Override
    public void dispose() {
        background.dispose();
        playBtn.dispose();
    }
}