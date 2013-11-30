package nulls;

import fj.F;
import fj.data.Option;

public class OptionType {
	public static void main(String... args) {
		
		F<String, Integer> length = new F<String, Integer>() {
			public Integer f(String str) {
				return str.length();
			}
		};
		
		Option<String> someString = Option.some("string");
		Option<String> noneString = Option.none();
		
		someString.map(length).orSome(42); // 6
		noneString.map(length).orSome(0); // 0
		
		System.out.println(someString.map(length).orSome(42));
		System.out.println(noneString.map(length).orSome(0));
	}
}
