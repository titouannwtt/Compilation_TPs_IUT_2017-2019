import java.util.*;

public class Tri {
    public static void main(String[] args) {
        Queue<Integer> f1 = new LinkedList<>();
        Queue<Integer> fres;
        int i;
        for (String f : args) {
            int tempo = Integer.parseInt(f);
            f1.add(tempo);
        }
        fres = scinder(f1);
        System.out.println(fres);
    }

    public static Queue<Integer> scinder(Queue<Integer> file) {
        int size = file.size();
        Queue<Integer> ff;
        Queue<Integer> ff2;
        Queue<Integer> f2 = new LinkedList<>();
        Queue<Integer> f3 = new LinkedList<>();
        if (size == 0 || size == 1) {
            return file;
        } else {
            int balance = 0;
            while (file.size() != 0) {
                if (balance == 0) {
                    balance = 1;
                    f2.add(file.remove());
                } else {
                    balance = 0;
                    f3.add(file.remove());
                }
            }
            ff = scinder(f2);
            ff2 = scinder(f3);
            return fusion(ff, ff2);
        }
    }

    public static Queue<Integer> fusion(Queue<Integer> f1, Queue<Integer> f2) {
        Queue<Integer> resultat = new LinkedList<>();
        int var1;
        int var2;
        if(f1.size()==0){
            return f2;
        }else if(f2.size()==0){
            return f1;
        }else{
            for (int i = 0; i < f1.size() + f2.size(); i++) {
                var1 = (int) f1.remove();
                var2 = (int) f2.remove();
                if (var1 < var2) {
                    resultat.add(var1);
                } else {
                    resultat.add(var2);
                }
            }
            System.out.println("Fusion resultat : "+ resultat);
            return resultat;
        }
        
    }

}