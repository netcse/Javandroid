class Bata{
	public void showBata(){
		System.out.println("Showing Bata");
	}
}

class Main extends Bata{
	Main(){
		//super();
	}
	public static void main(String args[]){
		System.out.println("I am from main function");
		new Main().showBata();
	}
}