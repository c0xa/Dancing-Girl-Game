package main;

import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public enum Sprite {
    BODY0("0"),
    BODY1("1"),
    BODY2("2"),
    BODY3("3"),
    BODY4("4"),
    BODY5("5"),
    BODY6("6"),
    BODY7("7"),
    BODY8("8"),
    BODY9("9"),
    BODY10("10"),
    BODY11("11"),
    BODY12("12"),
    BODY13("13"),
    BODY14("14"),
    BODY15("15"),
    BODY16("16"),
    BODY17("17"),
    BODY18("18"),
    BODY19("19"),
    CHERRIES("cherries"),
    APPLE("apple");

    private Texture texture;

    private Sprite(String texturename){
        try {
            if (texturename.equals("apple")){
                this.texture = TextureLoader.getTexture("PNG", new FileInputStream(new File("res/" + texturename + ".png")));
            }
            else if (texturename.equals("cherries")) {
                this.texture = TextureLoader.getTexture("PNG", new FileInputStream(new File("res/" + texturename + ".png")));
            }
            else
                this.texture = TextureLoader.getTexture("PNG", new FileInputStream(new File("res/girl/" + texturename + ".png")));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public Texture getTexture(){

        return this.texture;
    }
}