  /*********************************************************
 *        Patrik Helminen 20.5.2015                        *
 *        Ohjelmoinnin harjoitustyö [kesä 2015]            *
 *        Helsingin yliopisto (Avoin yliopisto)            *
 *********************************************************/




import java.util.Scanner;
public class Muistipeli {

    public static void alustaPelitaulukko(char[][] taulukko)
    {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
              taulukko[i][j] = ' ';
            }
        }
    }
    
    public static void piirraPelitaulukko(char[][] taulukko)
    {
        System.out.println(" --------");
        for (int i = 0; i < 4; i++) {
            System.out.print("| ");
            for (int j = 0; j < 4; j++) {
                System.out.print(taulukko[i][j] + " ");
            }
            System.out.println("|");
    }
        System.out.println(" --------");
        System.out.println();
    }
    
    public static void arvoPelitaulukkoon(char[][] taulukko)
    {
        int x = (int) (Math.random() * 4);
            int y = (int) (Math.random() * 4);
                if (taulukko[y][x] == ' ')
                {
                    taulukko[y][x] = 'X';
                   
                }
    }
    
    public static void valikko()
    {
        /*---- PIIRRÄ VALIKKO--------------------------------------------------   
        kutsutaan metodilla valikko()
        -piirtää valikon käyttäjälle
        -ottaa vastaan käyttäjän syötteen ja kutsuu syötettä vastaavaa metodia         
             
        ----------------------------------------------------------------------*/         
        char valinta;
               
        Scanner valikonlukija = new Scanner(System.in);
        System.out.println("Valitse jokin vaihtoehto: (U)usi peli, (V)aikeusaste, (P)isteet top-10, (O)hjeet, (L)opeta");  
        valinta = valikonlukija.findInLine(".").charAt(0); //luetaan char -tyyppinen syöte
             
           switch (valinta) {
            case 'U':
                System.out.println("Uusi peli");
                // aloittaa uuden pelin valitulla vaikeusteella, oletus 1
                // GUI:ssa aloittaa uuden pelin valitulla vaikeusasteella, oletus 1
          
                break;
            case 'V':
                System.out.println("Vaikeusaste");
                // printtaa nykyisen vaikeusasteen ja ottaa vastaan syötteen uudesta
                // GUI:ssa nykyinen vaikeusastet pop uppina ja ottaa vastaan syötteen uudesta
                break;
            case 'P':
                System.out.println("Pisteet");
                // printtaa maksimipisteet top-10 pelaajaa 
                // GUI:ssa maksimipisteet pop upppina top-10 pelaajaa 
                break;
            case 'O':
                System.out.println("Ohjeet");
                // printataan lyhyet ohjeet miten peliä pelataan - .txt -filenä?
                // GUI:ssa ohjeet pop uppina
                break;
                
           
            case 'L':
                System.out.println("Lopetit!");
                // lopettaa pelin ja palaa alkuvalikkoon
                // GUI:ssa lopettaa pelin ja palaa alkuvalikkoon
                break;
            }
            System.out.println("TESTI ulos switch");
    }
   
  
    public static void main(String[] args) {
        
        char[][] pelitaulukko = new char[4][4];
        alustaPelitaulukko(pelitaulukko);
        piirraPelitaulukko(pelitaulukko);


    
        System.out.println("Tämä on muistipeli espanjankielisillä sanoilla!");
    
       
        while(true)
        {
            valikko();
         
       
        }
     
        
     // MÄÄRITETÄÄN GRIDin koko   
        
        
        
        
     // ARVOTAAN NUMEROT gridiin   
        
        
        
        /*---- PIIRRÄ VALIKKO--------------------------------------------------   
        arraylistillä tulostetaan taulukon sisältö halutun kokoiseen gridiin
            arrayn sisältöön arvotaan random mathilla numeroparien indeksit, 
            jotka sitten sijoitetaan taulukkoon
                
        ----------------------------------------------------------------------*/        
        
        
    }
}
