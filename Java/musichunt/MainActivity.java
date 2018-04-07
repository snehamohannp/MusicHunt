package com.example.student.musichunt;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button lib;
    private static final String MY_PREFS_NAME = "aaaa";
    SQLiteDatabase dbh;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lib = (Button) findViewById(R.id.lib);
        lib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, song.class);
                startActivity(in);

            }
        });
        dbh = openOrCreateDatabase("Music", MODE_PRIVATE, null);
         dbh.execSQL("CREATE TABLE IF NOT EXISTS hindi(id Integer primary key,name varchar,description varchar);");
        // dbh.execSQL("delete * from hindi");
        insert();

    }
    public void insert() {
        dbh.execSQL("delete from hindi");
        //  dbh.execSQL("insert into hindi values(4,'Name','Lyrics')");



        dbh.execSQL("insert into hindi values(1,'MAZHAYE MAZHAYE','Mazhaye mazhaye mazhaye, mazhaye\n" +
                "Manassil mashiyaai uthirum nirame\n" +
                "Uyirin thoolikayil nirayum pen nirame\n" +
                "Nee vel praavai paadum nee nirame nirame\n" +
                "Neerum novil pulkum then nirame\n" +
                "Mazhaye mazhaye mazhaye, mazhaye\n" +
                "Manassil mashiyaai uthirum nirame\n" +
                "Vathil chillil pularmanju pole\n" +
                "Etho swapnam punarninnu melle\n" +
                "Viralum viralum pathiye cherunna neram\n" +
                "Ulayum mizhiyal njodiyil thenni maari enthe\n" +
                "Mazhaye mazhaye mazhaye, mazhaye\n" +
                "Manassil mashiyaai uthirum nirame\n" +
                "Uyirin thoolikayil nirayum pen nirame\n" +
                "Nee vel praavai paadum nee nirame nirame\n" +
                "Neerum novil pulkum then nirame\n" +
                "Mazhaye mazhaye mazhaye, mazhaye\n" +
                "Manassil mashiyaai uthirum nirame\n" +
                "Vathil chillil pularmanju pole\n" +
                "Etho swapnam punarninnu melle\n" +
                "Viralum viralum pathiye cherunna neram\n" +
                "Ulayum mizhiyal njodiyil thenni maari enthe\n" +
                "Mazhaye mazhaye mazhaye, mazhaye\n" +
                "Manassil mashiyai uthirum nirame\n" +
                "Aaro chaayam kudanjitta pole\n" +
                "Neeyen thaalil padarneriyille\n" +
                "Nadhiyum nadiyum kadalaai maarunna ravil\n" +
                "Ini nin vidarum mizhiyil njaan arinjithenne\n" +
                "Mazhaye mazhaye mazhaye, mazhaye\n" +
                "Manassil mashiyai uthirum nirame\n" +
                "Uyirin thoolikayil nirayum pen nirame\n" +
                "Nee vel praavai paadum nee nirame nirame\n" +
                "Neerum novil pulkum then nirame\n" +
                "Mazhaye mazhaye mazhaye, mazhaye\n" +
                "Manassil mashiyai uthirum nirame')");

        dbh.execSQL("insert into hindi values(2,'AKALEYOOO','Akalayo nee akalayo \n" +
                "vidatharath enthe poyi nee \n" +
                "oru vaakinum akale nee enkilum arikil njan innum\n" +
                "maru vaakin kothiyumaayi nilkayaan piriyathae\n" +
                "azhake vaa...arike vaa...malare vaa...thirike vaa \n" +
                "akalayo nee akalayo\n" +
                "vidatharath enthe poyi nee \n" +
                "\n" +
                "Ethrayo janmamaayi nin mugham ithu thedi njan\n" +
                "ente aayi theerna naal naam thangalill onnaayi\n" +
                "ennnum enn kuudeyaayi enn nizhal ath pole nee\n" +
                "neengave nedi njan en jeevitha saayujyam\n" +
                "saghi nin mozhi oru vari paadi pranayitha gaanam\n" +
                "ini enthin veroru maniyude sangeetham\n" +
                "azhake vaa...arike vaa...malare vaa...thirike vaa \n" +
                "\n" +
                "Illa njan nin mugham en manasithiyilaathe\n" +
                "illa njan nin swaram en kaathukal nirayathe\n" +
                "enthino poyi nee ann oru mozhi mindaathe\n" +
                "innum enn nombaram nee kaanuvathilleno \n" +
                "kali cholliya kiliyude mounam karalin novaayi\n" +
                "vida cholliya manasukal  idarukayaayi muugham\n" +
                "azhake vaa...arike vaa...malare vaa...thirike vaa \n" +
                "malare vaa...thirike vaa...malare vaa...thirike va')");

        dbh.execSQL("insert into hindi values(3,'MALARE','Thelimanam mazhavillin niramaniyum neram\n" +
                "Niramarnnoru kanavennil theliyunna pole\n" +
                "Puzhayoram thazhukunnee thanu neeran kaattum\n" +
                "Pulakangal izhaneythoru kuzhaloothiya pole\n" +
                "Kulirekum kanavil nee kathiradiya kaalam\n" +
                "Manathaaril madhumaasam thaliraadiya neram\n" +
                "Akamarukum mayilinakal thuyilunarum kaalam\n" +
                "En akathaaril anuraagam pakarunna yaamam\n" +
                "Advertisement\n" +
                "Azhake… Azhakil theerthoru shilayazhake\n" +
                "Malare.. Ennuyiril vidarum panimalare\n" +
                "Malare ninne kaanathirunnal\n" +
                "Mizhivekiya niramellam maayunna pole\n" +
                "Alivoden arikathinnanayathirunnal\n" +
                "Azhakekiya kanavellam akalunna pole\n" +
                "Njanente aathmavin aazhathinullil\n" +
                "Athilolamarorumariyaathe sookshicha\n" +
                "Thaalangal raagangal eenangalaai\n" +
                "Oro oro varnangalai\n" +
                "Idarunna ennte idanenjinullil\n" +
                "Pranayathin mazhayayi nee pozhiyunnee naalil\n" +
                "Thalarunnorente thanuthorum ninte\n" +
                "Alathallum pranayathalunarum\n" +
                "Malare..azhake..\n" +
                "Kulirekum kanavil nee kathiradiya kaalam\n" +
                "Manathaaril madhumaasam thaliraadiya neram\n" +
                "Akamurukum mayilinakal thuyilunarum kaalam\n" +
                "En akathaaril anuraagam pakarunna yaamam\n" +
                "Azhake… Azhakil theerthoru shilayazhake\n" +
                "Malare.. Ennuyaril vidarum panimalare')");

        dbh.execSQL("insert into hindi values(4,'NOKKI NOKKI','Oooooo….\n" +
                "Nokki nokki nokki ninnu\n" +
                "Kaathu kaathu kaathu ninnu\n" +
                "Manthaara poo viriyanathengananennu\n" +
                "Manthaara poo viriyanathepozhanennu\n" +
                "Nokki nokki nokki ninnu\n" +
                "Kaathu kaathu kaathu ninnu\n" +
                "Manthaara poo viriyanathengananennu\n" +
                "Manthaara poo viriyanathepozhanennu\n" +
                "Thekkennam kaatinumariyilla\n" +
                "Uthraada thumbikkumariyilla\n" +
                "Changaali pravinumariyilla\n" +
                "Aarkkumariyilla\n" +
                "\n" +
                "Nokki nokki nokki ninnu\n" +
                "Kaathu kaathu kaathu ninnu\n" +
                "Manthaara poo viriyanathengananennu\n" +
                "Manthaara poo viriyanathepozhanennu\n" +
                "Raavurangana neratho\n" +
                "Pakal therirangana neratho\n" +
                "Kaattirikku kammalittu\n" +
                "Naattu paathayorathu\n" +
                "Pokkuveyil then ozhukkana neratho\n" +
                "Pokkuveyil then ozhukkana neratho\n" +
                "Poothatheppozho\n" +
                "Ithal neerthatheppozho\n" +
                "Poothatheppozho\n" +
                "Ithal neerthatheppozho\n" +
                "Aalilayum paazh mulayum\n" +
                "Mindatha nerathu\n" +
                "Chingaara poo muttam\n" +
                "Meetha virinju poothu niranju\n" +
                "Nokki nokki nokki ninnu\n" +
                "Kaathu kaathu kaathu ninnu\n" +
                "(ninnu ninnu ninnu..)\n" +
                "Poomalayude thaazhathum\n" +
                "Mazha poovu chinnana paadatho\n" +
                "Aadi paadi kunungana kurumaali puzhakare\n" +
                "Naattu maina koodorukkana kombatho…\n" +
                "Naattu maina koodorukkana kombatho…\n" +
                "Poothathengaano\n" +
                "Ithal neerthathengaano\n" +
                "Poothathengaano\n" +
                "Ithal eerthathengaano\n" +
                "Aanmayilum poonkuyilum\n" +
                "Chellatha doorathu\n" +
                "Punnaara thoo motten nerkku virinju\n" +
                "Poothu marinju\n" +
                "Nokki nokki nokki ninnu\n" +
                "Kaathu kaathu kaathu ninnu\n" +
                "Manthaara poo viriyanathengananennu\n" +
                "Manthaara poo viriyanathepozhanennu\n" +
                "Thekkennam kaatinumariyilla\n" +
                "Uthraada thumbikkumariyilla\n" +
                "Changaali pravinumariyilla\n" +
                "Aarkkumariyilla')");

        dbh.execSQL("insert into hindi values(5,'JILLAM JILLALA','Chemanthi Chelum Konde\n" +
                "Mohippikum Pennane\n" +
                "Manimaran Tharan Pennin Meyyil Minnane\n" +
                "Thaaramban Ninne Kandal Ambum Villum Vechene\n" +
                "Kathirone Kannanchippan Poru Machane\n" +
                "Nenjolam Dollunde Chundolam Sheelunde\n" +
                "Kandaalum Koodumbol Kondaadande\n" +
                "Kondata Chelaattam Naalathakaarunde\n" +
                "Karineela Panthalketti Pappum Mutti Chendayum Kotti\n" +
                "Kaathirikkum Neram Vanne Jillam Jillala\n" +
                "\n" +
                "Hey Jillam Jillam Jillam Jillam Jillala\n" +
                "Hey Jillam Jillam Jillam Jillam Jillala\n" +
                "Hey Jillam Jillam Jillam Jillam Jillala\n" +
                "Hey Thithana Thithan Thithana Thithana Hey\n" +
                "Jillam Jillam Jillam Jillam Jillala\n" +
                "Hey Thithana Thithana Thithana Thithana Jillam Jillala\n" +
                "\n" +
                "\n" +
                "Hey Maykannin Nullum Konden Ullil Kuthum Pennane\n" +
                "Oru Kotta Swopnam Thannoru Omal Muthaane\n" +
                "Njan Thanne Kachayum Ketti Ninne Kettan Nilppane\n" +
                "Padiyoram Velli Pallakilirunnane\n" +
                "Veettarum Koottunde Naatttatum Koodeyunde\n" +
                "Aashichorellarum Koodiyuttunde\n" +
                "Aashapoo Kottaram Vinnolam Mutteele\n" +
                "Chinkaara Pattum Chutti Chekil Vanna Pottumkuthu\n" +
                "\n" +
                "Minnu Ketti konde Pokam Jillam Jillala\n" +
                "Hey Jillam Jillam Jillam Jillam Jillala\n" +
                "Hey Jillam Jillam Jillam Jillam Jillala\n" +
                "Hey Jillam Jillam Jillam Jillam Jillala\n" +
                "Hey Thithana Thithana Thithana Thithana Jillam Jillala\n" +
                "\n" +
                "Naalere Kaathittum Nee Vannilla\n" +
                "Mohikkum Pole Vegam Neram Poyilla\n" +
                "Ninne Njan Kaanunna Neram Thotte\n" +
                "Ennullil Kelkkunnunde Jilla Jillala]\n" +
                "Maarathe Mayne Ninn Therilkonchaarullu\n" +
                "Nee Ennoraale En Kannil Minnaullu\n" +
                "Aakasham Veeshunnunde Mekha Thoovaala\n" +
                "Padavilaake Jillam Jillana\n" +
                "Hey Jillam Jillam Jillam Jillam Jillala\n" +
                "Hey Jillam Jillam Jillam Jillam Jillala\n" +
                "Hey Jillam Jillam Jillam Jillam Jillala\n" +
                "Hey Thithana Thithana Thithana Thithana Jillam Jillala\n" +
                "\n" +
                "Chemanthi Chelum Konde\n" +
                "Mohippikum Pennane\n" +
                "Manimaran Tharan Pennin Meyyil Minnane\n" +
                "Hey Thaaramban Ninne Kandal Ambum Villum Vechene\n" +
                "Kathirone Kannanchippan Poru Machane\n" +
                "Nenjolam Dollunde Chundolam Sheelunde\n" +
                "Kandaalum Koodumbol Kondaadande\n" +
                "Kondata Chelaattam Naalathakaarunde\n" +
                "Karineela Panthalketti Pappum Mutti Chendayum Kotti\n" +
                "Kaathirikkum Neram Vanne Jillam Jillala\n" +
                "Hey Jillam Jillam Jillam Jillam Jillala\n" +
                "Hey Jillam Jillam Jillam Jillam Jillala\n" +
                "Hey Jillam Jillam Jillam Jillam Jillala\n" +
                "Hey Thithana Thithan Thithana Thithana Hey\n" +
                "Jillam Jillam Jillam Jillam Jillala\n" +
                "Hey Thithana Thithana Thithana Thithana Jillam Jillala')");

        dbh.execSQL("insert into hindi values(6,'TUHAI','Jaane Kyoon Har Khushi\n" +
                "Ab Lage Nami Thi\n" +
                "Haira Hoon Dafatan\n" +
                "Kyoon Teri Kami Thi\n" +
                "Piya Re Piya Re\n" +
                "Chhoo Liya Bin Chhue\n" +
                "Tu Hai Bas Tu Hai\n" +
                "Tu Hai Bas Tu Hai..\n" +
                "Samjha Jo Maayoosi\n" +
                "Ab Lage Hamse Thi\n" +
                "Keh Dena Tha Mujhe\n" +
                "Main Keh Na Saki Thi\n" +
                "Piya Re Piya Re\n" +
                "Chhoo Liya Bin Chhue\n" +
                "Tu Hai Bas Tu Hai\n" +
                "Tu Hai Bas Tu Hai\n" +
                "Aaja Gale Se Laga Le\n" +
                "Aa Dooriyon Ko Mita Le\n" +
                "Tarse Kyoon Aur Tarsaaye Hai\n" +
                "Kyoon Besharam Tu Sharmaaye Hai\n" +
                "Ye Dil Hua Hai Tera..\n" +
                "Piyaa..Piya Rey..\n" +
                "Chhoo Liya Bin Chhue\n" +
                "Tu Hai Bas Tu Hai\n" +
                "Tere Bina Kayi Raatein\n" +
                "Socha Kiya Teri Baatein\n" +
                "Bechaini Hai Din Hai Sataati\n" +
                "Kaise Jeeyein Hum Kat-Ti Na Raatein\n" +
                "Jaana Kahan Yeh Bata\n" +
                "Maahi Ve')");

        dbh.execSQL("insert into hindi values(7,'KAR GAYI CHULL','Yeah…\n" +
                "Arre ladki beautiful, kar gayi chull\n" +
                "(Chull chull chull..) (2 times )\n" +
                "Yeah..\n" +
                "Dekh tera rang sawla hua bawla\n" +
                "Ladki nahi hai tu hai garam mamla\n" +
                "Bolti banth meri, kahun kya bala\n" +
                "Kuch bhi kaha nahi jaaye\n" +
                "\n" +
                "Kya naachey tu Dilli, hile hai London\n" +
                "Matak matak jaisse Raveena Tandon\n" +
                "Kya naache tu Dilli, hile hai London\n" +
                "Matak matak jaise Raveena Tandon\n" +
                "Aag laganey aayi hai ban than\n" +
                "Goli chal gayi daayn\n" +
                "Nakhrey vilayti\n" +
                "Ego mein rehti\n" +
                "Nakhrey vilayti ego mein rehti\n" +
                "Tashan dikhati full\n" +
                "Arre ladki beautiful, kar gayi chull\n" +
                "(Chull chull chull) (2 times)\n" +
                "Arre dayein, bayein\n" +
                "Kaisse kamar tu jhulaaye\n" +
                "Physics samaj nahi aaye\n" +
                "Arre ladki beautiful, kar gayi chull\n" +
                "Arre dayein, bayein\n" +
                "Kaise kamar tu julaaye\n" +
                "Physics samaj nahi aaye\n" +
                "Sandal mere cham cham karde\n" +
                "Hege high brand ve\n" +
                "Evelyn mundeyan de\n" +
                "Mere heel pe hondey land ve\n" +
                "Sandal mere cham cham karde\n" +
                "Hege high brand ve\n" +
                "Evelyn mundeyan de\n" +
                "Mere heel pe hondey land ve\n" +
                "Sari kudiyan haaye desi chidiyan\n" +
                "Sari kudiyan desi chidiyan\n" +
                "Club ki main bulbul\n" +
                "Main ladki beautiful kar gayi chull\n" +
                "(Chull chull chull)\n" +
                "Main ladki beautiful kar gayi chull\n" +
                "(Chull chull chull)\n" +
                "Arre ladki beautiful, kar gayi chull\n" +
                "Arre daayein, baayein\n" +
                "Kaise kamar tu jhulaaye\n" +
                "Physics samajh nahi aaye\n" +
                "Arre ladki beautiful, kar gayi chull (2 times)\n" +
                "Dekh tera rang sawla hua bawla\n" +
                "Ladki nahi hai tu hai garam mamla\n" +
                "Bolti bandh meri kahun kya bhala\n" +
                "Arre ladki beautiful, kar gayi chull\n" +
                "Kya naachey tu Dilli, hile hai London\n" +
                "Matak mattak jaise Raveena Tandon\n" +
                "Aag laganey aayi hai ban than\n" +
                "Arre ladki beautiful kar gayi chull\n" +
                "Koyi bacha lo\n" +
                "Muje sambhalo\n" +
                "Arre isse utha lo\n" +
                "Arre ladki beautiful\n" +
                "Kar gayi Chull')");


        dbh.execSQL("insert into hindi values(8,'KAALA CHASMA','Tere nau (Naam) diyan dhuma peye gayain\n" +
                "Tu chandigarh toh aayi ni\n" +
                "Tenu dekh ke hauke bharde ne\n" +
                "Kare chownka vich tabahai ni\n" +
                "Dhodi te kala till kudiye\n" +
                "Dhodi te kala till kudiye\n" +
                "Jo daag hai chann (Moon) de tukre te\n" +
                "Tenu kala chashma \n" +
                "Tenu kala chashma \n" +
                "Tenu kala chashma jachda ae\n" +
                "Jachda aey gore mukhre te\n" +
                "\n" +
                "Sadko pe chale jab ladko ke dilon pe \n" +
                "Tu aag laga de baby ..Fire\n" +
                "Nakli se dekhe jab nakhre tu kare\n" +
                " Joothi lier\n" +
                "Kala kala chasma jachta tere mukhde pe\n" +
                "Jaise kala til jachta hai tere chin pe\n" +
                "Apni adaaon se zyada nahi to 10-12\n" +
                " Ladke toh maar hi deti hogi tu din me\n" +
                "\n" +
                "Tujh jaise 36 phirte hain\n" +
                "Meri wargi aur na honi ve\n" +
                "Vargi aur na honi ve\n" +
                "Vargi… aur na honi ve\n" +
                "Tu munda bilkul desi ve\n" +
                "Main katrina toh sohni ve\n" +
                "\n" +
                "Mai fed up hogi aa mundeya\n" +
                "Sun ke tere dukhre vee\n" +
                "\n" +
                "Menu kala chashma..\n" +
                "Menu kala kala kala…\n" +
                "Ho menu kala chasma jachda ae\n" +
                "Jachda hai gore mukhde pe\n" +
                "Menu kala chasma jachda ae\n" +
                "Jachda hai gore mukhde te\n" +
                "Jachda hai gore mukhde te\n" +
                "\n" +
                "Sadko pe chale jab ladko ke dilon pe \n" +
                "Tu aag laga de baby ..Fire\n" +
                "Nakli se dekhe jab nakhre tu kare\n" +
                "Chal Joothi lier\n" +
                "\n" +
                "Menu kala chashma..\n" +
                "Menu kala kala kala…\n" +
                "Menu kala chashma..\n" +
                "Menu kala kala kala…\n" +
                "\n" +
                "Menu kala chasma jachda ae\n" +
                "Jachda hai gore mukhde te\n" +
                "\n" +
                "Menu kala chasma jachda ae\n" +
                "Jachda hai gore mukhde te\n" +
                "Jachda hai gore mukhde te')");





        dbh.execSQL("insert into hindi values(9,'CHILLENA ORU MAZHAI THULI','Chillena Oru Mazhai Thuli\n" +
                "Ennai Nanaikuthey Penne\n" +
                "Siragugal Yaar Koduthadu\n" +
                "Nenjam Parakuthey Munne\n" +
                "\n" +
                "Un Vizhigalile Ohh.. Naan Vaazhgiren Penne\n" +
                "Un Kanavugalaal Ohh.. Naan Maarinen Penne\n" +
                "\n" +
                "Ada Karupatiye.. En Cheeni Kelange Sirichu Kavukadha\n" +
                "En Kannu Kuttiye.. Kamma Karaiyile Nee Kappal Ootaadha\n" +
                "Kanaala Paakama..\n" +
                "Kallaanam Pannalama..\n" +
                "Kai Koorthu Polama\n" +
                "\n" +
                "Konjam Paarthu Vidu \n" +
                "Konjam Pesi Vidu\n" +
                "Endru En Vizhigal Aiyaiyo Ennai Thitta\n" +
                "Kodai Kaala Mazhai\n" +
                "Vandhu Pona Pinnum\n" +
                "Saalai Ora Maram Thannaale Neer Sotta\n" +
                "Ennai Thaakum Puyale.. \n" +
                "Iravodu Kaayum Veyile.. Oh Ohh Unnale\n" +
                "\n" +
                "Unaale Noolilla Katraadi Aanene..\n" +
                "Adi Penne.. Adi Penne\n" +
                "Naan Vizhunthaal Un Paadham Servene..\n" +
                "\n" +
                "Un Vizhigalile Ohh.. Naan Vaazhgiren Penne\n" +
                "Un Kanavugalaal Ohh.. Naan Maarinen Penne\n" +
                "Chillena Oru Mazhai Thuli\n" +
                "Ennai Nanaikuthey Penne\n" +
                "Siragugal Yaar Koduthadu\n" +
                "Nenjam Parakuthey Munne..\n" +
                "\n" +
                "Sundariku Mari Mani Kolusu\n" +
                "Kadi Velakinu .....\n" +
                "Ari Ninnaaram.. Cheru Ponaaram\n" +
                "Idhu Madura Madura Karimbu\n" +
                "Kalaveni Methu Paani\n" +
                "Nin Heerudhaya Valiyinaganam\n" +
                "Swaramaaye Jethiyaaye\n" +
                "Idhu Unarumo Enariyaan Mogam..\n" +
                "\n" +
                "Kaadhal Vandhavudan Kaaichal Vandhadhadi\n" +
                "Meendum Naan Pizhaikka Muthangal Tharuvaaya..\n" +
                "Koovam Kolgaiyilum Kiranga Vaikuthadi\n" +
                "Meendum Oru Murai Nee Kovathil Paarpaaya..\n" +
                "Aalai Kollum Azhage.. Nizhal Kuda Azhagin Nagale\n" +
                "Oru Naalum.. Kuraiyaadha\n" +
                "Puthu Bothai Kan Oram Thandhaaye..\n" +
                "Anaithaalum.. Anaiyaadha\n" +
                "Oru Theeyaai Nenjoram Vandhaaye..\n" +
                "Adi Edam Valamai.. Naan Aadinen Penne\n" +
                "Oru Idi Mazhaiyai.. Naan Thaakinen Munne')");

        dbh.execSQL("insert into hindi values(10,'NENJUKKUL PEITHIDUM','Nenjukkul Peithidum Maa Mazhai.. Neerukul Moozhgidum Thaamarai..\n" +
                "Sattendru Maaruthu Vaanilai.. Penne Un Mael Pizhai..\n" +
                "Nillamal Veesidum Peralai.. Nenjukkul Neenthidum Tharagai..\n" +
                "Pon Vannam Soodiya Kaarigai.. Penne Nee Kaanchanai..\n" +
                "\n" +
                "Oh Shaanti Shaanti Oh Shaanti\n" +
                "En Uyirai Uyirai Nee Aenthi..\n" +
                "Aen Sendrai Sendrai Ennai Thaandi\n" +
                "Ini Neethan Enthan Anthathi..\n" +
                "\n" +
                "Nenjukkul Peithidum Maa Mazhai.. Neerukul Moozhgidum Thaamarai..\n" +
                "Sattendru Maaruthu Vaanilai.. Penne Un Mael Pizhai..\n" +
                "\n" +
                "Aetho Ondru Ennai Eerka.. Mookin Nuni Marmam Saerka..\n" +
                "Kallathanam Aethum Illaa.. Punnagaiyo Boganvillaa..\n" +
                "Nee Nindra Idam Endraal Vilai Aeri Pogaatho\n" +
                "Nee Sellum Vazhi Ellam Panikatti Aahaatho\n" +
                "Ennodu Vaa Veedu Varaikkum..\n" +
                "En Veetai Paar Ennai Pidikkum..Ival Yaaro Yaaro Theriyathey\n" +
                "Ival Pinnal Nenje Pogathey\n" +
                "Ithu Pøiyø Meiyø Theriyathey\n" +
                "Ival Pinnal Nenje Pøgathey.. Pøgathey..\n" +
                "Nenjukkul Peithidum Maa Mazhai.. Neerukul Møøzhgidum Thaamarai..\n" +
                "Šattendru Maaruthu Vaanilai.. Penne Un Mael Pizhai.. Oh. Oh..\n" +
                "Nillamal Veesidum Peralai.. Nenjukkul Neenthidum Tharagai..\n" +
                "Pøn Vannam Šøødiya Kaarigai.. Penne Nee Kaanchanai..\n" +
                "\n" +
                "Thøøkangalai Thøøki Šendrai.. Thøøki Šendrai..\n" +
                "Aekkangalai Thøøvi Šendrai..\n" +
                "Unnai Thaandi Pøghum Pøthu.. Pøghum Pøthu..\n" +
                "Veesum Kaatrin Veechu Veru\n" +
                "Nil Èndru Nee Šønnal Èn Kaalam Nagarathey\n" +
                "Nee Šøødum Pøøvellam Oru Pøthum Uthirathey\n" +
                "Kaathal Ènai Kaetka Villai.. Kaettaal Athu Kaathal Illai..\n" +
                "Èn Jeevan Jeevan Neethane.. Èna Thøandrum Neram Ithuthane..\n" +
                "Nee Illai Illai Èndralae.. Èn Nenjam Nenjam Thaangathey..\n" +
                "\n" +
                "Nenjukkul Peithidum Maa Mazhai.. Neerukul Møøzhgidum Thaamarai..\n" +
                "Šattendru Maaruthu Vaanilai.. Penne Un Mael Pizhai..\n" +
                "Nillamal Veesidum Peralai.. Nenjukkul Neenthidum Tharagai..\n" +
                "Pøn Vannam Šøødiya Kaarigai.. Penne Nee Kaanchanai..\n" +
                "\n" +
                "Oh Šhaanti Šhaanti Oh Šhaanti\n" +
                "Èn Uyirai Uyirai Nee Aenthi..\n" +
                "Aen Šendrai Šendrai Ènnai Thaandi\n" +
                "Ini Neethan Ènthan Anthathi')");

        dbh.execSQL("insert into hindi values(11,'POOKANTRE POOKANTRE','Poongaatre Poongaatre Poopolae Vanthaal Ival..\n" +
                "Poagindra Vazhi Yellam Santhosham Thanthaal Ival..\n" +
                "Yen Nenjodu Veesum, Intha Pennoda Vaasam,\n" +
                "Ival Kannodu Pookum, Pala Vinmeenngal Pesum..\n" +
                "En Kaathal Solla Oru Vaarthai Illai,\n" +
                "En Kannukulae Inni Kanavae Illai..\n" +
                "\n" +
                "Poongaatre Poongaatre Poopolae Vanthaal Ival..\n" +
                "Poagindra Vazhi Yellam Santhosham Thanthaal Ival..\n" +
                "\n" +
                "Manjal Vaanam Konjam Megam,\n" +
                "Konji Pesum Kaatru Thottu Chelluthey..\n" +
                "Niruthaamal Sirikindraen,\n" +
                "Intha Nimidangal Punnagaiye Poottikondaathey..\n" +
                "Kannaadi Sezhi Seithu Pinnaadi Unn Kannai Paarkindraen.. Paarkindraen..\n" +
                "Penney Naan Un Munney Oru Vaarthai Pesamal Thorkindraen.. Thorkindraen..\n" +
                "Vazhi Pookann Ponaalum, Vazhiyil Kaaladi Thadam Irukum..\n" +
                "Vazhkayiley Inthanodi, Vaasanaiyodu Ninaivirukkum..\n" +
                "\n" +
                "Poongaatre Poongaatre Poopolae Vanthaal Ival..\n" +
                "Poagindra Vazhi Yellam Šanthosham Thanthaal Ival..\n" +
                "\n" +
                "Azhagaana Nathi Paarthal, Naanum Peyarinai Kekka Vaanam Thudikkum..\n" +
                "Ival Yaaro Yenna Paero, Athai Arinthidum Varaiyil Oru Mayakkam..\n" +
                "Aedhedho Oorthaandi Yeraanam Peyr Thaandi Pogindraen.. Pogindraen..\n" +
                "Nil Èndru Šolgindraen Neydumchaalai Vizhakaagha Alaigindraen.. Therigindraen..\n" +
                "Mozhi Theriya, Paathalilum, Arthanggal Indru Purigirathey..\n" +
                "Padithunaiyai, Nee Vanthai, Poagum Thooram Kuraigirathey..\n" +
                "\n" +
                "Yen Nenjodu Veesum, Intha Pennoda Vaasam,\n" +
                "Ival Kannodu Pookum Pala Vinmeenngal Paesum..\n" +
                "Èn Kaathal Šolla Oru Vaarthai Illai,\n" +
                "Èn Kannukulae Inni Kanavae Illai..\n" +
                "\n" +
                "Poongaatre Poongaatre Poopolae Vanthaal Ival..\n" +
                "Poagindra Vazhi Yellam Šanthosham Thanthaal Ival')");


        dbh.execSQL("insert into hindi values(12,'ENNAVALE','Ennavalae Adi Ennavalae Enthan Ithayathai Tholaithu Vittaen\n" +
                "Entha Idam Athu Tholaintha Idam Antha Idathaiyum Maranthu Vittaen\n" +
                "Unthan Kaalgolusil Athu Tholainthadhenru\n" +
                "Unthan Kaaladi Thaedi Vanthaen\n" +
                "Kaathalenraal Perum Avasthaiyenru\n" +
                "Unai Kandathum Kandu Kondaen\n" +
                "Enthan Kazhuthu Varai Indru Kaathal Vanthu\n" +
                "Iru Kanvizhi Pithungi Ninraen\n" +
                "\n" +
                "Ennavalae Adi Ennavalae Enthan Ithayathai Tholaithu Vittaen\n" +
                "\n" +
                "Vaaimozhiyum Enthan Thaimozhiyum Inru Vasapadavillaiyadi\n" +
                "Vayitrukkum Thondaikkum Uruvamilla Oru Urundayum Uruluthadi\n" +
                "Kaathirunthaal Ethir Paarthirunthaal Oru Nimishamum Varushamadi\n" +
                "Kangalellaam Enai Paarppathupoal Oru Kalakkamum Thoanruthadi\n" +
                "Ithu Sorgamaa Naragamaa Solladi Ullapadi\n" +
                "Naan Vaazhvathum Vidaikondu Poavathum Un Vaarthaiyil Ullathadi..\n" +
                "\n" +
                "Ennavalae Adi Ennavalae Enthan Ithayathai Thølaithu Vittaen\n" +
                "\n" +
                "Gøkilamae Nee Kural Køduthaal Unai Kumbittu Kannadippaen')");

        dbh.execSQL("insert into hindi values(13,'VASEEGARA','vaseegaraa en nenjinikka\n" +
                "un pon madiyil thoonginaal poadhum\n" +
                "adhae kaNam en kaNNuRanga\n" +
                "mun jenmangaLin yeakkangaL theerum\n" +
                "\n" +
                "vaseegaraa en nenjinikka\n" +
                "un pon madiyil thoonginaal poadhum\n" +
                "adhae kaNam en kaNNuRanga\n" +
                "mun jenmangaLin yeakkangaL theerum\n" +
                "naan naesippadhum suvaasippadhum un dhayavaal thaanae\n" +
                "aengugiRaen aengugiRaen un ninaivaal naanae\n" +
                "\n" +
                "adai mazhai varum adhil nanaivoamae\n" +
                "kuLir kaaychchaloadu snegam\n" +
                "oru poarvaikkuL iru thookkam\n" +
                "kuLu kuLu poigaL solli ennai velvaay\n" +
                "adhu therindhum kooda anbae\n" +
                "manam adhaiyaedhaan edhirpaarkkum\n" +
                "engaeyum poagaamal dhinam veettilaeyae nee vaendum\n" +
                "sila samayam viLaiyaattaay un aadaikkuLae naan vaendum\n" +
                "\n" +
                "(vaseegaraa...)\n" +
                "\n" +
                "dhinam nee kuLiththadhum ennaith thaedi\n" +
                "en saelai nuniyaal undhan\n" +
                "thalai thudaippaayae adhu kavidhai\n" +
                "thirudan poal padhungiyae dhideer endru\n" +
                "pinnaalirundhu ennai nee aNaippaayae adhu kavidhai\n" +
                "yaaraenum maNi kaettaal adhai solla kooda theriyaadhae\n" +
                "kaadhalenum mudiveliyil gadigaara naeram kidaiyaadhae\n" +
                "\n" +
                "(vaseegara...')");

        dbh.execSQL("insert into hindi values(14,'AVAL APPADI ONDRUM','Aval Appadi Ọndrum Azhagillai\n" +
                "Avalukku Yaarum Inai Illai\n" +
                "Aval Appadi Ọrdrum Cọlọr Illai\n" +
                "Aanal Athu Ọru Kurai Illai\n" +
                "\n" +
                "Aval Appadi Ọndrum Azhagillai\n" +
                "Avalukku Yaarum Inai Illai\n" +
                "Aval Appadi Ọrdrum Cọlọr Illai\n" +
                "Aanal Athu Ọru Kurai Illai\n" +
                "\n" +
                "Aval Perithaai Ọndrum Padikka Villai\n" +
                "Avalai Padithaen Mudikka Villai\n" +
                "Aval Uthuthum Udaigal Pidikka Villai\n" +
                "Irunthum Kavanikka Marakka Villai\n" +
                "\n" +
                "Aval Appadi Ọndrum Azhagillai\n" +
                "Avalukku Yaarum Inai Illai\n" +
                "Aval Appadi Ọrdrum Cọlọr Illai\n" +
                "Aanal Athu Ọru Kurai Illai\n" +
                "\n" +
                "Aval Naaikutti Ethuvum.. \n" +
                "Valarkavillai..\n" +
                "Naan Kaaval Irunthaal.. \n" +
                "Thadukkavillai.\n" +
                "Aval Bọmmaikalai Vaithu Urangavillai\n" +
                "Naan Bọmmai Pọla Pirakka Villai\n" +
                "Aval Kọọnthal Ọndrum Neelamillai\n" +
                "Antha Kaatil Thọlaithen Meelavillai\n" +
                "Aval Kai Viral Mọthiram Thangamillai\n" +
                "Kai Pidithidum Aasai Thọọngavillai\n" +
                "Aval Sọntham Indri Eduvum Illai..\n" +
                "Enakku Eduvum Illai..\n" +
                "\n" +
                "Aval Appadi Ọndrum Azhagillai\n" +
                "Avalukku Yaarum Inai Illai\n" +
                "Aval Appadi Ọrdrum Cọlọr Illai\n" +
                "Aanal Athu Ọru Kurai Illai..\n" +
                "\n" +
                "Aval Pattu Pudavai Endrum.. Aninthathillai..\n" +
                "Aval Chudithar Pọla Ethuvum.. Siranthathillai..\n" +
                "Aval Thittum Pọthum Valikka Villai\n" +
                "Antha Akkarai Pọla Veru Illai\n" +
                "\n" +
                "Aval Vaasam Rọja Vaasam Illai\n" +
                "Aval Illamal Swasam Illai\n" +
                "Aval Sọntham Bantham Eduvum Illai\n" +
                "Aval Sọntham Indri Eduvum Illai\n" +
                "Aval Sọntham Indri Eduvum Illai..\n" +
                "Enakku Eduvum Illai..\n" +
                "\n" +
                "Aval Appadi Ọndrum Azhagillai\n" +
                "Avalukku Yaarum Inai Illai\n" +
                "Aval Appadi Ọrdrum Cọlọr Illai\n" +
                "Aanal Athu Ọru Kurai Illai\n" +
                "\n" +
                "Aval Perithaai Ọndrum Padikka Villai\n" +
                "Avalai Padithen Mudikka Villai\n" +
                "Aval Uthuthum Udaigal Pidikka Villai\n" +
                "Irunthum Kavanikka Marakka Villai..')");

        dbh.execSQL("insert into hindi values(15,'THE HUMMA SONG','Ek ho gaye hum aur tum\n" +
                "Humma, humma, humma\n" +
                "Tu udd gayi nindein re\n" +
                "Hey.. humma\n" +
                "\n" +
                "Ek ho gaye hum aur tum\n" +
                "Tu udd gayi nindein re\n" +
                "Aur khanki payal masti mein\n" +
                "To kangan..\n" +
                "\n" +
                "Yeh pehli baar mile\n" +
                "Tum pe yeh dum nikle\n" +
                "Tum pe yeh jawani dheere dheere\n" +
                "Maddham machle re\n" +
                "Humma humma, humma humma humma\n" +
                "Hey humma humma, humma humma humma\n" +
                "\n" +
                "Mujhe dar iss baat ka hai bas\n" +
                "Ki kahin na yeh raat nikal jaaye\n" +
                "Meri itne bhi paas tu aa mat\n" +
                "Kahin meri hathon se na baat nikal jaaye\n" +
                "\n" +
                "Bolunga sach mein jo de tu ijazat\n" +
                "Sabar bhi ab karne laga bagawat\n" +
                "Zulfein hai zalim aur aakhein hai aafat\n" +
                "Lagta hai hone wali hai qayamat\n" +
                "\n" +
                "Mat tadpa aise tu\n" +
                "Na kar na-insaafi\n" +
                "Jo ghalti karne wala hoon main uske liye\n" +
                "Pehle se hi mangta hoon maafi\n" +
                "\n" +
                "Khili chandini jaisa ye badan\n" +
                "Janam mila tumko\n" +
                "Man mein socha tha jaisa roop\n" +
                "Tera aaya nazar humko\n" +
                "\n" +
                "Sitam khuli khuli yeh sanam gori gori\n" +
                "Yeh baahein karti hain yoon\n" +
                "Humein tumne jab gale lagaya to\n" +
                "Kho hi gaye hum\n" +
                "\n" +
                "Humma humma, humma humma humma\nHey humma humma, humma humma humma')");

        dbh.execSQL("insert into hindi values(16,'POOKKALE','Pookkale sattru oivedungal\n" +
                "Aval vanthu vittaal aval vanthuvittal\n" +
                "\n" +
                "Pookkale sattru oivedungal\n" +
                "Aval vanthu vittaal aval vanthuvittal\n" +
                "Hey ai endraal adhu azhagu endraal\n" +
                "Antha aigalin ai aval thaana\n" +
                "Hey ai endraal adhu kadavul endraal\n" +
                "Andha kadavulin thugal aval thana\n" +
                "Haiyo ena thigaikkum ai ena viyakkum\n" +
                "Aigalukkellaam vidumuraiyai \n" +
                "Aval thanthuvitaal aval vanthuvittaal\n" +
                "\n" +
                "Pookkale sattru oivedungal\n" +
                "Aval vanthu vittaal aval vanthuvittal\n" +
                "\n" +
                "Dina thakkiduthaane na ..\n" +
                "\n" +
                "Intha ulagin olivenna oruvan illai\n" +
                "Undhan asaivugal yaavilum ai\n" +
                "Vizhi azhagu kadanthu un idhayam nuzhainthu\n" +
                "En aimpulam unarnthidum ai\n" +
                "Ivan bayathai anaikka\n" +
                "Aval ivanai anaikka\n" +
                "Aval seigaiyil peivathu ai\n" +
                "Aval vizhiyin kanivil\n" +
                "Intha ulagam paniyum\n" +
                "Siru noiyalavum aiyamillai\n" +
                "En kaigalai korthidu manthiranai\n" +
                "Ini thaithu nee vaithidu nam nizhalai\n" +
                "Aval idhazhgalai nugarnthuvida\n" +
                "Paadhai neduga thavam puriyum\n" +
                "\n" +
                "Pookkale sattru oivedungal ....\n" +
                "\n" +
                "Neerveezhchi pole nindravan naan\n" +
                "Neentha oru odai aanaan\n" +
                "Vaan muttum malaiyaip pondravan naan \n" +
                "Aada oru medai aanaan\n" +
                "Ennulle ennaik kadaval\n" +
                "Yaarendru enaik kaanach cheithaal\n" +
                "Kelaamal nenjai koithaval\n" +
                "Sirpam seithu kaiyil thanthaal\n" +
                "Yugam yugam kaana mugam idhu podhum\n" +
                "Pugalidam endre undhan nenjam mattum pothum\n" +
                "Maru uyir thanthaal nimirnthida seithaal \n" +
                "Nugarnthidum paadhai engum vaasam veesa vanthaale')");





        dbh.execSQL("insert into hindi values(17,'POOMARAM','Aaa…aaaaa… Aaa…aaaaa…\n" +
                "Aaa…aaaaa… Aaa…aaaaa…\n" +
                "Njaanum njaanumentaalum\n" +
                "Aaa naappathu perumm..\n" +
                "Poomaram kondu kappalundaakki\n" +
                "Njanum njanumentaalum\n" +
                "Aaa naappathu perumm..\n" +
                "Pumaram kondu kappalundaakki\n" +
                "Advertisement\n" +
                "Mmmm…..\n" +
                "Kappalilaane aa kuppaaya kaari\n" +
                "Pankaayam pokki njaanonnu nokki\n" +
                "Kappalilaane aa kuppaaya kaari\n" +
                "Pankaayam pokki njaanonnu nokki\n" +
                "Njanonnu nokki avalenneyum nokki\n" +
                "Naappathu perum shishyanmaarum\n" +
                "Onnichu nokki\n" +
                "Njanonnu nokki avalenneyum nokki\n" +
                "Naappathu perum shishyanmaarum\n" +
                "Onnichu nokki\n" +
                "Njanum njanumentaalum\n" +
                "Aaa naappathu perumm..\n" +
                "Poomaram kondu kappalundaakki\n" +
                "Mmmmm…\n" +
                "Enthorazhaku.. aa enthoru bhangi\n" +
                "Enthorazhakaanaa kuppayakarikku\n" +
                "Enthorazhaku.. aa enthoru bhangi\n" +
                "Enthorazhakaanaa kuppayakarikku\n" +
                "Enpriya alle priya kaaminiyalle\n" +
                "Ente hridayam nee kavarneduthille\n" +
                "Enpriya alle priya kaaminiyalle\n" +
                "Ente hridayam nee kavarneduthille\n" +
                "Njanum njanumentaalum\n" +
                "Aaa naappathu perumm..\n" +
                "Pumaram kondu kappalundaakki\n" +
                "Njanum njanumentaalum\n" +
                "Aaa naappathu perumm..\n" +
                "Pumaram kondu kappalundaakki\n" +
                "Poomaram kondu kappalundaak')");




        dbh.execSQL("insert into hindi values(18,'THUMHI HO','Hum tere bin ab reh nahi sakte\n" +
                "Tere bina kya wajood mera [x2]\n" +
                "\n" +
                "Tujhse juda gar ho jaayenge\n" +
                "Toh khud se hi ho jaayenge judaa\n" +
                "\n" +
                "Kyunki tum hi ho\n" +
                "Ab tum hi ho\n" +
                "Zindagi ab tum hi ho\n" +
                "Chain bhi, mera dard bhi\n" +
                "Meri aashiqui ab tum hi ho\n" +
                "\n" +
                "Tera mera rishta hai kaisa\n" +
                "Ik pal door gawara nahi\n" +
                "Tere liye har roz hai jeete\n" +
                "Tujh ko diya mera waqt sabhi\n" +
                "Koi lamha mera na ho tere bina\n" +
                "Har saans pe naam tera\n" +
                "\n" +
                "Kyunki tum hi ho\n" +
                "Ab tum hi ho\n" +
                "Zindagi ab tum hi ho\n" +
                "Chain bhi, mera dard bhi\n" +
                "Meri aashiqui ab tum hi ho\n" +
                "\n" +
                "Tumhi ho... Tumhi ho...\n" +
                "Tere liye hi jiya main\n" +
                "Khud ko jo yun de diya hai\n" +
                "Teri wafa ne mujhko sambhala\n" +
                "Saare ghamon ko dil se nikala\n" +
                "Tere saath mera hai naseeb juda\n" +
                "Tujhe paake adhoora naa raha hmm..\n" +
                "\n" +
                "Kyunki tum hi ho\n" +
                "Ab tum hi ho\n" +
                "Zindagi ab tum hi ho..\n" +
                "Chain bhi, mera dard bhi\n" +
                "Meri aashiqui ab tum hi ho [x2]')");


        Toast.makeText(this, "inserted", Toast.LENGTH_SHORT).show();

    }




    public void setFirstBoot() {
        SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE).edit();

        editor.putInt("check", 1);
        editor.commit();
    }

    public int getFirstBoot() {
        int id=0;
        SharedPreferences prefs = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);
        String restoredText = prefs.getString("text", null);
        if (restoredText != null) {

            id = prefs.getInt("check", 0); //0 is the default value.

        }
        return id;
    }


    public void showMessage(String title, String message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();

    }






}
