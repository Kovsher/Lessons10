public class Cat extends Animal{
    public void move(){
        System.out.println("Move like a cat");
    }
    private String poroda;
    public Cat(boolean isVegan,String Food,String poroda){
        super(isVegan,Food);
        this.poroda=poroda;
    }
    public String getPoroda(){
        return poroda;
    }
}
