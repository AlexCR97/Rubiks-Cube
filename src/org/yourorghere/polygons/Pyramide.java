package org.yourorghere.polygons;

public class Pyramide {
    
    public float spacing = 2.0f;
    
    public Point3d colorFront = new Point3d(1, 0, 0);
    public Point3d colorLeft = new Point3d(0, 0, 1);
    public Point3d colorRight = new Point3d(1, 1, 0);
    public Point3d colorBottom = new Point3d(0, 1, 1);
    
    public final Point3d[] verticesFront = {
        new Point3d(-1, -1, 1),
        new Point3d(1, -1, 1),
        new Point3d(0, 1, 0),
    };
    
    public final Point3d[] verticesLeft = {
        new Point3d(0, -1, -1),
        new Point3d(-1, -1, 1),
        new Point3d(0, 1, 0),
    };
    
    public final Point3d[] verticesRight = {
        new Point3d(0, -1, -1),
        new Point3d(1, -1, 1),
        new Point3d(0, 1, 0),
    };
    
    public final Point3d[] verticesBottom = {
        new Point3d(-1, -1, 1),
        new Point3d(1, -1, 1),
        new Point3d(0, -1, -1),
    };
    
    public Pyramide() {}
    
}
