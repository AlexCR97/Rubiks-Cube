package org.yourorghere.polygons;

import com.sun.javafx.util.Utils;

public class RubixCube {
    
    // Front layer
    private final Cube cubeFront1 = new Cube(new Point3d(-1, 1, 1), true);
    private final Cube cubeFront2 = new Cube(new Point3d(0, 1, 1), true);
    private final Cube cubeFront3 = new Cube(new Point3d(1, 1, 1), true);
    private final Cube cubeFront4 = new Cube(new Point3d(-1, 0, 1), true);
    private final Cube cubeFront5 = new Cube(new Point3d(0, 0, 1), true);
    private final Cube cubeFront6 = new Cube(new Point3d(1, 0, 1), true);
    private final Cube cubeFront7 = new Cube(new Point3d(-1, -1, 1), true);
    private final Cube cubeFront8 = new Cube(new Point3d(0, -1, 1), true);
    private final Cube cubeFront9 = new Cube(new Point3d(1, -1, 1), true);
    
    // Middle layer
    private final Cube cubeMiddle1 = new Cube(new Point3d(-1, 1, 0), true);
    private final Cube cubeMiddle2 = new Cube(new Point3d(0, 1, 0), true);
    private final Cube cubeMiddle3 = new Cube(new Point3d(1, 1, 0), true);
    private final Cube cubeMiddle4 = new Cube(new Point3d(-1, 0, 0), true);
    private final Cube cubeMiddle5 = new Cube(new Point3d(0, 0, 0), true);
    private final Cube cubeMiddle6 = new Cube(new Point3d(1, 0, 0), true);
    private final Cube cubeMiddle7 = new Cube(new Point3d(-1, -1, 0), true);
    private final Cube cubeMiddle8 = new Cube(new Point3d(0, -1, 0), true);
    private final Cube cubeMiddle9 = new Cube(new Point3d(1, -1, 0), true);
    
    // Back layer
    private final Cube cubeBack1 = new Cube(new Point3d(-1, 1, -1), true);
    private final Cube cubeBack2 = new Cube(new Point3d(0, 1, -1), true);
    private final Cube cubeBack3 = new Cube(new Point3d(1, 1, -1), true);
    private final Cube cubeBack4 = new Cube(new Point3d(-1, 0, -1), true);
    private final Cube cubeBack5 = new Cube(new Point3d(0, 0, -1), true);
    private final Cube cubeBack6 = new Cube(new Point3d(1, 0, -1), true);
    private final Cube cubeBack7 = new Cube(new Point3d(-1, -1, -1), true);
    private final Cube cubeBack8 = new Cube(new Point3d(0, -1, -1), true);
    private final Cube cubeBack9 = new Cube(new Point3d(1, -1, -1), true);
    
    public Cube[] front = {
        cubeFront1, cubeFront2, cubeFront3,
        cubeFront4, cubeFront5, cubeFront6,
        cubeFront7, cubeFront8, cubeFront9,
    };
    
    public Cube[] back = {
        cubeBack1, cubeBack2, cubeBack3,
        cubeBack4, cubeBack5, cubeBack6,
        cubeBack7, cubeBack8, cubeBack9,
    };
    
    public Cube[] left = {
        cubeBack1, cubeMiddle1, cubeFront1,
        cubeBack4, cubeMiddle4, cubeFront4,
        cubeBack7, cubeMiddle7, cubeFront7,
    };
    
    public Cube[] right = {
        cubeFront3, cubeMiddle3, cubeBack3,
        cubeFront6, cubeMiddle6, cubeBack6,
        cubeFront9, cubeMiddle9, cubeBack9,
    };
    
    public Cube[] top = {
        cubeFront1, cubeFront2, cubeFront3,
        cubeMiddle1, cubeMiddle2, cubeMiddle3,
        cubeBack1, cubeBack2, cubeBack3,
    };
    
    public Cube[] bottom = {
        cubeFront7, cubeFront8, cubeFront9,
        cubeMiddle7, cubeMiddle8, cubeMiddle9,
        cubeBack7, cubeBack8, cubeBack9,
    };
    
    public RubixCube() {
        
    }
    
    public void setRotationFront(float angle) {
        for (Cube c : front)
            c.rotation.z = angle;
    }
    
    public void setRotationBack(float angle) {
        for (Cube c : back)
            c.rotation.z = angle;
    }
    
    public void setRotationLeft(float angle) {
        for (Cube c : left)
            c.rotation.x = angle;
    }
    
    public void setRotationRight(float angle) {
        for (Cube c : right)
            c.rotation.x = angle;
    }
    
    public void setRotationTop(float angle) {
        for (Cube c : top)
            c.rotation.y = angle;
    }
    
    public void setRotationBottom(float angle) {
        for (Cube c : bottom)
            c.rotation.y = angle;
    }
    
    public void rotateFront(float angle) {
        for (Cube c : front)
            c.rotation.z = Utils.clamp(c.rotation.z + angle, -360, 360);
    }
    
    public void rotateBack(float angle) {
        for (Cube c : back)
            c.rotation.z = Utils.clamp(c.rotation.z + angle, -360, 360);
    }
    
    public void rotateLeft(float angle) {
        for (Cube c : left)
            c.rotation.x = Utils.clamp(c.rotation.x + angle, -360, 360);
    }
    
    public void rotateRight(float angle) {
        for (Cube c : right)
            c.rotation.x = Utils.clamp(c.rotation.x + angle, -360, 360);
    }
    
    public void rotateTop(float angle) {
        for (Cube c : top) {
            c.rotation.y = Utils.clamp(c.rotation.y + angle, -360, 360);
        }
    }
    
    public void rotateBottom(float angle) {
        for (Cube c : bottom) {
            c.rotation.y = Utils.clamp(c.rotation.y + angle, -360, 360);
        }
    }
    
}
