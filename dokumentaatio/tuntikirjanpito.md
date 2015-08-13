11.5.2015 ma OH 15min
os x komentorivin su -komento 15min

12.5.2015 ti OH 1h 45min
dokumentaatio komentolinjasta, sudo toimii hieman eri tavalla os x:ssä kuin linuxissa 90min
githubin asetukset & tilin luonti 15min

13.5.2015 ke OH 1h
SSH-avaimen luominen omalla koneella
ssh-agent // agentin luominen vaikeaa, en saanut tehtyä loppuun asti kohtaa:  Step 3: Add your key to the ssh-agent 60min


14.5.2015 to OH 3h 50min
Netbeans-projektin luominen repokansioon 
-javan (uusimman) asentaminen
-tmc-netbeansin asentaminen, installerin kanssa ongelmia - jouduin asentamaan netbeansin erikseen
tmc-plugarin kanssa 90min

-maven ja PIT
netbeansin projektikansion osoittaminen parempaan paikkaan - katso paketin sisään ->
Contents/Resources/etc/netbeans.conf 50min

netbeans meni rikki eikä suostunut käynnistymään enää toista kertaa - tunnistettu bugi

sudo killall -u nnexus // ei auttanu,
hard reset // auttoi

kotihakemiston luvituksissa on vikaa, eikä netbeans suostu käyttämään sitä // en saanut vielä korjattua 45min
tuntikirjan pito + kansiorakenne + aihemäärittely + labtools 45min

19.5.2015 ti 2h 15min
netbeans kotihakemiston uusi polku rikki, luvitukset ei toimi- chmod 755 ei auta!?	75min
luokkakaavion hahmottelua 30min
JUnit-yksikkötestauksen perusteiden lukemista 30min	   
	 
20.5.2015 ke 1h 15min 
ssh-agent
uuden avaimen luonti - ilman sudoa - sain viimein yhteyden toimimaan githubiin terminaalissa 30min 	
javan kirjoittamista - luokkien hahmottelua 30min
netbeansin kotikansion luvitukset + kansion lukitus, ei vain toimi,
johtuu todennäköisesti bugista: https://forums.netbeans.org/ntopic3753.html 15min
	
21.5.2015 to 3h	
netbeansin versio tmc:llä ei toimi, installeri ei lähde käyntiin
netbeansin asennus uudelleen, testaan versiota 8.0.1, edellinen 8.0.2  -> ei toimi 
hyväksyn tilanteen, että en saa asennettua os x:lle toimivaa netbeansia -> siirryn käyttämään pelkästään winkkua 60min

gitin asennus winkulle + SSH avain 

reposition valmisteleminen käyttö varten 
pieni repotreeni 
mave netbeansissa + .gitignore pushina repoon 100min

luokkakaavion lisääminen - lisäsin sen käsin työkoneen kloonihakemistoon ja pushasin 20min

23.5.2015 2h 20min
viikkotehtävien 1 & 2  hahmotus ylätasolla 20min
1. viikkotehtävä
-aihemäärittelyä tulee laajentaa hieman

2. viikkotehtävä

-ohjelmalogiikan hahmottelua 60min
-> liikkeelle yksinkertaisesta toteutuksesta
-JUnit, testaa mahdollisimman monta luokkaa ja metodia, noin 10 testiä valmiina
-tee seuraava iteraatio luokkakaaviosta ja stilisoi sitä
-hahmottele ensimmäinen versio ohjelmasta?
	
valikon rakenne 60min

2.6.2015 1h
Pohdintaa onko kurssiin mukaan enää mahdollista päästä. 

Luokkien hahmottelua ja luomista javalla
	-Pisteet
	-Sanat

Vaikea keksia miten pääsisin eteenpäin sanaparien taulukon muodostamisen kanssa. Mietin, että käyttäisin
aluksi vain moniulotteista chat -taulukkoa, johon syöttäisin kirjainpareja.

9.6. ti 1h 30min
GitBashin komentoja 30min
Muistipelin valikko 30min
metodeita: alustaPelitaulukko, piirraPelitaulukko, arvoPelitaulukkoon	30min

10.6. ke 1h 40min

muunnos muistipelistä jätkänsakiksi: luokkien ja metodien nimet 1h
pelin pääsilmukan rakenne + Pelilauta -luokkaan metodeita 40min

11.6. to 3h 30min
tarkistaVoitto -metodi, joka tarkistaa löytyykö perättäisiä merkkejä voittoon 1h

metodien kommenttikuvaukset tarkemmin 15min

ohjeen kuvauksen muokkaus 15min

github bashin - pullit ja pushit tulevat tutummiksi pikkuhiljaa komennoilla pelatessa 30min

PIT -raportin luonti
	-default -paketin poisto ja logiikka paketin luonti, en saanut generoitua raporttia 1h
	-JUnit -testaus materiaalin lukemista ja ensimmäisen testin PelilautaTest.java luonti 30min
	-Javadoc C:\Users\e63309\Desktop\GitHub\rapido\rapido\target\site\apidocs\index.html


29.7.2015 ke 30min
Sain onneksi jatkaa edellisen kurssin tyngäksi jäänyttä työtäni, joten uuden aiheen valinta ei ollut edessä. 

Muistinvirkistys:
Kurssin vaatimusten läpikäyminen 30min


5.8. ke 1h
GitHubin komennot 30minv
Kirjoittamani koodin tutkimista: luokat ja metodit 30min

6.8. to 1h 50min
Luokkakaavion päivittäminen uuteen vaihtuneeseen aiheeseen. Siivottu pois vanhat luokat ja päivitetty nimiä. 70min

GitHubi antaa komennolla: "git push" turhan usein
"fatal: 'origin' could not appear to be a git repository"
"fatal: could not read from remote repository"

JUnitin perusteiden lukemista ja miten käyttää niitä NetBeansissa. Illan aika loppui kesken, enkä saanut enää rakennettua mitään toimivaa testiä NB:hen.
PIT -raportin sain nopeasti generoitua uudelleen.  40min

11.8. ti 45min
GUI:n ja MVC:n perusteiden kertaamista 45min

12.8. ke 1h 
Luokkakaavion päivitys MVC:n mukaaan loogisemmaksi. Käyttöliittymä -luokan luonti ja sinne kuuluvien metodien siirtäminen sinne. 45min
Luokkien testauksen materiaalin lukemista, tein ensimmäisen metodin testin. 15min

13.8. to 2,5h
Testien kirjoittamista, en saanut toimimaan eilistä kirjoittamaani 30min
Vaikeuksia saada tehtyä testejä 1h
Luokkakaavion päivitys 1h	