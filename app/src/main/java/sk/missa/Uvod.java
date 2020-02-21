package sk.missa;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.view.GravityCompat;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import org.joda.time.DateTime;

import java.util.ArrayList;


public class Uvod extends Main {

    TextView dtm, upravyMisal;


    /*@Override
    protected void onResume() {
        if(zIntent == null || !zIntent)
            setZvuk();
        zIntent = false;
        super.onResume();
    }

    @Override
    protected void onPause() {
        if(!zIntent)
            unsetZvuk();
        super.onPause();
    }*/

    @Override
    protected void onResume() {
        if (!zIntent) {
            nastavDatum();
            sviatokDen();
        }
        super.onResume();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            //akcie po výbere položky z menu
            case android.R.id.home:
                drawer = findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
                return true;
            case R.id.menu_uvod:
                drawer = findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
                zIntent = true;
                Intent uvod = new Intent(this, Uvod.class);
                startActivity(uvod);
                return true;
            case R.id.menu_omse:
                drawer = findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
                vyberOmsu(this);
                return true;
            case R.id.menu_kalendar:
                drawer = findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
                zIntent = true;
                Intent kalendar = new Intent(this, Kalendar.class);
                startActivity(kalendar);
                return true;
            case R.id.menu_odpovede:
                drawer = findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
                vyberJazyk(Uvod.this);
                return true;
            case R.id.menu_font:
                drawer = findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
                vyberFont(Uvod.this);
                return true;
            case R.id.menu_fullscreen:
                switch_fullscreen.setChecked(!switch_fullscreen.isChecked());
                fullscreen = switch_fullscreen.isChecked();
                putFullscreen();
                setFullscreen();
                return true;
            case R.id.menu_rezim:
                switch_rezim.setChecked(!switch_rezim.isChecked());
                rezim = switch_rezim.isChecked();
                menuRezim();
                putRezim();
                sviatokDen();
                return true;
            case R.id.menu_pismo:
                switch_pismo.setChecked(!switch_pismo.isChecked());
                pismo = switch_pismo.isChecked();
                putPismo();
                sviatokDen();
                return true;
            case R.id.menu_zvoncek:
                switch_zvoncek.setChecked(!switch_zvoncek.isChecked());
                zvoncek = switch_zvoncek.isChecked();
                putZvoncek();
                return true;
            case R.id.menu_tiche_modlitby:
                switch_tiche_modlitby.setChecked(!switch_tiche_modlitby.isChecked());
                tiche_modlitby = switch_tiche_modlitby.isChecked();
                putTicheModlitby();
                return true;
            case R.id.menu_info:
                drawer = findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
                otvorDialog();
                return true;
        }

        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //nastaví písmo v celej aplikácií - pätkové alebo bezpätkové
        getThemeStyle();
        setTheme(themeStyle);
        //nastaví layout
        setContentView(R.layout.activity_uvod);

        //nastaví premenné, toolbar, fullscreen a režim v menu
        setSetting();
        setToolbar();
        setFullscreen();
        menuRezim();

        //nastaví veľkosť zvončeka podľa textu
        resizeZvoncek();

        //nastavenia v menu po stlačení switch tlačidla alebo obrazku pre priblíženie/oddialenie
        switch_fullscreen.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                fullscreen = isChecked;
                putFullscreen();
                setFullscreen();
            }
        });
        switch_pismo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                pismo = isChecked;
                putPismo();
                sviatokDen();
            }
        });
        switch_rezim.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                rezim = isChecked;
                menuRezim();
                putRezim();
                sviatokDen();
            }
        });
        switch_zvoncek.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                zvoncek = isChecked;
                putZvoncek();
            }
        });
        switch_tiche_modlitby.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                tiche_modlitby = isChecked;
                putTicheModlitby();
            }
        });
        image_zoomIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomIn();
                putVelkost();
                sviatokDen();
            }
        });
        image_zoomOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomOut();
                putVelkost();
                sviatokDen();
            }
        });

        dtm = findViewById(R.id.datum);
        upravyMisal = findViewById(R.id.upravyMisal);
        nastavDatum();
        sviatokDen();
    }

    @SuppressLint("SetTextI18n")
    public void nastavDatum() {
        setDate();
        dnes.set(rok, m, den);
        dtm.setText(den + ". " + mesiac[m] + " " + rok);
        setOpenDate();
    }

    private void sviatokDen() {
        if (rezim) {
            drawer.setBackgroundColor(Color.BLACK);
            dtm.setTextColor(getResources().getColor(R.color.background));
            upravyMisal.setTextColor(getResources().getColor(R.color.background));
        } else {
            drawer.setBackgroundColor(getResources().getColor(R.color.background));
            dtm.setTextColor(Color.BLACK);
            upravyMisal.setTextColor(Color.BLACK);
        }
        dtm.setTextSize(sizeN);
        upravyMisal.setTextSize(sizeO);
        //vypis sviatkov v aktualnom dni
        switch (m) {
            case 0:
                ziskajAaV(rok-1, rok);
                slavenieDen(month1);
                break;
            case 1:
                ziskajPaVN();
                slavenieDen(month2);
                break;
            case 2:
                ziskajPaVN();
                slavenieDen(month3);
                break;
            case 3:
                ziskajPaVN();
                slavenieDen(month4);
                break;
            case 4:
                ziskajPaVN();
                slavenieDen(month5);
                break;
            case 5:
                ziskajPaVN();
                slavenieDen(month6);
                break;
            case 6:
                slavenieDen(month7);
                break;
            case 7:
                slavenieDen(month8);
                break;
            case 8:
                slavenieDen(month9);
                break;
            case 9:
                slavenieDen(month10);
                break;
            case 10:
                slavenieDen(month11);
                break;
            case 11:
                ziskajAaV(rok, rok+1);
                slavenieDen(month12);
            default:
                break;
        }
    }

    private void slavenieDen(String[][] month) {
        final ArrayList<Calendar> words = new ArrayList<>();

        mD = new DateTime(rok, m + 1, den, 12, 0, 0);
        dvt = (dnes.get(java.util.Calendar.DAY_OF_WEEK) - 1);

        //post
        if ((mD.isEqual(mP) || mD.isAfter(mP)) && mD.isBefore(mVN))
            postVypis(words, month, den);
            //velka noc
        else if ((mD.isEqual(mVN) || mD.isAfter(mVN)) && (mD.isEqual(mDS) || mD.isBefore(mDS)))
            velkanocVypis(words, month, den);
            //advent
        else if ((mD.isEqual(mZacA) || mD.isAfter(mZacA)) && mD.isBefore(mNP))
            adventVypis(words, month, den);
            //vianoce
        else if ((mD.isEqual(mNP) || mD.isAfter(mNP)) && (mD.isEqual(mKKP) || mD.isBefore(mKKP)))
            vianoceVypis(words, month, den);
            //cezrok
        else
            cezrokVypis(words, month, den, m);
        adapter(words);
    }

    private void adapter(final ArrayList<Calendar> words) {
        Calendar w = words.get(0);
        ulozSpecial(w);
        uvodLayout = true;
        words.add(new Calendar(null));
        //words.add(new Calendar(null));
        CalendarAdapter adapter = new CalendarAdapter(this, words);
        ListView listView = findViewById(R.id.den_sviatky);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Calendar word = words.get(position);
                if (word.getMenoSvatca() != null){
                    ID = word.getID();
                    den = word.getDay();
                    tyzden = word.getTyzden();
                    pozicia_eucharistia = 1;
                    if (ID.contains("3dni")) {
                        LayoutInflater inflater = getLayoutInflater();
                        View layout = inflater.inflate(R.layout.toast_layout,
                                (ViewGroup) findViewById(R.id.toast));
                        TextView txt = layout.findViewById(R.id.text);
                        txt.setText("Pripravuje sa.");
                        Toast toast = new Toast(getApplicationContext());
                        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                        toast.setDuration(Toast.LENGTH_LONG);
                        toast.setView(layout);
                        toast.show();
                        /*zIntent = true;
                        Intent misal = new Intent(Uvod.this, Trojdnie.class);
                        startActivity(misal);*/
                    } else {
                        menoSvatca = word.getMenoSvatca();
                        slavenie = word.getSlavenie();
                        obdobie = word.getObdobie();
                        pozicia_formular = pozicia_prefacia = 0;
                        preface = false;
                        euchText = "";
                        C = A = V = P = VN = false;
                        zIntent = true;
                        Log.d("datum", String.valueOf(zIntent));
                        Intent misal = new Intent(Uvod.this, MisalNormal.class);
                        startActivity(misal);
                    }
                }
            }
        });
    }

    //ulozenie specialnej omse
    private void ulozSpecial(Calendar w){
        settings = getApplicationContext().getSharedPreferences("MySviatok", 0);
        SharedPreferences.Editor editor = settings.edit();
        String pom = w.getSlavenie();
        Gson gson = new Gson();
        String json = gson.toJson(w);
        editor.putString("special-omsa", json).apply();
        if (pom.equals("Sviatok") || pom.equals("Slávnosť") ||
                pom.equals("Vigília") || pom.equals("Oktáva") ||
                (pom.equals("") && !w.getObdobie().equals("p")))
        {
            editor.putBoolean("zmierenie", false).apply();
        }
        else {
            editor.putBoolean("zmierenie", true).apply();
        }
    }

    //otvori kalendar
    public void kalendar(View view){
        zIntent = true;
        Intent kalendar = new Intent(this, Kalendar.class);
        startActivity(kalendar);
    }

    //upravy velkost zvonceka
       private void resizeZvoncek() {
        int s = (sizeO - 16) / 2 * 5;
        sizeZ = 35 + s;
    }

    public void openUpravy(View view){
        zIntent = true;
        Intent upravy_misal = new Intent(this, Upravy_Misal.class);
        startActivity(upravy_misal);
    }
}
