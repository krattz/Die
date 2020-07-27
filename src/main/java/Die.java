import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;


public class Die {
    private static final Logger logger = LogManager.getLogger(MainProgram.class.getName());
    public int value;
    Random r = new Random();
    final private int sides;
    private int [] probabilities;
    double random = Math.random();

    public Die(int sides) {
        this.sides = sides;
    }

    public Die(int sides, int[] probabilities) {
        this.sides = sides;
         this.probabilities = probabilities;
    }

        public void setProbabilities(int [] probabilities){
        this.probabilities = probabilities;
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
        }
        @Test
    public void roll(){
        value = r.nextInt(sides )+1;
        try {
            setProbabilities(probabilities);
        }catch (NullPointerException e){

            logger.error(""+e);}
Assert.assertFalse(value ==0);
    }
    }