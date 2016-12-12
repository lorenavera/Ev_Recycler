package brigettevera.com.ev_recycler;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import brigettevera.com.ev_recycler.sitios_turisticos.Catedral;
import brigettevera.com.ev_recycler.sitios_turisticos.Parque_Caldas;
import brigettevera.com.ev_recycler.sitios_turisticos.Puente_Humilladero;
import brigettevera.com.ev_recycler.sitios_turisticos.Rincon_Payanes;
import brigettevera.com.ev_recycler.sitios_turisticos.San_Francisco;

/**
 * Created by BrigetteLorena on 03/11/2016.
 */
public class SitiosAdapter extends RecyclerView.Adapter<SitiosAdapter.ContenerdorGrafico> {

    ArrayList <Sitios> sitiosMostrar = new ArrayList <Sitios>();
    Context context;

    public SitiosAdapter(List<Sitios> arrayDatos, Context context) {
        this.sitiosMostrar = (ArrayList<Sitios>) arrayDatos;
        this.context = context;
    }

    @Override
    public ContenerdorGrafico onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardviewsitios, parent, false);
        ContenerdorGrafico contenerdorGrafico = new ContenerdorGrafico(view, context, sitiosMostrar);
        return contenerdorGrafico;
    }

    @Override
    public void onBindViewHolder(ContenerdorGrafico holder, int position) {

        Sitios sitios = sitiosMostrar.get(position);
        holder.nombreSitioTur.setText(sitiosMostrar.get(position).getNombreSitio());
        holder.imageViewFoto.setImageResource(sitiosMostrar.get(position).getIdFoto());
    }

    @Override
    public int getItemCount() {
        return sitiosMostrar.size();
    }

    public static class ContenerdorGrafico extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView nombreSitioTur;
        ImageView imageViewFoto;
        CardView cardView;
        ArrayList <Sitios> sitiosMostrar = new ArrayList <Sitios>();
        Context context;

        public ContenerdorGrafico(View itemView, Context context, ArrayList <Sitios> sitiosMostrar) {

            super(itemView);
            this.sitiosMostrar = sitiosMostrar;
            this.context =  context;
            itemView.setOnClickListener(this);
            cardView = (CardView) itemView.findViewById(R.id.cardViewSitios);
            nombreSitioTur = (TextView) itemView.findViewById(R.id.nombreSitio);
            imageViewFoto = (ImageView) itemView.findViewById(R.id.imageSitio);
        }

        @Override
        public void onClick(View view) {

            int position = getAdapterPosition();
            Sitios sitios = this.sitiosMostrar.get(position);

            Intent intent = null;
            switch (position){
                case 0:
                    intent = new Intent(this.context, Parque_Caldas.class);
                    intent.putExtra("imageSitio", sitios.getIdFoto());
                    intent.putExtra("nombreSitio", sitios.getNombreSitio());
                    this.context.startActivity(intent);
                    break;

                case 1:
                    intent = new Intent(this.context, Catedral.class);
                    intent.putExtra("imageSitio", sitios.getIdFoto());
                    intent.putExtra("nombreSitio", sitios.getNombreSitio());
                    this.context.startActivity(intent);
                    break;

                case 2:
                    intent = new Intent(this.context, San_Francisco.class);
                    intent.putExtra("imageSitio", sitios.getIdFoto());
                    intent.putExtra("nombreSitio", sitios.getNombreSitio());
                    this.context.startActivity(intent);
                    break;

                case 3:
                    intent = new Intent(this.context, Puente_Humilladero.class);
                    intent.putExtra("imageSitio", sitios.getIdFoto());
                    intent.putExtra("nombreSitio", sitios.getNombreSitio());
                    this.context.startActivity(intent);
                    break;

                case 4:
                    intent = new Intent(this.context, Rincon_Payanes.class);
                    intent.putExtra("imageSitio", sitios.getIdFoto());
                    intent.putExtra("nombreSitio", sitios.getNombreSitio());
                    this.context.startActivity(intent);
                    break;
            }


        }
    }

}