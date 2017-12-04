

public class newframedecor extends framedecorator{
	public newframedecor(frame decoratedframe) {
	      super(decoratedframe);		
	   }

	   @Override
	   public void draw() {
	      decoratedframe.draw();	       
	      settopframe(decoratedframe);
	      setbottomframe(decoratedframe);
	      setleftframe(decoratedframe);
	      setrightframe(decoratedframe);
	   }

	   public void settopframe(frame decoratedframe){
	      System.out.println("Picture with Topframe");
	   }
	   
	   public void setbottomframe(frame decoratedframe){
		   System.out.print("Pictore with bottomFrame");
	   }
	   
	   public void setleftframe(frame decoratedframe){
		   System.out.print("Pictore with leftFrame");
	   }
	   
	   public void setrightframe(frame decoratedframe){
		   System.out.print("Pictore with rightFrame");
	   }
}
