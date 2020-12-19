import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class Dictionnaire<K, V> {
    
    private ArrayList<Element> content;

    public Dictionnaire() {
        content = new ArrayList<>();
    }

    public V put(K key, V value) {
        content.add(new Element(key, value));
        return value;
    }

    public V get(K key) {
        for(Element e : content) {
            if(e.getKey().equals(key)) {
                return e.getValue();
            }
        }

        return null;
    }

    class Element {
        private K key;
        private V value;

        Element(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return this.key;
        }

        public V getValue() {
            return this.value;
        }
    }
}

/*
public class TestMap {
    public static void main(String[] args) {
        Dictionnaire dico = new Dictionnaire();
        dico.put("boubou", 5);
        dico.put("eg", 41);
        dico.put("gegrg", 4);
        dico.put("grgeg", 2);
        dico.put("egt", 3);
        dico.put("bohthhubou", 8);


        System.out.println(dico.get("eg"));
    }
}*/