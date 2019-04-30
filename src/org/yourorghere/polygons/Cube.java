package org.yourorghere.polygons;

import com.sun.opengl.util.texture.Texture;

public class Cube {
    
    public float spacing = 2.0f;
    public Point3d position;
    
    public Point3d colorFront = new Point3d(1, 0, 0);
    public Point3d colorBack = new Point3d(0, 1, 0);
    public Point3d colorLeft = new Point3d(0, 0, 1);
    public Point3d colorRight = new Point3d(1, 1, 0);
    public Point3d colorTop = new Point3d(1, 0, 1);
    public Point3d colorBottom = new Point3d(0, 1, 1);
    
    public Texture textureFront;
    public Texture textureBack;
    public Texture textureLeft;
    public Texture textureRight;
    public Texture textureTop;
    public Texture textureBottom;
    
    public final Point3d[] verticesFront = {
        new Point3d(1, -1, 1),
        new Point3d(1, 1, 1),
        new Point3d(-1, 1, 1),
        new Point3d(-1, -1, 1),
    };
    
    public final Point3d[] verticesBack = {
        new Point3d(1, -1, -1),
        new Point3d(1, 1, -1),
        new Point3d(-1, 1, -1),
        new Point3d(-1, -1, -1),
    };
    
    public final Point3d[] verticesLeft = {
        new Point3d(-1, -1, 1),
        new Point3d(-1, 1, 1),
        new Point3d(-1, 1, -1),
        new Point3d(-1, -1, -1),
    };
    
    public final Point3d[] verticesRight = {
        new Point3d(1, -1, 1),
        new Point3d(1, 1, 1),
        new Point3d(1, 1, -1),
        new Point3d(1, -1, -1),
    };
    
    public final Point3d[] verticesTop = {
        new Point3d(1, 1, -1),
        new Point3d(1, 1, 1),
        new Point3d(-1, 1, 1),
        new Point3d(-1, 1, -1),
    };
    
    public final Point3d[] verticesBottom = {
        new Point3d(1, -1, -1),
        new Point3d(1, -1, 1),
        new Point3d(-1, -1, 1),
        new Point3d(-1, -1, -1),
    };
    
    public Cube() {}
    
    public Cube(Texture textureFront, Texture textureBack, Texture textureLeft, Texture textureRight, Texture textureTop, Texture textureBottom) {
        this.textureFront = textureFront;
        this.textureBack = textureBack;
        this.textureLeft = textureLeft;
        this.textureRight = textureRight;
        this.textureTop = textureTop;
        this.textureBottom = textureBottom;
    }
    
    
    public Cube(Point3d position) {
        this.position = position;
    }
    
}
