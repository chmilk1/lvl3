package lvl3;

import java.util.ArrayList;

public class fibonacci_sequence {
	int numrals = 100;
	ArrayList<numberStorer> numbers = new ArrayList<numberStorer>();
public static void main(String[] args) {
	fibonacci_sequence run = new fibonacci_sequence();
	run.run();
}
void run(){
	numbers.add(new numberStorer(1));
	numbers.add(new numberStorer(1));
	for (int i = 0; i < numrals; i++) {
		int addation = numbers.get(numbers.size() - 2).returnNum() + numbers.get(numbers.size() - 1).returnNum();;
		numberStorer object = new numberStorer(0);
		object.setNum(addation);
		numbers.add(object);
	}
	for (numberStorer localObject : numbers) {
		System.out.println(localObject.returnNum() + " ");
	}
}
}

class numberStorer {
	int number;
	public numberStorer(int num){
		this.number = num;
	}
	public void setNum(int num){
		number = num;
		
	}
	public int returnNum(){
		return number;
		
	}
}