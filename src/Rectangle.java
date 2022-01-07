public class Rectangle {
    private double width;
    private double height;
    public Rectangle(){
        this.width = 0;
        this.height = 0;
    }
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return this.width * this.height;
    }

    public double getPerimeter(){
        return (this.width + this.height) *2;
    }

    public String toString(){
        return String.format("Hình chữ nhật có chiều rộng là %.3f, chiều dài là %.3f, chu vi là %.3f, diện tích là %.3f",
                this.width, this.height, this.getPerimeter(), this.getArea());
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
