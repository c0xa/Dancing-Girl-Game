package main;

import static main.Constants.CELL_SIZE;

public class Cell {

    private int x;
    private int y;
    private int state;/* 0 -> ячейка пуста
                        >0 -> в ячейке тело девушки
                        <0 -> Что-то необычное:
                            -1: Ягоды
                            -2: Ягоды
                        */

    ///Конструктор просто выставляет начальные значения координат и состояния
    public Cell(int x, int y, int state) {
        this.x = x;
        this.y = y;
        this.state = state;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHeight() {
        return CELL_SIZE;
    }

    public int getWidth() {
        return CELL_SIZE;
    }

    public int getState() {
        return this.state;
    }

    public void setState(int state) {
        this.state = state;
    }

    ///Метод обновления клетки. Уменьшаем время "горения", если это необходимо
    public void update(boolean have_to_decrease) {
        if (have_to_decrease && this.state > 0) {
                this.state--;
        }
    }

    ///Ячейка "думает" как она должна выглядеть
    public Sprite getSprite() {
        if (this.state > 0) {
            switch (Main.view){
                case 0:
                    return Sprite.BODY0;
                case 1:
                    return Sprite.BODY1;
                case 2:
                    return Sprite.BODY2;
                case 3:
                    return Sprite.BODY3;
                case 4:
                    return Sprite.BODY4;
                case 5:
                    return Sprite.BODY5;
                case 6:
                    return Sprite.BODY6;
                case 7:
                    return Sprite.BODY7;
                case 8:
                    return Sprite.BODY8;
                case 9:
                    return Sprite.BODY9;
                case 10:
                    return Sprite.BODY10;
                case 11:
                    return Sprite.BODY11;
                case 12:
                    return Sprite.BODY12;
                case 13:
                    return Sprite.BODY13;
                case 14:
                    return Sprite.BODY14;
                case 15:
                    return Sprite.BODY15;
                case 16:
                    return Sprite.BODY16;
                case 17:
                    return Sprite.BODY17;
                case 18:
                    return Sprite.BODY18;
                case 19:
                    return Sprite.BODY19;
            }
            return Sprite.BODY19;
        } else if (this.state == 0) {
            return null;
        } else {
            if (this.state == -1)
                return Sprite.APPLE;
            return Sprite.CHERRIES;
        }
    }
}