package kadai.kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		
		Dictionary_Chapter21 dictionary1 = new Dictionary_Chapter21();
		
		String[] fruit = {"apple","banana","grape","orange"};
		
		for (int i = 0; i < fruit.length; i++ ) {
			
			dictionary1.word = fruit[i];
			
			if(dictionary1.dictionary() == "null") {
			
				System.out.println(dictionary1.word + "は辞書に存在しません");
				
			} else {
				
				System.out.println(dictionary1.word + "の意味は" + dictionary1.dictionary());
			
			}
		}

	}

}
