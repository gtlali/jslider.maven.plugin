package com.alph.jsliderplugin;




import javax.inject.Inject;
import javax.swing.SwingUtilities;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;
//import org.apache.maven.plugins.annotations.Parameter;
//import org.apache.maven.project.MavenProject;


/*import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;*/

/**
 * An example Maven Mojo that resolves the current project's git revision and adds 
 * that a new {@code exampleVersion} property to the current Maven project.
 */
@Mojo(name = "version", defaultPhase = LifecyclePhase.DEPLOY)
public class sliderMojo extends AbstractMojo  {	 
	/**
	 *  An Example Mojo that resolves the current project version 
	 */

	@Inject
	imyslider isld;
	
	@Parameter(property="project", readonly=true)
	private MavenProject project;
	
	public void execute() throws MojoExecutionException, MojoFailureException {
	        // The logic of our plugin will go here
		 	//String content =;
			getLog().info("Cool, Got my Maven plugin" );
			isld.buildGUI();
			
			try {
				Thread.sleep(50000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			/*
			 * SwingUtilities.invokeLater(new Runnable(){ public void run(){ //myslider s =
			 * new myslider(); isld.buildGUI(); // s.buildGUI(); } });
			 */
	    }	
	
}
