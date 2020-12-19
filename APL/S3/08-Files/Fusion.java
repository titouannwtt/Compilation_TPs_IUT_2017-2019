import java.util.*;
import java.lang.*;

public class Fusion  { 
    noeux head = null; 
    // noeux a,b; 
    static class noeux { 
        int val; 
        noeux next; 
  
        public noeux(int val) { 
            this.val = val; 
        } 
    } 

    noeux sortedMerge(noeux a, noeux b) { 
        noeux result = null; 
        //Cas de base
        if (a == null) 
            return b; 
        if (b == null) 
            return a; 
  
        /* Choisissez a ou b et réexecute (récursif) */
        if (a.val <= b.val) { 
            result = a; 
            result.next = sortedMerge(a.next, b); 
        }  
        else { 
            result = b; 
            result.next = sortedMerge(a, b.next); 
        } 
        return result; 
    } 

    noeux mergeSort(noeux h) { 
        // Cas de base si "in" est nul
        if (h == null || h.next == null) { 
            return h; 
        } 
  
        // récupère le milieu de la file
        noeux middle = getMiddle(h); 
        noeux nextofmiddle = middle.next; 
  
        // défini la case à côté du milieu à null
        middle.next = null; 
  
        // Applique mergeSort() a la liste de gauche
        noeux left = mergeSort(h); 
  
        // Applique mergeSort() a la liste de droite
        noeux right = mergeSort(nextofmiddle); 
  
        // Fusionne les 2 listes
        noeux sortedlist = sortedMerge(left, right); 
        return sortedlist; 
    } 
  
    // Fonction utilitaire pour obtenir le milieu de la liste fusionnée 
    noeux getMiddle(noeux h) { 
        //Base case 
        if (h == null) 
            return h; 
        noeux fastptr = h.next; 
        noeux slowptr = h; 
          
        while (fastptr != null) 
        { 
            fastptr = fastptr.next; 
            if(fastptr!=null) 
            { 
                slowptr = slowptr.next; 
                fastptr=fastptr.next; 
            } 
        } 
        return slowptr; 
    } 
  
    void push(int new_data)  
    { 
        /* allou les noeux */
        noeux new_noeux = new noeux(new_data); 
  
        /* relier l'ancienne liste au nouveau noeux */
        new_noeux.next = head; 
  
        /* déplacer la tête pour pointer vers le nouveau noeux */
        head = new_noeux; 
    } 
  
    // Fonction utilitaire pour imprimer la liste chaînée
    void printList(noeux headref)  
    { 
        while (headref != null)  
        { 
            System.out.print(headref.val + "\n"); 
            headref = headref.next; 
        } 
    } 
      
    public static void main(String[] args) { 
        Fusion li = new Fusion(); 
        li.push(8); 
        li.push(29); 
        li.push(16); 
        li.push(2); 
        li.push(9); 
        li.push(11); 
        System.out.println("Liste non-triée :"); 
        li.printList(li.head); 
  
        // Applique le tri
        li.head = li.mergeSort(li.head); 
        System.out.print("\n Liste triée: \n"); 
        li.printList(li.head); 
    } 
} 