import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

CarPainter car = new CarPainter();
    car.setPaint(100);
    car.move();
    car.move();
    car.move();
    car.move();

    car.turnRight();

    car.move();
    car.move();
    car.move();
    car.move();


    car.turnLeft();
 
    car.paintBack();

    car.turnRight();
    car.move();
    car.turnRight();

     

    car.move();
    car.move();
    car.move();
    car.move();
    car.move();

    car.turnRight();
    car.turnRight();
 

    car.paintBody();

    car.turnRight();
    car.move();
    car.turnRight();

    

    int count = 0;
while (count < 8) {
    car.move();
    count++;
}

    car.turnRight();
    car.turnRight();
 
    
    car.paintBelly();

    car.turnRight();
    car.move();
    car.turnRight();

    car.move();
    car.paintLeg();

    car.move();
    car.move();
    car.move();
    car.move();

     car.paintLeg();

    car.move();
    car.move();
    
}
  }
