public class TestProgrammers {

    public static void main(String[] args) {

        Programmer programmer1 = new Programmer();
        programmer1.name = "Gino";
        programmer1.wearGlasses = false;
        programmer1.age = 25;

        programmer1.drinkCoffe();
        programmer1.printDetails();


        Programmer programmer2 = new Programmer();
        programmer2.name = "Laura";
        programmer2.age = 28;
        programmer2.wearGlasses = true;

        programmer2.printDetails();
        programmer2.hasGlasses();


    }
}
