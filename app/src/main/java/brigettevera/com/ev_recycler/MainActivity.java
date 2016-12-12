package brigettevera.com.ev_recycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List <Sitios> arrayDatos;
    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarDatos();
        inicializarRecycler();
    }

    private void inicializarRecycler() {
        rv = (RecyclerView) findViewById(R.id.rview);
        final RecyclerView.LayoutManager layoutManager;

        layoutManager = new LinearLayoutManager(getApplicationContext());
        rv.setLayoutManager(layoutManager);

        SitiosAdapter adaptador = new SitiosAdapter (arrayDatos, this);

        rv.setAdapter(adaptador);
        rv.setHasFixedSize(true);
    }

    private void inicializarDatos() {
        arrayDatos = new ArrayList<>();
        arrayDatos.add(new Sitios(getResources().getString(R.string.parqueCaldas), R.drawable.parquecaldas));
        arrayDatos.add(new Sitios(getResources().getString(R.string.catedral), R.drawable.catedral));
        arrayDatos.add(new Sitios(getResources().getString(R.string.sanFrancisco), R.drawable.iglesiasanfrancisco));
        arrayDatos.add(new Sitios(getResources().getString(R.string.puenteHumilladero), R.drawable.puentehumilladero));
        arrayDatos.add(new Sitios(getResources().getString(R.string.rinconPayanes), R.drawable.rinconpayanes));
    }
}
