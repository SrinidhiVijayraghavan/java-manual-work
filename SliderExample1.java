package my;
	import javax.swing.*;  
  	public class SliderExample1 extends JFrame{  
  
	/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

	public SliderExample1() {  
	JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);  
JPanel panel=new JPanel();  
	panel.add(slider);  
	  
	add(panel);  
	}  
	  
	public static void main(String s[]) {  
	SliderExample1 frame=new SliderExample1();  
	frame.pack();  
	frame.setVisible(true);  
	}  
}  

