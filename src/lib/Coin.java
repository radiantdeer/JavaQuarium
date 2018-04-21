package lib;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Coin extends AqObject {
    private int value;
    private static final int COIN_SPEED = 75;
    private static final int THIRTY = 30;
    private static final int THIRTY_TWO = 32;
    private static final int TWENTY_SIX = 26;
    private Image coinSprite;

    public Coin() {
        super(0, 0, COIN_SPEED, THIRTY, THIRTY);
        setValue(0);
        loadSprite();
    }

    public Coin(final double x, final double y, final int val) {
        super(x, y, COIN_SPEED, THIRTY, THIRTY);
        setValue(val);
        if (val >= 100) {
        	setWidth(THIRTY_TWO);
        	setHeight(TWENTY_SIX);
        }
        loadSprite();
    }

    private void loadSprite() {
    	if (value >= 100) {
    		coinSprite = (new ImageIcon("./bin/assets/Diamond.png")).getImage();
    	}
    	else {
    		coinSprite = (new ImageIcon("./bin/assets/Coin.png")).getImage();
    	}
    }

    //Getter & Setter
    public int getValue() {
        return this.value;
    }

    public void setValue(final int val) {
        this.value = val;
    }

    // Coin movement
    public void move(final double timePassed) {
        setY(getY() + (COIN_SPEED * timePassed));
        updateHitBox();
    }

    public void timeHasPassed(final double dtime) {
        move(dtime);
    }

    // Call this if coin is collected
    public void collected() {
        setIsAlive(false);
    }

    public Image draw() {
        return coinSprite;
    }
}
