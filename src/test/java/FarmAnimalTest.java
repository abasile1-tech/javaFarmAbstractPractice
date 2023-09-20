import org.example.FarmAnimal;
import org.example.Horse;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class FarmAnimalTest {

    private FarmAnimal farmAnimal;
    @Before
    public void before() {
        farmAnimal = new Horse();
    }

    @Test
    public void hasSpecies() {
        assertEquals("horse", farmAnimal.getSpecies());
    }

    @Test
    public void canIntroduceSelf() {
        assertEquals("Hi, I'm a horse", farmAnimal.introduceSelf());
    }

    @Test
    public void canMakeNoise() {
        assertEquals("Neigh", farmAnimal.makeNoise());
    }
}
