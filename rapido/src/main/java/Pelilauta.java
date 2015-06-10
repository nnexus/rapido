  /*********************************************************
 *        Patrik Helminen 2.6.2015                         *
 *        Ohjelmoinnin harjoitustyö [kesä 2015]            *
 *        Helsingin yliopisto (Avoin yliopisto)            *
 *********************************************************/


public class Pelilauta {
    

   /*  alustaPelitaulukko syöttää 2-ulotteisen taulun täyteen tyhjiä ' ' -merkkejä
   *   
   */        
   public static void alustaPelitaulukko(char[][] taulukko)
   {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
              taulukko[i][j] = ' ';
            }
        }
   }
   
   /*  piirraPelitaulukko piirtää taulun sisällön reunojen kanssa
   *   
   */
   public static void piirraPelitaulukko(char[][] taulukko)
   {
        System.out.println(" ********");
        for (int i = 0; i < 4; i++) {
            System.out.print("* ");
            for (int j = 0; j < 4; j++) {
                System.out.print(taulukko[i][j] + " ");
            }
            System.out.println("*");
   }
        System.out.println(" ********");
        System.out.println();
   }
   
   /*  arvoPelitaulukkoon arpoo luvun 1-4 välillä 2-ulotteiseen kordinaatistoon
   *   solusta tarkistetaan sisältääkö se tyhjän ja jos niin syötetään siihen X -merkki
   */
   public static void arvoPelitaulukkoon(char[][] taulukko)
   {
        while(true)
        {    
            int x = (int) (Math.random() * 4);
            int y = (int) (Math.random() * 4);
                
                if (taulukko[y][x] == ' ')
                {
                    taulukko[y][x] = 'X'; 
                    break;
                }
        }
   }
   
   
   
  
   
   
    
}
