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
        System.out.println("Valitse jokin vaihtoehto: (U)usi peli, (V)aikeusaste, top-10 (P)isteet, (O)hjeet, (L)opeta");  
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
                System.out.println("Lopeta");
                // lopettaa pelin ja palaa alkuvalikkoon
                // GUI:ssa lopettaa pelin ja palaa alkuvalikkoon
                break;
            }     
    }
   
  
    public static void main(String[] args) {
    
          System.out.println("Tämä on muistipeli espanjankielisillä sanoilla!");
    
        
     
     valikko();
        
     
        
     // MÄÄRITETÄÄN GRIDin koko   
        
        
        
        
     // ARVOTAAN NUMEROT gridiin   
        
        
        
        /*---- PIIRRÄ VALIKKO--------------------------------------------------   
        arraylistillä tulostetaan taulukon sisältö halutun kokoiseen gridiin
            arrayn sisältöön arvotaan random mathilla numeroparien indeksit, 
            jotka sitten sijoitetaan taulukkoon
                
        ----------------------------------------------------------------------*/        
        
        
    }
}
