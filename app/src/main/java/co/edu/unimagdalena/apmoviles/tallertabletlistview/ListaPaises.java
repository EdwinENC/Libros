package co.edu.unimagdalena.apmoviles.tallertabletlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListaPaises extends AppCompatActivity {

    ListView listapaises;
    ArrayList<String> libros = new ArrayList<String>();
    ArrayList<String> autor = new ArrayList<String>();
    ArrayList<String> codigo = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_paises);
        libros.add("Harry Potter");
        libros.add("El señor de los anillos");
        libros.add("El Alquimista");
        libros.add("El codigo Da Vinci");
        libros.add("Crepusculo");
        libros.add("Lo que el viento se llevo");
        autor.add("J.K. Rowling");
        autor.add("J.R.R. Tolkien");
        autor.add("Paulo Coelho");
        autor.add("Dan Brown");
        autor.add("Stephenie Meyer");
        autor.add("Margaret Margaret Mitchell");
        codigo.add("0000");
        codigo.add("1111");
        codigo.add("2222");
        codigo.add("3333");
        codigo.add("4444");
        codigo.add("5555");
        listapaises = findViewById(R.id.lstpaises);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,libros);
        listapaises.setAdapter(adapter);

        listapaises.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Libro : " + (libros.get(position)+ "                                    "
                        + "Autor : "+(autor.get(position)+ "                                           "
                        + "Codigo : "+(codigo.get(position)))),Toast.LENGTH_LONG).show();
            }
        });

    }


}
