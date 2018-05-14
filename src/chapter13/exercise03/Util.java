package chapter13.exercise03;

public class Util {

	public static <K, V> V getValue(Pair<K, V> p, String key) {
		if (p.getKey().equals(key)) {
			return p.getValue();
		}
		return null;
	}

}
