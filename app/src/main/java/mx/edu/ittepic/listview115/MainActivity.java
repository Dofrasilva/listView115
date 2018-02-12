package mx.edu.ittepic.listview115;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView simpleList;
    String countryList[] = {"Parada", "Activa", "Visible", "Destruida"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleList = (ListView)findViewById(R.id.lista);
        String[] values = new String[] { "onStart(): \n Nos indica que la actividad está a punto de ser mostrada al usuario\n",
                "onResume():\n Se llama cuando la actividad va a comenzar a interactuar con el usuario. Es un buen lugar para lanzar las animaciones y la música.\n",
                "onPause():\nonPause(): Indica que la actividad está a punto de ser lanzada a segundo plano, normalmente porque otra actividad es lanzada. Es el lugar adecuado para detener animaciones, música o almacenar los datos que estaban en edición.\n",
                "onStop():\n  La actividad ya no va a ser visible para el usuario. Ojo si hay muy poca memoria, es posible que la actividad se destruya sin llamar a este método.\n",
                "onDestroy():\n Se llama antes de que la actividad sea totalmente destruida. Por ejemplo, cuando el usuario pulsa el botón de volver o cuando se llama al método finish(). Ojo si hay muy poca memoria, es posible que la actividad se destruya sin llamar a este método.\n",

        };
        ArrayAdapter <String> adapter = new ArrayAdapter <String> (this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);
        simpleList.setAdapter(adapter);
        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                int itemPosition     = position;
                String  itemValue    = (String) simpleList.getItemAtPosition(position);

                Toast.makeText(getApplicationContext(),
                        "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                        .show();

            }

        });
    }
}
