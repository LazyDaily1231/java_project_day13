package 클래스사용;

import 클래스생성.Phone;

public class 거실 {

	public static void main(String[] args) {
		Phone phone1 = new Phone();
		phone1.run();
		phone1.up();
		phone1.color = "Red";
		phone1.count =  3;
		
		
		
		System.out.println(phone1.color);
		System.out.println(phone1.count);

	}

}
