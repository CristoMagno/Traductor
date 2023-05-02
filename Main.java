package com.example.traductor;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText espa;
    TextView aleman, ingles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        espa = findViewById(R.id.txtEspanol);
        aleman = findViewById(R.id.txtAleman);
        ingles = findViewById(R.id.txtIngles);
    }
    public void limpiar(View v){
        espa.setText("");
        aleman.setText("");
        ingles.setText("");
        espa.setFocusable(true);
    }
    public void Traducir(View v){
        String palabra;
        palabra = espa.getText().toString();
        if(palabra.equals("Hola")){
            ingles.setText("Hello");
            aleman.setText("Hallo");
        }else if (palabra.equals("Cero")) {
            ingles.setText("Zero");
            aleman.setText("Null");
        }else if (palabra.equals("Uno")) {
            ingles.setText("One");
            aleman.setText("Eins");
        }else if (palabra.equals("Dos")) {
            ingles.setText("Two");
            aleman.setText("Zwei");
        }else if (palabra.equals("Tres")) {
            ingles.setText("Three");
            aleman.setText("Drei");
        }else if (palabra.equals("Cuatro")) {
            ingles.setText("Four");
            aleman.setText("Vier");
        }else if (palabra.equals("Cinco")) {
            ingles.setText("Five");
            aleman.setText("Fünf");
        }else if (palabra.equals("Seis")) {
            ingles.setText("Six");
            aleman.setText("Sechs");
        }else if (palabra.equals("Siete")) {
            ingles.setText("Seven");
            aleman.setText("Sieben");
        }else if (palabra.equals("Ocho")) {
            ingles.setText("Eight");
            aleman.setText("Acht");
        }else if (palabra.equals("Nueve")) {
            ingles.setText("Nine");
            aleman.setText("Neun");
        }else if (palabra.equals("Diez")) {
            ingles.setText("Ten");
            aleman.setText("Zehn");
        }else if (palabra.equals("Nosotros")) {
            ingles.setText("Us");
            aleman.setText("Uns");
        }else if (palabra.equals("La mayoría")) {
            ingles.setText("Most");
            aleman.setText("Am meinsten");
        }else if (palabra.equals("Día")) {
            ingles.setText("Day");
            aleman.setText("Tag");
        }else if (palabra.equals("Dar")) {
            ingles.setText("Give");
            aleman.setText("Geben");
        }else if (palabra.equals("Estos")) {
            ingles.setText("These");
            aleman.setText("Diese");
        }else if (palabra.equals("Alguno")) {
            ingles.setText("Any");
            aleman.setText("Manche");
        }else if (palabra.equals("Porque")) {
            ingles.setText("Becuase");
            aleman.setText("Weil");
        }else if (palabra.equals("Querer")) {
            ingles.setText("Want");
            aleman.setText("Wollen");
        }else if (palabra.equals("Nuevo")) {
            ingles.setText("New");
            aleman.setText("Neu");
        }else if (palabra.equals("Incluso")) {
            ingles.setText("Even");
            aleman.setText("Selbst");
        }else if (palabra.equals("Camino")) {
            ingles.setText("Way");
            aleman.setText("Weg");
        }else if (palabra.equals("Bien")) {
            ingles.setText("Well");
            aleman.setText("Gut");
        }else if (palabra.equals( "Primero")) {
            ingles.setText("First");
            aleman.setText("Erste");
        }else if (palabra.equals( "Trabajo")) {
            ingles.setText("Work");
            aleman.setText("Arbeit");
        }else if (palabra.equals( "Nuestro")) {
            ingles.setText("Our");
            aleman.setText("Unser");
        }else if (palabra.equals( "Como")) {
            ingles.setText("How");
            aleman.setText("Als");
        }else if (palabra.equals( "Usar")) {
            ingles.setText("Use");
            aleman.setText("Tragen");
        }else if (palabra.equals( "Después")) {
            ingles.setText("After");
            aleman.setText("Nach");
        }else if (palabra.equals( "De vuelta")) {
            ingles.setText("Back");
            aleman.setText("Zurück");
        }else if (palabra.equals( "También")) {
            ingles.setText("Also");
            aleman.setText("Auch");
        }else if (palabra.equals( "Pensar")) {
            ingles.setText("Think");
            aleman.setText("Denken");
        }else if (palabra.equals( "Encima de")) {
            ingles.setText("Over");
            aleman.setText("Über");
        }else if (palabra.equals( "Su")) {
            ingles.setText("Its");
            aleman.setText("Sein");
        }else if (palabra.equals( "Venir")) {
            ingles.setText("Come");
            aleman.setText("Kommen");
        }else if (palabra.equals( "Solo")) {
            ingles.setText("Only");
            aleman.setText("Nur");
        }else if (palabra.equals( "Mirar")) {
            ingles.setText("Look");
            aleman.setText("Suchen");
        }else if (palabra.equals( "Ahora")) {
            ingles.setText("Now");
            aleman.setText("Jetzt");
        }else if (palabra.equals( "Entonces")) {
            ingles.setText("Then");
            aleman.setText("So");
        }else if (palabra.equals( "Que")) {
            ingles.setText("Than");
            aleman.setText("Das");
        }else if (palabra.equals( "Otro")) {
            ingles.setText("Other");
            aleman.setText("Andere");
        }else if (palabra.equals( "Ver")) {
            ingles.setText("See");
            aleman.setText("Sehen");
        }else if (palabra.equals( "Ellos")) {
            ingles.setText("Them");
            aleman.setText("Sie");
        }else if (palabra.equals( "Bueno")) {
            ingles.setText("Good");
            aleman.setText("Also");
        }else if (palabra.equals( "Tu")){
            ingles.setText("Your");
            aleman.setText("Du");
        }else if (palabra.equals( "Año")) {
            ingles.setText("Year");
            aleman.setText("Jahr");
        }else if (palabra.equals( "Dentro")) {
            ingles.setText("Into");
            aleman.setText("Inner");
        }else if (palabra.equals("Gente")) {
            ingles.setText("People");
            aleman.setText("Menschen");
        }else if (palabra.equals("Muerte")) {
            ingles.setText("Death");
            aleman.setText("Tod");
        }else{
            ingles.setText("No disponible");
            aleman.setText("No disponible");
        }

    }
}
