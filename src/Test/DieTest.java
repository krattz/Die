import org.junit.Assert;
import org.junit.Test;

import java.util.Random;


public class DieTest {
    public int value;
    Random r = new Random();
    private int sides;
    private int [] probabilities;
    double random = Math.random();

    @Test
    public void setProbabilities(int [] probabilities) {
        this.probabilities = probabilities;
        sides = 6;
        probabilities = new int[]{6};
        int result = 0;
        for (int probability : probabilities) {
            result += probability;
        }

        double [] np = new double[result];
        if(probabilities.length ==sides){
            for (int i = 0; i <probabilities.length ; i++) {
                np[i] = (probabilities[i])/(result*1.0);
            }
            for (int i = 0; i < probabilities.length ; i++) {
                if (random< np[i]) {
                    value = i+1;
                    break;
                }
            }
        }
        Assert.assertEquals(6, result);
    }

    @org.junit.Test
    public void roll() {
        sides = 6;
        value = r.nextInt(sides )+1;
        try {
            setProbabilities(probabilities);
        }catch (NullPointerException e){

        Assert.assertFalse(value ==0);
    }
}
}