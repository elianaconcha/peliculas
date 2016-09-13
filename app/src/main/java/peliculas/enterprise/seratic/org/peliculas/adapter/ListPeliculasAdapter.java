package peliculas.enterprise.seratic.org.peliculas.adapter;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import peliculas.enterprise.seratic.org.peliculas.R;
import peliculas.enterprise.seratic.org.peliculas.models.Pelicula;

/**
 * Created by jhon on 7/09/16.
 */
public class ListPeliculasAdapter extends BaseAdapter {
    List<Pelicula> data;
    Context context;

    public ListPeliculasAdapter(List<Pelicula> data, Context context) {
        this.data = data;
        this.context= context;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = view;
        if (v == null){
            v = View.inflate(context, R.layout.template_list_peliculas,null);
        }

        ImageView img = (ImageView) v.findViewById(R.id.imagen);
        TextView nombre = (TextView) v.findViewById(R.id.nombre);
        Log.i("Nombre",nombre.getText().toString());
        TextView sinopsis = (TextView) v.findViewById(R.id.sinopsis);
        TextView fechaEstreno = (TextView) v.findViewById(R.id.fechaEstreno);
        nombre.setText(data.get(i).getNombre());
        sinopsis.setText("Sinopsis: "+data.get(i).getSinopsis());
        fechaEstreno.setText("Fecha de Estreno: "+data.get(i).getFechaEstreno());
        Picasso.with(context).load(data.get(i).getImgUrl()).into(img);

        return v;
    }
}
