package jatkansakki.logiikka;

  /*********************************************************
 *        Patrik Helminen 2.6.2015                         *
 *        Ohjelmoinnin harjoitustyö [kesä 2015]            *
 *        Helsingin yliopisto (Avoin yliopisto)            *
 *********************************************************/


public class Pelilauta {
    
    /*----alustaPelitaulukko-------------------------------------------------   
     syöttää 2-ulotteisen taulun täyteen tyhjiä ' ' -merkkejä
              
    ----------------------------------------------------------------------*/
   public static void alustaPelitaulukko(char[][] taulukko)
   {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
              taulukko[i][j] = ' ';
            }
        }
   }
   
    /*----piirraPelitaulukkko-----------------------------------------------   
     piirtää taulun sisällön reunojen kanssa
              
    ----------------------------------------------------------------------*/
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
   
    /*----arvoPelitaulukko---------------------------------------------------  
     piirtää taulun sisällön reunojen arvoPelitaulukkoon arpoo luvun 1-4 välillä 2-ulotteiseen kordinaatistoon
     solusta tarkistetaan sisältääkö se tyhjän ja jos niin syötetään siihen X -merkki
              
    ----------------------------------------------------------------------*/
   
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
   
    /*----arvoPelitaulukko---------------------------------------------------  EI VALMIS
     pyytää käyttäjältä syötteet kordinaatistoa varten, validoi ne ja jos kelpaa, eikä solussa ole
     X -merkkiä niin sijoittaa O -merkin tauluun         
    ----------------------------------------------------------------------*/
   public static void kayttajanSyoteTaulukkoon(char[][] taulukko)
   {
       System.out.println("");
   }
   

    /*----tarkistaVoitto---------------------------------------------------  
     piirtää taulun sisällön reunojen arvoPelitaulukkoon arpoo luvun 1-4 välillä 2-ulotteiseen kordinaatistoon
     solusta tarkistetaan sisältääkö se tyhjän ja jos niin syötetään siihen X -merkki
              
    ----------------------------------------------------------------------*/
   public static boolean tarkistaVoitto(char merkki, char[][] taulukko)
   {
        for(int i = 0; i < 4; i++){
            if(taulukko[i][0] == merkki && taulukko[i][1] == merkki && taulukko[i][2] == merkki && taulukko[i][3] == merkki){
                return true; // vaakarivi
            }
            if(taulukko[0][i] == merkki && taulukko[1][i] == merkki && taulukko[2][i] == merkki && taulukko[3][i] == merkki){    
                return true; // pystyrivi
            }
            if(taulukko[0][0] == merkki && taulukko[1][1] == merkki && taulukko[2][2] == merkki && taulukko[3][3] == merkki){
                return true; // vinorivi nouseva
            } 
            if(taulukko[0][3] == merkki && taulukko[1][2] == merkki && taulukko[2][1] == merkki && taulukko[3][0] == merkki){
                return true; // vinorivi laskeva
            } 
        }
        return false;
    }
   
  
   
   
    
}
