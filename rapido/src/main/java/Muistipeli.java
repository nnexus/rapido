  /*********************************************************
 *        Patrik Helminen 20.5.2015                        *
 *        Ohjelmoinnin harjoitustyö [kesä 2015]            *
 *        Helsingin yliopisto (Avoin yliopisto)            *
 *********************************************************/




import java.util.Scanner;
public class Muistipeli {

   
   
    
    
    
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
        Pelilauta.alustaPelitaulukko(pelitaulukko);
        //Pelilauta.piirraPelitaulukko(pelitaulukko);

        Scanner syotteenLukija = new Scanner (System.in);



    
        System.out.println("Tämä on jätkänsakki, 3x3 ruudukolla");
        System.out.println("Minulla on 'X' merkki ja aloitan, sinulla on 'O' merkit");
    
        
            for(int i = 0; i <=8; i++)
            {
            // ARVOTAAN X -merkki
           
                //valikko();
                Pelilauta.arvoPelitaulukkoon(pelitaulukko);
                Pelilauta.piirraPelitaulukko(pelitaulukko);


           
                
                // KÄYTTÄJÄN SYÖTTEEN vastaanottaminen ja validointi
                while (true)
                    {
                        System.out.print("Anna ruudun pystykoordinaatti, ylhäällä 1: ");
                        int y = syotteenLukija.nextInt();
                        System.out.print("anna ruudun vaakakoordinaatti, vasemmassa reunassa 1: ");
                        int x = syotteenLukija.nextInt();
                        if (x >0 && x < 5 && y >0 && y < 5 && pelitaulukko[y-1][x-1] == ' ')
                        {
                            pelitaulukko[y-1][x-1] = 'O';
                            break;
                        }
                        System.out.println("Virheelliset koordinaatit tai ruutu on jo varattu.");
                    }
                    Pelilauta.piirraPelitaulukko(pelitaulukko);
            }
        }
     // MÄÄRITETÄÄN GRIDin koko   
        
        
        
        
     // ARVOTAAN NUMEROT gridiin   
        
        
        
        /*---- PIIRRÄ VALIKKO--------------------------------------------------   
        arraylistillä tulostetaan taulukon sisältö halutun kokoiseen gridiin
            arrayn sisältöön arvotaan random mathilla numeroparien indeksit, 
            jotka sitten sijoitetaan taulukkoon
                
        ----------------------------------------------------------------------*/        
        
        
}

