public class Age{

int age;

public void setAge(int age){


if (age<18) {
	System.out.println("You can not vote");
	
}
else{
	System.out.println("You can vote");
}

}




	public static void main(String[] args) {
		

Age a = new Age();

a.setAge(16);
	}
}