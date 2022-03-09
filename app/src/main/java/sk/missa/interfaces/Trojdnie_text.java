package sk.missa.interfaces;

/*
* vsuvkyTrojdnieEM - vsuvky do eucharistických modlitieb na Zelený štvrtok (ZŠ) a Bielu sobotu (BS)
* evanjeliumSobota - evanjelium na Bielu sobotu (A, B, C)
* sobota - texty na Bielu sobotu
* piatok - texty na Veľký piatok
* stvrtok - texty na Zelený štvrtok
* Skratky pre texty (kvôli rôznemu spôsobu výpisu):
  S - nadpis
  N - podnadpisy
  K - komentare
  V - vyskakovacie okna
  E - citania, evanjelia, zalmy
  A - komentare okolo evanjelia na bielu sobotu
  P - prefacia
  O - obrad prijimanie
*/

public interface Trojdnie_text {

    String[][] vsuvkyTrojdnieEM = {
            {"ZŠ", "<font color='#B71C1C'>2.k</font> V spoločenstve s celou Cirkvou<br>" +
                    "v presvätý deň,<br>" +
                    "keď sa náš Pán Ježiš Kristus<br>" +
                    "vydal za nás na smrť,<br>" +
                    "s úctou si spomíname<br>" +
                    "najmä na preblahoslavenú Máriu, vždy Pannu,<br>" +
                    "Rodičku Ježiša Krista,<br>" +
                    "Boha a nášho Pána,",
                    "<font color='#B71C1C'>HI</font> Bože, milostivo prijmi túto obetu,<br>" +
                            "ktorú ti predkladáme my, tvoji služobníci,<br>" +
                            "i celá tvoj a rodina<br>" +
                            "na pamiatku dňa, keď náš Pán Ježiš Kristus<br>" +
                            "svojich učeníkov poveril<br>" +
                            "slávením sviatostných tajomstiev<br>" +
                            "svojho tela a krvi.<br>" +
                            "Spravuj naše dni vo svojom pokoji,<br>" +
                            "zachráň nás od večného zatratenia<br>" +
                            "a pripočítaj k zástupu svojich vyvolených.",
                    "On večer pred svojím umučením<br>" +
                            "za spasenie nás i všetkých ľudí,<br>" +
                            "čiže dnes."},
            {"BS", "<font color='#B71C1C'>2.k</font> V spoločenstve s celou Cirkvou<br>" +
                    "v presvätú noc,<br>" +
                    "keď náš Pán Ježiš Kristus<br>" +
                    "vstal z mŕtvych,<br>" +
                    "s úctou si spomíname<br>" +
                    "najmä na preblahoslavenú Máriu, vždy Pannu,<br>" +
                    "Rodičku Ježiša Krista,<br>" +
                    "Boha a nášho Pána,",
                    "<font color='#B71C1C'>HI</font> Bože, milostivo prijmi túto obetu,<br>" +
                            "ktorú ti predkladáme<br>" +
                            "my, tvoji služobníci,<br>" +
                            "i celá tvoja rodina.<br>" +
                            "Prinášame ti ju za tých,<br>" +
                            "ktorých si znovuzrodil z vody<br>" +
                            "a z Ducha Svätého<br>" +
                            "a udelil si im odpustenie všetkých hriechov",},
    };

    String[][] evanjeliumSobota = {
            {"Mt 28, 1-10", "Vstal z mŕtvych a ide pred vami do Galiley",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého Evanjelia podľa Matúša" +
                            "Keď sa pominula sobota, na úsvite prvého dňa v týždni prišla Mária Magdaléna a iná Mária pozrieť hrob. Vtom nastalo veľké zemetrasenie, lebo z neba zostúpil Pánov anjel, pristúpil, odvalil kameň a sadol si naň. Jeho zjav bol ako blesk a jeho odev biely ako sneh. Strážnici strnuli od strachu z neho a ostali ako mŕtvi.<br>" +
                            "Anjel sa prihovoril ženám: „Vy sa nebojte! Viem, že hľadáte Ježiša, ktorý bol ukrižovaný. Niet ho tu, lebo vstal, ako povedal. Poďte, pozrite si miesto, kde ležal. A rýchlo choďte povedať jeho učeníkom: ‚Vstal z mŕtvych a ide pred vami do Galiley. Tam ho uvidíte.‘ Hľa, povedal som vám to.“<br>" +
                            "Rýchlo vyšli z hrobu a so strachom i s veľkou radosťou bežali to oznámiť jeho učeníkom.<br>" +
                            "A hľa, Ježiš im išiel v ústrety a oslovil ich: „Pozdravujem vás!“ Ony pristúpili, objali mu nohy a klaňali sa mu. Tu im Ježiš povedal: „Nebojte sa! Choďte, oznámte mojim bratom, aby šli do Galiley; tam ma uvidia.“<br>" +
                            "Počuli sme slovo Pánovo."},
            {"Mk 16, 1-8", "Ukrižovaný Ježiš Nazaretský vstal z mŕtvych",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého Evanjelia podľa Marka" +
                            "Keď sa pominula sobota, Mária Magdaléna a Mária Jakubova i Salome nakúpili voňavé oleje a išli ho pomazať. V prvý deň týždňa, skoro ráno, po východe slnka, prišli k hrobu a hovorili si: „Kto nám odvalí kameň od vchodu do hrobu?“<br>" +
                            "Ale keď sa pozreli, videli, že kameň je odvalený; bol totiž veľmi veľký.<br>" +
                            "Keď vošli do hrobu, na pravej strane videli sedieť mladíka oblečeného do bieleho rúcha a stŕpli.<br>" +
                            "On sa im prihovoril: „Neľakajte sa! Hľadáte Ježiša Nazaretského, ktorý bol ukrižovaný. Vstal z mŕtvych. Niet ho tu. Hľa, miesto, kde ho uložili. Ale choďte a povedzte jeho učeníkom a Petrovi: ‚Ide pred vami do Galiley. Tam ho uvidíte, ako vám povedal.‘“<br>" +
                            "Vyšli a utekali od hrobu, lebo sa ich zmocnila hrôza a strach. A nepovedali nikomu nič, lebo sa báli.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"Lk 24, 1-12", "Prečo hľadáte živého medzi mŕtvymi?",
                    "<font color='#B71C1C'>†</font> Čítanie zo svätého Evanjelia podľa Lukáša" +
                            "V prvý deň týždňa zavčas ráno prišli k hrobu ženy a priniesli voňavé oleje, čo si pripravili. Kameň našli od hrobu odvalený, vošli dnu, ale telo Pána Ježiša nenašli.<br>" +
                            "Ako nad tým rozpačito uvažovali, zastali pri nich dvaja mužovia v žiarivom odeve. Zmocnil sa ich strach i sklonili tvár k zemi. Ale oni sa im prihovorili: „Prečo hľadáte živého medzi mŕtvymi? Niet ho tu. Vstal z mŕtvych. Spomeňte si, ako vám povedal, keď bol ešte v Galilei: ‚Syna človeka musia vydať do rúk hriešnych ľudí a ukrižovať, ale on tretieho dňa vstane z mŕtvych.‘“ Tu sa rozpamätali na jeho slová, vrátili sa od hrobu a toto všetko zvestovali Jedenástim i všetkým ostatným. Bola to Mária Magdaléna, Jana a Mária Jakubova. A s nimi aj iné to rozprávali apoštolom.<br>" +
                            "Ale im sa zdali tieto slová ako blúznenie a neverili im.<br>" +
                            "No Peter vstal a bežal k hrobu. Keď sa nahol dnu, videl tam len plachty. I vrátil sa domov a čudoval sa, čo sa stalo.<br>" +
                            "Počuli sme slovo Pánovo."}
    };

    String[][] sobota = {
            {"S", "BIELA SOBOTA\nalebo\nVEĽKÁ SOBOTA"},
            {"K", "<font color='#000000'>1.</font> Podľa pradávnej tradície táto noc je očakávaním Pána (Ex 12, 42). Preto podľa napomenutia evanjelia (Lk 12, 35n) veriaci s horiacimi sviecami v rukách sa majú podobať ľudom očakávajúcim návrat svojho Pána. Ked príde a nájde ich bedliť, dá im miesto pri svojom stole.<br>" +
                    "<font color='#000000'>2.</font> Veľkonočná vigília sa slávi takto: Po krátkom obrade svetla (prvá časť vigílie) svätá Cirkev rozjíma o divoch, ktoré Pán konal od začiatku pre svoj ľud, a prejavuje dôveru v Pánovo slovo a v jeho prísľub (druhá časť vigílie - liturgia slova); keď nastáva deň zmŕtvychvstania, celá Cirkev spolu s tými, čo sa znovuzrodili v krste (tretia časť vigílie), je pozvaná na sviatostnú hostinu, ktorú svojmu ľudu pripravil Pán svojou smrťou a zmŕtvychvstaním (štvrtá časť vigílie).<br>" +
                    "<font color='#000000'>3.</font> Celá slávnosť Veľkonočnej vigílie sa koná v noci. Nemá sa začať pred súmrakom a má sa skončiť pred svitaním nedeľného rána.<br>" +
                    "<font color='#000000'>4.</font> Omša vigílie, aj keď sa slávi pred polnocou, je omšou Veľkonočnej nedele. Veriaci, ktorí prijali Oltárnu sviatosť cez svätú omšu v noci, môžu ju znova prijať v druhej veľkonočnej omši vo dne.<br>" +
                    "<font color='#000000'>5.</font> Kňazi, ktorí celebrovali alebo koncelebrovali svätú omšu v noci, môžu celebrovať alebo koncelebrovať druhú veľkonočnú omšu<br>" +
                    "<font color='#000000'>6.</font> Na slávenie veľkonočnej vigílie kňaz a prisluhujúci si oblečú biele omšové rúcho.<br>" +
                    "Ak je možné, je treba na vhodnom mieste mimo kostola pripraviť z dreva vatru na požehnanie nového ohňa; plameň by mal byť taký, aby naozaj rozptýlili tmu a osvietil noc. Pretože ide o pravdivosť znaku, veľkonočnú sviecu treba pripraviť z vosku, každý rok novú, jedinú, dosť veľkú, nikdy nie umelú, lebo iba tak bude môcť naznačiť, že Kristus je svetlo sveta.<br>" +
                    "Pre všetkých účastníkov vigílie treba pripraviť sviece."},
            {"N", "I. časť: Slávnostný začiatok vigílie: Obrad svetla"},
            {"C", "Požehnanie ohňa a príprava veľkonočnej sviece",},
            {"K", "<font color='#000000'>7.</font> V kostole sa zhasia svetlá. Na vhodnom mieste mimo kostola sa pripraví oheň. Keď sa tam už zhromaždili veriaci, príde kňaz s prisluhujúcimi; jeden z nich nesie veľkonočnú sviecu (paškál). Keď nemožno posvätiť oheň mimo kostola, obrad sa koná, ako je uvedené pod č. 13.<br>" +
                    "<font color='#000000'>8.</font> Kňaz pozdraví zhromaždený ľud zvyčajným spôsobom a krátko ho poučí o veľkonočnej vigílii týmito alebo podobnými slovami:",
                    "Bratia a sestry, v túto presvätú noc náš Pán Ježiš " +
                            "Kristus vstal z mŕtvych. Preto Cirkev po celom svete " +
                            "zvoláva svojich synov a dcéry a zhromažďuje ich, " +
                            "aby bedlili a modlili sa. Aj my sme prijali toto pozvanie.<br>" +
                            "Pripomenieme si Pánovo zmŕtvychvstanie, budeme " +
                            "počúvať Božie slovo a oslávime veľkonočné tajomstvo" +
                            "v nádeji, že budeme mať podiel na Kristovom víťazstve " +
                            "nad smrťou a na jeho živote v Bohu.",
                    "<font color='#000000'>9.</font> Potom požehná oheň.",
                    "Modlime sa.<br>" +
                            "Všemohúci a večný Bože,<br>" +
                            "skrze svojho Syna ožiaril si nás<br>" +
                            "svetlom svojej slávy; <font color='#B71C1C'>*</font><br>" +
                            "posväť <font color='#B71C1C'>+</font> tento nový oheň<br>" +
                            "a veľkonočnou slávnosťou<br>" +
                            "roznieť v nás túžbu po tebe, <font color='#B71C1C'>—</font><br>" +
                            "aby sme s čistým srdcom<br>" +
                            "mohli vojsť do kráľovstva<br>" +
                            "Skrze Krista, nášho Pána.<br>" +
                            "večného svetla.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Amen.<br>",
                    "Od posväteného ohňa sa zapáli veľkonočná svieca.<br>" +
                            "<font color='#000000'>10.</font> Ak je pre veriacich užitočnejšie zvýrazniť dôstojnosť a význam veľkonočnej sviece nejakými symbolmi, možno to urobiť takto:<br>" +
                            "Po požehnaní nového ohňa akolyta alebo jeden z prisluhujúcich prinesie pred celebranta veľkonočnú sviecu. Celebrant vryje do sviece kríž; nad kríž napíše grécke písmeno alfa, pod kríž písmeno omega a medzi ramená kríža vpíše štyri číslice bežného roku. Pritom hovorí:<br>" +
                            "(celebrant vrýva zvislú čiaru kríža)",
                    "Kristus je ten istý včera i dnes.",
                    "(kňaz vrýva vodorovnú čiaru kríža)",
                    "On je počiatok a koniec,",
                    "(nad zvislú čiaru kríža vrýva písmeno alfa)",
                    "Alfa",
                    "(pod zvislú čiaru kríža vrýva písmeno omega)",
                    "i Omega,",
                    "(do ľavého horného uhla kríža vrýva prvú číslicu letopočtu)",
                    "Pán času",
                    "(do pravého horného uhla kríža vrýva druhú číslicu letopočtu)",
                    "i večnosti.",
                    "(do ľavého spodného uhla kríža vrýva tretiu číslicu letopočtu)",
                    "Jemu patrí sláva i moc",
                    "(do spodného pravého uhla kríža vrýva štvrtú číslicu letopočtu)",
                    "po všetky veky vekov. Amen",
                    "<font color='#000000'>11.</font> Keď už vryl do sviece kríž a ostatné znaky, môže do nej vsadiť v podobe kríža päť hrudiek tymianu v naznačenom poradí. Pritom hovorí:",
                    "<font color='#B71C1C'>1</font> - Pre svoje sväté<br>" +
                            "<font color='#B71C1C'>2</font> - a oslávené rany<br>" +
                            "<font color='#B71C1C'>3</font> - nech nás ochraňuje<br>" +
                            "<font color='#B71C1C'>4</font> - a zachováva<br>" +
                            "<font color='#B71C1C'>5</font> - Kristus, náš Pán. Amen.",
                    "<font color='#000000'>12.</font> Kňaz od po sväteného ohňa zapáli veľkonočnú sviecu a hovorí:",
                    "Svetlo Krista, ktorý slávne vstal z mŕtvych,<br>" +
                            "nech zaženie tmu z našich sŕdc a myslí.",
                    "Tieto symbolické úkony možno použiť všetky alebo len niektoré, podľa miestnych okolností. Biskupská konferencia môže stanoviť iný spôsob, lepšie vyhovujúci mentalite veriacich.<br>" +
                            "<font color='#000000'>13.</font> Ak sa pre prípadné ťažkosti nežehná oheň vonku, obrad požehnania ohňa sa prispôsobí okolnostiam. Keď sa ľud zhromaždí v kostole, kňaz a prisluhujúci s veľkonočnou sviecou prídu k bráne kostola. Ak je možné, ľud sa obráti tvárou ku kňazovi.<br>" +
                            "Nasleduje pozdrav a poučenie (pozri č. 8). Potom sa žehná oheň (pozri č. 9) a prípadne sa pripraví a zažne veľkonočná svieca (pozri č. 10-12).", null},
            {"C", "Sprievod"},
            {"K", "<font color='#000000'>14.</font> Diakon alebo (ak nieto diakona) kňaz vezme veľkonočnú sviecu, drží ju pozdvihnutú a spieva:",
                    "Kristus, svetlo sveta.",
                    "Všetci odpovedajú:",
                    "Bohu vďaka.",
                    "Všetci vojdú do kostola. Na čele ide diakon (kňaz) s veľkonočnou sviecou. Ak sa používa kadidlo, posluhujúci s dymiacou kadidelnicou kráča pred diakonom (kňazom).<br>" +
                            "<font color='#000000'>15.</font> Pri vchode do kostola diakon (kňaz) zastane, pozdvihne sviecu a znova spieva:",
                    "Kristus, svetlo sveta.",
                    "Všetci odpovedajú:",
                    "Bohu vďaka.",
                    "Potom si zapália sviečky od veľkonočnej sviece a sprievod pokračuje.<br>" +
                            "<font color='#000000'>16.</font> Diakon (kňaz) pred oltárom zastane, obráti sa k ľudu a tretí raz spieva:",
                    "Kristus, svetlo sveta.",
                    "Všetci odpovedajú:",
                    "Bohu vďaka.",
                    "V kostole sa zažnú všetky svetlá (okrem sviec na oltári).", null},
            {"C", "Veľkonočný chválospev"},
            {"K", "<font color='#000000'>17.</font> Po príchode k oltáru kňaz ide k sedadlu. Diakon (alebo sám kňaz) postaví veľkonočnú sviecu na svietnik, pripravený uprostred presbytéria alebo vedľa ambóny. Ak sa používa kadidelnica, vloží do nej temian ako na evanjelium vo svätej omši. Potom požiada kňaza o požehnanie. Kňaz mu ho dá polohlasne týmito slovami:",
                    "Pán nech je v tvojom srdci i na tvojich perách,<br>" +
                            "aby si dôstojne predniesol veľkonočný chválospev<br>" +
                            "v mene Otca i Syna <font color='#B71C1C'>+</font> i Ducha Svätého.<br>" +
                            "<font color='#B71C1C'>O.:</font> Amen.",
                    "Toto požehnanie sa vynechá, ak chválospev prednesie niekto iný ako diakon. Diakon alebo (ak nieto diakona) kňaz môže incenzovať knihu i sviecu a potom na ambone alebo pri stojane prednesie veľkonočný chválospev. Všetci zatiaľ stoja a držia v rukách zažaté sviece. Podľa potreby chválospev môže spievať aj spevák, ktorý nie je diakonom. V dlhšom znení chválospevu však vynechá stať " +
                            "<font color='#000000'>Prosím vás teda, bratia a sestry</font> až do konca úvodu a v dlhšom i kratšom znení chválospevu vynechá pozdravenie " +
                            "<font color='#000000'>Pán s vami.</font> Chválospev možno spievať aj v skrátenom znení. Biskupské konferencie môžu vložiť do chválospevu niekoľko zvolaní pre ľud.", null},
            {"V", "KRATŠÍ VEĽKONOČNÝ CHVÁLOSPEV", null, null, null, null,
                    "Zaplesaj, nebeský chór anjelov,<br>" +
                            "zaplesajte, oslávení v nebi,<br>" +
                            "nech zahlaholí chválospev<br>" +
                            "na oslavu víťazného Krista.<br>" +
                            "<br>" +
                            "Zaraduj sa, zem, zaplavená toľkým jasom,<br>" +
                            "lebo svetlo večného Kráľa<br>" +
                            "vymanilo ťa z moci temnôt.<br>" +
                            "Raduj sa aj ty, Matka Cirkev,<br>" +
                            "ozdobená žiarou Pánovej slávy,<br>" +
                            "a tento chrám nech zaznie<br>" +
                            "naším jasavým spevom.<br>" +
                            "<br>" +
                            "<font color='#B71C1C'>V.:</font> <font color='#B71C1C'>(</font>Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<font color='#B71C1C'>)</font><br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br>" +
                            "<br>" +
                            "Je naozaj dôstojné a správne<br>" +
                            "z hĺbky srdca a z celej duše zvelebovať<br>" +
                            "neviditeľného, všemohúceho Boha Otca<br>" +
                            "a ospevovať jeho jednorodeného Syna,<br>" +
                            "nášho Pána Ježiša Krista.<br>" +
                            "<br>" +
                            "On namiesto nás splatil večnému Otcovi<br>" +
                            "dlžobu za hriech Adamov<br>" +
                            "a svojou krvou zrušil výrok odsúdenia<br>" +
                            "za prvotnú vinu.<br>" +
                            "<br>" +
                            "Lebo slávime veľkonočné sviatky,<br>" +
                            "keď bol zabitý pravý Baránok,<br>" +
                            "ktorého krv posväcuje dveraje veriacich.<br>" +
                            "<br>" +
                            "Toto je noc,<br>" +
                            "v ktorej si našim otcom, synom Izraela,<br>" +
                            "pomohol prejsť suchou nohou cez Červené more,<br>" +
                            "keď si ich vyviedol z Egypta.<br>" +
                            "<br>" +
                            "Toto je noc,<br>" +
                            "v ktorej jas ohnivého stĺpa<br>" +
                            "rozohnal temnoty hriechu.<br>" +
                            "<br>" +
                            "Toto je noc,<br>" +
                            "ktorá dnes na celej zemi<br>" +
                            "veriacich v Krista<br>" +
                            "vymaňuje z neprávosti sveta<br>" +
                            "a z otroctva hriechu,<br>" +
                            "vracia im Božiu milosť<br>" +
                            "a vovádza ich do spoločenstva svätých.<br>" +
                            "<br>" +
                            "Toto je noc,<br>" +
                            "v ktorej Kristus rozlámal okovy smrti<br>" +
                            "a víťazne vstal z hrobu.<br>" +
                            "<br>" +
                            "Aká nesmierna je voči nám tvoja dobrota, Otče,<br>" +
                            "aká nevyspytateľná je tvoja láska!<br>" +
                            "Aby si vykúpil otroka,<br>" +
                            "vydal si na smrť vlastného Syna!<br>" +
                            "Naozaj potrebný bol hriech Adamov,<br>" +
                            "ktorý zotrela smrť Kristova !<br>" +
                            "Ó, šťastná vina,<br>" +
                            "pre ktorú k nám prišiel taký vznešený Vykupiteľ!<br>" +
                            "<br>" +
                            "Posvätné tajomstvo tejto noci premáha zlobu,<br>" +
                            "zmýva viny,<br>" +
                            "hriešnikom vracia nevinnosť<br>" +
                            "a radosť zarmúteným.<br>" +
                            "<br>" +
                            "Naozaj požehnaná noc,<br>" +
                            "ktorá spája nebo so zemou<br>" +
                            "a človeka s Bohom.<br>" +
                            "<br>" +
                            "Preto v túto milostivú noc<br>" +
                            "prijmi, presvätý Otče,<br>" +
                            "našu večernú obetu chvály,<br>" +
                            "ktorú ti prináša svätá Cirkev,<br>" +
                            "keď rukami svojich služobníkov<br>" +
                            "slávnostne ti predkladá túto veľkonočnú sviecu,<br>" +
                            "pripravenú z vosku pracovitých včiel.<br>" +
                            "Preto ťa, Otče, prosíme,<br>" +
                            "nech táto svieca, zasvätená oslave tvojho mena,<br>" +
                            "žiari nehasnúcim svetlom<br>" +
                            "a zaháňa nočné temnoty.<br>" +
                            "Prijmi ju so záľubou<br>" +
                            "a jej žiara nech sa spojí<br>" +
                            "so svetlom nebeských hviezd.<br>" +
                            "Nech ju nájde horieť ranná zornica,<br>" +
                            "tá zornica, ktorá nikdy nezapadá:<br>" +
                            "tvoj Syn Ježiš Kristus,<br>" +
                            "ktorý slávne vstal z mŕtvych,<br>" +
                            "osvecuje ľudstvo veľkonočným svetlom<br>" +
                            "a s tebou žije a kraľuje na veky vekov.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Amen.<br>"},
            {"V", "DLHŠÍ VEĽKONOČNÝ CHVÁLOSPEV", null, null, null, null,
                    "Zaplesaj, nebeský chór anjelov,<br>" +
                            "zaplesajte, oslávení v nebi,<br>" +
                            "nech zahlaholí chválospev<br>" +
                            "na oslavu víťazného Krista.<br>" +
                            "<br>" +
                            "Zaraduj sa, zem, zaplavená toľkým jasom,<br>" +
                            "lebo svetlo večného Kráľa<br>" +
                            "vymanilo ťa z moci temnôt.<br>" +
                            "Raduj sa aj ty, Matka Cirkev,<br>" +
                            "ozdobená žiarou Pánovej slávy,<br>" +
                            "a tento chrám nech zaznie<br>" +
                            "naším jasavým spevom.<br>" +
                            "<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Tento chrám nech zaznie spevom<br>" +
                            "na oslavu víťazného Krista.<br>" +
                            "<br>" +
                            "<font color='#B71C1C'>(</font>Prosím vás teda, bratia a sestry,<br>" +
                            "ako svedkov svetla, ktoré šíri táto posvätná svieca,<br>" +
                            "vzývajte so mnou milosrdného a všemohúceho Boha.<br>" +
                            "On ma bez mojich zásluh, iba z milosti<br>" +
                            "pridružil k služobníkom oltára;<br>" +
                            "nech ma teda naplní jasom svojho svetla,<br>" +
                            "aby som mohol zaspievať chválospev o tejto svieci.<font color='#B71C1C'>)</font><br>" +
                            "<br>" +
                            "<font color='#B71C1C'>V.:</font> <font color='#B71C1C'>(</font>Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<font color='#B71C1C'>)</font><br>" +
                            "<font color='#B71C1C'>V.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>V.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br>" +
                            "<br>" +
                            "Je naozaj dôstojné a správne<br>" +
                            "z hĺbky srdca a z celej duše zvelebovať<br>" +
                            "neviditeľného, všemohúceho Boha Otca<br>" +
                            "a ospevovať jeho jednorodeného Syna,<br>" +
                            "nášho Pána Ježiša Krista.<br>" +
                            "<br>" +
                            "On namiesto nás splatil večnému Otcovi<br>" +
                            "dlžobu za hriech Adamov<br>" +
                            "a svojou krvou zrušil výrok odsúdenia<br>" +
                            "za prvotnú vinu.<br>" +
                            "<br>" +
                            "Lebo slávime veľkonočné sviatky,<br>" +
                            "keď bol zabitý pravý Baránok,<br>" +
                            "ktorého krv posväcuje dveraje veriacich.<br>" +
                            "<br>" +
                            "Toto je noc,<br>" +
                            "v ktorej si našim otcom, synom Izraela,<br>" +
                            "pomohol prejsť suchou nohou cez Červené more,<br>" +
                            "keď si ich vyviedol z Egypta.<br>" +
                            "<br>" +
                            "Toto je noc,<br>" +
                            "v ktorej jas ohnivého stĺpa<br>" +
                            "rozohnal temnoty hriechu.<br>" +
                            "<br>" +
                            "Toto je noc,<br>" +
                            "ktorá dnes na celej zemi<br>" +
                            "veriacich v Krista<br>" +
                            "vymaňuje z neprávosti sveta<br>" +
                            "a z otroctva hriechu,<br>" +
                            "vracia im Božiu milosť<br>" +
                            "a vovádza ich do spoločenstva svätých.<br>" +
                            "<br>" +
                            "Toto je noc,<br>" +
                            "v ktorej Kristus rozlámal okovy smrti<br>" +
                            "a víťazne vstal z hrobu.<br>" +
                            "<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Tento chrám nech zaznie spevom<br>" +
                            "na oslavu víťazného Krista.<br>" +
                            "<br>" +
                            "Veď čo by nám osožilo, že sme sa narodili,<br>" +
                            "keby nás tvoj Syn nebol vykúpil?<br>" +
                            "Aká nesmierna je voči nám tvoja dobrota, Otče,<br>" +
                            "aká nevyspytateľná je tvoja láska!<br>" +
                            "Aby si vykúpil otroka,<br>" +
                            "vydal si na smrť vlastného Syna!<br>" +
                            "Naozaj potrebný bol hriech Adamov,<br>" +
                            "ktorý zotrela smrť Kristova!<br>" +
                            "Ó, šťastná vina,<br>" +
                            "pre ktorú k nám prišiel taký vznešený Vykupiteľ!<br>" +
                            "<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Tento chrám nech zaznie spevom<br>" +
                            "na oslavu víťazného Krista.<br>" +
                            "<br>" +
                            "Ó, naozaj blažená noc,<br>" +
                            "ktorá bola svedkom preslávnej chvíle,<br>" +
                            "keď Kristus vstal z mŕtvych.<br>" +
                            "<br>" +
                            "Toto je noc,<br>" +
                            "o ktorej Písmo hovorí:<br>" +
                            "Noc bude jasná ako deň,<br>" +
                            "noc ma obklopí ako žiarivé svetlo.<br>" +
                            "Posvätné tajomstvo tejto noci premáha zlobu,<br>" +
                            "zmýva viny,<br>" +
                            "hriešnikom vracia nevinnosť<br>" +
                            "a radosť zarmúteným;<br>" +
                            "odvracia nenávisť, zjednocuje srdcia<br>" +
                            "a pokoruje pýchu mocných.<br>" +
                            "Preto v túto milostivú noc<br>" +
                            "prijmi, presvätý Otče,<br>" +
                            "našu večernú obetu chvály,<br>" +
                            "ktorú ti prináša svätá Cirkev,<br>" +
                            "keď rukami svojich služobníkov<br>" +
                            "slávnostne ti predkladá túto veľkonočnú sviecu,<br>" +
                            "pripravenú z vosku pracovitých včiel.<br>" +
                            "<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Tento chrám nech zaznie spevom<br>" +
                            "na oslavu víťazného Krista.<br>" +
                            "<br>" +
                            "Veď už vieme, čo znamená táto svieca,<br>" +
                            "ktorú sme na tvoju počesť rozožali<br>" +
                            "z plápolajúceho ohňa.<br>" +
                            "Hoci jej plameň rozožal sviece dookola,<br>" +
                            "predsa neubudlo na jeho jase,<br>" +
                            "lebo sa živí roztopeným voskom,<br>" +
                            "ktorý na túto vzácnu sviecu<br>" +
                            "pripravila usilovná včela.<br>" +
                            "Naozaj požehnaná noc,<br>" +
                            "ktorá spája nebo so zemou<br>" +
                            "a človeka s Bohom.<br>" +
                            "<br>" +
                            "Preto ťa, Otče, prosíme,<br>" +
                            "nech táto svieca, zasvätená oslave tvojho mena,<br>" +
                            "žiari nehasnúcim svetlom<br>" +
                            "a zaháňa nočné temnoty.<br>" +
                            "Prijmi ju so záľubou<br>" +
                            "a jej žiara nech sa spojí<br>" +
                            "so svetlom nebeských hviezd.<br>" +
                            "Nech ju nájde horieť ranná zornica,<br>" +
                            "tá zornica, ktorá nikdy nezapadá:<br>" +
                            "tvoj Syn Ježiš Kristus,<br>" +
                            "ktorý slávne vstal z mŕtvych,<br>" +
                            "osvecuje ľudstvo veľkonočným svetlom<br>" +
                            "a s tebou žije a kraľuje na veky vekov.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Amen.<br>"},
            {"N", "II. časť - Liturgia slova"},
            {"K", "<font color='#000000'>20.</font> Na túto vigíliu, najdôležitejšiu zo všetkých vigílií, je určených deväť čítaní, a to sedem zo Starého zákona a dve (epištola a evanjelium) z Nového zákona.<br>" +
                    "<font color='#000000'>21.</font> Ak to vyžadujú pastoračné dôvody, možno vynechať niektoré čítania zo Starého zákona. Treba však vždy pamätať na to, že čítanie Božieho slova je podstatnou zložkou tejto vigílie. Majú sa čítať aspoň tri čítania zo Starého zákona, v krajnom prípade najmenej dve. Nikdy sa však nesmie vynechať čítanie z Druhej knihy Mojžišovej (14, 15 – 15, 1, tretie čítanie).<br>" +
                    "<font color='#000000'>22.</font> Všetci odložia sviece a sadnú si. Pred čítaním kňaz povzbudí ľud týmito alebo podobnými slovami:",
                    "Drahí bratia a sestry,<br>" +
                            "po slávnostnom úvode veľkonočnej vigílie teraz pozorne počúvajme Božie slovo.<br>" +
                            "Uvažujme, ako Boh ochraňoval svoj ľud v minulosti a ako napokon poslal svojho Syna ako Vykupiteľa. Modlime sa, aby Boh dovŕšil v nás dielo vykúpenia, ktoré Kristus uskutočnil svojou smrťou a zmŕtvychvstaním.",
                    "<font color='#000000'>23.</font> Nasledujú čítania. Lektor príde k ambóne a prečíta prvé čítanie. Žalmista čiže predspevák recituje alebo spieva medzispev a ľud mu odpovedá. Potom všetci vstanú.<br>" +
                            "Kňaz povie Modlime sa a všetci sa chvíľu potichu modlia. Napokon sa kňaz nahlas modli príslušnú modlitbu.<br>" +
                            "Namiesto medzispevu sa môže vsunúť chvíľa tichého rozjímania. V tomto prípade po výzve Modlime sa kňaz hneď prednesie príslušnú modlitbu.", null},
            {"V", "PRVÉ ČÍTANIE", "Gn 1, 1 – 2, 2 alebo Gn 1, 1. 26-31a",
                    "PRVÉ ČÍTANIE", "Gn 1, 1 – 2, 2",
                    "Boh videl všetko, čo urobil, a bolo to veľmi dobré",
                    "Čítanie z Knihy Genezis<br>" +
                            "Na počiatku stvoril Boh nebo a zem. Ale zem bola pustá a prázdna, tma bola nad priepasťou a duch Boží sa vznášal nad vodami.<br>" +
                            "Boh povedal: „Buď svetlo!“ A bolo svetlo. Boh videl, že svetlo je dobré, a oddelil svetlo od tmy. Svetlo nazval Dňom a tmu Nocou. A nastal večer a ráno, prvý deň.<br>" +
                            "Boh povedal: „Nech je obloha uprostred vôd a nech oddeľuje vody od vôd.“ Boh urobil oblohu a oddelil vody pod oblohou od vôd nad oblohou. A tak sa stalo. A Boh nazval oblohu Nebom. A nastal večer a ráno, druhý deň.<br>" +
                            "Boh povedal: „Vody pod nebom nech sa zhromaždia na jedno miesto a nech sa ukáže súš.“ A tak sa stalo. Boh nazval súš Zemou a masy vôd nazval Morom. A Boh videl, že je to dobré.<br>" +
                            "Ďalej Boh povedal: „Zem nech vyženie zelené rastliny: rastliny prinášajúce semeno a ovocné stromy prinášajúce plody podľa svojho druhu a v nich nech je semeno na zemi.“ A tak sa stalo. Zem vyhnala zelené rastliny, rastliny prinášajúce semeno podľa svojho druhu i stromy prinášajúce plody a v nich semená podľa svojho druhu. A Boh videl, že je to dobré. A nastal večer a ráno, tretí deň.<br>" +
                            "Boh povedal: „Nech sú svetlá na nebeskej oblohe a nech oddeľujú deň od noci, nech sú znamením období, dní a rokov, nech svietia na nebeskej oblohe a nech osvetľujú zem.“ A tak sa stalo. Boh urobil dvoje veľkých svetiel: väčšie svetlo, žeby vládlo vo dne, a menšie svetlo, žeby vládlo v noci, a hviezdy. Umiestil ich na nebeskej oblohe, aby svietili na zem a vládli vo dne v noci a oddeľovali svetlo od tmy. A Boh videl, že je to dobré. A nastal večer a ráno, štvrtý deň.<br>" +
                            "Boh povedal: „Nech sa vody hemžia živými tvormi a vtáky nech lietajú ponad zem na nebeskej oblohe.“ A Boh stvoril veľryby a všetky živé tvory, ktoré sa hýbu a hemžia vo vodách, podľa svojho druhu, i všetky vtáky podľa svojho druhu. A Boh videl, že je to dobré. Boh ich požehnal a povedal: „Vzrastajte, rozmnožujte sa a naplňte morské vody; aj vtáky nech sa rozmnožujú na zemi.“ A nastal večer a ráno, piaty deň.<br>" +
                            "Boh povedal: „Zem nech vydá všetky druhy živých bytostí: dobytok, plazy a divú zver podľa svojho druhu.“ A tak sa stalo. Boh urobil divú zver podľa svojho druhu, dobytok podľa svojho druhu i všetky druhy zemských plazov. A Boh videl, že je to dobré.<br>" +
                            "Potom Boh povedal: „Urobme človeka na náš obraz, na našu podobu. Nech vládnu nad morskými rybami a nad nebeským vtáctvom, nad zverinou i nad celou zemou; nad všetkými plazmi, čo sa hýbu po zemi.“ A stvoril Boh človeka na svoj obraz; na Boží obraz ho stvoril, muža a ženu ich stvoril. Boh ich požehnal a povedal im: „Vzrastajte a množte sa. Naplňte zem a podmaňte si ju. Panujte nad morskými rybami, nad nebeským vtáctvom a nad všetkou zverou, čo sa hýbe na zemi.“<br>" +
                            "Potom Boh povedal: „Hľa, dávam vám všetky semenné rastliny na zemi a všetky stromy s ich ovocím, v ktorom je semeno, aby vám boli za pokrm. A všetkým živočíchom zeme, všetkému nebeskému vtáctvu i všetkému, čo sa hýbe na zemi a má v sebe život, dávam za pokrm všetky zelené rastliny.“ A tak sa stalo. A Boh videl všetko, čo urobil; a bolo to veľmi dobré. A nastal večer a ráno, šiesty deň.<br>" +
                            "Takto boli dokončené nebo a zem i všetka ich nádhera. Siedmeho dňa Boh ukončil dielo, ktoré konal, a v siedmy deň si odpočinul po všetkých dielach, čo vytvoril.<br>" +
                            "Počuli sme Božie slovo.",
                    "Alebo kratšie:", "Gn 1, 1. 26-31a",
                    "Na počiatku stvoril Boh nebo a zem.",
                    "Čítanie z Knihy Genezis<br>" +
                            "Potom Boh povedal: „Urobme človeka na náš obraz, na našu podobu. Nech vládnu nad morskými rybami a nad nebeským vtáctvom, nad zverinou i nad celou zemou; nad všetkými plazmi, čo sa hýbu po zemi.“ A stvoril Boh človeka na svoj obraz; na Boží obraz ho stvoril, muža a ženu ich stvoril.<br>" +
                            "Boh ich požehnal a povedal im: „Vzrastajte a množte sa. Naplňte zem a podmaňte si ju. Panujte nad morskými rybami, nad nebeským vtáctvom a nad všetkou zverou, čo sa hýbe na zemi.“ Potom Boh povedal: „Hľa, dávam vám všetky semenné rastliny na zemi a všetky stromy s ich ovocím, v ktorom je semeno, aby vám boli za pokrm. A všetkým živočíchom zeme, všetkému nebeskému vtáctvu i všetkému, čo sa hýbe na zemi a má v sebe život, dávam za pokrm všetky zelené rastliny.“ A tak sa stalo. A Boh videl všetko, čo urobil; a bolo to veľmi dobré.<br>" +
                            "Počuli sme Božie slovo.<br>",
                    "RESPONZÓRIOVÝ ŽALM", "Ž 104, 1-2a. 5-6. 10+12. 13-14b. 24+35c", null,
                    "<font color='#B71C1C'>R.:</font> Pane, zošli svojho Ducha a obnov tvárnosť zeme.<br>" +
                            "<br>" +
                            "Dobroreč, duša moja, Pánovi; <font color='#B71C1C'>*</font><br>" +
                            "Pane, Bože môj, ty si nesmierne veľký.<br>" +
                            "Odel si sa do slávy a veleby, <font color='#B71C1C'>*</font><br>" +
                            "do svetla si sa zahalil ako do rúcha. <font color='#B71C1C'>R.</font><br>" +
                            "Zem si postavil na jej základoch, <font color='#B71C1C'>*</font><br>" +
                            "nevychýli sa nikdy-nikdy.<br>" +
                            "Oceán ju prikryl sťa odev, <font color='#B71C1C'>*</font><br>" +
                            "nad vrchmi vody zastali. <font color='#B71C1C'>R.</font><br>" +
                            "Prameňom dávaš stekať do potokov, <font color='#B71C1C'>*</font><br>" +
                            "čo tečú pomedzi vrchy.<br>" +
                            "Popri nich hniezdi nebeské vtáctvo, <font color='#B71C1C'>*</font><br>" +
                            "spomedzi konárov zaznieva ich pieseň. <font color='#B71C1C'>R.</font><br>" +
                            "Zo svojich komnát zvlažuješ vrchy, <font color='#B71C1C'>*</font><br>" +
                            "plodmi svojich diel sýtiš zem.<br>" +
                            "Tráve dávaš rásť pre ťažný dobytok <font color='#B71C1C'>*</font><br>" +
                            "a byli, aby slúžila človeku. <font color='#B71C1C'>R.</font><br>" +
                            "Aké mnohoraké sú tvoje diela, Pane! <font color='#B71C1C'>*</font><br>" +
                            "Všetko si múdro urobil.<br>" +
                            "Zem je plná tvojho stvorenstva. <font color='#B71C1C'>*</font><br>" +
                            "Dobroreč, duša moja, Pánovi. <font color='#B71C1C'>R.<br>" +
                            "Alebo kratšie:</font>",
                    "RESPONZÓRIOVÝ ŽALM", "Ž 33, 4-5. 6-7. 12-13. 20+22", null,
                    "<font color='#B71C1C'>R.:</font> Milosti Pánovej plná je zem.<br>" +
                            "<br>" +
                            "Pánovo slovo je pravdivé <font color='#B71C1C'>*</font><br>" +
                            "a verné všetko jeho konanie.<br>" +
                            "Miluje spravodlivosť a právo; <font color='#B71C1C'>*</font><br>" +
                            "milosti Pánovej plná je zem. <font color='#B71C1C'>R.</font><br>" +
                            "Pánovým slovom povstali nebesia <font color='#B71C1C'>*</font><br>" +
                            "a dychom jeho úst všetky ich voje.<br>" +
                            "Ako do vreca hromadí morské vody, <font color='#B71C1C'>*</font><br>" +
                            "ako do nádrží zlieva oceány. <font color='#B71C1C'>R.</font><br>" +
                            "Blažený národ, ktorého Bohom je Pán, <font color='#B71C1C'>*</font><br>" +
                            "blažený ľud, ktorý si on vyvolil za dedičstvo.<br>" +
                            "Pán hľadí z neba <font color='#B71C1C'>*</font><br>" +
                            "a vidí všetkých ľudí. <font color='#B71C1C'>R.</font><br>" +
                            "Naša duša očakáva Pána, <font color='#B71C1C'>*</font><br>" +
                            "on je naša pomoc a ochrana.<br>" +
                            "Tvoje milosrdenstvo, Pane, nech je nad nami, <font color='#B71C1C'>*</font><br>" +
                            "ako dúfame v teba. <font color='#B71C1C'>R.</font>"},
            {"K", null, "Modlime sa.<br>" +
                    "Všemohúci a večný Bože,<br>" +
                    "ty si obdivuhodný vo všetkom, čo konáš; <font color='#B71C1C'>*</font><br>" +
                    "daj, aby tvoj vykúpený ľud poznal,<br>" +
                    "aké vznešené bolo dielo stvorenia na počiatku<br>" +
                    "a o koľko vznešenejšie bolo dielo<br>" +
                    "vykúpenia v plnosti času, <font color='#B71C1C'>—</font><br>" +
                    "keď sa obetoval náš veľkonočný<br>" +
                    "Baránok Ježiš Kristus,<br>" +
                    "ktorý žije a kraľuje na veky vekov.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.",
                    "Alebo (Stvorenie človeka):",
                    "Modlime sa.<br>" +
                            "Všemohúci a večný Bože,<br>" +
                            "obdivuhodne si stvoril človeka<br>" +
                            "a ešte obdivuhodnejšie si ho vykúpil; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, posilňuj našu vôľu, <font color='#B71C1C'>—</font><br>" +
                            "aby sme odolávali zvodom hriechu<br>" +
                            "a zaslúžili si vojsť do večnej radosti.<br>" +
                            "Skrze Krista, nášho Pána.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Amen.<br>"},
            {"V", "DRUHÉ ČÍTANIE", "Gn 22, 1-18 alebo Gn 22, 1-2. 9a. 10-13. 15-18",
                    "DRUHÉ ČÍTANIE", "Gn 22, 1-18",
                    "Obeta nášho praotca Abraháma",
                    "Čítanie z Knihy Genezis<br>" +
                            "Boh skúšal Abraháma a povedal mu: „Abrahám!“<br>" +
                            "On odpovedal: „Tu som.“<br>" +
                            "Boh hovoril: „Vezmi svojho jediného syna Izáka, ktorého miluješ, choď do krajiny Moria a obetuj ho tam ako zápalnú obetu na vrchu, ktorý ti ukážem.“<br>" +
                            "Abrahám vstal ešte za noci, osedlal osla, vzal so sebou dvoch sluhov a svojho syna Izáka, naštiepal dreva na zápalnú obetu a vybral sa na miesto, ktoré mu Boh označil.<br>" +
                            "Keď na tretí deň Abrahám zdvihol oči, zďaleka uzrel to miesto a povedal svojim sluhom: „Čakajte tu s oslom. Ja a chlapec pôjdeme až ta, pokloníme sa a vrátime sa k vám.“ Potom Abrahám vzal drevo na zápalnú obetu a naložil ho na svojho syna Izáka. Sám niesol v rukách oheň a nôž.<br>" +
                            "Ako išli sami dvaja, vravel Izák svojmu otcovi Abrahámovi: „Otče!“<br>" +
                            "On mu povedal: „Čo chceš, syn môj?“<br>" +
                            "„Pozri,“ hovorí Izák, „oheň a drevo je tu, a baránok na zápalnú obetu je kde?“<br>" +
                            "Abrahám odvetil: „Boh si zaobstará baránka na obetu, syn môj.“ A vedno šli ďalej.<br>" +
                            "Keď došli na miesto, ktoré mu ukázal Boh, Abrahám postavil oltár, poukladal naň drevo, zviazal svojho syna Izáka a položil ho na oltár, na drevo. Potom Abrahám vystrel ruku, vzal nôž a chcel obetovať svojho syna. Ale vtom naň zavolal anjel Pána z neba: „Abrahám, Abrahám!“<br>" +
                            "On odpovedal: „Tu som.“<br>" +
                            "Anjel mu povedal: „Nevzťahuj svoju ruku na chlapca a neublíž mu! Teraz viem, že sa bojíš Boha, veď si mi neodoprel svojho jediného syna.“<br>" +
                            "Abrahám zdvihol oči a uzrel barana zachyteného rohami v kroví. Vzal ho a obetoval namiesto svojho syna ako zápalnú obetu. A toto miesto nazval: „Pán sa stará;“ a tak sa až podnes hovorí: „Na vrchu Pán sa stará.“<br>" +
                            "Anjel Pána znova zavolal z neba na Abraháma: „Na seba samého prisahám – taký je výrok Pána –: Pretože si toto urobil a neodoprel si mi svojho jediného syna, požehnám ťa a rozmnožím tvoje potomstvo ako hviezdy na nebi a ako piesok na brehu mora a tvoje potomstvo sa zmocní brán svojich nepriateľov. A pretože si poslúchol môj hlas, v tvojom potomstve budú požehnané všetky národy zeme.“<br>" +
                            "Počuli sme Božie slovo.",
                    "Alebo kratšie:", "Gn 22, 1-2. 9a. 10-13. 15-18",
                    "Obeta nášho praotca Abraháma",
                    "Čítanie z Knihy Genezis<br>" +
                            "Boh skúšal Abraháma a povedal mu: „Abrahám!“<br>" +
                            "On odpovedal: „Tu som.“<br>" +
                            "Boh hovoril: „Vezmi svojho jediného syna Izáka, ktorého miluješ, choď do krajiny Moria a obetuj ho tam ako zápalnú obetu na vrchu, ktorý ti ukážem.“<br>" +
                            "Keď došli na miesto, ktoré mu ukázal Boh, Abrahám postavil oltár a poukladal naň drevo. Potom vystrel ruku, vzal nôž a chcel obetovať svojho syna.<br>" +
                            "Ale vtom naň zavolal anjel Pána z neba: „Abrahám, Abrahám!“<br>" +
                            "On odpovedal: „Tu som.“<br>" +
                            "Anjel mu povedal: „Nevzťahuj svoju ruku na chlapca a neublíž mu! Teraz viem, že sa bojíš Boha, veď si mi neodoprel svojho jediného syna.“<br>" +
                            "Abrahám zdvihol oči a uzrel barana zachyteného rohami v kroví. Vzal ho a obetoval namiesto svojho syna ako zápalnú obetu.<br>" +
                            "Anjel Pána znova zavolal z neba na Abraháma: „Na seba samého prisahám – taký je výrok Pána –: Pretože si toto urobil a neodoprel si mi svojho jediného syna, požehnám ťa a rozmnožím tvoje potomstvo ako hviezdy na nebi a ako piesok na brehu mora a tvoje potomstvo sa zmocní brán svojich nepriateľov. A pretože si poslúchol môj hlas, v tvojom potomstve budú požehnané všetky národy zeme.“<br>" +
                            "Počuli sme Božie slovo.<br>",
                    "RESPONZÓRIOVÝ ŽALM", "Ž 16, 5+8. 9-10. 11", null,
                    "<font color='#B71C1C'>R.:</font> Ochráň ma, Bože, k tebe sa utiekam.<br><br>" +
                            "Ty, Pane, si môj podiel na dedičstve a na kalichu, <font color='#B71C1C'>*</font><br>" +
                            "v tvojich rukách je môj osud.<br>" +
                            "Pána mám vždy pred očami; <font color='#B71C1C'>*</font><br>" +
                            "a pretože je po mojej pravici, nezakolíšem sa. <font color='#B71C1C'>R.</font><br>" +
                            "Preto sa raduje moje srdce <font color='#B71C1C'>†</font><br>" +
                            "a moja duša plesá <font color='#B71C1C'>*</font><br>" +
                            "aj moje telo odpočíva v nádeji.<br>" +
                            "Lebo nenecháš moju dušu v podsvetí <font color='#B71C1C'>*</font><br>" +
                            "a nedovolíš, aby tvoj svätý videl porušenie. <font color='#B71C1C'>R.</font><br>" +
                            "Ukážeš mi cestu života. <font color='#B71C1C'>†</font><br>" +
                            "U teba je plnosť radosti, <font color='#B71C1C'>*</font><br>" +
                            "po tvojej pravici večná slasť. <font color='#B71C1C'>R.</font><br>"},
            {"K", null, "Modlime sa.<br>" +
                    "Bože, Otče všetkých veriacich, <font color='#B71C1C'>*</font><br>" +
                    "po celej zemi rozmnožuješ synov svojho prisľúbenia,<br>" +
                    "keď ľudí prijímaš za svoje deti<br>" +
                    "a sviatosťou krstu plníš prísľub,<br>" +
                    "ktorý si dal Abrahámovi,<br>" +
                    "že bude otcom všetkých národov; <font color='#B71C1C'>—</font><br>" +
                    "daj, aby všetci ľudia ochotne prijali milosť,<br>" +
                    "ktorou ich povolávaš do svojej Cirkvi.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>"},
            {"V", "TRETIE ČÍTANIE", "Ex 14,15 – 15, 1",
                    "TRETIE ČÍTANIE", "Ex 14,15 – 15, 1",
                    "Izraeliti šli stredom mora po suchu",
                    "Čítanie z Knihy Exodus<br>" +
                            "Pán povedal Mojžišovi: “Čo voláš ku mne? Povedz Izraelitom, aby sa pohli. Ty zdvihni svoju palicu a vystri ruku nad more a rozdeľ ho, aby Izraeliti mohli prejsť stredom mora ako po súši.<br>" +
                            "Ja zatvrdím srdce Egypťanov a budú sa hnať za nimi; a na faraónovi, na celom jeho vojsku, na jeho vozoch a jazde ukážem svoju slávu. Egypťania spoznajú, že ja som Pán, keď ukážem svoju slávu na faraónovi i na jeho vozoch a jazde.“<br>" +
                            "Tu sa Boží anjel, čo šiel pred izraelským táborom, zdvihol a išiel za ním. A s ním aj oblačný stĺp zmenil svoje doterajšie miesto – prešiel spredu zaň. Postavil sa medzi egyptský tábor a izraelský tábor. Oblak bol pre jedných temný, druhým osvetľoval noc, a tak sa celú noc nemohli jedni k druhým priblížiť.<br>" +
                            "Mojžiš vystrel ruku nad more a Pán ho celú noc prudkým horúcim vetrom rozháňal a vysúšal. Voda sa rozdelila a Izraeliti šli stredom mora po suchu, kým voda bola ako múr po ich pravici a ľavici. Egypťania ich prenasledovali. Všetky faraónove kone, vozy a jazdci sa pustili za nimi doprostred mora.<br>" +
                            "Ale v čase rannej stráže sa Pán pozrel z ohnivého a oblačného stĺpa na Egypťanov a ich vojsko uviedol do zmätku. Hamoval kolesá na ich vozoch, takže mohli len ťažko napredovať. Preto Egypťania hovorili: “Utekajme pred Izraelitmi, lebo Pán za nich bojuje proti nám.“<br>" +
                            "A Pán povedal Mojžišovi: “Vystri ruku nad more, aby sa vody vrátili na Egypťanov, na ich vozy a na ich jazdcov.“ Mojžiš vystrel ruku nad more a ono sa nad ránom vrátilo na svoje pôvodné miesto. Vody sa valili oproti utekajúcim Egypťanom a Pán ich prikryl vlnami uprostred mora. Vody sa vrátili a pokryli vozy i jazdcov celého faraónovho vojska, ktoré sa pustilo za Izraelitmi do mora. Ani jeden z nich neostal. No Izraeliti prešli stredom mora po suchu a voda bola ako múr po ich pravici a ľavici.<br>" +
                            "Takto Pán v ten deň vyslobodil Izrael z rúk Egypťanov. Videli mŕtvych Egypťanov na morskom brehu i mocnú ruku, ktorú Pán zdvihol proti nim. Ľud sa bál a uverili Pánovi i jeho služobníkovi Mojžišovi.<br>" +
                            "Vtedy Mojžiš a synovia Izraela zaspievali Pánovi túto pieseň:<br>",
                    "RESPONZÓRIOVÝ ŽALM", "Ex 15, 1b-2. 3-4. 5-6. 17-18", null,
                    "<font color='#B71C1C'>R.:</font> Spievajme Pánovi, lebo sa preslávil.<br><br>" +
                            "Spievajme Pánovi, lebo sa preslávil: <font color='#B71C1C'>*</font><br>" +
                            "koňa i jazdca zmietol do mora.<br>" +
                            "Pán je moja sila a moja udatnosť, <font color='#B71C1C'>*</font><br>" +
                            "on ma zachránil.<br>" +
                            "On je môj Boh, chcem ho velebiť; <font color='#B71C1C'>*</font><br>" +
                            "Boh môjho otca, budem ho chváliť. <font color='#B71C1C'>R.</font><br>" +
                            "Pán je ako bojovník; <font color='#B71C1C'>*</font><br>" +
                            "Jahve je jeho meno.<br>" +
                            "Faraónove vozy a jeho vojsko zmietol do mora; <font color='#B71C1C'>*</font><br>" +
                            "jeho najlepší bojovníci utonuli v Červenom mori. <font color='#B71C1C'>R.</font><br>" +
                            "Vlny ich pokryli; <font color='#B71C1C'>*</font><br>" +
                            "sťa kameň klesli do hlbín.<br>" +
                            "Tvoja pravica, Pane, vyniká mocou, <font color='#B71C1C'>*</font><br>" +
                            "tvoja pravica, Pane, zasiahla nepriateľa. <font color='#B71C1C'>R.</font><br>" +
                            "Vovedieš ich a zasadíš na vrchu svojho dedičstva, <font color='#B71C1C'>*</font><br>" +
                            "v svojom bezpečnom príbytku, ktorý si ty, Pane, urobil;<br>" +
                            "vo svätyni, ktorej základy kládli tvoje ruky, Pane. <font color='#B71C1C'>*</font><br>" +
                            "Pán bude kraľovať naveky a navždy. <font color='#B71C1C'>R.</font><br>"},
            {"K", null, "Modlime sa.<br>" +
                    "Všemohúci Bože, tvoje dávne veľké činy<br>" +
                    "sa obnovujú aj za našich čias; <font color='#B71C1C'>*</font><br>" +
                    "veď čo si v minulosti svojou mocou<br>" +
                    "preukázal jednému národu,<br>" +
                    "keď si ho zachránil pred faraónom,<br>" +
                    "to za našich čias vodou znovuzrodenia<br>" +
                    "uskutočňuješ na spásu všetkých národov; <font color='#B71C1C'>—</font><br>" +
                    "prosíme ťa,<br>" +
                    "daj, aby sa všetci ľudia stali<br>" +
                    "duchovnými deťmi praotca Abraháma<br>" +
                    "a dosiahli výsady vyvoleného ľudu.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.",
                    "Alebo:",
                    "Modlime sa.<br>" +
                            "Všemohúci Bože,<br>" +
                            "ty si objasnil význam starozákonných zázrakov<br>" +
                            "svetlom Nového zákona: <font color='#B71C1C'>*</font><br>" +
                            "Červené more je predobrazom krstnej vody<br>" +
                            "a izraelský ľud, vyslobodený z otroctva,<br>" +
                            "je predobrazom kresťanského ľudu; <font color='#B71C1C'>—</font><br>" +
                            "daj, aby všetci ľudia<br>" +
                            "vierou nadobudli výsady vyvoleného ľudu<br>" +
                            "a krstom sa znovuzrodili z Ducha Svätého.<br>" +
                            "Skrze Krista, nášho Pána.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Amen.<br>"},
            {"V", "ŠTVRTÉ ČITANIE", "Iz 54, 5-14",
                    "ŠTVRTÉ ČITANIE", "Iz 54, 5-14",
                    "Večným milosrdenstvom som sa nad tebou zmiloval, tvoj vykupiteľ, Pán",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            "Tvoj Stvoriteľ je tvojím ženíchom, “Pán zástupov“ je jeho meno. Svätý Izraela je tvoj vykupiteľ, “Bohom celej zeme“ sa nazýva.<br>" +
                            "Pán ťa povolal ako ženu opustenú a duchom sklesnutú, ako odvrhnutú ženu svojej mladosti, hovorí tvoj Boh. Na chvíľu krátku som ťa opustil, no s veľkou láskou si ťa pritiahnem. V návale hnevu skryl som nakrátko svoju tvár pred tebou, no večným milosrdenstvom som sa nad tebou zmiloval, hovorí tvoj vykupiteľ, Pán.<br>" +
                            "Je mi ako za dní Noema: keď som prisahal, že Noemove vody viac nezaplavia zem. Aj teraz prisahám, že sa už nebudem hnevať na teba, ani ťa viac karhať nebudem. Vrchy sa pohnú a kopce sa budú triasť, no moje milosrdenstvo neodstúpi od teba, moja zmluva pokoja sa neotrasie, hovorí Pán, ktorý sa zmilúva nad tebou.<br>" +
                            "Úbohá, vetrom zmietaná, bez akejkoľvek potechy, hľa, ja položím tvoje kamene na malachit a tvoje základy na zafíry, cimburie urobím z rubínu, tvoje brány budú z krištáľu a múry zo vzácnych kameňov.<br>" +
                            "Všetci tvoji synovia budú učeníkmi Pána a veľký pokoj budú požívať tvoji synovia. Základy budeš mať na spravodlivosti. Budeš ďaleko od utláčania, preto sa nemusíš báť, ďaleko od strachu, lebo sa k tebe nepriblíži.<br>" +
                            "Počuli sme Božie slovo.<br>",
                    "RESPONZÓRIOVÝ ŽALM", "Ž 30, 2+4. 5-6. 11-12a+13b", null,
                    "<font color='#B71C1C'>R.:</font> Budem ťa, Pane, oslavovať, že si ma vyslobodil.<br><br>" +
                            "Budem ťa, Pane, oslavovať, že si ma vyslobodil <font color='#B71C1C'>*</font><br>" +
                            "a že si nedovolil, aby sa moji nepriatelia radovali nado mnou.<br>" +
                            "Pane, vyviedol si ma z ríše zosnulých, <font color='#B71C1C'>*</font><br>" +
                            "navrátil si mi život, aby som nezostúpil do hrobu. <font color='#B71C1C'>R.</font><br>" +
                            "Na harfe hrajte Pánovi, jeho svätí, <font color='#B71C1C'>*</font><br>" +
                            "vzdávajte vďaky jeho menu svätému.<br>" +
                            "Lebo len chvíľku trvá jeho hnev, <font color='#B71C1C'>*</font><br>" +
                            "ale celý život jeho láskavosť.<br>" +
                            "Podvečer je nám hosťom plač <font color='#B71C1C'>*</font><br>" +
                            "a radosť nad ránom. <font color='#B71C1C'>R.</font><br>" +
                            "Čuj, Pane a zmiluj sa nado mnou; <font color='#B71C1C'>*</font><br>" +
                            "Pane, buď mi na pomoci.<br>" +
                            "Môj nárek si obrátil na tanec; <font color='#B71C1C'>*</font><br>" +
                            "Pane, Bože môj, naveky ťa chcem velebiť. <font color='#B71C1C'>R.</font><br>"},
            {"K", null, "Modlime sa.<br>" +
                    "Všemohúci a večný Bože,<br>" +
                    "na slávu svojho mena zveľaďuj potomstvo,<br>" +
                    "ktoré si sľúbil praotcom za ich vieru, <font color='#B71C1C'>*</font><br>" +
                    "a sviatosťou krstu rozmnožuj svoju rodinu, <font color='#B71C1C'>—</font><br>" +
                    "aby Cirkev spoznala,<br>" +
                    "že sa už plní to,<br>" +
                    "čo svätí praotcovia s dôverou očakávali.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľ.: </font>Amen.<br>",
                    "Tu možno použiť aj inú z modlitieb predpísaných po čítaniach, ktoré sa prípadne vynechajú.", null},
            {"V", "PIATE ČÍTANIE", "Iz 55, 1-11",
                    "PIATE ČÍTANIE", "Iz 55, 1-11",
                    "Poďte k vodám: počúvajte a budete žiť",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            "Toto hovorí Pán: “Poďte k vodám, všetci, čo ste smädní, nech príde aj ten, čo nemá peniaze. Kupujte chlieb a jedzte. Poďte, kupujte bez striebra, víno a mlieko bez platenia.<br>" +
                            "Prečo platíte striebrom za to, čo nie je chlieb, a driete za to, čo nesýti? Počúvajte mňa a budete jesť dobroty a budete sa kochať v jedlách vyberaných. Napnite svoj sluch a poďte ku mne, počúvajte a budete žiť. Uzavriem s vami večnú zmluvu, verný láske, ktorou som miloval Dávida. Hľa, ustanovil som ho za svedka pre ľudí, za knieža a vládcu národov. Budeš volať národ, ktorý nepoznáš; národy, ktoré ťa nepoznali, pribehnú k tebe kvôli Pánovi, tvojmu Bohu, a kvôli Svätému Izraela, lebo ťa oslávil.<br>" +
                            "Hľadajte Pána, kým ho možno nájsť, volajte ho, kým je nablízku. Nech zanechá bezbožný svoju cestu a zločinec svoje zámery, nech sa vráti k Pánovi a on sa nad ním zmiluje, k nášmu Bohu, lebo on veľkodušne odpúšťa. Lebo moje myšlienky nie sú vaše myšlienky a vaše cesty nie sú mojimi cestami, hovorí Pán. Lebo ako vysoko je nebo nad zemou, tak vysoko sú moje cesty nad vašimi cestami a moje myšlienky nad vašimi myšlienkami.<br>" +
                            "A ako z neba padá dážď a sneh a nevracia sa späť, lež napojí zem a zúrodní ju, aby z nej klíčilo, aby obdarovala rozsievača semenom a dala chlieb hladnému, tak bude so slovom, ktoré vychádza z mojich úst: nevráti sa ku mne naprázdno, ale vykoná všetko, čo chcem, a vydarí sa jeho poslanie.“<br>" +
                            "Počuli sme Božie slovo.<br>",
                    "RESPONZÓRIOVÝ ŽALM", "Iz 12, 2-3. 4b-d. 5-6", null,
                    "<font color='#B71C1C'>R.:</font> Čerpajme vodu s radosťou z prameňov spásy.<br><br>" +
                            "“Hľa, Boh je moja spása; <font color='#B71C1C'>*</font><br>" +
                            "dúfam a nebojím sa,<br>" +
                            "lebo moja sila a chvála je Pán, <font color='#B71C1C'>*</font><br>" +
                            "on sa mi stal záchrancom.“<br>" +
                            "Budete čerpať vodu s radosťou <font color='#B71C1C'>*</font><br>" +
                            "z prameňov spásy. <font color='#B71C1C'>R.</font><br>" +
                            "“Oslavujte Pána a vzývajte jeho meno, <font color='#B71C1C'>†</font><br>" +
                            "ohlasujte medzi národmi jeho zázraky, <font color='#B71C1C'>*</font><br>" +
                            "pamätajte, že jeho meno je vznešené. <font color='#B71C1C'>R.</font><br>" +
                            "Spievajte Pánovi, lebo urobil veľké veci; <font color='#B71C1C'>*</font><br>" +
                            "nech je to známe po celej zemi.<br>" +
                            "Plesaj a jasaj, obyvateľka Siona, <font color='#B71C1C'>*</font><br>" +
                            "lebo veľký uprostred teba je Svätý Izraela.“ <font color='#B71C1C'>R.</font><br>"},
            {"K", null, "Modlime sa.<br>" +
                    "Všemohúci a večný Bože, jediná nádej sveta, <font color='#B71C1C'>*</font><br>" +
                    "ty si už ústami prorokov zvestoval udalosti spásy,<br>" +
                    "ktoré sa odohrávajú za našich čias; <font color='#B71C1C'> —</font><br>" +
                    "milostivo v nás roznecuj sväté túžby,<br>" +
                    "lebo len s tvojou pomocou<br>" +
                    "môžeme rásť v láske a v každej čnosti.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>"},
            {"V", "ŠIESTE ČÍTANIE", "Bar 3, 9-15. 32 – 4, 4",
                    "ŠIESTE ČÍTANIE", "Bar 3, 9-15. 32 – 4, 4",
                    "Choď za Pánovou žiarou",
                    "Čítanie z Knihy proroka Barucha<br>" +
                            "Počúvaj, Izrael, príkazy života, napnite sluch, aby ste sa naučili byť rozumnými. Čo je, Izrael? Čo je, že si v nepriateľskej krajine? Zostarel si v cudzej krajine, poškvrnil si sa mŕtvolami, pripočítaný si k tým, čo sú v podsvetí. Opustil si prameň múdrosti. Keby si bol kráčal po Božej ceste, bol by si býval v pokoji naveky. Nauč sa, kde je rozumnosť, kde je sila, kde je rozum, aby si vedel, aj kde je dlhý vek a život, kde je svetlo očí a pokoj. Kto našiel jej miesto? A kto vošiel do jej pokladníc?<br>" +
                            "Ale ten, ktorý vie všetko, pozná ju, vynašiel ju svojou rozumnosťou. Ten, ktorý založil zem na večný čas a naplnil ju štvornohými zvieratami. Ten, ktorý vysiela svetlo a ono ide, zavolal ho a ono ho s chvením poslúchlo. I hviezdy zažiarili na svojich strážach a potešili sa. Zavolal ich a povedali: “Tu sme!“ a veselo svietia tomu, ktorý ich vytvoril.<br>" +
                            "Toto je náš Boh a iného nemožno k nemu prirovnať. On našiel každú cestu k múdrosti a dal ju svojmu služobníkovi Jakubovi a svojmu miláčikovi Izraelovi. Potom sa zjavila na zemi a žila s ľuďmi.<br>" +
                            "Ona je knihou Božích prikázaní a zákonom, ktorý zostáva naveky. Všetci, ktorí sa jej držia, budú žiť, tí však, čo ju opúšťajú, zomrú.<br>" +
                            "Obráť sa, Jakub, a chop sa jej, choď za žiarou v jej svetle. Nedávaj svoju slávu inému a svoje hodnosti cudziemu národu.<br>" +
                            "Blahoslavení sme, Izrael, lebo my vieme, čo sa páči Bohu.<br>" +
                            "Počuli sme Božie slovo.<br>",
                    "RESPONZÓRIOVÝ ŽALM", "Ž 19, 8. 9. 10. 11", null,
                    "<font color='#B71C1C'>R.:</font> Pane, ty máš slová večného života.<br><br>" +
                            "Zákon Pánov je dokonalý, <font color='#B71C1C'>*</font><br>" +
                            "osviežuje dušu.<br>" +
                            "Svedectvo Pánovo je hodnoverné, <font color='#B71C1C'>*</font><br>" +
                            "dáva múdrosť maličkým. <font color='#B71C1C'>R.</font><br>" +
                            "Rozhodnutia Pánove sú správne, <font color='#B71C1C'>*</font><br>" +
                            "potešujú srdce.<br>" +
                            "Prikázania Pánove sú jasné, <font color='#B71C1C'>*</font><br>" +
                            "osvecujú oči. <font color='#B71C1C'>R.</font><br>" +
                            "Bázeň pred Pánom je úprimná, <font color='#B71C1C'>*</font><br>" +
                            "trvá naveky.<br>" +
                            "Výroky Pánove sú pravdivé <font color='#B71C1C'>*</font><br>" +
                            "a všetky spravodlivé. <font color='#B71C1C'>R.</font><br>" +
                            "Vzácnejšie sú než zlato, <font color='#B71C1C'>*</font><br>" +
                            "než veľký drahokam,<br>" +
                            "sladšie sú než med, <font color='#B71C1C'>*</font><br>" +
                            "než medové kvapky z plástu. <font color='#B71C1C'>R.</font><br>"},
            {"K", null, "Modlime sa.<br>" +
                    "Milosrdný Otče, <font color='#B71C1C'>*</font><br>" +
                    "ty neprestajne zveľaďuješ svoju Cirkev<br>" +
                    "a povolávaš do nej ľudí zo všetkých národov; <font color='#B71C1C'>—</font><br>" +
                    "prosíme ťa, ustavične ochraňuj všetkých,<br>" +
                    "ktorým krstnou vodou dávaš nový život.<br>" +
                    "Skrze Krista, nášho Pána.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.<br>"},
            {"V", "SIEDME ČÍTANIE", "Ez 36, 16-17a. 18-28",
                    "SIEDME ČÍTANIE", "Ez 36, 16-17a. 18-28",
                    "Vylejem na vás čistú vodu a dám vám nové srdce",
                    "Čítanie z Knihy proroka Ezechiela<br>" +
                            "Pán prehovoril ku mne takto: “Syn človeka, Izraelov dom býval na svojej pôde a poškvrnil ju svojím správaním a svojimi skutkami. Preto som na nich vylial svoj hnev: pre krv, ktorú vylievali po zemi, a poškvrnili ju svojimi modlami. Roztrúsil som ich medzi národy a rozptýlení sú po krajinách. Podľa ich správania a podľa ich skutkov som ich odsúdil.<br>" +
                            "Išli medzi národy a všade, kam sa dostali, zhanobili moje sväté meno, lebo sa o nich vravelo: ‚Toto je Pánov ľud a musel vyjsť zo svojej krajiny.'<br>" +
                            "A mne záleží na mojom svätom mene, ktoré zhanobil dom Izraela medzi národmi, ku ktorým prišli.<br>" +
                            "Preto povedz Izraelovmu domu: Toto hovorí Pán, Boh: Nie kvôli vám budem konať, dom Izraela, ale z úcty k svojmu svätému menu, ktoré ste hanobili medzi národmi, ku ktorým ste prišli.<br>" +
                            "Posvätím svoje veľké meno, zneuctené medzi národmi, ktoré ste uprostred nich hanobili. A národy spoznajú, že ja som Pán, keď na vás pred ich očami ukážem, že som svätý, – hovorí Pán, Boh.<br>" +
                            "Vezmem vás spomedzi národov, zhromaždím vás zo všetkých krajín a zavediem vás do vlastnej krajiny. Potom na vás vylejem čistú vodu a budete očistení od všetkej špiny. Od všetkých vašich modiel vás očistím.<br>" +
                            "Dám vám nové srdce a vložím do vás nového ducha. Odstránim z vášho tela srdce kamenné a dám vám srdce z mäsa. Vložím do vás svojho ducha a spôsobím, že budete kráčať podľa mojich príkazov, že budete zachovávať a plniť moje výroky.<br>" +
                            "Budete bývať v krajine, ktorú som dal vašim otcom, budete mojím ľudom a ja budem vaším Bohom.“<br>" +
                            "Počuli sme Božie slovo.<br>",
                    "RESPONZÓRIOVÝ ŽALM", "Ž 42, 3. 5b-e; 43, 3. 4", null,
                    "<font color='#B71C1C'>R.:</font> Ako jeleň dychtí za vodou z prameňa, tak moja duša, Bože, túži za tebou.<br><br>" +
                            "Po Bohu žízni moja duša, po Bohu živom; <font color='#B71C1C'>*</font><br>" +
                            "kedyže už prídem k nemu a uzriem Božiu tvár? <font color='#B71C1C'>R.</font><br>" +
                            "Veď som putoval ku vznešenému stánku <font color='#B71C1C'>*</font><br>" +
                            "a vstupoval do domu Božieho<br>" +
                            "s radostným plesaním a s piesňou ďakovnou <font color='#B71C1C'>*</font><br>" +
                            "uprostred zástupov sláviacich sviatky. <font color='#B71C1C'>R.</font><br>" +
                            "Zošli svoje svetlo a svoju pravdu; <font color='#B71C1C'>†</font><br>" +
                            "ony nech ma sprevádzajú <font color='#B71C1C'>*</font><br>" +
                            "a privedú na tvoj svätý vrch a do tvojich stánkov. <font color='#B71C1C'>R.</font><br>" +
                            "I pristúpim k Božiemu oltáru, <font color='#B71C1C'>†</font><br>" +
                            "k Bohu, ktorý ma napĺňa radosťou i plesaním, <font color='#B71C1C'>*</font><br>" +
                            "a citarou ťa, Bože, môj Bože, zvelebím. <font color='#B71C1C'>R.</font><br>" +
                            "<font color='#B71C1C'>______________<br>" +
                            "Keď sa slávi krst:</font>",
                    "RESPONZÓRIOVÝ ŽALM", "Iz 12, 2-3. 4b-d. 5-6.", null,
                    "<font color='#B71C1C'>R.:</font> Čerpajme vodu s radosťou z prameňov spásy.<br><br>" +
                            "“Hľa, Boh je moja spása; <font color='#B71C1C'>*</font><br>" +
                            "dúfam a nebojím sa,<br>" +
                            "lebo moja sila a chvála je Pán, <font color='#B71C1C'>*</font><br>" +
                            "on sa mi stal záchrancom.“<br>" +
                            "Budete čerpať vodu s radosťou <font color='#B71C1C'>*</font><br>" +
                            "z prameňov spásy. <font color='#B71C1C'>R.</font><br>" +
                            "“Oslavujte Pána a vzývajte jeho meno, <font color='#B71C1C'>†</font><br>" +
                            "ohlasujte medzi národmi jeho zázraky, <font color='#B71C1C'>*</font><br>" +
                            "pamätajte, že jeho meno je vznešené. <font color='#B71C1C'>R.</font><br>" +
                            "Spievajte Pánovi, lebo urobil veľké veci; <font color='#B71C1C'>*</font><br>" +
                            "nech je to známe po celej zemi.<br>" +
                            "Plesaj a jasaj, obyvateľka Siona, <font color='#B71C1C'>*</font><br>" +
                            "lebo veľký uprostred teba je Svätý Izraela.“ <font color='#B71C1C'>R.</font><br>" +
                            "<font color='#B71C1C'>‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾<br>" +
                            "Alebo:</font>",
                    "RESPONZÓRIOVÝ ŽALM", "Ž 51, 12-13. 14-15. 18-19", null,
                    "<font color='#B71C1C'>R.:</font> Bože, stvor vo mne srdce čisté.<br><br>" +
                            "Bože, stvor vo mne srdce čisté <font color='#B71C1C'>*</font><br>" +
                            "a v mojom vnútri obnov ducha pevného.<br>" +
                            "Neodvrhuj ma spred svojej tváre <font color='#B71C1C'>*</font><br>" +
                            "a neodnímaj mi svojho ducha svätého. <font color='#B71C1C'>R.</font><br>" +
                            "Navráť mi radosť z tvojej spásy <font color='#B71C1C'>*</font><br>" +
                            "a posilni ma duchom veľkej ochoty.<br>" +
                            "Poučím blúdiacich o tvojich cestách <font color='#B71C1C'>*</font><br>" +
                            "a hriešnici sa k tebe obrátia. <font color='#B71C1C'>R.</font><br>" +
                            "Veď ty nemáš záľubu v obete, <font color='#B71C1C'>*</font><br>" +
                            "ani žertvu neprijmeš odo mňa.<br>" +
                            "Obetou Bohu milou je duch skrúšený; <font color='#B71C1C'>*</font><br>" +
                            "Bože, ty nepohŕdaš srdcom skrúšeným a poníženým. <font color='#B71C1C'>R.</font><br>"},
            {"K", null, "Modlime sa.<br>" +
                    "Bože, nekonečná sila a nehynúce svetlo,<br>" +
                    "láskavo zhliadni na svoju Cirkev,<br>" +
                    "ktorá je sviatosťou spásy, <font color='#B71C1C'>*</font><br>" +
                    "a podľa svojho odvekého rozhodnutia<br>" +
                    "uskutočňuj dielo ľudského vykúpenia<br>" +
                    "v trvalom pokoji; <font color='#B71C1C'>—</font><br>" +
                    "nech celý svet skúsi a uzná,<br>" +
                    "že dvíhaš, čo bolo pokorené, omladzuješ, čo zostarlo,<br>" +
                    "a všetko privádzaš do stavu pôvodnej dokonalosti<br>" +
                    "skrze pôvodcu všetkého, Ježiša Krista,<br>" +
                    "ktorý s tebou žije a kraľuje na veky vekov.<br>" +
                    "<font color='#B71C1C'>Ľ.:</font> Amen.",
                    "Alebo:",
                    "Modlime sa.<br>" +
                            "Večný Bože, Písmom Starého a Nového zákona<br>" +
                            "uvádzaš nás do veľkonočného tajomstva; <font color='#B71C1C'>*</font><br>" +
                            "daj nám pochopiť svoju milosrdnú lásku, <font color='#B71C1C'>—</font><br>" +
                            "aby dary, ktoré nám dnes dávaš,<br>" +
                            "posilňovali v nás nádej na dary budúce.<br>" +
                            "Skrze Krista, nášho Pána.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Amen.",
                    "<font color='#000000'>31.</font> Po poslednom čítaní zo Starého zákona s príslušným medzispevom a modlitbou zažnú sa na oltári sviece a kňaz začne oslavnú pieseň <font color='000000'><i>Sláva Bohu na výsostiach.</i></font> Všetci pokračujú. Ak je zvykom, zvonia pritom zvony.<br>" +
                            "<font color='#000000'>32.</font> Keď sa skončí oslavná pieseň, kňaz prednesie zvyčajným spôsobom modlitbu:",
                    "Modlime sa.<br>" +
                            "Nekonečný Bože, ty ožiaruješ túto presvätú noc<br>" +
                            "jasom a velebou Kristovho zmŕtvychvstania; <font color='#B71C1C'>*</font><br>" +
                            "oživuj vo svojej Cirkvi ducha Božieho synovstva<br>" +
                            "a pomáhaj nám obnoviť sa na tele i na duši, <font color='#B71C1C'>—</font><br>" +
                            "aby sme ti vždy verne slúžili.<br>" +
                            "Skrze nášho Pána Ježiša Krista, tvojho Syna,<br>" +
                            "ktorý je Boh a s tebou žije a kraľuje<br>" +
                            "v jednote s Duchom Svätým po všetky veky vekov.<br>"},
            {"E", "EPIŠTOLA", "Rim 6, 3-11",
                    "Kristus vzkriesený z mŕtvych už neumiera",
                    "Čítanie z Listu svätého apoštola Pavla Rimanom<br>" +
                            "Bratia, všetci, čo sme boli pokrstení v Kristovi Ježišovi, v jeho smrť sme boli pokrstení. Krstom sme teda s ním boli pochovaní v smrť, aby sme tak, ako bol Kristus vzkriesený z mŕtvych Otcovou slávou, aj my žili novým životom. Lebo ak sme s ním zrástli a stali sa mu podobnými v smrti, tak mu budeme podobní aj v zmŕtvychvstaní. Veď vieme, že náš starý človek bol s ním ukrižovaný, aby bolo hriešne telo zničené, aby sme už neotročili hriechu. Lebo kto zomrel, je ospravedlnený od hriechu.<br>" +
                            "Ale ak sme zomreli s Kristom, veríme, že s ním budeme aj žiť. Veď vieme, že Kristus vzkriesený z mŕtvych už neumiera, smrť nad ním už nepanuje. Lebo keď zomrel, zomrel raz navždy hriechu, ale keď žije, žije Bohu. Tak zmýšľajte o sebe aj vy: že ste mŕtvi hriechu a žijete Bohu v Kristovi Ježišovi.<br>" +
                            "Počuli sme Božie slovo."},
            {"K", "<font color='#000000'>34.</font> Po čítaní epištoly všetci vstanú. Kňaz zaspieva slávnostné <font color='000000'><i>aleluja</i></font> a všetci po ňom opakujú. Potom žalmista alebo predspevák prednesie žalm a ľud odpovedá <font color='000000'><i>Aleluja.</i></font> Ak treba, sám žalmista môže zaintonovať (namiesto kňaza) slávnostné <font color='000000'><i>aleluja.</i></font>", ""},
            {"E", "RESPONZÓRIOVÝ ŽALM", "Ž 118, 1-2. 16ab+17. 22-23", null,
                    "<font color='#B71C1C'>R.:</font> Aleluja.<br><br>" +
                            "Oslavujte Pána, lebo je dobrý, <font color='#B71C1C'>*</font><br>" +
                            "lebo jeho milosrdenstvo trvá naveky.<br>" +
                            "Teraz nech hovorí Izrael, že Pán je dobrý, <font color='#B71C1C'>*</font><br>" +
                            "že jeho milosrdenstvo trvá naveky. <font color='#B71C1C'>R.</font><br>" +
                            "\"Pánova pravica mocne zasiahla, <font color='#B71C1C'>*</font><br>" +
                            "Pánova pravica ma zdvihla.\"<br>" +
                            "Ja nezomriem, budem žiť <font color='#B71C1C'>*</font><br>" +
                            "a vyrozprávam skutky Pánove. <font color='#B71C1C'>R.</font><br>" +
                            "Kameň, čo stavitelia zavrhli, <font color='#B71C1C'>*</font><br>" +
                            "stal sa kameňom uholným.<br>" +
                            "To sa stalo na pokyn Pána; <font color='#B71C1C'>*</font><br>" +
                            "vec v našich očiach obdivuhodná. <font color='#B71C1C'>R.</font><br>"},
            {"A", "<font color='#000000'>35.</font> Na evanjelium sa neprinášajú sviece, ale iba kadidlo (ak sa používa).",
                    "<font color='#000000'>36.</font> Hneď po evanjeliu je homília. Po nej nasleduje liturgia krstu."},
            {"N", "III. časť: Liturgia krstu"},
            {"K", "<font color='#000000'>37.</font> Kňaz s prisluhujúcimi ide ku krstiteľnici, ak je veriacim na dohľad. Ak nie, nádobu s vodou treba umiestniť v presbytériu. Ak sa má vysluhovať krst, zavolajú sa katechumeni. Pred zhromaždenie veriacich ich privedú krstní rodičia. Ak ide o malé deti, prinesú ich rodičia alebo krstní rodičia.<br>" +
                    "<font color='#000000'>38.</font> Potom sa kňaz prihovorí prítomným týmito alebo podobnými slovami:<br>" +
                    "________________<br>" +
                    "Ak bude krst:",
                    "Drahí bratia a sestry, všetci sprevádzajme svojou modlitbou našich bratov <font color='#B71C1C'>(</font>sestry<font color='#B71C1C'>)</font>, ktorí<font color='#B71C1C'>(</font>é<font color='#B71C1C'>)</font> idú s radostnou nádejou k prameňu znovuzrodenia. Všemohúci Boh Otec nech ich ochraňuje a nech je im milostivý.",
                    "‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾<br>" +
                            "Ak nebude krst, ale sa iba svätí krstná voda:",
                    "Drahí bratia a sestry, pokorne vzývajme všemohúceho Boha Otca, aby zoslal svoju milosť na túto vodu a tých, čo sa z nej znovuzrodia, prijal v Kristovi za svoje deti.",
                    "<font color='#000000'>39.</font> Potom dvaja speváci spievajú litánie. Všetci stoja (pretože je už veľkonočné obdobie) a odpovedajú. Ak treba ísť ku krstiteľnici v dlhšom sprievode, litánie sa spievajú počas procesie. V tomto prípade sa krstenci zavolajú dopredu ešte pred procesiou.<br>" +
                            "Na čele sprievodu sa nesie veľkonočná svieca, za ňou idú katechumeni s krstnými rodičmi a kňaz s prisluhujúcimi. Príhovor (pozri č. 38) je až pred svätením vody.<br>" +
                            "<font color='#000000'>40.</font> Ak sa nevysluhuje krst a nesvätí sa krstná voda, litánie sa vynechajú a hneď nasleduje obrad posvätenia vody (pozri č. 45).<br>" +
                            "<font color='#000000'>41.</font> Do litánií možno vsunúť aj mená iných svätých, najmä meno patróna kostola alebo obce a mená patrónov krstencov.",
                    "Pane, zmiluj za. Pane, <i>zmiluj za.</i><br>" +
                            "Kriste, zmiluj sa. <i>Kriste, zmiluj sa.</i><br>" +
                            "Pane, zmiluj sa. <i>Pane, zmiluj za.</i><br>" +
                            "Svätá Mária, Matka Božia, <i>oroduj za nás</i><br>" +
                            "Svätý Michal, <i>oroduj za nás</i><br>" +
                            "Svätí Boží anjeli, <i>orodujte za nás.</i><br>" +
                            "Svätý Ján Krstiteľ, <i>oroduj za nás</i><br>" +
                            "Svätý Jozef, <i>oroduj za nás</i><br>" +
                            "Svätý Peter a Pavol, <i>orodujte za nás.</i><br>" +
                            "Svätý Andrej, <i>oroduj za nás</i><br>" +
                            "Svätý Ján, <i>oroduj za nás</i><br>" +
                            "Svätá Mária Magdaléna, <i>oroduj za nás</i><br>" +
                            "Svätý Štefan, <i>oroduj za nás</i><br>" +
                            "Svätý Ignác Antiochijský, <i>oroduj za nás</i><br>" +
                            "Svätý Vavrinec, <i>oroduj za nás</i><br>" +
                            "Svätý Vojtech, <i>oroduj za nás</i><br>" +
                            "Svätý Ján Nepomucký, <i>oroduj za nás</i><br>" +
                            "Svätá Perpetua a Felicita, orodujte za nás.</i><br>" +
                            "Svätá Agnesa, <i>oroduj za nás</i><br>" +
                            "Svätý Gregor, <i>oroduj za nás</i><br>" +
                            "Svätý Augustín, <i>oroduj za nás</i><br>" +
                            "Svätý Atanáz, <i>oroduj za nás</i><br>" +
                            "Svätý Bazil, <i>oroduj za nás</i><br>" +
                            "Svätý Martin, <i>oroduj za nás</i><br>" +
                            "Svätý Benedikt, <i>oroduj za nás</i><br>" +
                            "Svätý Cyril a Metod, <i>orodujte za nás.</i><br>" +
                            "Svätý Andrej-Svorad a Benedikt, <i>orodujte za nás.</i><br>" +
                            "Svätý František a Dominik, <i>orodujte za nás.</i><br>" +
                            "Svätý František Xaverský, <i>oroduj za nás</i><br>" +
                            "Svätý Ján Mária Vianney, <i>oroduj za nás</i><br>" +
                            "Svätá Katarína Sienská, <i>oroduj za nás</i><br>" +
                            "Svätá Terézia Avilská, <i>oroduj za nás</i><br>" +
                            "Všetci Boží svätí a sväté, <i>orodujte za nás.</i><br>" +
                            "Buď nám milostivý, <i>ochraňuj nás, Pane.</i><br>" +
                            "Od všetkého zla, <i>ochraňuj nás, Pane.</i><br>" +
                            "Od každého hriechu, <i>ochraňuj nás, Pane.</i><br>" +
                            "Od večnej smrti, <i>ochraňuj nás, Pane.</i><br>" +
                            "Pre tvoje vtelenie, <i>ochraňuj nás, Pane.</i><br>" +
                            "Pre tvoju smrť a zmŕtvychvstanie, <i>ochraňuj nás, Pane.</i><br>" +
                            "Pre zoslanie Ducha Svätého, <i>ochraňuj nás, Pane.</i><br>" +
                            "My hriešnici, <i>prosíme ťa, vyslyš nás.</i><br>",
                    "________________<br>" +
                            "Ak bude krst:",
                    "Udeľ vo svätom krste milosť znovuzrodenia týmto svojim vyvoleným, <i>prosíme ťa, vyslyš nás.</i>",
                    "‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾<br>" +
                            "Ak nebude krst:",
                    "Posväť svojou milosťou túto vodu, z ktorej sa ti zrodia synovia a dcéry, <i>prosíme ťa, vyslyš nás.</i><br>" +
                            "Ježišu, Synu Boha živého, <i>prosíme ťa, vyslyš nás.</i>",
                    "________________<br>" +
                            "Ak bude krst, kňaz so zopätými rukami prednesie túto modlitbu:",
                    "Všemohúci a večný Bože,<br>" +
                            "prejav svoj u moc vo sviatosti svojej lásky: <font color='#B71C1C'>*</font><br>" +
                            "udeľ ducha synovstva a nový život všetkým,<br>" +
                            "ktorí sa ti zrodia v krstnom prameni, <font color='#B71C1C'>—</font><br>" +
                            "a uskutočni svojou mocou,<br>" +
                            "čo my, tvoji služobníci,<br>" +
                            "vykonáme sviatostnými znakmi.<br>" +
                            "Skrze Krista, nášho Pána.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Amen.",
                    "‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾", null},
            {"N", "Svätenie krstnej vody"},
            {"K", "<font color='#000000'>42.</font> Potom kňaz svätí krstnú vodu. So zopätými rukami sa modlí:",
                    "Bože,<br>" +
                            "tvoja neviditeľná moc zázračne účinkuje<br>" +
                            "prostredníctvom sviatostných znakov.<br>" +
                            "Stvoril si vodu<br>" +
                            "a mnohorakým spôsobom si ju pripravoval,<br>" +
                            "aby nám naznačovala milosť krstu.<br>" +
                            "<br>" +
                            "Bože, tvoj Duch sa už na počiatku stvorenia<br>" +
                            "vznášal nad vodami, a tak voda už vtedy<br>" +
                            "dostala schopnosť posväcovať.<br>" +
                            "<br>" +
                            "Potopou sveta si vopred naznačil naše znovuzrodenie,<br>" +
                            "keď v hlbinách jedného a toho istého živlu<br>" +
                            "bol koniec nerestí a začiatok čností.<br>" +
                            "Abrahámovým potomkom si dal<br>" +
                            "suchou nohou prejsť cez Červené more,<br>" +
                            "aby ľud vyslobodený z faraónovho otroctva<br>" +
                            "bol predobrazom pokrsteného ľudu.<br>" +
                            "Keď Ján pokrstil tvojho Syna vodou Jordána,<br>" +
                            "pomazal si ho Duchom Svätým.<br>" +
                            "Keď Ježiš visel na kríži,<br>" +
                            "z jeho boku vytiekla krv a voda.<br>" +
                            "A keď vstal z mŕtvych, rozkázal učeníkom:<br>" +
                            "„Iďte a učte všetky národy<br>" +
                            "a krstite ich v mene Otca i Syna i Ducha Svätého.“<br>" +
                            "<br>" +
                            "Otče, zhliadni na tvár svojej Cirkvi<br>" +
                            "a milostivo jej otvor prameň krstnej vody.<br>" +
                            "Nech Duch Svätý vloží do tejto vody<br>" +
                            "milosť tvojho jednorodeného Syna,<br>" +
                            "aby z človeka, stvoreného na obraz Boží,<br>" +
                            "sviatosť krstu zmyla všetku nečistotu<br>" +
                            "prvotného hriechu<br>" +
                            "a umožnila mu povstať z vody a z Ducha Svätého<br>" +
                            "k novému detstvu.",
                    "Kňaz ponorí veľkonočnú sviecu do vody (raz alebo tri razy, ako uzná za vhodné) a pokračuje:",
                    "Prosíme ťa, Bože,<br>" +
                            "nech prostredníctvom tvojho Syna<br>" +
                            "zostúpi sila Ducha Svätého do tohto prameňa,",
                    "(držiac veľkonočnú sviecu vo vode, pokračuje):",
                    "aby všetci, ktorí v krste tajomne umierajú<br>" +
                            "a sú pochovaní s Kristom,<br>" +
                            "povstali s ním aj k životu.<br>" +
                            "Skrze Krista, nášho Pána.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Amen.",
                    "<font color='#000000'>43.</font> Kňaz vytiahne veľkonočnú sviecu z vody. Ľud pritom zvolá:",
                    "Oslavujte Pána, pramene,<br>" +
                            "chváľte a zvelebujte ho naveky!",
                    "Možno použiť aj iné zvolanie.<br>" +
                            "<font color='#000000'>44.</font> Katechumeni sa po jednom osvedčia, že sa zriekajú zlého ducha, vyznajú vieru a potom prijmú krst. Ak je prítomný biskup alebo kňaz, ktorý má právomoc birmovať, hneď po krste vysluhuje dospelým novopokrsteným aj sviatosť birmovania.<br>" +
                            "________________<br>" +
                            "<font color='#000000'>45.</font> Ak sa nevysluhuje krst a nesvätí sa ani krstná voda, kňaz požehná vodu touto formulou:",
                    "Bratia a sestry,<br>" +
                            "prosme pokorne Pána Boha, nech posvätí túto vodu,<br>" +
                            "aby sme ňou mohli byť pokropení<br>" +
                            "na pamiatku nášho krstu,<br>" +
                            "a nech nás milostivo obnoví,<br>" +
                            "aby sme ostali verní Duchu Svätému,<br>" +
                            "ktorého sme prijali.",
                    "Po krátkej tichej modlitbe pokračuje so zopätými rukami:",
                    "Pane a Bože náš, láskavo buď s nami,<br>" +
                            "keď nábožne slávime túto presvätú noc<br>" +
                            "a pripomíname si, ako obdivuhodne si nás stvoril<br>" +
                            "a ešte obdivuhodnejšie vykúpil.<br>" +
                            "Posväť túto vodu,<br>" +
                            "ktorá nám pripomína tvoju starostlivosť o nás:<br>" +
                            "Ty si stvoril vodu, aby zúrodňovala polia<br>" +
                            "a aby nás osviežovala a očisťovala.<br>" +
                            "Ty si ju postavil do služieb svojho milosrdenstva:<br>" +
                            "V odo u Červeného mora<br>" +
                            "si vyslobodil svoj ľud z egyptského otroctva.<br>" +
                            "Vodou zo skaly<br>" +
                            "uhasil si na púšti smäd svojho ľudu.<br>" +
                            "V predpovediach prorokov voda bola<br>" +
                            "obrazom novej zmluvy,<br>" +
                            "ktorú si chcel uzavrieť s ľudstvom.<br>" +
                            "Napokon ju Kristus v Jordáne posvätil,<br>" +
                            "aby vo sviatosti znovuzrodenia<br>" +
                            "obnovovala porušenú ľudskú prirodzenosť.<br>" +
                            "Nech nám teda táto voda pripomína náš krst,<br>" +
                            "aby sme sa radovali s našimi bratmi a sestrami,<br>" +
                            "ktorí v túto presvätú noc prijímajú sviatosť krstu.<br>" +
                            "Skrze Krista, nášho Pána.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Amen."},
            {"N", "Obnovenie krstných sľubov"},
            {"K", "<font color='#000000'>46.</font> Po krstných (a birmovných) obradoch, alebo, ak sa tieto sviatosti nevysluhovali, po svätení vody, všetci vstanú a so zažatými sviecami v rukách obnovia krstné sľuby . Kňaz sa im prihovorí týmito alebo podobnými slovami:",
                    "Drahí bratia a sestry,<br>" +
                            "všetci máme účasť na veľkonočnom tajomstve,<br>" +
                            "lebo v krste sme boli pochovaní s Kristom,<br>" +
                            "aby sme s ním povstali k novému životu.<br>" +
                            "Preto po skončení<br>" +
                            "štyridsaťdennej veľkonočnej prípravy<br>" +
                            "obnovme krstné sľuby,<br>" +
                            "ktorými sme sa zriekli zlého ducha a jeho skutkov<br>" +
                            "a sľúbili sme,<br>" +
                            "že budeme slúžiť Bohu vo svätej katolíckej Cirkvi.<br>" +
                            "Preto sa vás pýtam:<br>" +
                            "<font color='#B71C1C'>K.:</font> Zriekate sa zlého ducha?<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Zriekam.<br>" +
                            "<font color='#B71C1C'>K.:</font> Aj všetkých jeho skutkov?<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Zriekam.<br>" +
                            "<font color='#B71C1C'>K.:</font> Aj všetkých jeho pokušení?<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Zriekam.",
                    "Alebo:",
                    "<font color='#B71C1C'>K.:</font> Zriekate sa hriechu, aby ste mohli žiť v slobode Božích detí?<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Zriekam.<br>" +
                            "<font color='#B71C1C'>K.:</font> Zriekate sa vábivých pokušení, aby vás neovládal hriech?<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Zriekam.<br>" +
                            "<font color='#B71C1C'>K.:</font> Zriekate sa zlého ducha, pôvodcu a kniežaťa hriechu?<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Zriekam.",
                    "Biskupská konferencia môže túto druhú formulu upraviť podľa miestnych potrieb.<br>" +
                            "Kňaz pokračuje:",
                    "<font color='#B71C1C'>K.:</font> Veríte v Boha, Otca všemohúceho, Stvoriteľa neba i zeme?<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Verím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Veríte v Ježiša Krista, jeho jediného Syna a nášho Pána, narodeného z Márie Panny, umučeného a pochovaného, ktorý vstal z mŕtvych a sedí po pravici Otca?<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Verím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Veríte v Ducha Svätého, v svätú Cirkev všeobecnú, v spoločenstvo svätých, v odpustenie hriechov, vo vzkriesenie tela a v život večný?<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Verím.",
                    "Kňaz zakľúči:",
                    "Všemohúci Boh, Otec nášho Pána Ježiša Krista, ktorý nás znovuzrodil z vody a z Ducha Svätého a odpustil nám hriechy, nech nás svojou milosťou zachová pre večný život v Kristu Ježišovi, našom Pánovi.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Amen.",
                    "<font color='#000000'>47.</font> Kňaz pokropí ľud svätenou vodou. Všetci spievajú (nápev v JKS, č. 484):<br>" +
                            "<font color='#000000'>Tiekla voda z pravej strany svätyne, aleluja,<br>" +
                            "krstom v nej sme povolaní k nevine, aleluja.<br>" +
                            "Zmiluj sa nad nami, Bože, v nekonečnej milosti,<br>" +
                            "tvoje zľutovanie môže zotrieť naše nečnosti.<br>" +
                            "Môže sa spievať aj iná pieseň pripomínajúca krst.</font><br>" +
                            "<font color='#000000'>48.</font> Medzitým sa novopokrstení vrátia na svoje miesta medzi veriacich. Ak sa krstná voda nesvätila v krstiteľnici, prisluhujúci dôstojne prenesú nádobu s krstnou vodou ku krstiteľnici. Ak sa nesvätila krstná voda, svätenú vodu odnesú na zvyčajné miesto.<br>" +
                            "<font color='#000000'>49.</font> Keď kňaz pokropil ľud, vráti sa k sedadlu. Vynechá sa <font color='#000000'><b>vyznanie viery</b></font> a hneď nasleduje modlitba veriacich, na ktorej sa po prvý raz zúčastnia aj novopokrstení.", null},
            {"N", "Spoločná modlitba veriacich"},
            {"K", null, "Bratia a sestry, v túto svätú noc slávime vzkriesenie nášho Pána. S radosťou a veľkou dôverou prednesme svoje prosby.<br>" +
                    "<i>(Volajme: Prosíme ťa, vyslyš nás.<br><font color='#B71C1C'>Alebo:</font> Víťazný Baránok, vyslyš naše prosby.)</i><br>" +
                    "<br>" +
                    "<font color='#B71C1C'>1.</font> Pane Ježišu, víťaz nad hriechom a smrťou, naplň svoju nevestu Cirkev, zrodenú z tvojho boku, veľkonočnou radosťou.<br>" +
                    "<font color='#B71C1C'>2.</font> Pane Ježišu, Boží Baránok, pritiahni k sebe celé ľudstvo, za ktoré si sa obetoval na kríži, a daj mu účasť na svojom božskom živote.<br>" +
                    "<font color='#B71C1C'>3.</font> Pane Ježišu, svetlo sveta, osvieť svojím Duchom všetkých, ktorí ešte nepoznajú tvoje vzkriesenie.<br>" +
                    "<font color='#B71C1C'>4.</font> Pane Ježišu, naša cesta, pravda a život, zachovaj v krstnej milosti a vo svojej láske všetkých, ktorí boli pokrstení v tejto svätej noci.<br>" +
                    "<font color='#B71C1C'>5.</font> Pane Ježišu, naša radosť, daj, aby sme s úprimným srdcom slávili v našich domoch a rodinách tvoje slávne zmŕtvychvstanie.<br>" +
                    "<font color='#B71C1C'>6.</font> Pane Ježišu, naše vzkriesenie a život, daj, aby naši zosnulí <font color='#B71C1C'>(M.)</font> dosiahli účasť na večnom živote v nebi.<br>" +
                    "<br>" +
                    "Božský Vykupiteľ,<br>" +
                    "ty si nás zmieril s Otcom a dal si nám účasť na Božom živote;<br>" +
                    "daj, nech si ceníme svoje znovuzrodenie v krste<br>" +
                    "a všade ohlasujeme veľkonočnú radosť.<br>" +
                    "Lebo ty žiješ a kraľuješ na veky vekov."},
            {"N", "IV. časť: Liturgia Eucharistie"},
            {"K", "<font color='#000000'>50.</font> Kňaz pristúpi k oltáru a zvyčajným spôsobom začne liturgiu Eucharistie.<br>" +
                    "<font color='#000000'>51.</font> Odporúča sa, aby chlieb a víno priniesli k oltáru novo pokrstení.",
                    "<font color='#B71C1C'>NAD OBETNÝMI DARMI</font><br>" +
                            "Prosíme ťa, Bože, <font color='#B71C1C'>*</font><br>" +
                            "prijmi modlitby a obetné dary svojho ľudu <font color='#B71C1C'>—</font><br>" +
                            "a daj, aby nám táto obeta,<br>" +
                            "ktorá má pôvod<br>" +
                            "v obete pravého veľkonočného Baránka,<br>" +
                            "zaistila večnú spásu.<br>" +
                            "Skrze Krista, nášho Pána."},
    {""},
            {"P", "O veľkonočnom tajomstve",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>" +
                            "<font color='#B71C1C'>K.:</font> Hore srdcia.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Máme ich u Pána.<br>" +
                            "<font color='#B71C1C'>K.:</font> Vzdávajme vďaky Pánovi, Bohu nášmu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Je to dôstojné a správne.<br><br>" +
                            "Je naozaj dôstojné a správne, dobré a spásonosné<br>" +
                            "teba, Pane, velebiť v každom čase,<br>" +
                            "ale slávnostnejšie v túto noc,<br>" +
                            "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" +
                            "<font color='#B71C1C'>(</font>v tento deň,<font color='#B71C1C'>)</font><br>" +
                            "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" +
                            "<font color='#B71C1C'>(</font>v tento čas,<font color='#B71C1C'>)</font><br>" +
                            "keď sa Kristus obetoval<br>" +
                            "ako náš veľkonočný Baránok.<br>" +
                            "Veď on je opravdivý Baránok,<br>" +
                            "ktorý sňal hriechy sveta.<br>" +
                            "On svojou smrťou našu smrť premohol<br>" +
                            "a svojím zmŕtvychvstaním obnovil nám život.<br>" +
                            "Preto vykúpené ľudstvo po celom svete<br>" +
                            "raduje sa z Kristovho vzkriesenia<br>" +
                            "a v nebi anjeli so zástupmi svätých<br>" +
                            "neprestajne spievajú na tvoju slávu:<br><br>" +
                            "Svätý, svätý, svätý, je Pán, Boh všetkých svetov<br>" +
                            "Plné sú, nebesia i zem tvojej slávy.<br>" +
                            "Hosana na výsostiach!<br>" +
                            "Požehnaný, ktorý prichádza v mene Pánovom<br>" +
                            "Hosana na výsostiach!"},
            {""},
            {"O"},
            {""},
            {"E", "SPEV NA PRIJÍMANIE", "(Porov. 1 Kor 5, 7-8)", null,
                    "Náš veľkonočný baránok Kristus bol obetovaný;<br>" +
                            "preto slávme túto veľkonočnú hostinu s úprimnou radosťou.<br>" +
                            "<br>" +
                            "<font color='#B71C1C'>PO PRIJÍMANÍ</font><br>" +
                            "Dobrotivý Bože, <font color='#B71C1C'>*</font><br>" +
                            "pri veľkonočnej hostine si nás posilnil<br>" +
                            "sviatostným pokrmom; <font color='#B71C1C'>—</font><br>" +
                            "naplň nás všetkých svojím Duchom<br>" +
                            "a v láske nám zjednoť srdcia i mysle.<br>" +
                            "Skrze Krista, nášho Pána."},
            {"K", "<font color='#000000'>55.</font> Ak po omši veľkonočnej vigílie nasleduje sprievod Vzkriesenia, vynechá sa požehnanie a prepustenie ľudí.<br>" +
                    "________________<br>" +
                    "<font color='#000000'>56.</font> Nasleduje prepustenie ľudu. Kňaz sa obráti k ľudu a s rozopätými rukami povie:",
                    "<font color='#B71C1C'>K.:</font> Pán s vami.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> I s duchom tvojím.<br>",
                    "Diakon (alebo ak ho niet, sám kňaz) sa obráti na veriacich týmito alebo podobnými slovami: ", "Prijmite slávnostné požehnanie. ", "Potom kňaz vystrie ruky nad ľud a povie (spieva) formulu požehnania. Všetci odpovedia: ", "Amen.\n", null,
                    "<font color='#B71C1C'>K.:</font> Pri dnešnej veľkonočnej slávnosti nech vás žehná všemohúci Boh a chráni od nebezpečenstva hriechu.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                            "<font color='#B71C1C'>K.:</font> Boh, ktorý vás zmŕtvychvstaním svojho Syna pripravuje na večný život, nech vás naplní duchovnými darmi.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                            "<font color='#B71C1C'>K.:</font> Boh, ktorý vám doprial po dňoch Pánovho umučenia radostne sláviť veľkonočné sviatky, nech vám pomáha dôjsť do večnej slávy.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                            "<font color='#B71C1C'>K.:</font> Nech vás žehná všemohúci Boh, Otec i Syn <font color='#B71C1C'>†</font> i Duch Svätý.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Amen.",
                    "Kňaz alebo diakon prepustí ľud slovami:",
                    "Iďte v mene Božom, aleluja, aleluja.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Bohu vďaka, aleluja, aleluja.",
                    "Ak po omši Veľkonočnej vigílie nasleduje sprievod Vzkriesenia, vynechá sa prepustenie ľudu.", null},
            {"V", "Procesia po Veľkonočnej vigílii", null, "<font color='#000000'>57.</font> Po prijímaní celebrant (alebo diakon, ak je) vloží hostiu do monštrancie.<br>"+
                    "<font color='#000000'>58.</font> Hneď po modlitbe po prijímaní celebrant si vezme biely pluviál (alebo môže zostať aj v ornáte), zíde pred oltár, kľakne si (chrbtom k ľudu) a incenzuje sviatosť.<br>"+
                    "<font color='#000000'>59.</font> Potom vstane, obráti sa tvárou k veriacim a povie takto alebo podobne:",
                    "Drahí bratia a sestry, v tejto Veľkonočnej vigílii sme oslávili Kristovo veľkonočné tajomstvo: Kristus vstal z mŕtvych, premohol smrť a hriech a priniesol nám nový život. Kristus nás vykúpil svojím krížom a zmŕtvychvstaním. Raduje sa celá Cirkev, ozdobená žiarou Pánovej slávy, a aj tento chrám zaznel jasavým spevom. Nech aj okolo tohto chrámu a v celej našej farnosti zaznie chválospev na oslavu víťazného Pána.",
                    "<font color='#000000'>60.</font> Celebrant sa obráti k oltáru a zaintonuje on alebo spevák:",
                    "Vstal som z mŕtvych.",
                    "Zbor alebo aj veriaci pokračujú:",
                    "A som, Otče, stále s tebou. Aleluja.<br>" +
                            "Kladieš na mňa svoju ruku. Aleluja.<br>" +
                            "Obdivuhodná je tvoja múdrosť. Aleluja, aleluja, aleluja.",
                    "<font color='#000000'>61.</font> Celebrant príjme vélum, vezme do rúk monštranciu a povie:",
                    "<font color='#B71C1C'>K.:</font> Pokoj vám, ja som to. Aleluja.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Nebojte sa. Aleluja.",
                    "<font color='#000000'>62.</font> Tieto slová celebrant i zbor opakujú ešte dvakrát, a to vždy vyšším hlasom. Namiesto kňaza môže intonovať spevák. Potom kňaz alebo spevák zaspieva:",
                    "Pán Ježiš Kristus vstal z mŕtvych.",
                    "Všetci v piesni (JKS 192) pokračujú.<br>"+
                    "<font color='#000000'>63.</font> Sprievod ide cez kostol a okolo kostola podľa miestnych okolností. Pred Sviatosťou idú turiferi, ktorí striedavo incenzujú. Najsvätejšiu sviatosť. Na čele procesie sa nesie kríž a socha Zmŕtvychvstalého. Ostatní veriaci s a usporiadajú podlá miestnych zvyklostí. Zvonia zvony.<br>"+
                    "<font color='#000000'>64.</font> Pri návrate speváci intonujú chválospev ", "Teba, Bože, chválime. ", "Ľud pokračuje. Keď celebrant príde k oltáru, položí monštranciu na oltár.<br>"+
                    "<font color='#000000'>65.</font> Po skončení chválospevu kňaz alebo spevák intonuje <font color='#000000'>Tantum ergo - Ctime túto Sviatosť slávnu.</font><br>"+
                    "<font color='#000000'>66.</font> Ak sa nemôže konať procesia, kňaz po intonácii <font color='#000000'>Pán Ježiš Kristus vstal z mŕtvych</font> položí Sviatosť na oltár, stane si pred oltár (chrbtom k ľudu) a pripojí sa k spevu. Nasleduje <font color='#000000'>Tantum ergo.</font><br>"+
                    "<font color='#000000'>67.</font> Pri druhej strofe eucharistického hymnu kňaz incenzuje Sviatosť a po skončení hymnu povie:",
                    "<font color='#B71C1C'>K.:</font> Nebo a zem sa tešia. Aleluja.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Z tvojho zmŕtvychvstania, Kriste. Aleluja.<br>" +
                            "<font color='#B71C1C'>K.:</font> Modlime sa.",
                    "Chvíľa ticha:",
                    "Pane Ježišu,<br>" +
                            "vo vznešenej Oltárnej sviatosti<br>" +
                            "zanechal si nám pamiatku<br>" +
                            "svojho umučenia a zmŕtvychvstania; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                            "pomáhaj nám uctievať tajomstvo tvojho tela a krvi<br>" +
                            "s takou vierou a láskou,<br>" +
                            "aby sme vždy pociťovali<br>" +
                            "účinky tvojho vykupiteľského diela.<br>" +
                            "Lebo ty žiješ a kraľuješ na veky vekov.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Amen.",
                    "<font color='#000000'>68.</font> Kňaz prijme náplecné vélum, vezme do rúk monštranciu a požehná ľud, pričom nič nehovorí.<br>"+
                    "<font color='#000000'>69.</font> Potom uloží Sviatosť do svätostánku, pokľakne a svätostánok uzavrie. Ľud môže zatiaľ predniesť vhodnú aklamáciu, napr.: <font color='#000000'>Christus vincit.</font><br>"+
                    "<font color='#000000'>70.</font> Na zakončenie sa zaspieva veľkonočná mariánska antifóna <font color='#000000'>Raduj sa, nebies Kráľovná.</font>",
                    "Raduj sa, nebies Kráľovná, aleluja, aleluja.<br>" +
                            "Lebo koho si nosila, aleluja, aleluja.<br>" +
                            "Z mŕtvych vstal, jak predpovedal, aleluja, aleluja.<br>" +
                            "Pros, aby nás k sebe prijal, aleluja, aleluja.<br>" +
                            "<font color='#B71C1C'>K.:</font> Raduj sa a veseľ sa, Panna Mária, aleluja.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Lebo Pán naozaj vstal z mŕtvych, aleluja.<br>" +
                            "<font color='#B71C1C'>K.:</font> Modlime sa.<br>" +
                            "Bože, ty si zmŕtvychvstaním tvojho Syna,<br>" +
                            "nášho Pána Ježiša Krista potešil celý svet; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa, <font color='#B71C1C'>—</font><br>" +
                            "daj, aby sme na príhovor jeho Rodičky Panny Márie<br>" +
                            "dosiahli radosti večného života.<br>" +
                            "Skrze Krista, nášho Pána.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Amen."},
    };

    String[][] piatok = {
            {"S", "VEĽKÝ PIATOK\nSLÁVENIE UTRPENIA A SMRTI PÁNA"},
            {"K", "Podľa pradávnej tradície Cirkev v tento a v nasledujúci deň neslávi eucharistickú obetu." +
                    "Oltár má byť úplne obnažený, bez kríža, svietnikov a plachiet." +
                    "V popoludňajších hodinách okolo tretej (z pastoračných dôvodov to môže byť aj neskoršie) slávi sa liturgia umučenia Pána. Má tri časti: liturgiu slova, poklonu svätému krížu a sväté prijímanie. V tento deň sa veriacim podáva Oltárna sviatosť výlučne v rámci tejto liturgie; ale chorým, ktorí sa nemôžu na nej zúčastniť, možno sväté prijímanie zaniesť kedykoľvek." +
                    "Kňaz a prisluhujúci sa oblečú ako na omšu do rúcha červenej farby; prídu k oltáru, poklonia sa, ľahnú si dolu tvárou alebo, ak je to vhodnejšie, kľaknú si, a zotrvajú chvíľu v tichej modlitbe.<br>" +
                    "Potom kňaz a prisluhujúci odídu k sedadlám. Kňaz sa obráti k ľudu a so zopätými rukami sa modlí jednu z týchto modlitieb:",
                    "<br>" +
                            "<font color='#B71C1C'>MODLITBA</font>",
                    "(Vynechá sa výzva: Modlime sa)",
                    "Dobrotivý Otče,<br>" +
                            "rozpomeň sa na veľké skutky svojho milosrdenstva<br>" +
                            "a ustavične ochraňuj a posväcuj svoj ľud,<br>" +
                            "za ktorý tvoj Syn Ježiš Kristus vy lial svoj u krv,<br>" +
                            "a tak započal veľkonočné tajomstvo.<br>" +
                            "On žije a kraľuje na veky vekov.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Amen.",
                    "Alebo:",
                    "Milosrdný Bože,<br>" +
                            "utrpením a smrťou tvojho Syna<br>" +
                            "a nášho Pána Ježiša Krista<br>" +
                            "premohol si smrť, ktorú celé ľudstvo zdedilo<br>" +
                            "ako trest za prvotný hriech;<br>" +
                            "prosíme Ťa, urob nás podobnými Kristovi,<br>" +
                            "a keď sme podľa prirodzenosti<br>" +
                            "doteraz žili ako ľudia hriešni,<br>" +
                            "daj, aby sme odteraz, posvätení tvojou milosťou,<br>" +
                            "žili ako ľudia vykúpení.<br>" +
                            "Skrze Krista, nášho Pána.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Amen."},
            {"N", "l. časť: Liturgia slova"},
            {"E", "PRVÉ ČÍTANIE", "Iz 52, 13 – 53, 12",
                    "On bol prebodnutý pre naše neprávosti\n" +
                            "Štvrtý spev Pánovho sluhu",
                    "Čítanie z Knihy proroka Izaiáša<br>" +
                            "Boh hovorí:<br>" +
                            "Hľa, môj služobník bude úspešný, bude povýšený, vyzdvihnutý a veľmi slávny. Ako sa mnohí nad ním zhrozili – lebo bol zohavený, že sa výzorom nepodobá človeku a vzhľadom sa neponáša na ľudí –, tak rozoženie mnohé národy. Králi pred ním zatvoria ústa, lebo uvidia, o čom sa im nevravelo, a spoznajú, čo nikdy nepočuli.<br>" +
                            "Prorok hovorí:<br>" +
                            "Kto uveril, čo sme hlásali? A Pánovo rameno komu sa zjavilo? Veď vzišiel pred ním ako ratoliestka, sťa koreň z vyschnutej zeme. Nemal podoby ani krásy, aby sme naň hľadeli; ani výzor nemal, aby sme po ňom túžili. Opovrhnutý bol a najposlednejší z ľudí, muž bolestí, ktorý poznal slabosť, ako niekto, pred kým si zakrývame tvár, opovrhnutý, a preto sme si ho nevážili. A on niesol naše neduhy, vzal na seba naše bolesti. No my sme ho pokladali za zbitého, strestaného Bohom a pokoreného. Ale on bol prebodnutý pre naše neprávosti, pre naše zločiny strýznený. On pre náš pokoj znášal trest a jeho rany nás uzdravili.<br>" +
                            "My všetci sme blúdili ako ovce, každý zahol svojou vlastnou cestou. A Pán na neho uvalil neprávosť nás všetkých. Týrali ho, on to ponížene znášal a neotvoril ústa; ako baránok vedený na zabitie, ako ovca, ktorá onemela pred strihačmi a neotvorila ústa.<br>" +
                            "Násilným súdom ho odstránili a kto sa bude starať o jeho pokolenie? Veď bol vyťatý z krajiny žijúcich, pre hriech môjho ľudu na smrť ubitý. So zločincami ho pochovali, a hrob mal medzi boháčmi, hoci sa nedopustil neprávosti, ani lesť nebola v jeho ústach.<br>" +
                            "Pán dovolil zdrviť ho slabosťou; keď dá svoj život na zmiernu obetu, uvidí ďaleké potomstvo a jeho ruka úspešne vykoná Pánovu vôľu. Po útrapách svojej duše uvidí svetlo a nasýti sa poznaním.<br>" +
                            "Boh hovorí:<br>" +
                            "Môj spravodlivý služobník ospravedlní mnohých a sám ponesie ich viny. Preto mu dám ako podiel zástupy a s mocnými sa bude deliť o korisť, pretože vydal na smrť svoj život a započítali ho medzi zločincov; a on niesol hriech mnohých a prosí za hriešnikov.<br>" +
                            "Počuli sme Božie slovo.<br>"},
            {"E", "RESPONZÓRIOVÝ ŽALM", "Ž 31, 2+6. 12-13. 15-16. 17+25", null,
                    "<font color='#B71C1C'>R.:</font> Otče, do tvojich rúk porúčam svojho ducha.<br><br>" +
                            "Pane, v teba dúfam, nech nie som zahanbený naveky; <font color='#B71C1C'>*</font><br>" +
                            "vysloboď ma, veď si spravodlivý.<br>" +
                            "Do tvojich rúk porúčam svojho ducha; <font color='#B71C1C'>*</font><br>" +
                            "ty si ma vykúpil, Pane, Bože verný. <font color='#B71C1C'>R.</font><br>" +
                            "Všetci moji nepriatelia mnou opovrhujú, <font color='#B71C1C'>†</font><br>" +
                            "susedom som na posmech<br>" +
                            "a svojim známym som postrachom. <font color='#B71C1C'>*</font><br>" +
                            "Tí, čo ma vidia na ulici, utekajú predo mnou.<br>" +
                            "Vytrácam sa z ich pamäti ako mŕtvy, <font color='#B71C1C'>*</font><br>" +
                            "som sťa odhodená nádoba. <font color='#B71C1C'>R.</font><br>" +
                            "Ja sa však spolieham na teba, Pane,<br>" +
                            "a hovorím: „Ty si môj Boh, <font color='#B71C1C'>*</font><br>" +
                            "v tvojich rukách je môj osud.“<br>" +
                            "Vytrhni ma z rúk mojich nepriateľov <font color='#B71C1C'>*</font><br>" +
                            "a prenasledovateľov. <font color='#B71C1C'>R.</font><br>" +
                            "Rozjasni svoju tvár nad svojím sluhom <font color='#B71C1C'>*</font><br>" +
                            "a zachráň ma vo svojom milosrdenstve.<br>" +
                            "Vzmužte sa a majte srdce statočné, <font color='#B71C1C'>*</font><br>" +
                            "vy všetci, čo dúfate v Pána. <font color='#B71C1C'>R.</font><br>"},
            {"E", "DRUHÉ ČÍTANIE", "Hebr 4, 14-16; 5, 7-9",
                    "Naučil sa poslušnosti a stal sa pôvodcom večnej spásy pre všetkých, ktorí ho poslúchajú",
                    "Čítanie z Listu Hebrejom<br>" +
                            "Bratia, keďže máme vznešeného veľkňaza, ktorý prenikol nebesia, Ježiša, Božieho Syna, držme sa svojho vyznania. Veď nemáme veľkňaza, ktorý by nemohol cítiť s našimi slabosťami; veď bol podobne skúšaný vo všetkom okrem hriechu. Pristupujme teda s dôverou k trónu milosti, aby sme dosiahli milosrdenstvo a našli milosť a pomoc v pravom čase.<br>" +
                            "Kristus v dňoch svojho pozemského života so silným výkrikom a so slzami prednášal prosby a modlitby tomu, ktorý ho mohol zachrániť od smrti; a bol vyslyšaný pre svoju bohabojnosť. A hoci bol Synom, z toho, čo vytrpel, naučil sa poslušnosti; a keď dosiahol dokonalosť, stal sa pôvodcom večnej spásy pre všetkých, ktorí ho poslúchajú.<br>" +
                            "Počuli sme Božie slovo.<br>"},
            {"E", "VERŠ PRED EVANJELIOM", "Flp 2, 8-9", null,
                    "<font color='#B71C1C'>R.</font> Sláva ti a chvála, Ježišu Kriste.<br>" +
                            "Kristus sa stal pre nás poslušným až na smrť,<br>" +
                            "až na smrť na kríži.<br>" +
                            "Preto ho Boh nad všetko povýšil<br>" +
                            "a dal mu meno, ktoré je nad každé iné meno.<br>" +
                            "<font color='#B71C1C'>R.</font> Sláva ti a chvála, Ježišu Kriste.<br>"},
            {"E", "EVANJELIUM", "Jn 18, 1 – 19, 42", null,
                    "<font color='#B71C1C'>Značky pri dialogickom čítaní: E - evanjelista, + - Kristove slová, S - slová ostatných osôb.</font><br>" +
                            "Umučenie nášho Pána Ježiša Krista podľa Jána",
                    "Ježiša chytili a zviazali",
                    "<font color='#B71C1C'>E</font> Ježiš vyšiel so svojimi učeníkmi za potok Cedron. Tam bola záhrada. Vošiel do nej on i jeho učeníci. O tom mieste však vedel aj jeho zradca Judáš, lebo Ježiš sa tam často schádzal so svojimi učeníkmi.<br>" +
                            "<font color='#B71C1C'>E</font> Judáš vzal kohortu a sluhov od veľkňazov a farizejov a prišiel ta s lampášmi, fakľami a zbraňami. Ale Ježiš, keďže vedel všetko, čo malo naňho prísť, popodišiel a opýtal sa ich: <font color='#B71C1C'>+</font> „Koho hľadáte?“<br>" +
                            "<font color='#B71C1C'>E</font> Odpovedali mu: <font color='#B71C1C'>S</font> „Ježiša Nazaretského.“<br>" +
                            "<font color='#B71C1C'>E</font> Povedal im:  <font color='#B71C1C'>+</font> „Ja som.“<br>" +
                            "<font color='#B71C1C'>E</font> Bol s nimi aj zradca Judáš.<br>" +
                            "<font color='#B71C1C'>E</font> Ako im povedal: „Ja som,“ cúvli a popadali na zem. Znova sa ich teda opýtal: + „Koho hľadáte?“<br>" +
                            "<font color='#B71C1C'>E</font> Oni povedali: <font color='#B71C1C'>S</font> „Ježiša Nazaretského.“<br>" +
                            "<font color='#B71C1C'>E</font> Ježiš odvetil: <font color='#B71C1C'>+</font> „Povedal som vám: Ja som. Keď teda mňa hľadáte, týchto nechajte odísť!“<br>" +
                            "<font color='#B71C1C'>E</font> Tak sa malo splniť slovo, ktoré povedal: „Z tých, ktorých si mi dal, nestratil som ani jedného.“<br>" +
                            "<font color='#B71C1C'>E</font> Šimon Peter mal meč. Vytasil ho, zasiahol ním veľkňazovho sluhu a odťal mu pravé ucho. Sluha sa volal Malchus. Ale Ježiš Petrovi povedal: <font color='#B71C1C'>+</font> „Schovaj meč do pošvy! Azda nemám piť kalich, ktorý mi dal Otec?!“",
                    "Ježiša priviedli najprv k Annášovi",
                    "<font color='#B71C1C'>E</font> Kohorta, veliteľ a židovskí sluhovia Ježiša chytili, zviazali ho a priviedli najprv k Annášovi; bol totiž tesťom Kajfáša, ktorý bol veľkňazom toho roka. A bol to Kajfáš, čo poradil Židom: „Je lepšie, ak zomrie jeden človek za ľud.“<br>" +
                            "<font color='#B71C1C'>E</font> Za Ježišom šiel Šimon Peter a iný učeník. Ten učeník sa poznal s veľkňazom a vošiel s Ježišom do veľkňazovho dvora, Peter však ostal vonku pri dverách. Potom ten druhý učeník, čo sa poznal s veľkňazom, vyšiel, prehovoril s vrátničkou a voviedol ta Petra. Tu vrátnička povedala Petrovi: <font color='#B71C1C'>S</font> „Nie si aj ty z učeníkov toho človeka?“<br>" +
                            "<font color='#B71C1C'>E</font> On vravel: <font color='#B71C1C'>S</font> „Nie som.“<br>" +
                            "<font color='#B71C1C'>E</font> Stáli tam sluhovia a strážnici, ktorí si rozložili oheň, lebo bolo chladno, a zohrievali sa. S nimi stál aj Peter a zohrieval sa.<br>" +
                            "<font color='#B71C1C'>E</font> Veľkňaz sa vypytoval Ježiša na jeho učeníkov a na jeho učenie. Ježiš mu odpovedal: <font color='#B71C1C'>+</font> „Ja som verejne hovoril svetu. Vždy som učil v synagóge a v chráme, kde sa schádzajú všetci Židia, a nič som nehovoril tajne. Prečo sa pýtaš mňa? Opýtaj sa tých, ktorí počuli, čo som im hovoril! Oni vedia, čo som hovoril.“<br>" +
                            "<font color='#B71C1C'>E</font> Ako to povedal, jeden zo sluhov, čo tam stál, udrel Ježiša po tvári a povedal: <font color='#B71C1C'>S</font> „Tak odpovedáš veľkňazovi?“<br>" +
                            "Ježiš mu odvetil: <font color='#B71C1C'>+</font> „Ak som zle povedal, dokáž, čo bolo zlé, ale ak dobre, prečo ma biješ?!“<br>" +
                            "<font color='#B71C1C'>E</font> A tak ho Annáš zviazaného poslal k veľkňazovi Kajfášovi.",
                    "Nie si aj ty z jeho učeníkov? Nie som",
                    "<font color='#B71C1C'>E</font> Šimon Peter tam stál a zohrieval sa. I pýtali sa ho: „Nie si aj ty z jeho učeníkov?“<br>" +
                            "<font color='#B71C1C'>E</font> On zaprel: <font color='#B71C1C'>S</font> „Nie som.“<br>" +
                            "<font color='#B71C1C'>E</font> Jeden z veľkňazových sluhov, príbuzný toho, ktorému Peter odťal ucho, vravel: <font color='#B71C1C'>S</font> „A nevidel som ťa s ním v záhrade?!“<br>" +
                            "<font color='#B71C1C'>E</font> Peter znova zaprel – a vtom zaspieval kohút.",
                    "Moje kráľovstvo nie je z tohto sveta",
                    "<font color='#B71C1C'>E</font> Od Kajfáša viedli Ježiša do vládnej budovy. Bolo už ráno. Ale oni do vládnej budovy nevošli, aby sa nepoškvrnili a mohli jesť veľkonočného baránka. Preto vyšiel von za nimi Pilát a opýtal sa: <font color='#B71C1C'>S</font> „Akú žalobu podávate proti tomuto človeku?“<br>" +
                            "<font color='#B71C1C'>E</font> Odpovedali mu: <font color='#B71C1C'>S</font> „Keby tento nebol zločinec, neboli by sme ti ho vydali.“<br>" +
                            "<font color='#B71C1C'>E</font> Pilát im povedal: <font color='#B71C1C'>S</font> „Vezmite si ho vy a súďte podľa svojho zákona!“<br>" +
                            "<font color='#B71C1C'>E</font> Židia mu odpovedali: <font color='#B71C1C'>S</font> „My nesmieme nikoho usmrtiť.“ Tak sa malo splniť Ježišovo slovo, ktorým naznačil, akou smrťou zomrie.<br>" +
                            "<font color='#B71C1C'>E</font> Pilát opäť vošiel do vládnej budovy. Predvolal si Ježiša a spýtal sa ho: <font color='#B71C1C'>S</font> „Si židovský kráľ?“<br>" +
                            "<font color='#B71C1C'>E</font> Ježiš odpovedal: <font color='#B71C1C'>+</font> „Hovoríš to sám od seba, alebo ti to iní povedali o mne?“<br>" +
                            "<font color='#B71C1C'>E</font> Pilát odvetil: <font color='#B71C1C'>S</font> „Vari som ja Žid? Tvoj národ a veľkňazi mi ťa vydali. Čo si vykonal?“<br>" +
                            "<font color='#B71C1C'>E</font> Ježiš povedal: <font color='#B71C1C'>+</font> „Moje kráľovstvo nie je z tohto sveta. Keby moje kráľovstvo bolo z tohto sveta, moji služobníci by sa bili, aby som nebol vydaný Židom. Lenže moje kráľovstvo nie je stadiaľto.“<br>" +
                            "<font color='#B71C1C'>E</font> Pilát mu povedal: <font color='#B71C1C'>S</font> „Tak predsa si kráľ?“<br>" +
                            "<font color='#B71C1C'>E</font> Ježiš odpovedal: <font color='#B71C1C'>+</font> „Sám hovoríš, že som kráľ. Ja som sa na to narodil a na to som prišiel na svet, aby som vydal svedectvo pravde. Každý, kto je z pravdy, počúva môj hlas.“<br>" +
                            "<font color='#B71C1C'>E</font> Pilát mu povedal: <font color='#B71C1C'>S</font> „Čo je pravda?“<br>" +
                            "<font color='#B71C1C'>E</font> Ako to povedal, znova vyšiel k Židom a vravel im: <font color='#B71C1C'>S</font> „Ja na ňom nenachádzam nijakú vinu. Je však u vás zvykom, že vám na Veľkú noc prepúšťam jedného väzňa. Chcete teda, aby som vám prepustil židovského kráľa?“<br>" +
                            "<font color='#B71C1C'>E</font> Oni znova kričali: <font color='#B71C1C'>S</font> „Toho nie, ale Barabáša!“ <font color='#B71C1C'>E</font> A Barabáš bol zbojník.",
                    "Buď pozdravený, židovský kráľ!",
                    "<font color='#B71C1C'>E</font> Vtedy Pilát Ježiša vzal a dal ho zbičovať. Vojaci uplietli z tŕnia korunu, položili mu ju na hlavu a odeli ho do purpurového plášťa. Prichádzali k nemu a hovorili: S „Buď pozdravený, židovský kráľ!“ <font color='#B71C1C'>E</font> A bili ho po tvári.<br>" +
                            "<font color='#B71C1C'>E</font> Pilát znova vyšiel a povedal im: <font color='#B71C1C'>S</font> „Pozrite, privádzam vám ho von, aby ste vedeli, že na ňom nijakú vinu nenachádzam.“<br>" +
                            "<font color='#B71C1C'>E</font> Ježiš vyšiel von s tŕňovou korunou a v purpurovom plášti. Pilát im povedal: <font color='#B71C1C'>S</font> „Hľa, človek!“<br>" +
                            "<font color='#B71C1C'>E</font> Len čo ho zazreli veľkňazi a ich sluhovia, kričali: <font color='#B71C1C'>S</font> „Ukrižuj! Ukrižuj ho!“<br>" +
                            "<font color='#B71C1C'>E</font> Pilát im povedal: <font color='#B71C1C'>S</font> „Vezmite si ho a ukrižujte. Ja na ňom nenachádzam vinu.“<br>" +
                            "<font color='#B71C1C'>E</font> Židia mu odpovedali: <font color='#B71C1C'>S</font> „My máme zákon a podľa zákona musí umrieť, lebo sa vydával za Božieho Syna.“<br>" +
                            "<font color='#B71C1C'>E</font> Keď to Pilát počul, ešte väčšmi sa naľakal. Znova vošiel do vládnej budovy a spýtal sa Ježiša: <font color='#B71C1C'>S</font> „Odkiaľ si?“ <font color='#B71C1C'>E</font> Ale Ježiš mu neodpovedal. Pilát sa ho spýtal: <font color='#B71C1C'>S</font> „So mnou sa nechceš rozprávať?! Nevieš, že mám moc prepustiť ťa a moc ukrižovať ťa?“<br>" +
                            "<font color='#B71C1C'>E</font> Ježiš odpovedal: <font color='#B71C1C'>+</font> „Nemal by si nado mnou nijakú moc, keby ti to nebolo dané zhora. Preto má väčší hriech ten, čo ma vydal tebe.“",
                    "Preč s ním! Preč s ním! Ukrižuj ho!",
                    "<font color='#B71C1C'>E</font> Od tej chvíle sa Pilát usiloval prepustiť ho. Ale Židia kričali: <font color='#B71C1C'>S</font> „Ak ho prepustíš, nie si priateľom cisára. Každý, kto sa vydáva za kráľa, stavia sa proti cisárovi.“<br>" +
                            "<font color='#B71C1C'>E</font> Keď Pilát počul tieto slová, vyviedol Ježiša von a sadol si na súdnu stolicu na mieste zvanom Lithostrotus, po hebrejsky Gabbatha. Bol Prípravný deň pred Veľkou nocou, okolo poludnia.<br>" +
                            "<font color='#B71C1C'>E</font> Tu povedal Židom: <font color='#B71C1C'>S</font> „Hľa, váš kráľ!“<br>" +
                            "<font color='#B71C1C'>E</font> Ale oni kričali: <font color='#B71C1C'>S</font> „Preč s ním! Preč s ním! Ukrižuj ho!“<br>" +
                            "<font color='#B71C1C'>E</font> Pilát im povedal: <font color='#B71C1C'>S</font> „Vášho kráľa mám ukrižovať?!“<br>" +
                            "<font color='#B71C1C'>E</font> Veľkňazi odpovedali: <font color='#B71C1C'>S</font> „Nemáme kráľa, iba cisára!“ Tak im ho teda vydal, aby ho ukrižovali. A oni prevzali Ježiša.",
                    "Ukrižovali ho a s ním iných dvoch",
                    "<font color='#B71C1C'>E</font> Sám si niesol kríž a vyšiel na miesto, ktoré sa volá Lebka, po hebrejsky Golgota. Tam ho ukrižovali a s ním iných dvoch, z jednej i druhej strany, Ježiša v prostriedku. Pilát vyhotovil aj nápis a pripevnil ho na kríž. Bolo tam napísané: „Ježiš Nazaretský, židovský kráľ.“ Tento nápis čítalo mnoho Židov, lebo miesto, kde Ježiša ukrižovali, bolo blízko mesta; a bol napísaný po hebrejsky, latinsky a grécky.<br>" +
                            "<font color='#B71C1C'>E</font> Židovskí veľkňazi povedali Pilátovi: <font color='#B71C1C'>S</font> „Nepíš: Židovský kráľ, ale: On povedal: ‚Som židovský kráľ.‘“<br>" +
                            "<font color='#B71C1C'>E</font> Pilát odpovedal: <font color='#B71C1C'>S</font> „Čo som napísal, to som napísal.“",
                    "Rozdelili si moje šaty",
                    "<font color='#B71C1C'>E</font> Keď vojaci Ježiša ukrižovali, vzali jeho šaty a rozdelili ich na štyri časti, pre každého vojaka jednu. Vzali aj spodný odev. Ale tento odev bol nezošívaný, odhora v celku utkaný. Preto si medzi sebou povedali: <font color='#B71C1C'>S</font> „Netrhajme ho, ale losujme oň, čí bude!“ <font color='#B71C1C'>E</font> Aby sa splnilo Písmo:<br>" +
                            "„Rozdelili si moje šaty<br>" +
                            "a o môj odev hodili lós.“<br>" +
                            "<font color='#B71C1C'>E</font> A vojaci to tak urobili.<br>" +
                            "Hľa, tvoj syn! Hľa, tvoja matka!<br>" +
                            "<font color='#B71C1C'>E</font> Pri Ježišovom kríži stála jeho matka, sestra jeho matky, Mária Kleopasova, a Mária Magdaléna. Keď Ježiš uzrel matku a pri nej učeníka, ktorého miloval, povedal matke: <font color='#B71C1C'>+</font> „Žena, hľa, tvoj syn!“<br>" +
                            "<font color='#B71C1C'>E</font> Potom povedal učeníkovi: <font color='#B71C1C'>+</font> „Hľa, tvoja matka!“ A od tej hodiny si ju učeník vzal k sebe.",
                    "Je dokonané",
                    "<font color='#B71C1C'>E</font> Potom Ježiš vo vedomí, že je už všetko dokonané, povedal, aby sa splnilo Písmo: <font color='#B71C1C'>+</font> „Žíznim.“<br>" +
                            "<font color='#B71C1C'>E</font> Bola tam nádoba plná octu. Nastokli teda na yzop špongiu naplnenú octom a podali mu ju k ústam. Keď Ježiš okúsil ocot, povedal: <font color='#B71C1C'>+</font> „Je dokonané.“ <font color='#B71C1C'>E</font> Naklonil hlavu a odovzdal ducha."},
            {"K", "Pokľakne sa a chvíľku je ticho."},
            {"E", null, null, null, null, "Hneď vyšla krv a voda",
                    "<font color='#B71C1C'>E</font> Keďže bol Prípravný deň, Židia požiadali Piláta, aby ukrižovaným polámali nohy a sňali ich, aby nezostali telá na kríži cez sobotu, lebo v tú sobotu bol veľký sviatok. Prišli teda vojaci a polámali kosti prvému aj druhému, čo boli s ním ukrižovaní. No keď prišli k Ježišovi a videli, že je už mŕtvy, kosti mu nepolámali, ale jeden z vojakov mu kopijou prebodol bok a hneď vyšla krv a voda.<br>" +
                            "<font color='#B71C1C'>E</font> A ten, ktorý to videl, vydal o tom svedectvo a jeho svedectvo je pravdivé. On vie, že hovorí pravdu, aby ste aj vy uverili. Toto sa stalo, aby sa splnilo Písmo: „Kosť mu nebude zlomená.“ A na inom mieste Písmo hovorí: „Uvidia, koho prebodli.“<br>" +
                            "Ježišovo telo zavinuli do plátna s voňavými olejmi<br>" +
                            "<font color='#B71C1C'>E</font> Potom Jozef z Arimatey, ktorý bol Ježišovým učeníkom, ale tajným, lebo sa bál Židov, poprosil Piláta, aby mu dovolil sňať Ježišovo telo. A Pilát dovolil. Išiel teda a sňal jeho telo.<br>" +
                            "<font color='#B71C1C'>E</font> Prišiel aj Nikodém, ten, čo bol kedysi u neho v noci. Priniesol asi sto libier zmesi myrhy s aloou. Vzali Ježišovo telo a zavinuli ho do plátna s voňavými olejmi, ako je u Židov zvykom pochovávať. V tých miestach, kde bol ukrižovaný, bola záhrada a v záhrade nový hrob, v ktorom ešte nik neležal. Tam teda uložili Ježiša, lebo bol židovský Prípravný deň a hrob bol blízko.<br>" +
                            "Počuli sme slovo Pánovo."},
            {"N", "Slávnostná modlitba veriacich"},
            {"K", "Poslednou časťou liturgie slova je modlitba veriacich. Kňaz pri sedadle alebo ambóne, prípadne pri oltári, povie so zopätými rukami úvodnú výzvu, ktorou oznámi úmysel. Potom všetci zotrvajú chvíľu v tichej modlitbe. Nato sa kňaz modlí nahlas s rozopätými rukami. Veriaci počas modlitby stoja alebo kľačia.<br>" +
                    "Biskupská konferencia môže stanoviť, aby sa medzi úvodnou výzvou a hlasnou modlitbou kňaza zachovala tradičná výzva diakona: <font color='#000000'>Kľaknime si - Vstaňte</font>, alebo môže zaviesť primeranú aklamáciu ľudu. Na výzvu <font color='#000000'>Kľaknime si</font> všetci si kľaknú a ticho sa modlia. Na výzvu <font color='#000000'>Vstaňte</font> vstanú.<br>" +
                    "Keď to vážny verejný záujem vyžaduje, miestny ordinár môže dovoliť alebo určiť, aby sa pridala aj iná modlitba na osobitný úmysel.<br>" +
                    "Spomedzi modlitieb uvedených v misáli môže si kňaz vybrať tie, ktoré lepšie vyhovujú miestnym okolnostiam. Ale aj v tomto prípade sa má zachovať poradie úmyslov, stanovené pre spoločnú modlitbu veriacich.",
                    "<br>I. <font color='#B71C1C'>ZA SVÄTÚ CIRKEV</font><br>" +
                    "Modlime sa, milovaní bratia a sestry,<br>" +
                    "za svätú Božiu Cirkev: nech jej náš Boh a Pán<br>" +
                    "láskavo udelí pokoj, jednotu a ochranu na celom svete,<br>" +
                    "aby sme mohli pokojne a nerušene oslavovať<br>" +
                    "Boha Otca všemohúceho.",
                    "Všetci sa potichu modlia na tento úmysel. Potom kňaz nahlas pokračuje:",
                    "Všemohúci a večný Bože,<br>" +
                            "ty si v Kristovi zjavil svoju slávu všetkým národom;<br>" +
                            "ochraňuj dielo svojej lásky,<br>" +
                            "aby Cirkev, rozšírená po celom svete,<br>" +
                            "vytrvala v pevnej viere a neohrozene ťa vyznávala.<br>" +
                            "Skrze Krista, nášho Pána.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                            "<br>" +
                            "II. <font color='#B71C1C'>ZA PÁPEŽA</font><br>" +
                            "Modlime sa za nášho Svätého Otca, pápeža <font color='#B71C1C'>M.</font>,<br>" +
                            "ktorého si náš Boh a Pán vyvolil spomedzi biskupov:<br>" +
                            "nech ho chráni a zachová pre svoju Cirkev,<br>" +
                            "aby mohol spravovať svätý ľud Boží.",
                    "Všetci sa potichu modlia na tento úmysel. Potom kňaz nahlas pokračuje:",
                    "Všemohúci a večný Bože,<br>" +
                            "od tvojej vôle závisí všetko;<br>" +
                            "láskavo vypočuj naše prosby<br>" +
                            "a ochraňuj nášho najvyššieho pastiera,<br>" +
                            "aby kresťanský ľud, ktorý si mu zveril,<br>" +
                            "pod jeho vedením rástol vo viere a láske.<br>" +
                            "Skrze Krista, nášho Pána.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                            "<br>" +
                            "III. <font color='#B71C1C'>ZA BISKUPOV, KŇAZOV, DIAKONOV A VŠETOK VERIACI ĽUD</font>",
                    "O mene biskupa, ktorého treba menovať, a o formule, ktorú treba použiť, pozri Všeobecné smernice Rímskeho misála, č. 109.",
                    "Modlime sa za nášho biskupa <font color='#B71C1C'>M.</font>,<br>" +
                            "za všetkých biskupov, kňazov<br>" +
                            "a diakonov svätej Cirkvi<br>" +
                            "i za všetok veriaci ľud.",
                    "Všetci sa potichu modlia na tento úmysel. Potom kňaz nahlas pokračuje:",
                    "Všemohúci a večný Bože,<br>" +
                            "tvoj Duch posväcuje a spravuje celú Cirkev;<br>" +
                            "vypočuj naše prosby za tvojich služobníkov<br>" +
                            "a udeľ im milosť,<br>" +
                            "aby ti všetci verne slúžili.<br>" +
                            "Skrze Krista, nášho Pána.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                            "<br>" +
                            "IV. <font color='#B71C1C'>ZA KATECHUMENOV</font><br>" +
                            "Modlime sa za tých, čo sa pripravujú na krst:<br>" +
                            "nech náš Boh a Pán pri praví ich srdcia<br>" +
                            "a otvorí im náruč svojho milosrdenstva,<br>" +
                            "aby v prameni znovuzrodenia<br>" +
                            "dosiahli odpustenie hriechov<br>" +
                            "a nový život v Ježišovi Kristovi, našom Pánovi.",
                    "Všetci sa potichu modlia na tento úmysel. Potom kňaz nahlas pokračuje:",
                    "Všemohúci a večný Bože,<br>" +
                            "ty stále požehnávaš svoju Cirkev<br>" +
                            "novým potomstvom;<br>" +
                            "zveľaďuj dar viery a poznania v tých,<br>" +
                            "čo sa pripravujú na krst,<br>" +
                            "aby sa znovuzrodili v krstnom prameni<br>" +
                            "a stali sa tvojimi deťmi.<br>" +
                            "Skrze Krista, nášho Pána.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                            "<br>" +
                            "V. <font color='#B71C1C'>ZA JEDNOTU KRESŤANOV</font><br>" +
                            "Modlime sa za všetkých bratov, čo veria v Krista<br>" +
                            "a úprimne žijú podľa pravdy:<br>" +
                            "nech ich náš Boh a Pán zjednotí<br>" +
                            "a zachová vo svojej jedinej Cirkvi.",
                    "Všetci sa potichu modlia na tento úmysel. Potom kňaz nahlas pokračuje:",
                    "Všemohúci a večný Bože,<br>" +
                            "ty zjednocuješ rozdelených<br>" +
                            "a zjednotených zachovávaš vo svornosti;<br>" +
                            "láskavo zhliadni na všetkých,<br>" +
                            "ktorí veria v tvojho Syna,<br>" +
                            "a keďže nás posvätil ten istý krst,<br>" +
                            "nech nás spája aj pravá viera a vzájomná láska.<br>" +
                            "Skrze Krista, nášho Pána.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                            "<br>" +
                            "VI. <font color='#B71C1C'>ZA ŽIDOV</font><br>" +
                            "Modlime sa aj za synov židovského národa,<br>" +
                            "lebo oni boli prví, ku ktorým Pán prehovoril:<br>" +
                            "nech vzrastajú v láske k Bohu<br>" +
                            "a vo vernosti k jeho zákonu.",
                    "Všetci sa potichu modlia na tento úmysel. Potom kňaz nahlas pokračuje:",
                    "Všemohúci a večný Bože,<br>" +
                            "ty si dal svoje prisľúbenia<br>" +
                            "Abrahámovi a jeho potomkom;<br>" +
                            "milostivo vypočuj prosby svojej Cirkvi za národ,<br>" +
                            "ktorý bol tvojím vyvoleným ľudom,<br>" +
                            "aby dosiahol plné vykúpenie.<br>" +
                            "Skrze Krista, nášho Pána.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                            "<br>" +
                            "VII. <font color='#B71C1C'>ZA TÝCH, ČO NEVERIA V KRISTA</font><br>" +
                            "Modlime sa za tých, čo neveria v Krista,<br>" +
                            "aby ich Duch Svätý osvietil<br>" +
                            "a priviedol na cestu spásy.",
                    "Všetci sa potichu modlia na tento úmysel. Potom kňaz nahlas pokračuje:",
                    "Všemohúci a večný Bože,<br>" +
                            "daj, aby tí, čo nevyznávajú Krista,<br>" +
                            "žili pred tvojou tvárou statočným životom,<br>" +
                            "a tak došli k pravde;<br>" +
                            "nám však pomôž<br>" +
                            "vždy hlbšie vnikať do tajomstiev tvojho života<br>" +
                            "a rásť vo vzájomnej láske,<br>" +
                            "aby sme boli vo svete vždy dokonalejšími svedkami<br>" +
                            "tvojej dobroty.<br>" +
                            "Skrze Krista, nášho Pána.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                            "<br>" +
                            "VIII. <font color='#B71C1C'>ZA TÝCH, ČO NEVERIA V BOHA</font><br>" +
                            "Modlime sa za tých, čo neveria v Boha,<br>" +
                            "aby úprimne žili podľa svedomia,<br>" +
                            "a tak došli k poznaniu pravého Boha.",
                    "Všetci sa potichu modlia na tento úmysel. Potom kňaz nahlas pokračuje:",
                    "Všemohúci a večný Bože,<br>" +
                            "ty si vložil do srdca človeka<br>" +
                            "takú silnú túžbu po tebe,<br>" +
                            "že sa uspokojí len vtedy, keď ťa nájde;<br>" +
                            "prosíme ťa,<br>" +
                            "daj, nech všetci pocítia prejavy tvojej lásky<br>" +
                            "a povzbudia sa na príkladnom živote tvojich veriacich,<br>" +
                            "aby napriek všetkým prekážkam a ťažkostiam uznali,<br>" +
                            "že ty jediný si pravý Boh a Otec všetkých ľudí.<br>" +
                            "Skrze Krista, nášho Pána.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                            "<br>" +
                            "IX. <font color='#B71C1C'>ZA TÝCH, CO SPRAVUJÚ ŠTÁT</font><br>" +
                            "Modlime sa za tých, čo spravujú štát:<br>" +
                            "nech náš Boh a Pán vedie ich mysle a srdcia,<br>" +
                            "aby podľa jeho vôle pracovali za pravý pokoj<br>" +
                            "a slobodu pre všetkých.",
                    "Všetci sa potichu modlia na tento úmysel. Potom kňaz nahlas pokračuje:",
                    "Všemohúci a večný Bože,<br>" +
                            "v tvojich rukách sú ľudské srdcia i práva národov;<br>" +
                            "dobrotivo pomáhaj tým, čo nás zákonite spravujú,<br>" +
                            "aby všade presadzovali<br>" +
                            "pravý pokoj, blahobyt ľudu<br>" +
                            "a náboženskú slobodu.<br>" +
                            "Skrze Krista, nášho Pána.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Amen.<br>" +
                            "<br>" +
                            "X. <font color='#B71C1C'>ZA TÝCH, CO ZNÁŠAJÚ ÚTRAPY</font><br>" +
                            "Modlime sa, milovaní bratia a sestry,<br>" +
                            "k Bohu Otcu všemohúcemu,<br>" +
                            "aby oslobodil svet od všetkých neporiadkov,<br>" +
                            "odvrátil choroby, zahnal hlad,<br>" +
                            "oslobodil nevinne väznených,<br>" +
                            "ujal sa utláčaných, cestujúcim doprial bezpečnosť,<br>" +
                            "vzdialeným z domova šťastný návrat, chorým zdravie<br>" +
                            "a umierajúcim večnú spásu.",
                    "Všetci sa potichu modlia na tento úmysel. Potom kňaz nahlas pokračuje:",
                    "Všemohúci a večný Bože,<br>" +
                            "útecha zarmútených a posila trpiacich,<br>" +
                            "vypočuj prosby tých,<br>" +
                            "čo ťa vzývajú vo svojich súženiach,<br>" +
                            "a poteš ich v každej núdzi svojou láskavou pomocou.<br>" +
                            "Skrze Krista, nášho Pána.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Amen."},
            {"N", "II. časť: Poklona svätému krížu"},
            {"K", "Po modlitbách veriacich nasleduje slávnostná poklona svätému krížu. Z dvoch spôsobov tejto poklony, ktoré sa uvádzajú, treba zvoliť ten, ktorý je vhodnejší z pastoračného hľadiska.",
                    "<br>" +
                            "<font color='#B71C1C'><b>Prvý spôsob: OBRAD SO ZAHALENÝM KRÍŽOM</b></font>",
                    "K oltáru sa prinesie zahalený kríž v sprievode dvoch prisluhujúcich so zažatými sviecami. Kňaz, stojac pred oltárom, vezme kríž, poodhali jeho vrchnú časť, vyzdvihne ho a začne spievať:",
                    "Hľa, drevo kríža. Na ktorom zomrel Spasiteľ sveta.",
                    "V speve mu pomáhajú prisluhujúci, prípadne spevácky zbor. Všetci odpovedajú:",
                    "Poďte, pokloňme sa.",
            "Keď dospievajú, všetci si kľaknú a chvíľu zotrvajú v tichej adorácii. Kňaz pritom stojí a drží zdvihnutý kríž. Potom odhalí pravé rameno kríža, znova pozdvihne kríž a spieva druhý raz <font color='#000000'>Hľa, drevo kríža.</font><br>" +
                    "Pokračuje sa ako po prvýkrát.<br>" +
                    "Napokon odhalí celý kríž, pozdvihne ho a tretí raz spieva: <font color='#000000'>Hľa, drevo kríža.</font><br>" +
                    "Pokračuje sa ako po prvý raz.<br>"+
            "Potom v sprievode dvoch prisluhujúcich so zažatými sviecami odnesie kríž ku vchodu do presbytéria alebo na iné vhodné miesto. Tam ho položí alebo odovzdá prisluhujúcim, aby ho držali. Po oboch stranách kríža sa postavia sviece. Nasleduje vlastná poklona krížu (pozri Poklona svätému krížu).",
                    "<br>" +
                            "<font color='#B71C1C'><b>Druhý spôsob: OBRAD S NEZAHALENÝM KRÍŽOM</b></font><br>",
                    "Kňaz alebo diakon (prípadne iný prisluhujúci) ide v sprievode prisluhujúcich ku vchodu kostola. Tu vezme nezahalený kríž, prisluhujúci vezmú zažaté sviece a idú v sprievode cez kostol do presbytéria. Ten, čo nesie kríž, pozdvihne ho najprv pri vchode, potom uprostred kostola, napokon pred presbytériom a spieva pritom",
                    "Hľa, drevo kríža. Na ktorom zomrel Spasiteľ sveta.",
                    "Všetci mu odpovedajú",
                    "Poďte, pokloňme sa.",
                    "Po každej odpovedi si kľaknú a chvíľu zotrvajú v tichej adorácii ako pri prvom spôsobe.<br>" +
                            "Potom sa kríž so sviecami položí ku vchodu do presbytéria.",
                    "<br>" +
                            "<font color='#B71C1C'><b>Poklona svätému krížu</b></font><br>",
            "Krížu sa príde pokloniť najprv kňaz, potom klérus a veriaci. Keď prechádzajú pred krížom, vzdajú mu úctu jednoduchým pokľaknutím alebo iným vhodným spôsobom podľa miestneho zvyku, napríklad pobozkaním. Medzitým sa spieva antifóna: <font color='#000000'>Pane, vzdávame úctu tvojmu krížu,</font><br>" +
                    "impropériá alebo iný vhodný spev. Tí, čo sa už poklonili krížu, si sadnú.<br>" +
                    "Na poklonu sa vystaví iba jeden kríž. Keď sa pre veľké množstvo veriacich nemôžu všetci jednotlivo pokloniť krížu, postupuje sa takto: Keď sa už istá časť veriacich poklonila krížu, kňaz ho vezme, stane si do stredu pred oltárom a niekoľkými slovami vyzve prítomných, aby sa spoločne poklonili krížu. Potom drží chvíľu kríž vysoko vyzdvihnutý a veriaci zatiaľ zotrvajú v tichej adorácii.<br>" +
                    "Po poklone sa kríž odnesie na miesto, ktoré je preň pripravené. Zažaté sviece sa postavia vedľa oltára alebo ku krížu.", null},
            {"V", "Spevy pri poklone svätému krížu", null,
                    "<font color='#B71C1C'>ANTIFÓNA<br>"+
                            "1. a 2. zbor: </font> Pane, vzdávame úctu tvojmu krížu,<br>" +
                            "velebíme a oslavujeme tvoje zmŕtvychvstanie,<br>" +
                            "lebo drevo kríža prinieslo radosť celému svetu.<br>",
                            "ŽALM", "(Ž 67, 2)", null,
                            "<font color='#B71C1C'>1. zbor: </font> Bože, buď nám milostivý a žehnaj nás;<br>" +
                            "a tvoja tvár nech žiari nad nami.<br>" +
                            "Zmiluj sa nad nami.<br>",
                            "<font color='#B71C1C'>ANTIFÓNA<br>"+
                            "1 . a 2. zbor: </font>Pane, vzdávame úctu tvojmu krížu,<br>" +
                            "velebíme a oslavujeme tvoje zmŕtvychvstanie,<br>" +
                            "lebo drevo kríža prinieslo radosť celému svetu.<br><br>"+
                            "<font color='#B71C1C'>IMPROPÉRIA</font><br>",
                    "Prvý Pánov žalospev",
                    "<br><font color='#B71C1C'>1. a 2.: </font> Ó ľud môj, čo som ti urobil?<br>" +
                            "Alebo čím som ťa zarmútil?<br>" +
                            "Odpovedz mi!<br>" +
                            "<font color='#B71C1C'>1.: </font>Ja som ťa vyviedol z egyptskej krajiny,<br>" +
                            "a ty si pripravil kríž svojmu Spasiteľovi.<br>" +
                            "<font color='#B71C1C'>1. a 2.: </font> Ó ľud môj, čo som ti urobil?<br>" +
                            "Alebo čím som ťa zarmútil?<br>" +
                            "Odpovedz mi!<br>" +
                            "<br>" +
                            "<font color='#B71C1C'>1.: </font> Hágios o Theós.<br>" +
                            "<font color='#B71C1C'>2.: </font> Sanctus Deus.<br>" +
                            "<font color='#B71C1C'>1. a 2.: </font>Svätý Bože.<br>" +
                            "<font color='#B71C1C'>1.: </font> Hágios lschyrós.<br>" +
                            "<font color='#B71C1C'>2.: </font> Sanctus Fortis.<br>" +
                            "<font color='#B71C1C'>1. a 2.: </font>Svätý Silný.<br>" +
                            "<font color='#B71C1C'>1.: </font> Hágios Athánatos, eléison himás.<br>" +
                            "<font color='#B71C1C'>2.: </font> Sanctus Immortális, miserere nobis.<br>" +
                            "<font color='#B71C1C'>1. a 2.: </font>Svätý Nesmrteľný, zmiluj sa nad nami.<br>" +
                            "<font color='#B71C1C'>1.: </font> Ja som ťa štyridsať rokov viedol púšťou,<br>" +
                            "kŕmil som ťa mannou a priviedol do úrodnej krajiny,<br>" +
                            "a ty si pripravil kríž svojmu Spasiteľovi.<br>" +
                            "<font color='#B71C1C'>1. a 2.: </font> Hágios o Theós...<br>" +
                            "<font color='#B71C1C'>1.: </font>Čo som mal ešte pre teba urobiť?<br>" +
                            "Veď som ťa vysadil ako svoju najkrajšiu vinicu,<br>" +
                            "ale ty si mi priniesol iba trpkosti,<br>" +
                            "lebo octom si mi hasil smäd<br>" +
                            "a kopijou si prebodol srdce svojho Spasiteľa.<br>" +
                            "<font color='#B71C1C'>1. a 2.: </font>Hágios o Theós ...<br>",
                    "Druhý Pánov žalospev",
                    "<br><font color='#B71C1C'>1. </font>Pre teba som tvrdo stíhal Egypt<br>" +
                            "a pobil jeho prvorodených,<br>" +
                            "a ty si ma zbičoval a hnal na smrť.<br>" +
                            "<font color='#B71C1C'>R.: </font> Ó ľud môj, čo som ti urobil?<br>" +
                            "Alebo čím som ťa zarmútil?<br>" +
                            "Odpovedz mi.<br>" +
                            "<font color='#B71C1C'>2. </font> Ja som ťa vyviedol z egyptskej krajiny<br>" +
                            "a faraóna som nechal utonúť v Červenom mori,<br>" +
                            "a ty si ma za to priviedol pred veľradu. <font color='#B71C1C'>R. </font><br>" +
                            "<font color='#B71C1C'>3. </font> Ja som ti otvoril cestu cez Červené more,<br>" +
                            "a ty si mi kopijou otvoril srdce. <font color='#B71C1C'>R. </font><br>" +
                            "<font color='#B71C1C'>4. </font> Ja som šiel pred tebou v oblačnom stipe,<br>" +
                            "a ty si ma priviedol pred Pilátov súd. <font color='#B71C1C'>R. </font><br>" +
                            "<font color='#B71C1C'>5. </font> Ja som ťa kŕmil mannou na púšti,<br>" +
                            "a ty si ma bičoval a potupoval. <font color='#B71C1C'>R. </font><br>" +
                            "<font color='#B71C1C'>6. </font> Ja som ťa zázračne občerstvoval vodou zo skaly,<br>" +
                            "a ty si ma napájal žlčou a octom. <font color='#B71C1C'>R. </font><br>" +
                            "<font color='#B71C1C'>7. </font> Ja som za teba bil kanaanských kráľov,<br>" +
                            "a ty si ma bil trstinou po hlave. <font color='#B71C1C'>R. </font><br>" +
                            "<font color='#B71C1C'>8. </font> Ja som ti daroval kráľovské žezlo,<br>" +
                            "a ty si mi dal na hlavu tŕňovú korunu. <font color='#B71C1C'>R. </font><br>" +
                            "<font color='#B71C1C'>9. </font> Ja som ťa preslávil veľkými skutkami,<br>" +
                            "a ty si ma za to všetko ukrižoval. <font color='#B71C1C'>R. </font><br>" +
                            "<br>" +
                            "<font color='#B71C1C'>Tento žalospev možno spievať na nápev JKS, č. 188 v tejto úprave:</font><br><br>" +
                            "Ľud môj, národ premilený,<br>" +
                            "pre teba som skrvavený.<br>" +
                            "Ja Boh stal som sa ti bratom,<br>" +
                            "tys' ma na smrť vydal katom.<br>" +
                            "<br>" +
                            "Na Egypt som poslal ranu,<br>" +
                            "viedol som ťa do Kanaánu,<br>" +
                            "dal som ti trón, česť a vládu,<br>" +
                            "ty si na mne spáchal zradu.<br>" +
                            "<br>" +
                            "Ja som ti dal berlu slávy,<br>" +
                            "ty mne tŕnie kolo hlavy,<br>" +
                            "dlhé veky som ťa chránil,<br>" +
                            "tys' ma nevernosťou ranil.<br>" +
                            "<br>" +
                            "Keď ti ústa vysychali,<br>" +
                            "dal som ti piť z lona skaly,<br>" +
                            "ty si môj smäd, čo svet spasil,<br>" +
                            "výsmechom a žlčou hasil.<br>" +
                            "<br>" +
                            "Z rán po hadoch som ťa hojil,<br>" +
                            "ty si na mne svoj hnev kojil,<br>" +
                            "svietil som ti cestou v noci,<br>" +
                            "tys' mne handrou zastrel oči.<br>" +
                            "<br>" +
                            "V púšti bez vlahy a chleba<br>" +
                            "kŕmil som ťa mannou z neba,<br>" +
                            "ako matka som ťa choval,<br>" +
                            "preto si ma zauškoval.<br>" +
                            "<br>" +
                            "Ľud môj, národ premilený,<br>" +
                            "pre teba som skrvavený.<br>" +
                            "Ja Boh stal som sa ti bratom,<br>" +
                            "tys' ma na smrť vydal katom.<br>" +
                            "<font color='#B71C1C'>Môžu sa spievať aj piesne z JKS, č. 129, 131 alebo 166.</font><br>",
                    "HYMNUS",
                    "<br><font color='#B71C1C'>ANTIFÓNA (spieva 1. a 2. zbor)</font><br>"+
                            "Útulný kríž, najkrajší strom,<br>" +
                            "ty skvost medzi stromami,<br>" +
                            "všetkým sadom taký konár,<br>" +
                            "kvet a plod je neznámy!<br>" +
                            "Milé drevo s milou ťarchou milo stojíš pred nami.<br><br>"+
                            "<font color='#B71C1C'>HYMNUS (spieva 1. zbor)</font><br>"+
                            "Ospevujme veľký súboj, šírme slávne odkazy<br>" +
                            "trámov kríža, ktorý zdolal strojcu večnej nákazy!<br>" +
                            "Obeť na ňom zmiera za svet, a tou smrťou víťazí.<br>" +
                            "<br>" +
                            "<font color='#B71C1C'>2. zb. </font> Útulný kríž, najkrajší strom,<br>" +
                            "ty skvost medzi stromami,<br>" +
                            "všetkým sadom taký konár,<br>" +
                            "kvet a plod je neznámy!<br>" +
                            "<font color='#B71C1C'>1. zb. </font> Prvý človek veril zvodom,<br>" +
                            "smrť si vtiahol do domu,<br>" +
                            "keď v ňom Božiu lásku zhasil<br>" +
                            "jed, čo zjedol zo stromu,<br>" +
                            "lež Boh nový strom si vybral<br>" +
                            "zažehnať tú pohromu.<br>" +
                            "<font color='#B71C1C'>2. zb. </font> Milé drevo s milou ťarchou<br>" +
                            "milo stojíš pred nami.<br>" +
                            "<font color='#B71C1C'>1. zb. </font> Poriadok si vyžadoval<br>" +
                            "po bolestnom otrase<br>" +
                            "do priepasti vrhnúť zhubcu,<br>" +
                            "čo nás ranil v zápase,<br>" +
                            "aby skazonosný úder<br>" +
                            "poslúžil nám ku spáse.<br>" +
                            "<font color='#B71C1C'>2. zb. </font> Útulný kríž, najkrajší strom,<br>" +
                            "ty skvost medzi stromami,<br>" +
                            "všetkým sadom taký konár,<br>" +
                            "kvet a plod je neznámy!<br>" +
                            "<font color='#B71C1C'>1. zb. </font> Keď čas prišiel, keď po Bohu<br>" +
                            "vyvrcholil dávny smäd,<br>" +
                            "Otec poslal na svet Syna,<br>" +
                            "skrz ktorého stvoril svet,<br>" +
                            "a on z Panny ľudsky vzklíčil,<br>" +
                            "sťa z kra vytúžený kvet.<br>" +
                            "<font color='#B71C1C'>2. zb. </font> Milé drevo s milou ťarchou<br>" +
                            "milo stojíš pred nami.<br>" +
                            "<font color='#B71C1C'>1. zb. </font> V úzkych jasliach plače Dieťa,<br>" +
                            "predurčená Hostia,<br>" +
                            "bedlí nad ním, ohrieva ho<br>" +
                            "nežná matka Mária,<br>" +
                            "útle telo, ruky, nohy<br>" +
                            "povojníkom ovíja.<br>" +
                            "<font color='#B71C1C'>2. zb. </font> Útulný kríž, najkrajší strom,<br>" +
                            "ty skvost medzi stromami<br>" +
                            "všetkým sadom taký konár,<br>" +
                            "kvet a plod je neznámy!<br>" +
                            "<font color='#B71C1C'>1. zb. </font>A keď sa mu v ľudskom veku<br>" +
                            "najkrajší vek priblíži,<br>" +
                            "predurčený trpieť, rád sa<br>" +
                            "pred mukami poníži,<br>" +
                            "preto Baránka, hľa, ľudstvo<br>" +
                            "v obeť dvíha na kríži.<br>" +
                            "<font color='#B71C1C'>2. zb. </font> Milé drevo s milou ťarchou<br>" +
                            "milo stojíš pred nami.<br>" +
                            "<font color='#B71C1C'>1. zb. </font> Hľa, žlč, ocot, sliny, kliny, trsť a dýka ranivá<br>" +
                            "trápia telo, z boku tečie voda a krv neživá,<br>" +
                            "predsa ten zdroj zem i nebo,<br>" +
                            "súš i more omýva.<br>" +
                            "<font color='#B71C1C'>2. zb. </font> Útulný kríž, najkrajší strom,<br>" +
                            "ty skvost medzi stromami,<br>" +
                            "všetkým sadom taký konár,<br>" +
                            "kvet a plod je neznámy!<br>" +
                            "<font color='#B71C1C'>1. zb. </font> Vznešený kmeň, ohni vetvy,<br>" +
                            "zjemni postoj pristrohý,<br>" +
                            "hoci Tvorca dal ti tvrdosť,<br>" +
                            "keď ťa staval na nohy,<br>" +
                            "neotváraj rany Kráľa,<br>" +
                            "našej spásnej zálohy!<br>" +
                            "<font color='#B71C1C'>2. zb. </font> Milé drevo s milou ťarchou<br>" +
                            "milo stojíš pred nami.<br>" +
                            "<font color='#B71C1C'>1. zb. </font> Len tebe sa ušlo slávy<br>" +
                            "nosiť Darcu života,<br>" +
                            "rozosvietiť vo tme maják<br>" +
                            "svetu, ktorý troskotá,<br>" +
                            "ved ťa krvou napojila<br>" +
                            "Baránkova milota.<br>" +
                            "<font color='#B71C1C'>2. zb. </font> Útulný kríž, najkrajší strom,<br>" +
                            "ty skvost medzi stromami,<br>" +
                            "všetkým sadom taký konár,<br>" +
                            "kvet a plod je neznámy!<br><br>" +
                            "<font color='#B71C1C'>Nasledujúci záver sa nikdy nevynechá.<br><br>" +
                            "1. a z. zbor: </font><br>" +
                            "Tebe, Otče, s Duchom Svätým, nech je sláva naveky<br>" +
                            "skrze Krista, ktorý telom nie je nám už ďaleký<br>" +
                            "a chce krížom zmeniť v radosť ľudský bôľ a náreky. Amen."},
            {"N", "III. časť: Sväté prijímanie"},
            {"K", "Oltár sa prikryje plachtou, rozprestrie sa naň korporál a pripraví sa kniha. Potom diakon alebo (ak niet diakona) sám kňaz prenesie na oltár Najsvätejšiu sviatosť najkratšou cestou z miesta, kde bola uschovaná. Dvaja prisluhujúci sprevádzajú Oltárnu sviatosť so zažatými sviecami, ktoré potom postavia vedľa oltára alebo na oltár. Ostatní pritom mlčky stoja.<br>" +
                    "Diakon položí nádobku s Najsvätejšou sviatosťou na korporál a odkryje ju. Potom príde kňaz, pokľakne, vystúpi k oltáru a so zopätými rukami nahlas hovorí:",
                    "Na príkaz nášho Spasiteľa<br>" +
                            "a podľa jeho božského učenia<br>" +
                            "osmeľujeme sa povedať:",
                    "Kňaz rozopne ruky a spolu s prítomnými pokračuje:",
                    "Otče náš, ktorý si na nebesiach,<br>" +
                            "posväť sa meno tvoje,<br>" +
                            "príď kráľovstvo tvoje,<br>" +
                            "buď vôľa tvoja ako v nebi tak i na zemi.<br>" +
                            "Chlieb náš každodenný daj nám dnes<br>" +
                            "a odpusť nám naše viny,<br>" +
                            "ako i my odpúšťame svojim vinníkom,<br>" +
                            "a neuveď nás do pokušenia,<br>" +
                            "ale zbav nás zlého.",
                    "Kňaz sám pokračuje s rozopätými rukami:",
                    "Prosíme ťa, Otče, zbav nás všetkého zla,<br>" +
                            "udeľ svoj pokoj našim dňom<br>" +
                            "a príď nám milosrdne na pomoc,<br>" +
                            "aby sme boli vždy uchránení pred hriechom<br>" +
                            "a pred každým nepokojom,<br>" +
                            "kým očakávame splnenie blaženej nádeje<br>" +
                            "a príchod nášho Spasiteľa Ježiša Krista.",
                    "Kňaz zopne ruky. Ľud zakľúči modlitbu zvolaním:",
                    "Lebo tvoje je kráľovstvo a moc i sláva naveky.<br>",
                    "Potom sa kňaz so zopätými rukami potichu modlí:",
                    "Pane Ježišu Kriste,<br>" +
                            "nech mi prijatie tvojho tela<br>" +
                            "neslúži na odsúdenie a zatratenie,<br>" +
                            "ale pre tvoju dobrotu<br>" +
                            "nech mi ochraňuje a uzdravuje dušu i telo.",
                    "Potom pokľakne, vezme hostiu, drží ju pozdvihnutú nad cibóriom a obrátený k ľudu nahlas hovorí:",
                    "Hľa, Baránok Boží, ktorý sníma hriechy sveta.<br>" +
                            "Blažení tí, čo sú pozvaní na hostinu Baránkovu.",
                    "Spolu s ľudom hovorí iba raz",
                    "Pane, nie som hoden,<br>" +
                            "aby si vošiel pod moju strechu,<br>" +
                            "ale povedz iba slovo a duša mi ozdravie.<br>" +
                            "Obrátený k oltáru úctivo prijme Kristovo telo.",
                    "Potom ide rozdávať prijímanie veriacim. Cez prijímanie možno spievať primerané piesne.<br>" +
                            "Po skončení prijímania kňaz alebo diakon odnesie nádobku s hostiami na pripravené miesto mimo kostola, alebo - ak to okolnosti vyžadujú - uloží ju do svätostánku.<br>" +
                            "Možno zachovať chvíľu posvätného ticha. Potom sa kňaz modlí:",
                    "<br>" +
                            "<font color='#B71C1C'>PO PRIJÍMANÍ</font><br>" +
                            "Modlime sa.<br>" +
                            "Všemohúci a večný Bože,<br>" +
                            "ty si nám smrťou a zmŕtvychvstaním Ježiša Krista<br>" +
                            "daroval nový život; <font color='#B71C1C'>*</font><br>" +
                            "prosíme ťa,<br>" +
                            "zachovaj v nás účinky svojej milosrdnej lásky, <font color='#B71C1C'>—</font><br>" +
                            "aby nám účasť na tomto tajomstve<br>" +
                            "pomáhala žiť príkladným kresťanským životom.<br>" +
                            "Skrze Krista, nášho Pána.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Amen.",
            "Napokon sa kňaz obráti k ľudu, vystrie nad ním ruky a prepustí ho touto modlitbou:",
                    "<br>" +
                            "<font color='#B71C1C'>MODLITBA NAD ĽUDOM</font><br>" +
                            "Prosíme ťa, Bože,<br>" +
                            "zošli hojné požehnanie na svoj ľud,<br>" +
                            "ktorý v nádeji na svoje vzkriesenie<br>" +
                            "nábožne oslávil smrť tvojho Syna; <font color='#B71C1C'>*</font><br>" +
                            "odpusť mu viny<br>" +
                            "a obdaruj ho radosťou, <font color='#B71C1C'>—</font><br>" +
                            "zveľaďuj v ňom svätú vieru<br>" +
                            "a posilňuj ho na ceste k večnej spáse.<br>" +
                            "Skrze Krista, nášho Pána.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Amen.",
                    "Všetci v tichosti odídu.<br>" +
                            "Vo vhodnej chvíli sa obnaží oltár.<br>" +
                            "Tí, čo sa zúčastnili na popoludňajších obradoch, nerecitujú vešpery.", null},
            {"N", "Sprievod do Božieho hrobu"},
            {"K", "Po prijímaní v liturgii Utrpenia a smrti Pána celebrant (alebo diakon, ak je) vloží hostiu do monštrancie, monštranciu zahalí bielym priesvitným závojom a nechá ju na oltári.<br>" +
                    "Po modlitbe po prijímaní (modlitba nad ľudom sa vynechá) celebrant zostúpi pred oltár (chrbtom k veriacim), vloží do kadidelnice tymian, kľakne si a incenzuje Najsvätejšiu sviatosť. Potom prijme náplecné vélum, vezme do rúk monštranciu a nesie ju do Božieho hrobu. Pred ním ide turifer, ktorý incenzuje Sviatosť, celebranta sprevádzajú štyria akolyti so zapálenými sviecami. Počas procesie sa spieva (alebo recituje):",
                    "<br><i>AVE, VERUM COPRUS</i><br>" +
                            "Zdrav buď, pravé telo Krista,<br>" +
                            "z Panny Matky zrodené,<br>" +
                            "za nás ako obeť čistá<br>" +
                            "na kríži umučené.<br>" +
                            "Z jeho boku tiekla voda<br>" +
                            "i krv, čo nás obmyla,<br>" +
                            "Ochraňuj nás v chvíli smrti,<br>" +
                            "sviatosť spásy premilá.<br>" +
                            "Ježiš drahý, dobrotivý,<br>" +
                            "Syn Márie milostivý!",
            "Možno spievať aj inú primeranú pieseň, napr. <font color='#000000'>„Vitaj, milý Jezu Kriste“</font> (JKS 295).<br>"+
            "Po príchode k Božiemu hrobu celebrant vystaví monštranciu na oltár alebo na trón (na korporáli), kľakne si, incenzuje Sviatosť a zotrvá v tichej modlitbe. Potom prednesie túto modlitbu:",
                    "Pane Ježišu Kriste,<br>" +
                            "ty si naše zmŕtvychvstanie a život,<br>" +
                            "pomôž nám povstať z hrobu hriechov,<br>" +
                            "príď k nám a naplň nás duchovnou silou.<br>" +
                            "Upevni našu vieru, nádej a lásku<br>" +
                            "a daj, aby sme so všetkými svätými mohli pochopiť,<br>" +
                            "aká veľká je tvoja láska.<br>" +
                            "Tak veľmi si nás miloval,<br>" +
                            "že si za nás umrel na kríže,<br>" +
                            "aby nik, kto v teba verí,<br>" +
                            "nezahynul, ale mal večný život.<br>" +
                            "Ty žiješ a kraľuješ na veky vekov.<br>" +
                            "<font color='#B71C1C'>Ľ.:</font> Amen.",
                    "Potom po krátkej adorácii celebrant s asistenciou odíde do sakristie. Pred krížom sa kľaká až do Veľkonočnej vigílie.", null},
    };

    String[][] stvrtok = {
            {"red|small", "1. Omša na pamiatku Pánovej večere sa slávi vo večerných hodinách v čase, ktorý najviac umožňuje plnú účasť celého miestneho spoločenstva. Všetci kňazi a posluhujúci pri nej vykonávajú svoju službu.\n" +
                    "2. Koncelebrovať môžu všetci kňazi, hoci už koncelebrovali pri omši svätenia olejov alebo slúžili inú omšu pre dobro veriacich.\n" +
                    "3. Ak si to vyžadujú pastoračné dôvody, miestny ordinár môže dovoliť aj inú večernú omšu v kostoloch a oratóriách. Vo veľmi naliehavých prípadoch môže dovoliť svätú omšu aj v ranných hodinách pre veriacich, ktorí sa nemôžu zúčastniť na večernej omši. Treba dbať, aby táto omša nebola iba pre záujem jednotlivcov či malej skupinky osôb, a na úkor hlavnej večernej omše.\n" +
                    "4. Sväté prijímanie možno veriacim podávať iba cez omšu, ale chorým ho možno zaniesť v ktorúkoľvek hodinu dňa.\n" +
                    "5. Oltár možno ozdobiť kvetmi s miernosťou, ktorá prináleží tomuto dňu. Bohostánok má byť úplne prázdny. V tejto omši je potrebné konsekrovať dostatočné množstvo hostií na prijímanie kňazov a ľudu v dnešný i zajtrajší deň."},
            {"center", "Úvodné obrady a liturgia slova"},
            {"separated", "red", "6. VSTUPNÝ SPEV", "(Porov. Gal 6, 14)"},
            {"", "Máme sa chváliť krížom nášho Pána Ježiša Krista, \n" +
                    "v ktorom je naša spása, náš život, naše vzkriesenie; \n" +
                    "on nás oslobodil a spasil."},
            {"html|small", "<font color='#B71C1C'>7. Hymnus </font>Sláva Bohu na výsostiach<font color='#B71C1C'>. Kým sa spieva hymnus, zvonia zvony. Potom sa odmlčia až do spevu tohto hymnu na Veľkonočnú vigíliu, ak diecézny biskup nestanovil niečo iné. Organ a iné hudobné nástroje možno v tomto čase používať len na podporu spevu.</font>"},
            {"red", "8. KOLEKTA"},
            {"html", "Bože, zišli sme sa osláviť<br>" +
                    "pamiatku najsvätejšej večere,<br>" +
                    "pri ktorej tvoj jednorodený Syn,<br>" +
                    "prv než seba samého vydal na smrť,<br>" +
                    "zveril svojej Cirkvi novú a večnú obetu<br>" +
                    "ako hostinu svojej lásky; <font color='#B71C1C'>*</font><br>" +
                    "daj, prosíme, <font color='#B71C1C'>—</font><br>" +
                    "aby sme z tejto veľkej sviatosti<br>" +
                    "čerpali plnosť lásky a života.<br>" +
                    "Skrze nášho Pána Ježiša Krista, tvojho Syna, ktorý je Boh<br>" +
                    "a s tebou žije a kraľuje v jednote Ducha Svätého<br>" +
                    "po všetky veky vekov."},
            {"red|small", "9. Po prednesení evanjelia má kňaz homíliu, v ktorej objasní hlavné tajomstvá pripomínané v tejto omši, a to ustanovenie Eucharistie a sviatosti kňazstva, ako aj Pánov príkaz lásky."},
            {"center", "Umývanie nôh"},
            {"red|small", "10. Po homílii, ak je to z pastoračných dôvodov vhodné, môže sa konať obrad umývania nôh.\n" +
                    "11. Posluhujúci privedú vybraných z Božieho ľudu k sedadlám pripraveným na vhodnom mieste. Kňaz (ak treba, odloží ornát) príde ku každému, naleje mu vody na nohy a utrie ich. Posluhujúci mu pri tom pomáhajú.\n" +
                    "12. Medzitým sa spievajú niektoré z uvedených antifón alebo iné vhodné piesne."},
            {"separated", "red", "ANTIFÓNA 1", "(Porov. Jn 13, 4. 5. 15)"},
            {"", "Pán vstal od večere, nalial vody do umývadla\n" +
                    "a začal učeníkom umývať nohy, aby im dal príklad."},
            {"separated", "red", "ANTIFÓNA 2", "(Porov. Jn 13, 12. 13. 15)"},
            {"", "Pán Ježiš po večeri umyl svojim učeníkom nohy a povedal im:\n" +
                    "„Chápete, čo som vám urobil ja, Pán a Učiteľ?\n" +
                    "Dal som vám príklad, aby ste aj vy robili, ako som ja urobil vám.“"},
            {"separated", "red", "ANTIFÓNA 3", "(Porov. Jn 13, 6. 7. 8)"},
            {"html", "Pane, ty mi chceš umývať nohy?<br>" +
                    "Ježiš mu odpovedal: Ak ti neumyjem nohy,<br>" +
                    "nebudeš mať podiel so mnou.<br>" +
                    "<font color='#B71C1C'>℣.</font> Pristúpil teda k Šimonovi Petrovi a Peter mu povedal:<br>" +
                    "<font color='#B71C1C'>—</font> Pane, ty mi chceš umývať nohy? Ježiš mu odpovedal:<br>" +
                    "Ak ti neumyjem nohy, nebudeš mať podiel so mnou.<br>" +
                    "<font color='#B71C1C'>℣.</font> Čo ja robím, to teraz nechápeš. Pochopíš to neskôr.<br>" +
                    "<font color='#B71C1C'>—</font> Pane, ty mi chceš umývať nohy? Ježiš mu odpovedal:<br>" +
                    "Ak ti neumyjem nohy, nebudeš mať podiel so mnou."},
            {"separated", "red", "ANTIFÓNA 4", "(Porov. Jn 13, 14)"},
            {"", "Keď som vám teda ja, Pán a Učiteľ, umyl nohy,\n" +
                    "o koľko skôr máte vy umývať nohy jeden druhému!"},
            {"separated", "red", "ANTIFÓNA 5", "(Jn 13, 35)"},
            {"html", "Podľa toho spoznajú všetci, že ste moji učeníci,<br>" +
                    "ak sa budete navzájom milovať.<br>" +
                    "<font color='#B71C1C'>℣.</font> Ježiš povedal svojim učeníkom:<br>" +
                    "<font color='#B71C1C'>—</font> Podľa toho spoznajú všetci, že ste moji učeníci,<br>" +
                    "ak sa budete navzájom milovať."},
            {"separated", "red", "ANTIFÓNA 6", "(Jn 13, 34)"},
            {"", "Nové prikázanie vám dávam, \n" +
                    "aby ste sa milovali navzájom,\n" +
                    "ako som ja miloval vás, hovorí Pán."},
            {"separated", "red", "ANTIFÓNA 7", "(1 Kor 13, 13)"},
            {"html", "Nech zostane vo vás viera, nádej a láska, tieto tri;<br>" +
                    "no najväčšia z nich je láska.<br>" +
                    "<font color='#B71C1C'>℣.</font> A tak teraz ostáva viera, nádej, láska, tieto tri; no najväčšia z nich je láska.<br>" +
                    "<font color='#B71C1C'>—</font> Nech zostane vo vás viera, nádej a láska, tieto tri;<br>" +
                    "no najväčšia z nich je láska."},
            {"red|small", "13. Po umývaní nôh si kňaz umyje ruky, znova si oblečie ornát a vráti sa k sedadlu, kde pokračuje modlitbou veriacich.\n" +
                    "Vyznanie viery sa vynechá."},
            {"center", "Liturgia Eucharistie"},
            {"red|small", "14. Liturgia Eucharistie sa môže začať procesiou, v ktorej veriaci môžu priniesť okrem chleba a vína aj dary pre chudobných.\n" +
                    "Medzitým sa spieva tento alebo iný vhodný spev."},
            {"html", "<font color='#B71C1C'>ANTIFÓNA:</font> Kde je láska opravdivá, tam Boh prebýva.<br>" +
                    "<font color='#B71C1C'>℣.</font> Láska Kristova nás zhromažďuje k stolu.<br>" +
                    "V ňom sa všetci tešme, radujme sa spolu.<br>" +
                    "Vrúcne ctime Boha, nech je puto tuhšie.<br>" +
                    "Milujme sa bratsky z otvorenej duše."},
            {"html", "<font color='#B71C1C'>ANTIFÓNA:</font> Kde je láska opravdivá, tam Boh prebýva.<br>" +
                    "<font color='#B71C1C'>℣.</font> Keď nás teda láska spája pri oltári,<br>" +
                    "hľaďme, by nás nikdy nedelili sváry.<br>" +
                    "Nech sa od nás vzdialia nezhody a spory,<br>" +
                    "medzi nami Kristus večné bratstvo tvorí."},
            {"html", "<font color='#B71C1C'>ANTIFÓNA:</font> Kde je láska opravdivá, tam Boh prebýva.<br>" +
                    "<font color='#B71C1C'>℣.</font> Kriste, Bože, daj nám s blaženými raja obdivovať krásu tvojho obličaja.<br>" +
                    "Ty, náš nesmierny zdroj čistej blaženosti, ktorá klíči v čase, zreje vo večnosti. Amen."},
            {"red", "15. NAD OBETNÝMI DARMI"},
            {"html", "Prosíme ťa, Pane,<br>" +
                    "pomôž nám nábožne sláviť tieto tajomstvá, <font color='#B71C1C'>*</font><br>" +
                    "lebo vždy, keď slávime pamiatku Kristovej obety, <font color='#B71C1C'>—</font><br>" +
                    "uskutočňuje sa dielo nášho vykúpenia.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"red", "16. PREFÁCIA"},
            {"insert", "prefacia"},
            {"html|small", "<font color='#B71C1C'>17. Ak sa recituje Rímsky kánon, použije sa vlastné znenie</font> V spoločenstve, Pane, milostivo prijmi a On večer pred svojím umučením.<br>" +
                    "<font color='#B71C1C'>18. Kňaz rozopne ruky a povie:</font>"},
            {"html", "<font color='#B71C1C'>Hl</font>Teba teda, najláskavejší Otče,<br>" +
                    "pokorne vzývame a prosíme skrze Ježiša Krista,<br>" +
                    "tvojho Syna a nášho Pána:"},
            {"small|red", "Zopne ruky a povie:"},
            {"", "láskavo prijmi"},
            {"small|red", "Urobí jeden znak kríža spolu nad chlebom a kalichom, hovoriac:"},
            {"html", "a požehnaj <font color='#B71C1C'>✠</font> tieto dary, tieto žertvy,<br>" +
                    "tieto sväté a nepoškvrnené obety."},
            {"small|red", "Pokračuje s rozopätými rukami:"},
            {"html", "Prinášame ti ich<br>" +
                    "najmä za tvoju svätú katolícku Cirkev<br>" +
                    "v jednote s tvojím služobníkom,<br>" +
                    "naším pápežom <font color='#B71C1C'>M.</font>,<br>" +
                    "s naším biskupom <font color='#B71C1C'>M.*</font><br>" +
                    "a so všetkými, ktorí vyznávajú<br>" +
                    "pravú, katolícku a apoštolskú vieru.<br>" +
                    "Daruj svojej Cirkvi pokoj,<br>" +
                    "chráň ju, zjednocuj<br>" +
                    "a spravuj po celom svete."},
            {"small|red", "* Tu možno spomenúť biskupa koadjútora alebo pomocných biskupov v zmysle Všeobecných smerníc Rímskeho misála, č. 149.\n" +
                    "19. Spomienka na živých"},
            {"html", "<font color='#B71C1C'>1k</font> Pamätaj, Pane,<br>" +
                    "na svojich služobníkov a služobnice <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font>"},
            {"smal|red", "Zopne ruky a chvíľu sa modlí za tých, ktorých si chce osobitne pripomenúť.\n" +
                    "Potom s rozopätými rukami pokračuje:"},
            {"", "Pamätaj i na všetkých tu zhromaždených.\n" +
                    "Ty poznáš ich vieru\n" +
                    "a vieš, že sú ti oddaní.\n" +
                    "Za nich ti prinášame túto obetu chvály.\n" +
                    "Aj oni sami ti ju obetujú za seba \n" +
                    "i za všetkých svojich drahých,\n" +
                    "za svoje vykúpenie,\n" +
                    "za nádej na večnú spásu i za časné blaho \n" +
                    "a predkladajú svoje prosby tebe,\n" +
                    "Bohu večnému, živému a pravému."},
            {"small|red", "20. Spomienka na svätých"},
            {"html", "<font color='#B71C1C'>2k</font> V spoločenstve s oslávenou Cirkvou<br>" +
                    "slávime presvätý deň,<br>" +
                    "keď sa náš Pán Ježiš Kristus vydal za nás na smrť<br>" +
                    "a s úctou si spomíname<br>" +
                    "najmä na preblahoslavenú Máriu, vždy Pannu,<br>" +
                    "Rodičku Boha a nášho Pána Ježiša Krista,<br>" +
                    "ale i na svätého Jozefa, jej ženícha,<br>" +
                    "a na tvojich svätých apoštolov a mučeníkov<br>" +
                    "Petra a Pavla, Ondreja,<br>" +
                    "<font color='#B71C1C'>(</font>Jakuba, Jána, Tomáša, Jakuba,<br>" +
                    "Filipa, Bartolomeja, Matúša,<br>" +
                    "Šimona a Tadeáša, Lína, Kléta, Klimenta,<br>" +
                    "Sixta, Kornela, Cypriána, Vavrinca, Chryzogóna,<br>" +
                    "Jána a Pavla, Kozmu a Damiána<font color='#B71C1C'>)</font><br>" +
                    "i na všetkých tvojich svätých.<br>" +
                    "Pre ich zásluhy a na ich prosby<br>" +
                    "poskytni nám vždy a všade<br>" +
                    "svoju pomoc a ochranu.<br>" +
                    "<font color='#B71C1C'>(</font>Skrze Krista, nášho Pána. Amen.<font color='#B71C1C'>)</font>"},
            {"small|red", "21. Pokračuje s rozopätými rukami:"},
            {"html", "<font color='#B71C1C'>Hl</font> Pane, milostivo prijmi túto obetu,<br>" +
                    "ktorú ti predkladáme my, tvoji služobníci,<br>" +
                    " i celá tvoja rodina na pamiatku dňa,<br>" +
                    "keď náš Pán Ježiš Kristus<br>" +
                    "svojich učeníkov poveril<br>" +
                    "slávením sviatostných tajomstiev svojho Tela a Krvi.<br>" +
                    "Spravuj naše dni vo svojom pokoji,<br>" +
                    "zachráň nás od večného zatratenia<br>" +
                    "a pripočítaj k zástupu svojich vyvolených."},
            {"small|red", "Zopne ruky."},
            {"html", "<font color='#B71C1C'>(</font>Skrze Krista, nášho Pána. Amen.<font color='#B71C1C'>)</font>"},
            {"small|red", "22. Vystrie ruky nad obetné dary a hovorí:"},
            {"html", "<font color='#B71C1C'>Vš</font> Prosíme ťa, Bože,<br>" +
                    "láskavo urob túto obetu vo všetkom požehnanou,<br>" +
                    "dokonalou, prijatou, duchovnou a ľúbeznou,<br>" +
                    "aby sa nám stala Telom a Krvou<br>" +
                    "tvojho milovaného Syna, nášho Pána Ježiša Krista."},
            {"small|red", "Zopne ruky.\n" +
                    "23. V nasledujúcich formulách treba predniesť Pánove slová jasne a zrozumiteľne, ako si to vyžaduje ich povaha."},
            {"", "On večer pred svojím umučením \n" +
                    "za spasenie nás i všetkých ľudí,\n" +
                    "čiže dnes,"},
            {"small|red", "Vezme chlieb, drží ho trocha zdvihnutý nad oltárom a pokračuje:"},
            {"", "vzal chlieb do svojich svätých a ctihodných rúk,"},
            {"small|red", "Pozdvihne oči."},
            {"", "pozdvihol oči k nebu, \n" +
                    "k tebe, Bohu,\n" +
                    "svojmu všemohúcemu Otcovi, \n" +
                    "vzdával ti vďaky a dobrorečil, \n" +
                    "lámal chlieb\n" +
                    "a dával svojim učeníkom, hovoriac:"},
            {"small|red", "Trocha sa skloní."},
            {"center", "VEZMITE A JEDZTE Z NEHO VŠETCI, \n" +
                    "LEBO TOTO JE MOJE TELO,\n" +
                    "KTORÉ SA OBETUJE ZA VÁS."},
            {"small|red", "Ukáže konsekrovanú hostiu ľudu,\n" +
                    "znova ju položí na paténu a pokľaknutím adoruje.\n" +
                    "24. Potom pokračuje:"},
            {"", "Podobne po večeri"},
            {"small|red", "Vezme kalich, drží ho trocha zdvihnutý nad oltárom a pokračuje:"},
            {"", "vzal do svojich svätých a ctihodných rúk \n" +
                    "aj tento preslávny kalich,\n" +
                    "znova ti vzdával vďaky, dobrorečil \n" +
                    "a dal ho svojim učeníkom, hovoriac:"},
            {"small|red", "Trocha sa skloní."},
            {"center", "VEZMITE A PITE Z NEHO VŠETCI,\n" +
                    "LEBO TOTO JE KALICH MOJEJ KRVI,\n" +
                    "KTORÁ SA VYLIEVA ZA VÁS I ZA MNOHÝCH\n" +
                    "NA ODPUSTENIE HRIECHOV.\n" +
                    "JE TO KRV NOVEJ A VEČNEJ ZMLUVY.\n" +
                    "TOTO ROBTE NA MOJU PAMIATKU."},
            {"small|red", "Ukáže kalich ľudu, znova ho položí na korporál a pokľaknutím adoruje.\n" +
                    "25. Potom povie:"},
            {"html", "<font color='#B71C1C'>Hl</font> Hľa, tajomstvo viery."},
            {"small|red", "Ľud pokračuje zvolaním:"},
            {"", "Smrť tvoju, Pane, zvestujeme\n" +
                    "a tvoje zmŕtvychvstanie vyznávame, kým neprídeš v sláve."},
            {"small|red", "Alebo:"},
            {"html", "<font color='#B71C1C'>Hl</font> Vyznajme tajomstvo viery.<br>" +
                    "Pane, keď jeme tento chlieb a pijeme z tohto kalicha, zvestujeme tvoju smrť, kým neprídeš v sláve."},
            {"small|red", "Alebo:"},
            {"html", "<font color='#B71C1C'>Hl</font> Veľké je tajomstvo viery.<br>" +
                    "Spasiteľ sveta, zachráň nás, veď ty si nás vykúpil svojím krížom a zmŕtvychvstaním."},
            {"small|red", "26. Potom kňaz s rozopätými rukami povie:"},
            {"html", "<font color='#B71C1C'>Vš</font> Preto, Pane, my, tvoji služobníci<br>" +
                    "aj tvoj svätý ľud,<br>" +
                    "slávime pamiatku požehnaného umučenia<br>" +
                    "a zmŕtvychvstania<br>" +
                    "i slávneho nanebovstúpenia Ježiša Krista,<br>" +
                    "tvojho Syna a nášho Pána,<br>" +
                    "a prinášame tebe, vznešenému Bohu,<br>" +
                    "dary z tvojich darov,<br>" +
                    "svätý chlieb večného života<br>" +
                    "a kalich večnej spásy<br>" +
                    "ako obetu čistú, obetu svätú,<br>" +
                    "obetu nepoškvrnenú."},
            {"small|red", "27."},
            {"", "Zhliadni na ne vľúdnym a láskavým okom \n" +
                    "a milostivo ich prijmi,\n" +
                    "ako si milo prijal obetné dary\n" +
                    "svojho spravodlivého služobníka Ábela, \n" +
                    "žertvu nášho praotca Abraháma\n" +
                    "i svätú a nepoškvrnenú obetu\n" +
                    "tvojho veľkňaza Melchizedecha."},
            {"small|red", "28. Sklonený so zopätými rukami pokračuje:"},
            {"", "Pokorne ťa prosíme, všemohúci Bože, \n" +
                    "prikáž svojmu svätému anjelovi \n" +
                    "preniesť tieto dary na tvoj nebeský oltár, \n" +
                    "pred tvár tvojej božskej velebnosti,\n" +
                    "aby nás všetkých,\n" +
                    "ktorí máme účasť na tejto oltárnej obete\n" +
                    "a prijmeme presväté Telo a Krv tvojho Syna,"},
            {"small|red", "Vzpriami sa a prežehná sa, pritom hovorí:"},
            {"", "naplnilo hojné nebeské požehnanie a milosť."},
            {"small|red", "Zopne ruky."},
            {"html", "<font color='#B71C1C'>(</font>Skrze Krista, nášho Pána. Amen.<font color='#B71C1C'>)</font>"},
            {"small|red", "29. Spomienka na zosnulých. S rozopätými rukami povie:"},
            {"html", "<font color='#B71C1C'>1k</font> Pamätaj, Pane,<br>" +
                    "i na svojich služobníkov<br>" +
                    "a služobnice <font color='#B71C1C'>M.</font> a <font color='#B71C1C'>M.</font>,<br>n" +
                    "ktorí nás predišli do večnosti<br>" +
                    "so znakom viery a spia spánkom pokoja."},
            {"small|red", "Zopne ruky a chvíľu sa modlí za zosnulých, ktorých si chce osobitne pripomenúť.\n" +
                    "Potom s rozopätými rukami pokračuje:"},
            {"", "Prosíme ťa, Pane, daj im a všetkým, \n" +
                    "ktorí odpočívajú v Kristovi,\n" +
                    "prebývať na mieste blaha, svetla a pokoja."},
            {"small|red", "Zopne ruky."},
            {"html", "<font color='#B71C1C'>(</font>Skrze Krista, nášho Pána. Amen.<font color='#B71C1C'>)</font>"},
            {"small|red", "30. Pravou rukou sa bije v prsia a hovorí:"},
            {"html", "<font color='#B71C1C'>2k</font> Aj nás, svojich hriešnych služobníkov,"},
            {"small|red", "A s rozopätými rukami pokračuje:"},
            {"html", "ktorí dúfame v tvoje prehojné milosrdenstvo,<br>" +
                    "priveď do spoločenstva<br>" +
                    "svojich svätých apoštolov a mučeníkov:<br>" +
                    "Jána, Štefana, Mateja, Barnabáša,<br>" +
                    "<font color='#B71C1C'>(</font>Ignáca, Alexandra, Marcelína, Petra,<br>" +
                    "Felicity, Perpetuy, Agáty, Lucie,<br>" +
                    "Agnesy, Cecílie, Anastázie<font color='#B71C1C'>)</font><br>" +
                    "a všetkých tvojich svätých.<br>" +
                    "Prosíme ťa, prijmi nás do ich spoločenstva<br>" +
                    "nie pre naše zásluhy,<br>" +
                    "ale pre tvoje veľké zľutovanie."},
            {"small|red", "Zopne ruky."},
            {"", "Skrze nášho Pána Ježiša Krista."},
            {"small|red", "31. A pokračuje:"},
            {"html", "<font color='#B71C1C'>Hl</font> Skrze neho ty, Pane,<br>" +
                    "všetky tieto dary stále tvoríš,<br>" +
                    "posväcuješ, oživuješ,<br>" +
                    "požehnávaš a nám dávaš."},
            {"small|red", "32. Vezme paténu s hostiou a kalich, pozdvihne ich a hovorí:"},
            {"html", "<font color='#B71C1C'>Vš</font> Skrze Krista, s Kristom a v Kristovi<br>" +
                    "máš ty, Bože Otče všemohúci,<br>" +
                    "v jednote Ducha Svätého<br>" +
                    "všetku úctu a slávu po všetky veky vekov."},
            {"small|red", "Ľud zvolá:"},
            {"", "Amen."},
            {"insert", "obrad prijimania"},
            {"small|red", "33. Vo vhodnom momente obradu prijímania kňaz odovzdá Eucharistiu z oltára diakonom alebo akolytom, alebo iným mimoriadnym vysluhovateľom, aby ju potom mohli zaniesť chorým, ktorí ju prijmú doma."},
            {"separated", "red", "34. SPEV NA PRIJÍMANIE", "(1 Kor 11, 24 – 25)"},
            {"", "Toto je moje Telo, ktoré sa obetuje za vás;\n" +
                    "tento kalich je nová zmluva v mojej Krvi, hovorí Pán.\n" +
                    "Toto robte, kedykoľvek ho budete piť, na moju pamiatku."},
            {"small|red", "35. Po skončení prijímania nádobka s hostiami určenými na prijímanie v nasledujúci deň ostane na oltári. Kňaz stojí pri sedese a prednesie modlitbu po prijímaní."},
            {"red", "36. PO PRIJÍMANÍ"},
            {"html", "Všemohúci Bože, <font color='#B71C1C'>*</font><br>" +
                    "na pozemskej púti nás posilňuješ<br>" +
                    "posvätnou večerou svojho Syna; <font color='#B71C1C'>—</font><br>" +
                    "dopraj, aby sme mali účasť<br>" +
                    "aj na jeho večnej hostine.<br>" +
                    "Skrze Krista, nášho Pána."},
            {"center", "Prenesenie Najsvätejšej sviatosti"},
            {"html|small", "<font color='#B71C1C'>37. Po tejto modlitbe kňaz, stojac pred oltárom, vloží do kadidelnice tymian, požehná ho a kľačiačky trikrát okiadza Najsvätejšiu sviatosť. Potom si vezme vélum bielej farby, zoberie nádobku s hostiami a zakryje ju koncami véla.<br>" +
                    "38. Nasleduje sprievod, v ktorom sa prenesie Najsvätejšia sviatosť so sviecami a kadidlom cez kostol na miesto, kde bude uložená, čo môže byť v primerane ozdobenej časti kostola alebo kaplnke. Na čele ide posluhujúci s krížom medzi dvoma posluhujúcimi so zažatými sviecami, za nimi idú ďalší so zažatými sviecami. Pred kňazom nesúcim Najsvätejšiu sviatosť ide posluhujúci s dymiacou kadidelnicou. Medzitým sa spieva hymnus </font>Sviatosť tela tajomného<font color='#B71C1C'> (okrem posledných dvoch slôh) alebo iná eucharistická pieseň.<br>" +
                    "39. Keď sa príde na miesto, kde má byť uschovaná Najsvätejšia sviatosť, kňaz vloží nádobku s hostiami do bohostánku, pričom mu môže pomáhať diakon. Dvierka bohostánku nechá otvorené. Nasype do kadidelnice tymian a kľačiačky okiadza Najsvätejšiu sviatosť. Pritom sa spieva </font>Ctime túto sviatosť slávnu<font color='#B71C1C'> alebo iná eucharistická pieseň. Potom diakon alebo sám kňaz zatvorí bohostánok.<br>" +
                    "40. Po krátkej tichej poklone kňaz a posluhujúci pokľaknú a vrátia sa do sakristie.<br>" +
                    "41. Vo vhodnom momente sa obnaží oltár a odnesú sa, ak je to možné, kríže z kostola. Tie, čo zostanú v kostole, by sa mali zahaliť.<br>" +
                    "42. Tí, čo sa zúčastnili na omši na pamiatku Pánovej večere, neslávia vešpery.<br>" +
                    "43. Veriacich treba pozvať k tomu, aby v noci – podľa miestnych zvyklostí a možností – venovali nejaký čas poklone Najsvätejšej sviatosti. Poklona po polnoci však už nemá mať slávnostný ráz.<br>" +
                    "44. Ak sa v danom kostole v Piatok utrpenia Pána nebudú sláviť obrady utrpenia a smrti Pána, omša sa ukončí zvyčajným spôsobom a Najsvätejšia sviatosť sa odloží do bohostánku.</font>"},
    };
}
