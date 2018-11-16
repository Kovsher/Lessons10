public abstract class Animal {
    public abstract void move();
    private boolean isVegeterian;
    protected String Food;

    public  Animal() {
    }

    ;


    public Animal(Boolean isVegan, String Food){
    this.isVegeterian=isVegan;
       this.Food=Food;

}

    public boolean isVegeterian() {
        return isVegeterian;
    }

    public String getFood() {
        return Food;
    }


}
