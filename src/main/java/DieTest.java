import org.junit.Assert;
import org.junit.Test;


public class DieTest {
    Die die = new Die(6);
    @Test
    public void setProbabilities() {

        Assert.assertEquals(6, die.value);
        Assert.assertFalse(die.random< 7);
    }

    @Test
    public void roll() {

        Assert.assertFalse(die.random>6);
    }
}