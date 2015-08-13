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
       
      
       // testataan merkki = X 
       @Test 
       public void arvoPelitaulukkoon(char[][] taulukko)
   {
        while(true)
        {    
            int x = (int) (Math.random() * 4);
            int y = (int) (Math.random() * 4);
                
                if (taulukko[y][x] == ' ')
                {
                    taulukko[y][x] = 'X'; 
                    assertEquals('X', taulukko[y][x]);
                    break;
                }
        }
   }

}