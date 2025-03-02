package kadai.kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {
		
	public String word;
	
	String dictionary() {
		HashMap<String, String> dictionary = new HashMap<String, String>();
		
		dictionary.put("apple", "りんご");
		dictionary.put("peach", "桃");
		dictionary.put("banana", "バナナ");
		dictionary.put("lemon", "レモン");
		dictionary.put("pear", "梨");
		dictionary.put("kiwi", "キウィ");
		dictionary.put("strawberry", "いちご");
		dictionary.put("grape", "ぶどう");
		dictionary.put("muscat", "マスカット");
		dictionary.put("cherry", "さくらんぼ");

		if ( dictionary.containsKey(this.word)) {
			return dictionary.get(word);
		} else {
			return "null";
		}
		
		
	}
}
