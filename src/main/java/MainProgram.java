public class MainProgram {
  //  private static final Logger logger = LogManager.getLogger(MainProgram.class.getName());
    public static void main(String[] args) {
        Die die = new Die(6);
//        try {
            die.roll();
//        }catch (NullPointerException e){}

        System.out.println("Six sided die returns "+die.value);

        Die die20 = new Die(20);
//        try {
            die20.roll();
//        }catch (NullPointerException e){}
        System.out.println("Twenty sided die returns "+die20.value);

        Die dieDodgy6 = new Die(6,new int[]{1,1,1,1,1,2});
        dieDodgy6.roll();
        System.out.println("Weighted dice returns "+dieDodgy6.value);

    }
}
