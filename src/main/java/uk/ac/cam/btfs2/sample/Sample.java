package uk.ac.cam.btfs2.sample;

import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;

public class Sample {

	
	public static void main(String[] args) throws Exception {
		// Setup native path
		NativePathModifier.setLibraryPath("lib/natives");
		
		// Create display
		Display.setDisplayMode(new DisplayMode(1600, 900));
		Display.setFullscreen(false);
		Display.create();
		
		//Setup GL11 State machine
	    GL11.glMatrixMode(GL11.GL_PROJECTION);
	    GL11.glLoadIdentity();
	    GL11.glOrtho(0, 800, 0, 600, 1, -1);
	    GL11.glMatrixMode(GL11.GL_MODELVIEW);
	    
	    //Do Display
	    while (!Display.isCloseRequested()) {
	        // Clear the screen and depth buffer
	        GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);  
	         
	        // set the color of the quad (R,G,B,A)
	        GL11.glColor3f(0.5f,0.5f,1.0f);
	             
	        // draw quad
	        GL11.glBegin(GL11.GL_QUADS);
	            GL11.glVertex2f(100,100);
	            GL11.glVertex2f(100+200,100);
	            GL11.glVertex2f(100+200,100+200);
	            GL11.glVertex2f(100,100+200);
	        GL11.glEnd();
	  
	        Display.update();
	    }
	  
	    Display.destroy();
		
	}
	
}
