package jatkansakki.logiikka;

  /*********************************************************
 *        Patrik Helminen 20.5.2015                        *
 *        Ohjelmoinnin harjoitustyö [kesä 2015]            *
 *        Helsingin yliopisto (Avoin yliopisto)            *
 *********************************************************/




import java.util.Scanner;
public class Jatkansakki {

   
   
    
    
    
    public static void valikko()
    {
        /*---- PIIRRÄ VALIKKO--------------------------------------------------   
        kutsutaan metodilla valikko()
        -piirtää valikon käyttäjälle
        -ottaa vastaan käyttäjän syötteen ja kutsuu syötettä vastaavaa metodia         
             
        ----------------------------------------------------------------------*/         
        char valinta;
               
        Scanner valikonlukija = new Scanner(System.in);
        System.out.println("Valitse jokin vaihtoehto: (U)usi peli, (O)hjeet, (L)opeta");  
        valinta = valikonlukija.findInLine(".").charAt(0); //luetaan char -tyyppinen syöte
             
           switch (valinta) {
            case 'U':
                System.out.println("Uusi peli");
                // aloittaa uuden pelin valitulla vaikeusteella, oletus 1
                // GUI:ssa aloittaa uuden pelin valitulla vaikeusasteella, oletus 1
                System.out.println("Tämä on jätkänsakki, 4x4 ruudukolla");
                System.out.println("Minulla on 'X' merkki ja aloitan, sinulla on 'O' merkit");
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

        char xmerkki = 'X';
        char omerkki = 'O';

    
     
    
            // PÄÄSILMUKKA int i = 8 -> 4x4 laudassa on 16 ruutua 
            for(int i = 0; i <=8; i++)
            {
                
            /*---- KONEEN PELIVUORO--------------------------------------------------   
                arvotaan ja validoidaan kordinaatit X -merkkille ja sijoitetaan tauluun
                piirretään taulu käyttäjälle
                tarkistetaan johtiko merkin sijoittaminen pelilaudalle voiton, mikäli kyllä, lopetaan peli
            ----------------------------------------------------------------------*/      
           
                //valikko();
                Pelilauta.arvoPelitaulukkoon(pelitaulukko);
                Pelilauta.piirraPelitaulukko(pelitaulukko);
                
                if(Pelilauta.tarkistaVoitto(xmerkki, pelitaulukko))
                {    
                    System.out.println("Hävisit!");
                    i = 8;
                }

           
                
                // KÄYTTÄJÄN SYÖTTEEN vastaanottaminen ja validointi
                while(true)
                {
                    
                    System.out.print("Anna ruudun pystykoordinaatti, ylhäällä on 1: ");
                    int y = syotteenLukija.nextInt();
                    System.out.print("Anna ruudun vaakakoordinaatti, vasemmassa reunassa on 1: ");
                    int x = syotteenLukija.nextInt();
                    if (x >0 && x < 5 && y >0 && y < 5 && pelitaulukko[y-1][x-1] == ' ')
                    {
                        pelitaulukko[y-1][x-1] = 'O';
                        break;
                    }
                    System.out.println("Virheelliset koordinaatit tai ruutu on jo varattu, syötä uudestaan kordinaatit");
                }
                Pelilauta.piirraPelitaulukko(pelitaulukko);
                if(Pelilauta.tarkistaVoitto(omerkki, pelitaulukko))
                {
                    System.out.println("Voitit!");
                    i = 8;
                }
            }
            valikko();
        }

        
}

