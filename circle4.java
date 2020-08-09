

public class Circle4 extends GeometricObject{
  double radius;

  //constructor
  Circle4(){};
  //constructor2
  Circle4(double radius){
    this.radius = radius;
  };

  //constructor3
  Circle4(double radius, String color, boolean filled){
    this.radius = radius;
    this.color = color;
    this.filled = filled;
  };
}
