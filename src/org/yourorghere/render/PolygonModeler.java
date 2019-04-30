package org.yourorghere.render;

import javax.media.opengl.GL;
import org.yourorghere.polygons.Cube;
import org.yourorghere.polygons.Point3d;
import org.yourorghere.polygons.Pyramide;
import org.yourorghere.polygons.RubixCube;

public class PolygonModeler {
    
    private void modelCube(GL gl, Cube cube) {
        // Front
        gl.glBegin(GL.GL_QUADS);
        gl.glColor3f(cube.colorFront.x, cube.colorFront.y, cube.colorFront.z);
        for (Point3d p : cube.verticesFront)
            gl.glVertex3f(p.x, p.y, p.z);
        gl.glEnd();
        
        // Back
        gl.glBegin(GL.GL_QUADS);
        gl.glColor3f(cube.colorBack.x, cube.colorBack.y, cube.colorBack.z);
        for (Point3d p : cube.verticesBack)
            gl.glVertex3f(p.x, p.y, p.z);
        gl.glEnd();
        
        // Left
        gl.glBegin(GL.GL_QUADS);
        gl.glColor3f(cube.colorLeft.x, cube.colorLeft.y, cube.colorLeft.z);
        for (Point3d p : cube.verticesLeft)
            gl.glVertex3f(p.x, p.y, p.z);
        gl.glEnd();
        
        // Right
        gl.glBegin(GL.GL_QUADS);
        gl.glColor3f(cube.colorRight.x, cube.colorRight.y, cube.colorRight.z);
        for (Point3d p : cube.verticesRight)
            gl.glVertex3f(p.x, p.y, p.z);
        gl.glEnd();
        
        // Top
        gl.glBegin(GL.GL_QUADS);
        gl.glColor3f(cube.colorTop.x, cube.colorTop.y, cube.colorTop.z);
        for (Point3d p : cube.verticesTop)
            gl.glVertex3f(p.x, p.y, p.z);
        gl.glEnd();
        
        // Bottom
        gl.glBegin(GL.GL_QUADS);
        gl.glColor3f(cube.colorBottom.x, cube.colorBottom.y, cube.colorBottom.z);
        for (Point3d p : cube.verticesBottom)
            gl.glVertex3f(p.x, p.y, p.z);
        gl.glEnd();
    }
    
    private void modelTexturizedCube(GL gl, Cube cube) {
        // Front
        cube.textureFront.enable();
        cube.textureFront.bind();
        gl.glBegin(GL.GL_QUADS);
            gl.glTexCoord2f(0, 1);
            gl.glVertex3f(cube.verticesFront[0].x, cube.verticesFront[0].y, cube.verticesFront[0].z);
            gl.glTexCoord2f(1, 1);
            gl.glVertex3f(cube.verticesFront[1].x, cube.verticesFront[1].y, cube.verticesFront[1].z);
            gl.glTexCoord2f(1, 0);
            gl.glVertex3f(cube.verticesFront[2].x, cube.verticesFront[2].y, cube.verticesFront[2].z);
            gl.glTexCoord2f(0, 0);
            gl.glVertex3f(cube.verticesFront[3].x, cube.verticesFront[3].y, cube.verticesFront[3].z);
        gl.glEnd();
        cube.textureFront.disable();
        
        // Back
        cube.textureBack.enable();
        cube.textureBack.bind();
        gl.glBegin(GL.GL_QUADS);
            gl.glTexCoord2f(0, 1);
            gl.glVertex3f(cube.verticesBack[0].x, cube.verticesBack[0].y, cube.verticesBack[0].z);
            gl.glTexCoord2f(1, 1);
            gl.glVertex3f(cube.verticesBack[1].x, cube.verticesBack[1].y, cube.verticesBack[1].z);
            gl.glTexCoord2f(1, 0);
            gl.glVertex3f(cube.verticesBack[2].x, cube.verticesBack[2].y, cube.verticesBack[2].z);
            gl.glTexCoord2f(0, 0);
            gl.glVertex3f(cube.verticesBack[3].x, cube.verticesBack[3].y, cube.verticesBack[3].z);
        gl.glEnd();
        cube.textureBack.disable();
        
        // Left
        cube.textureLeft.enable();
        cube.textureLeft.bind();
        gl.glBegin(GL.GL_QUADS);
            gl.glTexCoord2f(0, 1);
            gl.glVertex3f(cube.verticesLeft[0].x, cube.verticesLeft[0].y, cube.verticesLeft[0].z);
            gl.glTexCoord2f(1, 1);
            gl.glVertex3f(cube.verticesLeft[1].x, cube.verticesLeft[1].y, cube.verticesLeft[1].z);
            gl.glTexCoord2f(1, 0);
            gl.glVertex3f(cube.verticesLeft[2].x, cube.verticesLeft[2].y, cube.verticesLeft[2].z);
            gl.glTexCoord2f(0, 0);
            gl.glVertex3f(cube.verticesLeft[3].x, cube.verticesLeft[3].y, cube.verticesLeft[3].z);
        gl.glEnd();
        cube.textureLeft.disable();
        
        // Right
        cube.textureRight.enable();
        cube.textureRight.bind();
        gl.glBegin(GL.GL_QUADS);
            gl.glTexCoord2f(0, 1);
            gl.glVertex3f(cube.verticesRight[0].x, cube.verticesRight[0].y, cube.verticesRight[0].z);
            gl.glTexCoord2f(1, 1);
            gl.glVertex3f(cube.verticesRight[1].x, cube.verticesRight[1].y, cube.verticesRight[1].z);
            gl.glTexCoord2f(1, 0);
            gl.glVertex3f(cube.verticesRight[2].x, cube.verticesRight[2].y, cube.verticesRight[2].z);
            gl.glTexCoord2f(0, 0);
            gl.glVertex3f(cube.verticesRight[3].x, cube.verticesRight[3].y, cube.verticesRight[3].z);
        gl.glEnd();
        cube.textureRight.disable();
        
        // Top
        cube.textureTop.enable();
        cube.textureTop.bind();
        gl.glBegin(GL.GL_QUADS);
            gl.glTexCoord2f(0, 1);
            gl.glVertex3f(cube.verticesTop[0].x, cube.verticesTop[0].y, cube.verticesTop[0].z);
            gl.glTexCoord2f(1, 1);
            gl.glVertex3f(cube.verticesTop[1].x, cube.verticesTop[1].y, cube.verticesTop[1].z);
            gl.glTexCoord2f(1, 0);
            gl.glVertex3f(cube.verticesTop[2].x, cube.verticesTop[2].y, cube.verticesTop[2].z);
            gl.glTexCoord2f(0, 0);
            gl.glVertex3f(cube.verticesTop[3].x, cube.verticesTop[3].y, cube.verticesTop[3].z);
        gl.glEnd();
        cube.textureTop.disable();
        
        // Bottom
        cube.textureBottom.enable();
        cube.textureBottom.bind();
        gl.glBegin(GL.GL_QUADS);
            gl.glTexCoord2f(0, 1);
            gl.glVertex3f(cube.verticesBottom[0].x, cube.verticesBottom[0].y, cube.verticesBottom[0].z);
            gl.glTexCoord2f(1, 1);
            gl.glVertex3f(cube.verticesBottom[1].x, cube.verticesBottom[1].y, cube.verticesBottom[1].z);
            gl.glTexCoord2f(1, 0);
            gl.glVertex3f(cube.verticesBottom[2].x, cube.verticesBottom[2].y, cube.verticesBottom[2].z);
            gl.glTexCoord2f(0, 0);
            gl.glVertex3f(cube.verticesBottom[3].x, cube.verticesBottom[3].y, cube.verticesBottom[3].z);
        gl.glEnd();
        cube.textureBottom.disable();
    }
    
    public void modelRubixCube(GL gl, RubixCube cube) {
        
        // front
        for (Cube c : cube.front) {
            gl.glTranslatef(c.position.x * c.spacing, c.position.y * c.spacing, c.position.z * c.spacing);
            modelCube(gl, c);
        }
        
        // back
        for (Cube c : cube.back) {
            gl.glTranslatef(c.position.x * c.spacing, c.position.y * c.spacing, c.position.z * c.spacing);
            modelCube(gl, c);
        }
        
        // left
        for (Cube c : cube.left) {
            gl.glTranslatef(c.position.x * c.spacing, c.position.y * c.spacing, c.position.z * c.spacing);
            modelCube(gl, c);
        }
        
        // right
        for (Cube c : cube.right) {
            gl.glTranslatef(c.position.x * c.spacing, c.position.y * c.spacing, c.position.z * c.spacing);
            modelCube(gl, c);
        }
        
        // up
        for (Cube c : cube.up) {
            gl.glTranslatef(c.position.x * c.spacing, c.position.y * c.spacing, c.position.z * c.spacing);
            modelCube(gl, c);
        }
        
        // down
        for (Cube c : cube.down) {
            gl.glTranslatef(c.position.x * c.spacing, c.position.y * c.spacing, c.position.z * c.spacing);
            modelCube(gl, c);
        }
    }
    
    public void modelRubixCube(GL gl, Cube cube) {
        modelRubixCubeFront(gl, cube);
        modelRubixCubeMiddle(gl, cube);
        modelRubixCubeBack(gl, cube);
    }
    
    private void modelRubixCubeFront(GL gl, Cube cube) {
        // Top
        gl.glTranslatef(-cube.spacing, cube.spacing, cube.spacing); // top left
        modelCube(gl, cube);
        
        gl.glTranslatef(cube.spacing, 0, 0); // top middle
        modelCube(gl, cube);
        
        gl.glTranslatef(cube.spacing, 0, 0); // top right
        modelCube(gl, cube);
        
        // Middle
        gl.glTranslatef(-cube.spacing, -cube.spacing, 0); // set in middle center
        
        gl.glTranslatef(-cube.spacing, 0, 0); // middle left
        modelCube(gl, cube);
        
        gl.glTranslatef(cube.spacing, 0, 0); // middle center
        modelCube(gl, cube);
        
        gl.glTranslatef(cube.spacing, 0, 0); // middle right
        modelCube(gl, cube);
        
        // Bottom
        gl.glTranslatef(-cube.spacing, -cube.spacing, 0); // set in bottom center
        
        gl.glTranslatef(-cube.spacing, 0, 0); // bottom left
        modelCube(gl, cube);
        
        gl.glTranslatef(cube.spacing, 0, 0); // bottom center
        modelCube(gl, cube);
        
        gl.glTranslatef(cube.spacing, 0, 0); // bottom right
        modelCube(gl, cube);
    }
    
    public void modelRubixCubeMiddle(GL gl, Cube cube) {
        // Top
        gl.glTranslatef(-cube.spacing * 2, cube.spacing * 2, -cube.spacing);
        modelCube(gl, cube);
        
        gl.glTranslatef(cube.spacing, 0, 0);
        modelCube(gl, cube);
        
        gl.glTranslatef(cube.spacing, 0, 0);
        modelCube(gl, cube);
        
        // Middle
        gl.glTranslatef(-cube.spacing, -cube.spacing, 0);
        
        gl.glTranslatef(-cube.spacing, 0, 0);
        modelCube(gl, cube);
        
        gl.glTranslatef(cube.spacing, 0, 0);
        modelCube(gl, cube);
        
        gl.glTranslatef(cube.spacing, 0, 0);
        modelCube(gl, cube);
        
        // Bottom
        gl.glTranslatef(-cube.spacing, -cube.spacing, 0);
        
        gl.glTranslatef(-cube.spacing, 0, 0);
        modelCube(gl, cube);
        
        gl.glTranslatef(cube.spacing, 0, 0);
        modelCube(gl, cube);
        
        gl.glTranslatef(cube.spacing, 0, 0);
        modelCube(gl, cube);
    }
    
    public void modelRubixCubeBack(GL gl, Cube cube) {
        // Top
        gl.glTranslatef(-cube.spacing * 2, cube.spacing * 2, -cube.spacing);
        modelCube(gl, cube);
        
        gl.glTranslatef(cube.spacing, 0, 0);
        modelCube(gl, cube);
        
        gl.glTranslatef(cube.spacing, 0, 0);
        modelCube(gl, cube);
        
        // Middle
        gl.glTranslatef(-cube.spacing, -cube.spacing, 0);
        
        gl.glTranslatef(-cube.spacing, 0, 0);
        modelCube(gl, cube);
        
        gl.glTranslatef(cube.spacing, 0, 0);
        modelCube(gl, cube);
        
        gl.glTranslatef(cube.spacing, 0, 0);
        modelCube(gl, cube);
        
        // Bottom
        gl.glTranslatef(-cube.spacing, -cube.spacing, 0);
        
        gl.glTranslatef(-cube.spacing, 0, 0);
        modelCube(gl, cube);
        
        gl.glTranslatef(cube.spacing, 0, 0);
        modelCube(gl, cube);
        
        gl.glTranslatef(cube.spacing, 0, 0);
        modelCube(gl, cube);
    }
    
    public void modelTexturizedRubixCube(GL gl, Cube cube) {
        modelTexturizedRubixCubeFront(gl, cube);
        modelTexturizedRubixCubeMiddle(gl, cube);
        modelTexturizedRubixCubeBack(gl, cube);
    }
    
    public void modelTexturizedRubixCubeFront(GL gl, Cube texturizedCube) {
        // Top
        gl.glTranslatef(-texturizedCube.spacing, texturizedCube.spacing, texturizedCube.spacing); // top left
        modelTexturizedCube(gl, texturizedCube);
        
        gl.glTranslatef(texturizedCube.spacing, 0, 0); // top middle
        modelTexturizedCube(gl, texturizedCube);
        
        gl.glTranslatef(texturizedCube.spacing, 0, 0); // top right
        modelTexturizedCube(gl, texturizedCube);
        
        // Middle
        gl.glTranslatef(-texturizedCube.spacing, -texturizedCube.spacing, 0); // set in middle center
        
        gl.glTranslatef(-texturizedCube.spacing, 0, 0); // middle left
        modelTexturizedCube(gl, texturizedCube);
        
        gl.glTranslatef(texturizedCube.spacing, 0, 0); // middle center
        modelTexturizedCube(gl, texturizedCube);
        
        gl.glTranslatef(texturizedCube.spacing, 0, 0); // middle right
        modelTexturizedCube(gl, texturizedCube);
        
        // Bottom
        gl.glTranslatef(-texturizedCube.spacing, -texturizedCube.spacing, 0); // set in bottom center
        
        gl.glTranslatef(-texturizedCube.spacing, 0, 0); // bottom left
        modelTexturizedCube(gl, texturizedCube);
        
        gl.glTranslatef(texturizedCube.spacing, 0, 0); // bottom center
        modelTexturizedCube(gl, texturizedCube);
        
        gl.glTranslatef(texturizedCube.spacing, 0, 0); // bottom right
        modelTexturizedCube(gl, texturizedCube);
    }
    
    public void modelTexturizedRubixCubeMiddle(GL gl, Cube texturizedCube) {
        // Top
        gl.glTranslatef(-texturizedCube.spacing * 2, texturizedCube.spacing * 2, -texturizedCube.spacing);
        modelTexturizedCube(gl, texturizedCube);
        
        gl.glTranslatef(texturizedCube.spacing, 0, 0);
        modelTexturizedCube(gl, texturizedCube);
        
        gl.glTranslatef(texturizedCube.spacing, 0, 0);
        modelTexturizedCube(gl, texturizedCube);
        
        // Middle
        gl.glTranslatef(-texturizedCube.spacing, -texturizedCube.spacing, 0);
        
        gl.glTranslatef(-texturizedCube.spacing, 0, 0);
        modelTexturizedCube(gl, texturizedCube);
        
        gl.glTranslatef(texturizedCube.spacing, 0, 0);
        modelTexturizedCube(gl, texturizedCube);
        
        gl.glTranslatef(texturizedCube.spacing, 0, 0);
        modelTexturizedCube(gl, texturizedCube);
        
        // Bottom
        gl.glTranslatef(-texturizedCube.spacing, -texturizedCube.spacing, 0);
        
        gl.glTranslatef(-texturizedCube.spacing, 0, 0);
        modelTexturizedCube(gl, texturizedCube);
        
        gl.glTranslatef(texturizedCube.spacing, 0, 0);
        modelTexturizedCube(gl, texturizedCube);
        
        gl.glTranslatef(texturizedCube.spacing, 0, 0);
        modelTexturizedCube(gl, texturizedCube);
    }
    
    public void modelTexturizedRubixCubeBack(GL gl, Cube texturizedCube) {
        // Top
        gl.glTranslatef(-texturizedCube.spacing * 2, texturizedCube.spacing * 2, -texturizedCube.spacing);
        modelTexturizedCube(gl, texturizedCube);
        
        gl.glTranslatef(texturizedCube.spacing, 0, 0);
        modelTexturizedCube(gl, texturizedCube);
        
        gl.glTranslatef(texturizedCube.spacing, 0, 0);
        modelTexturizedCube(gl, texturizedCube);
        
        // Middle
        gl.glTranslatef(-texturizedCube.spacing, -texturizedCube.spacing, 0);
        
        gl.glTranslatef(-texturizedCube.spacing, 0, 0);
        modelTexturizedCube(gl, texturizedCube);
        
        gl.glTranslatef(texturizedCube.spacing, 0, 0);
        modelTexturizedCube(gl, texturizedCube);
        
        gl.glTranslatef(texturizedCube.spacing, 0, 0);
        modelTexturizedCube(gl, texturizedCube);
        
        // Bottom
        gl.glTranslatef(-texturizedCube.spacing, -texturizedCube.spacing, 0);
        
        gl.glTranslatef(-texturizedCube.spacing, 0, 0);
        modelTexturizedCube(gl, texturizedCube);
        
        gl.glTranslatef(texturizedCube.spacing, 0, 0);
        modelTexturizedCube(gl, texturizedCube);
        
        gl.glTranslatef(texturizedCube.spacing, 0, 0);
        modelTexturizedCube(gl, texturizedCube);
    }
    
    public void modelPyramide(GL gl, Pyramide pyramide) {
        // Front
        gl.glBegin(GL.GL_TRIANGLES);
        gl.glColor3f(pyramide.colorFront.x, pyramide.colorFront.y, pyramide.colorFront.z);
        for (Point3d p : pyramide.verticesFront)
            gl.glVertex3f(p.x, p.y, p.z);
        gl.glEnd();
        
        // Left
        gl.glBegin(GL.GL_TRIANGLES);
        gl.glColor3f(pyramide.colorLeft.x, pyramide.colorLeft.y, pyramide.colorLeft.z);
        for (Point3d p : pyramide.verticesLeft)
            gl.glVertex3f(p.x, p.y, p.z);
        gl.glEnd();
        
        // Right
        gl.glBegin(GL.GL_TRIANGLES);
        gl.glColor3f(pyramide.colorRight.x, pyramide.colorRight.y, pyramide.colorRight.z);
        for (Point3d p : pyramide.verticesRight)
            gl.glVertex3f(p.x, p.y, p.z);
        gl.glEnd();
        
        gl.glBegin(GL.GL_TRIANGLES);
        gl.glColor3f(pyramide.colorBottom.x, pyramide.colorBottom.y, pyramide.colorBottom.z);
        for (Point3d p : pyramide.verticesBottom)
            gl.glVertex3f(p.x, p.y, p.z);
        gl.glEnd();
    }
    
    public void modelPyraminx(GL gl, Pyramide pyramide) {
        modelPyraminxLevel1(gl, pyramide);
        modelPyraminxLevel2(gl, pyramide);
        modelPyraminxLevel3(gl, pyramide);
    }
    
    private void modelPyraminxLevel1(GL gl, Pyramide pyramide) {
        float spacing = pyramide.spacing;
        
        gl.glTranslatef(-spacing, -spacing, spacing);
        modelPyramide(gl, pyramide);
        
        gl.glTranslatef(spacing, 0, 0);
        modelPyramide(gl, pyramide);
        
        gl.glTranslatef(spacing, 0, 0);
        modelPyramide(gl, pyramide);
    }
    
    private void modelPyraminxLevel2(GL gl, Pyramide pyramide) {
        float spacing = pyramide.spacing;
        
        gl.glTranslatef(-spacing * 1.5f, spacing, -spacing/2);
        modelPyramide(gl, pyramide);
        
        gl.glTranslatef(spacing, 0, 0);
        modelPyramide(gl, pyramide);
    }
    
    private void modelPyraminxLevel3(GL gl, Pyramide pyramide) {
        float spacing = pyramide.spacing;
        
        gl.glTranslatef(-spacing/2, spacing, -spacing/2);
        modelPyramide(gl, pyramide);
    }
    
}
