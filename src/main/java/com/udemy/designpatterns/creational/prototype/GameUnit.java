package com.udemy.designpatterns.creational.prototype;

import javafx.geometry.Point3D;
import lombok.Getter;

@Getter
public abstract class GameUnit implements Cloneable {

    private Point3D position;

    public GameUnit() {
        this.position = Point3D.ZERO;
    }

    public GameUnit(float x, float y, float z) {
        position = new Point3D(x, y, z);
    }

    public void move(Point3D direction, float distance) {
        Point3D finalMove = direction.normalize();
        finalMove = finalMove.multiply(distance);
        position = position.add(finalMove);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        GameUnit gameUnit = (GameUnit) super.clone();
        gameUnit.initialize();
        return gameUnit;
    }

    protected void initialize() {
        this.position = Point3D.ZERO;
        reset();
    }

    protected abstract void reset();
}