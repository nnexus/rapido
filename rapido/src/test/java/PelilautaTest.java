/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author E63309
 */
public class PelilautaTest {
    
    public PelilautaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
        @Test
     
        public static void arvoPelitaulukkoon(char[][] taulukko){
        
        
           // assertTrue(x < 5 && x > 0);

     
}
        
        @Test
        
       public static void alustaPelitaulukko(char[][] taulukko)
   {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
              taulukko[i][j] = ' ';
            }
        }
        
        assertTrue(i == 0);
   }

}