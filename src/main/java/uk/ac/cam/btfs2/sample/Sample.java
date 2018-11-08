package uk.ac.cam.btfs2.sample;

import static org.lwjgl.glfw.GLFW.GLFW_RESIZABLE;
import static org.lwjgl.glfw.GLFW.glfwInit;
import static org.lwjgl.glfw.GLFW.glfwSetErrorCallback;
import static org.lwjgl.glfw.GLFW.glfwTerminate;
import static org.lwjgl.glfw.GLFW.glfwWindowHint;
import static org.lwjgl.opengl.GL11.GL_COLOR_BUFFER_BIT;
import static org.lwjgl.opengl.GL11.GL_DEPTH_BUFFER_BIT;
import static org.lwjgl.opengl.GL11.GL_FALSE;
import static org.lwjgl.opengl.GL11.GL_VERSION;
import static org.lwjgl.opengl.GL11.glClear;
import static org.lwjgl.opengl.GL11.glGetString;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.opengl.GL;

/**
 * This is a sample to check OpenGL works
 * 
 * @author btfs2
 *
 */
public class Sample {

	static long window;
	static int winWidth, winHeight;
	
	/**
	 * Called before initialisation I.e. loading textures etc.
	 */
	public static void preInit() {
		// tell GLFW to warn us about errrors
		glfwSetErrorCallback(GLFWErrorCallback.createPrint(System.err));
		// attempt to initialise GLFW
		if (!glfwInit())
			throw new IllegalStateException("Unable to initialize GLFW"); // FAIL if opengl fails (i.e. bad GPU)
		
		// Make window non-resizable
	    glfwWindowHint(GLFW_RESIZABLE, GL_FALSE);
		
	    // Set window parameters
	    winWidth = 1600;
	    winHeight = 900;
	    // Create window
		window = GLFW.glfwCreateWindow(winWidth, winHeight, "CST Sample", 0, 0);
		
		// Setup window
		GLFW.glfwMakeContextCurrent(window);
		GLFW.glfwSwapInterval(2);
		GL.createCapabilities();
		
		// Print our OpenGl version
		System.out.println("OpenGL version: " + glGetString(GL_VERSION));
	}
	
	/**
	 * Where all the initialisation stages go
	 * 
	 * Loading resources, etc.
	 */
	public static void init() {
		// Would load textures but can't be bothered to find any
	}
	
	/**
	 * Where all the post init stages go
	 * 
	 * I.e. pushing resources to GPU, configuring shaders, etc.
	 */
	public static void postInit() {
		// Would set up shaders here but can't be bothered to write any
	}
	
	/**
	 * Where the main loop of the program occurs
	 */
	public static void loop() {
		// Loop until user presses close button
		while (!GLFW.glfwWindowShouldClose(window)) {
			GLFW.glfwPollEvents();
			GLFW.glfwSwapBuffers(window);
			
			/* draw here */
			
			glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT); // 
			
		}
		glfwTerminate();
	}
	
	/**
	 * Calls setup
	 * 
	 * @param args args to pass (does nothing)
	 */
	public static void main(String[] args) {
		preInit();
		init();
		postInit();
		loop();
	}
}
