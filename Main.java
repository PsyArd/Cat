public class Main {

    public static void main(String[] args) {
        Cat[] arrCats = new Cat[5];
        arrCats[0] = new Cat("Mota", 15);
        arrCats[1] = new Cat("Alice", 20);
        arrCats[2] = new Cat("Carl", 25);
        arrCats[3] = new Cat("Felix", 20);
        arrCats[4] = new Cat("Mishka", 30);

        Plate p = new Plate(100);

        for (Cat cat : arrCats) {
            cat.eat(p);
            cat.info();
        }
        p.info();
        p.addFood(100);
        p.info();
    }
}
