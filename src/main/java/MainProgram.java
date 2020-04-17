public class MainProgram {
    public static void main(String[] args) {
        Die die = new Die(6);
            die.roll();


        System.out.println("Six sided die returns "+die.value);

        Die die20 = new Die(20);
            die20.roll();
        System.out.println("Twenty sided die returns "+die20.value);

        Die dieDodgy6 = new Die(6,new int[]{1,1,1,1,1,2});
        dieDodgy6.roll();
        System.out.println("Weighted dice returns "+dieDodgy6.value);

    }
}
