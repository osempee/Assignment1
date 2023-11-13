package Assignment4;

public class Main {
    public static void main(String[] args) {
        Human human = new Human(3, "Peter");
        Horse horse = new Horse(27, "Polo");
        human.eat("Yum Yum Yum");

        Square square = new Square();
        Rectangle squareRectangle = new Square();
       // Square rectangleSquare = new Rectangle();

    }
    static class Rectangle{
        private int height;
        private int width;

        public void setHeight(int height) {
            this.height = height;
        }

        public void setWidth(int width) {
            this.width = width;
        }

    }
    static class Square extends Rectangle{
        @Override
        public void setHeight(int height) {
            super.setHeight(height);
        }

        @Override
        public void setWidth(int width) {
            super.setWidth(width);
        }
    }

}
