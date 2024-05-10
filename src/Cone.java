public class Cone extends Circle {
    private double height = 1;
    Cone(){}

    Cone(double radius, double height){
        super(radius);
        this.height = height;
    }
    Cone(double radius, double height, String color){
        super(radius, color);
        this.height = height;
    }
    public double getHeight() {
        return this.height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        double volume = (1.0/3) * super.getArea() * this.getHeight();
        return volume;
    }
    @Override
    public double getArea(){
        double area = Math.PI * super.getRadius() * super.getRadius() + Math.PI * super.getRadius() * Math.sqrt(Math.pow(super.getRadius(), 2) + Math.pow(this.getHeight(), 2));
        return area;
    }
    @Override
    public String toString() {
        return String.format("\nbase radius=%.2f, \ncolor=%s, \nheight=%.2f, \nVolume=%.4f, \nSurface Area=%.5f",super.getRadius(),super.getColor(),this.getHeight(),this.getVolume(),this.getArea());
    }

}
