package org.yourorghere.polygons;

public class RubixCube {
    
    // Front layer
    private final Cube cubeFront1 = new Cube(new Point3d(-1, 1, 1));
    private final Cube cubeFront2 = new Cube(new Point3d(0, 1, 1));
    private final Cube cubeFront3 = new Cube(new Point3d(1, 1, 1));
    private final Cube cubeFront4 = new Cube(new Point3d(-1, 0, 1));
    private final Cube cubeFront5 = new Cube(new Point3d(0, 0, 1));
    private final Cube cubeFront6 = new Cube(new Point3d(1, 0, 1));
    private final Cube cubeFront7 = new Cube(new Point3d(-1, -1, 1));
    private final Cube cubeFront8 = new Cube(new Point3d(0, -1, 1));
    private final Cube cubeFront9 = new Cube(new Point3d(1, -1, 1));
    
    // Middle layer
    private final Cube cubeMiddle1 = new Cube(new Point3d(-1, 1, 0));
    private final Cube cubeMiddle2 = new Cube(new Point3d(0, 1, 0));
    private final Cube cubeMiddle3 = new Cube(new Point3d(1, 1, 0));
    private final Cube cubeMiddle4 = new Cube(new Point3d(-1, 0, 0));
    private final Cube cubeMiddle5 = new Cube(new Point3d(0, 0, 0));
    private final Cube cubeMiddle6 = new Cube(new Point3d(1, 0, 0));
    private final Cube cubeMiddle7 = new Cube(new Point3d(-1, -1, 0));
    private final Cube cubeMiddle8 = new Cube(new Point3d(0, -1, 0));
    private final Cube cubeMiddle9 = new Cube(new Point3d(1, -1, 0));
    
    // Back layer
    private final Cube cubeBack1 = new Cube(new Point3d(-1, 1, -1));
    private final Cube cubeBack2 = new Cube(new Point3d(0, 1, -1));
    private final Cube cubeBack3 = new Cube(new Point3d(1, 1, -1));
    private final Cube cubeBack4 = new Cube(new Point3d(-1, 0, -1));
    private final Cube cubeBack5 = new Cube(new Point3d(0, 0, -1));
    private final Cube cubeBack6 = new Cube(new Point3d(1, 0, -1));
    private final Cube cubeBack7 = new Cube(new Point3d(-1, -1, -1));
    private final Cube cubeBack8 = new Cube(new Point3d(0, -1, -1));
    private final Cube cubeBack9 = new Cube(new Point3d(1, -1, -1));
    
    public final Cube[] front = {
        cubeFront1, cubeFront2, cubeFront3,
        cubeFront4, cubeFront5, cubeFront6,
        cubeFront7, cubeFront8, cubeFront9,
    };
    
    public final Cube[] back = {
        cubeBack1, cubeBack2, cubeBack3,
        cubeBack4, cubeBack5, cubeBack6,
        cubeBack7, cubeBack8, cubeBack9,
    };
    
    public final Cube[] left = {
        cubeBack1, cubeMiddle1, cubeFront1,
        cubeBack4, cubeMiddle4, cubeFront4,
        cubeBack7, cubeMiddle7, cubeFront7,
    };
    
    public final Cube[] right = {
        cubeFront3, cubeMiddle3, cubeBack3,
        cubeFront6, cubeMiddle6, cubeBack6,
        cubeFront9, cubeMiddle9, cubeBack9,
    };
    
    public final Cube[] up = {
        cubeFront1, cubeFront2, cubeFront3,
        cubeMiddle1, cubeMiddle2, cubeMiddle3,
        cubeBack1, cubeBack2, cubeBack3,
    };
    
    public final Cube[] down = {
        cubeFront7, cubeFront8, cubeFront9,
        cubeMiddle7, cubeMiddle8, cubeMiddle9,
        cubeBack7, cubeBack8, cubeBack9,
    };
    
    public RubixCube() {
        
    }
    
}
