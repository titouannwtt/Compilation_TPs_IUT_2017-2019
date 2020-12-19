import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class ListController implements MouseListener{

    private Fenetre fen;
    public ListController(Fenetre f){
        this.fen=f;
    }

    public void mousePressed(MouseEvent e) {
     }
 
     public void mouseReleased(MouseEvent e) {
     }
 
     public void mouseEntered(MouseEvent e) {
     }
 
     public void mouseExited(MouseEvent e) {
     }
 
     public void mouseClicked(MouseEvent e){
         if(e.getClickCount()==1){
             this.fen.getSelectItem();
         }
     }

}