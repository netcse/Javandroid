class Rectangle{
	double width;
	double height;
	
	Rectangle(Rectangle ob){
		width = ob.width;
		height = ob.height;
	}
	
	Rectangle(double w, double h){
		width = w;
		height = h;
	}
	Rectangle(){
		width = -1;
		height = -1;
	}
	
	Rectangle(double len){
		width = height = len;
	}
	
	double area(){
		return width = height;
	}
}

public class Constructor{
	public static void main(String args[]){
		Rectangle myObj = new Rectangle(10, 20);
		
	}
}