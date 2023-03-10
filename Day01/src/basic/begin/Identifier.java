package basic.begin;

public class Identifier {

	public static void main(String[] args) {
		
		//꼭 지켜야 할 규칙 (안 지킬 시 에러가 발생할 수 있습니다.)
		//1. 식별자의 이름은 중복을 허용하지 않습니다.
		//그리고, 대/소문자를 철저하게 구분합니다.
		
		int age = 35;
//		int age = 40; (x)
		int Age = 40;
		System.out.println(age);
		System.out.println(Age);
		
		//2. 식별자 이름은 숫자로만 지정하거나 숫자로 시작하면 안됩니다.
//		int 700 = 365; (x)
//		int 7number = 7; (x)
		//위 두가지 경우 빼고는 가능하다.
		int number7 = 7;
		int num7ber = 7;
		
		//3. 식별자 이름에 공백을 포함할 수 없습니다.
		int mybirthday = 19921013;
		int myBirthDay = 19921013; //camel case
		//연결단어의 첫글자를 대문자로 사용해야된다.
		//4. 식별자 이름에 쓸 수 있는 특수문자는 밑줄(_), 달러기호($)
		//뿐입니다. 하지만 사용을 권장하지는 않습니다.
		//저 특수문자들은 사용하기로 약속한 곳이 지정되어 있습니다.
		String $hello_ = "안녕";
		
		//5. 키워드(예약어)는 식별자 이름으로 사용이 불가능합니다.
		//키워드는 이미 어떠한 기능을 내포하고 있는 지정 문자입니다.
//		String class = "클래스"; (x)
		String Class = "클래스"; //(권장하지 않습니다.)
		String className = "클래스";
		//6. 한글이나 한자 같은 식별자 이름도 지정이 가능합니다.
		//하지만 사용을 권장하지는 않습니다.
		int 숫자 = 10;
		String 名 = "홍길동";
		System.out.println(숫자);
		System.out.println(名);
		//눈에 불편해서 가속성이 별로 좋지 않고 협업에도 별로 좋지 않다.
		//UTF-8의 환경으로만 사용하는것이 아니어서 한글이나 한자를 사용을 권장하지 않는다.
		//한글이 깨지게 되면 특수문자로 식별되서 코드 실행이 안되는 문제가 일어날수 있다.
		//변수 라는 것은 명사 느낌이 나게 정해주는게 좋다.
		//함수는 동사느낌이 나게 작성하는게 원칙이다.
		//변수는 소문자가 원칙이다.
		
		
	}

}
