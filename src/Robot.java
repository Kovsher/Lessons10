public class Robot {
    private int x;
    private int y;

    public void doStep() {
        x++;
        y++;


    }
    public int getX(){
        return x;
            }
    public int getY(){
        return y;
    }
    public void setX(int x){
        if (x<=3&&x>0){
            this.x = x;
        }else {
            System.out.println("Слишком большой шаг");

        }
    }

    public void setY(int y) {
        if (y<=3&&y>0){
            this.y = y;
        }else {
            System.out.println("Слишком большой шаг");
                    }

            }
}

class Application {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.setX(2);
        robot.setY(3);
    }
}