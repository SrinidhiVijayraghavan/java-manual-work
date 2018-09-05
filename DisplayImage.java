package srinidhi;
	import java.awt.*;  
	import java.applet.*;  
	  
	  
	public class DisplayImage extends Applet {  
	  
	  public class First {

		}

	/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
	Image picture;  
	  	  public void init() {  
	    picture = getImage(getDocumentBase(),"sonoo.jpg");  
	  }  
	    
	  public void paint(Graphics g) {  
	    g.drawImage(picture, 30,30, this);  
	  }
	}
      
