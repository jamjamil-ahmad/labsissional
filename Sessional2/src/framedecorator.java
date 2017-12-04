

public abstract class framedecorator implements frame{
	protected frame decoratedframe;
	
	
	public framedecorator(frame decoratedframe){
		this.decoratedframe=decoratedframe;
	}
	public void draw(){
		decoratedframe.draw();
	}

}
