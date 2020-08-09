public class GeometricObject {
  String color;
  boolean filled;
  java.util.Date dateCreate;

  // empty constructor
  GeometricObject() {
  };

  // constructor
  GeometricObject(String color, boolean filled) {
    this.color = color;
    this.filled = filled;
  };

  // get the color
  public String getColor() {
    return color;
  };

  // set the color
  public void setColor(String color) {
    this.color = color;
  };

  // boolean for wether or not its filled
  public boolean isFilled() {
    return filled;
  };

  // set a new filled boolean prop
  public void setFilled(boolean filled) {
    this.filled = filled;
  };

  // Date
  public java.util.Date getCreated() {
    return dateCreate;
  };

  // turn this to understandable string
  public String toString() {
    return "Date " + dateCreate + "\nColor: " + color + "\nFilled " + filled;
  };

}
