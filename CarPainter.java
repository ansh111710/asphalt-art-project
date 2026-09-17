import org.code.neighborhood.*;
public class CarPainter extends PainterPlus {
  public void paintAndMove() {
    paint("blue");
    move();
  }
  
   /* Paints the back of the hippo.
  This creates the upper section of the hippo. */
  
  public void paintBack() {
    paintAndMove();
    paintAndMove();
    paintAndMove();
    paint("blue");
  }

   /* Paints the main body of the hippo.
  This creates the long center section of the design.*/
  
  public void paintBody() {
    paintAndMove();
    paintAndMove();
    paintAndMove();
    paintAndMove();
    paintAndMove();
    paintAndMove();
    paintAndMove();
    paintAndMove();
    paintAndMove();
    paint("blue");
  }

   /* Paints the belly of the hippo.
 This creates the lower section of the hippo's body. */
  
  public void paintBelly() {
    paintAndMove();
    paintAndMove();
    paintAndMove();
    paintAndMove();
    paintAndMove();
    paintAndMove();
    paintAndMove();
    paintAndMove();
    paint("blue");
  }

   /* Paints one of the hippo's legs.
 This creates the legs underneath the body.*/
  
  public void paintLeg() {
    paint("blue");
  }
}


