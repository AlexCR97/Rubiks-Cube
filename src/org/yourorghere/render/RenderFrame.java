package org.yourorghere.render;

import org.yourorghere.polygons.Pyramide;
import org.yourorghere.polygons.Point3d;
import org.yourorghere.polygons.Cube;
import com.sun.opengl.util.Animator;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;
import javax.swing.JFrame;
import org.yourorghere.polygons.RubixCube;

public class RenderFrame extends JFrame implements GLEventListener {

    //public float zoom = 70.0f;
    public float zoom = 100.0f;
    //public float zoom = 140.0f;
    
    public final Point3d origin = new Point3d(0, 0, -10);
    public final PolygonModeler modeler = new PolygonModeler();
    
    public Cube cube = new Cube();
    public Cube texturizedCube;
    public Pyramide pyramide = new Pyramide();
    public RubixCube rubixCube;
    
    public RenderFrame() {
        super("Rubix cube");
        
        GLCanvas canvas = new GLCanvas();
        canvas.addGLEventListener(this);
        this.add(canvas);
        this.setSize(1080, 720);
        
        final Animator animator = new Animator(canvas);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                new Thread(new Runnable() {
                    public void run() {
                        animator.stop();
                        System.exit(0);
                    }
                }).start();
            }
        });
        
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        animator.start();
    }
    
    @Override
    public void init(GLAutoDrawable drawable) {
        GL gl = drawable.getGL();
        
        gl.setSwapInterval(1);
        //gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        gl.glClearColor(0.25f, 0.25f, 0.25f, 0.0f);
        gl.glShadeModel(GL.GL_SMOOTH);
        
        texturizedCube = new Cube(
                TextureManager.getTexture(TextureManager.IMAGE_STICKER_RED),
                TextureManager.getTexture(TextureManager.IMAGE_STICKER_GREEN),
                TextureManager.getTexture(TextureManager.IMAGE_STICKER_BLUE),
                TextureManager.getTexture(TextureManager.IMAGE_STICKER_YELLOW),
                TextureManager.getTexture(TextureManager.IMAGE_STICKER_WHITE),
                TextureManager.getTexture(TextureManager.IMAGE_STICKER_ORANGE)
        );
        
        rubixCube = new RubixCube();
    }

    @Override
    public void display(GLAutoDrawable drawable) {
        GL gl = drawable.getGL();
        
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        
        gl.glLoadIdentity();
        gl.glTranslatef(origin.x, origin.y, origin.z);
        
        // DRAW HERE
        
        //modelRubixCube(gl);
        modeler.modelRubixCube(gl, rubixCube);
        
        //gl.glRotatef(angle, 1, 1, 1);
        //gl.glRotatef(30, 1, 0, 0);
        //gl.glRotatef(angle, 1, 0, 0);
        //gl.glRotatef(angle, 0, 1, 0);
        //gl.glRotatef(angle, 0, 0, 1);
        
        //modeler.modelTexturizedRubixCube(gl, texturizedCube);
        //modeler.modelPyramide(gl, pyramide);
        //modeler.modelPyraminx(gl, pyramide);
        
        // rubix cube 2
        //modeler.modelRubixCube(gl, rubixCube);
        
        // FINISH DRAWING HERE
        
        gl.glFlush();
    }

    @Override
    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
        
    }
    
    @Override
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL gl = drawable.getGL();
        GLU glu = new GLU();
        
        if (height <= 0)
            height = 1;
        
        final float aspectRatio = (float) (width / height);
        
        gl.glViewport(0, 0, width, height);
        gl.glMatrixMode(GL.GL_PROJECTION);
        gl.glLoadIdentity();
        
        glu.gluPerspective(zoom, 1.42, 4, 20.0);
        gl.glDepthFunc(GL.GL_LEQUAL);
        gl.glEnable(GL.GL_DEPTH_TEST);
        gl.glClearDepth(1.0);
        
        gl.glTexEnvi(GL.GL_TEXTURE_ENV, GL.GL_TEXTURE_ENV_MODE, GL.GL_DECAL);
        gl.glMatrixMode(GL.GL_MODELVIEW);
        gl.glLoadIdentity();
    }
    
    public void modelRubixCube(GL gl) {
        /*TOP*/
        gl.glLoadIdentity();
        gl.glTranslatef(origin.x, origin.y, origin.z);
        texturizedCube.position = new Point3d(-1, 1, 0);
        gl.glTranslatef(
                texturizedCube.position.x * texturizedCube.spacing,
                texturizedCube.position.y * texturizedCube.spacing,
                texturizedCube.position.z * texturizedCube.spacing
        );
        modeler.modelTexturizedCube(gl, texturizedCube);
        
        gl.glLoadIdentity();
        gl.glTranslatef(origin.x, origin.y, origin.z);
        texturizedCube.position = new Point3d(0, 1, 0);
        gl.glTranslatef(
                texturizedCube.position.x * texturizedCube.spacing,
                texturizedCube.position.y * texturizedCube.spacing,
                texturizedCube.position.z * texturizedCube.spacing
        );
        modeler.modelTexturizedCube(gl, texturizedCube);
        
        gl.glLoadIdentity();
        gl.glTranslatef(origin.x, origin.y, origin.z);
        texturizedCube.position = new Point3d(1, 1, 0);
        gl.glTranslatef(
                texturizedCube.position.x * texturizedCube.spacing,
                texturizedCube.position.y * texturizedCube.spacing,
                texturizedCube.position.z * texturizedCube.spacing
        );
        modeler.modelTexturizedCube(gl, texturizedCube);
        
        /*MIDDLE*/
        gl.glLoadIdentity();
        gl.glTranslatef(origin.x, origin.y, origin.z);
        texturizedCube.position = new Point3d(-1, 0, 0);
        gl.glTranslatef(
                texturizedCube.position.x * texturizedCube.spacing,
                texturizedCube.position.y * texturizedCube.spacing,
                texturizedCube.position.z * texturizedCube.spacing
        );
        modeler.modelTexturizedCube(gl, texturizedCube);
        
        gl.glLoadIdentity();
        gl.glTranslatef(origin.x, origin.y, origin.z);
        texturizedCube.position = new Point3d(0, 0, 0);
        gl.glTranslatef(
                texturizedCube.position.x * texturizedCube.spacing,
                texturizedCube.position.y * texturizedCube.spacing,
                texturizedCube.position.z * texturizedCube.spacing
        );
        modeler.modelTexturizedCube(gl, texturizedCube);
        
        gl.glLoadIdentity();
        gl.glTranslatef(origin.x, origin.y, origin.z);
        texturizedCube.position = new Point3d(1, 0, 0);
        gl.glTranslatef(
                texturizedCube.position.x * texturizedCube.spacing,
                texturizedCube.position.y * texturizedCube.spacing,
                texturizedCube.position.z * texturizedCube.spacing
        );
        modeler.modelTexturizedCube(gl, texturizedCube);
        
        /*BOTTOM*/
        gl.glLoadIdentity();
        gl.glTranslatef(origin.x, origin.y, origin.z);
        texturizedCube.position = new Point3d(-1, -1, 0);
        gl.glTranslatef(
                texturizedCube.position.x * texturizedCube.spacing,
                texturizedCube.position.y * texturizedCube.spacing,
                texturizedCube.position.z * texturizedCube.spacing
        );
        modeler.modelTexturizedCube(gl, texturizedCube);
        
        gl.glLoadIdentity();
        gl.glTranslatef(origin.x, origin.y, origin.z);
        texturizedCube.position = new Point3d(0, -1, 0);
        gl.glTranslatef(
                texturizedCube.position.x * texturizedCube.spacing,
                texturizedCube.position.y * texturizedCube.spacing,
                texturizedCube.position.z * texturizedCube.spacing
        );
        modeler.modelTexturizedCube(gl, texturizedCube);
        
        gl.glLoadIdentity();
        gl.glTranslatef(origin.x, origin.y, origin.z);
        texturizedCube.position = new Point3d(1, -1, 0);
        gl.glTranslatef(
                texturizedCube.position.x * texturizedCube.spacing,
                texturizedCube.position.y * texturizedCube.spacing,
                texturizedCube.position.z * texturizedCube.spacing
        );
        modeler.modelTexturizedCube(gl, texturizedCube);
    }
    
}
