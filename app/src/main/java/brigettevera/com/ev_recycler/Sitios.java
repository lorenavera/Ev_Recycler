package brigettevera.com.ev_recycler;

import android.graphics.drawable.Drawable;

/**
 * Created by BrigetteLorena on 03/11/2016.
 */
public class Sitios {

    private String nombreSitio;
    private int idFoto;

    public Sitios() {
    }

    public Sitios(String nombreSitio, int idFoto) {
        this.nombreSitio = nombreSitio;
        this.idFoto = idFoto;
    }

    public String getNombreSitio() {
        return nombreSitio;
    }

    public void setNombreSitio(String nombreSitio) {
        this.nombreSitio = nombreSitio;
    }

    public int getIdFoto() {
        return idFoto;
    }

    public void setIdFoto(int idFoto) {
        this.idFoto = idFoto;
    }

}
