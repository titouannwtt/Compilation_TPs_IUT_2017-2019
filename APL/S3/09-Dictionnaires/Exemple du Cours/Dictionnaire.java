public class Dictionnaire {

	private Link[] table;

	private static int hachage(String key) {
		int hash =( (int)key.charAt(0))%25;
		hash *= ((int)key.charAt(1))%4;
		return hash;
	}

	public String get(String key) {
		int hash = Dictionnaire.hachage(key);
		Link candidate=this.table[hash];
		while(candidate!=null) {
			if (candidate.getKey().equals(key)) {
				return candidate.getKey();
			}
		}
		return null;
	}
}