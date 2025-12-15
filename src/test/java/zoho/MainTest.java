package zoho;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
	
    @Test
    void add_shouldReturnSum() {
        int result = Main.add(2, 3);
        assertEquals(5, result);
    } 

	@Test 
	void add_shouldReturnSum1(){
		int result = Main.add(3,3);
		assertEquals(7,result);
	}

}
