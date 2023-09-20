import org.example.FarmAnimal;
import org.example.Horse;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class FarmAnimalTest {

    private FarmAnimal farmAnimal;
    @Before
    public void before() {
        farmAnimal = new Horse("palomino");
    }

    @Test
    public void hasSpecies() {
        assertEquals("horse", farmAnimal.getSpecies());
    }

    @Test
    public void canIntroduceSelf() {
        assertEquals("Hi, I am a horse from palomino family, neigh neigh", farmAnimal.introduceSelf());
    }

    @Test
    public void canMakeNoise() {
        assertEquals("neigh", farmAnimal.makeNoise());
    }
}
