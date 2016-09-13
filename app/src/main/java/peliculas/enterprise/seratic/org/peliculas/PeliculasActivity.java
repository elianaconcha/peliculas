package peliculas.enterprise.seratic.org.peliculas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import peliculas.enterprise.seratic.org.peliculas.adapter.ListPeliculasAdapter;
import peliculas.enterprise.seratic.org.peliculas.models.Pelicula;

public class PeliculasActivity extends AppCompatActivity {

    ListView list;
    List<Pelicula> data;
    ListPeliculasAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peliculas);

        list = (ListView) findViewById(R.id.list);
        data = new ArrayList<>();
        //region setData
        Pelicula pelicula1 = new Pelicula();
        pelicula1.setNombre("Ice Age: El gran cataclismo");
        pelicula1.setSinopsis("En la nueva historia veremos a Scrat y su mítica bellota en el espacio, donde accidentalmente desencadenará una serie de acontecimientos que amenazarán la Edad de Hielo. Para salvarse, Sid, Manny, Diego y el resto de la manada deberán salir de su hogar y embarcarse en una aventura llena de comedia y aventuras, viajando por tierras exóticas donde se encontrarán con nuevos y peculiares personajes");
        pelicula1.setFechaEstreno("14 de julio de 2016");
        pelicula1.setImgUrl("http://img.rtve.es/imagenes/teaser-poster-ice-age-gran-cataclismo/1450192665392.jpg");
        data.add(pelicula1);

        Pelicula pelicula2 = new Pelicula();
        pelicula2.setNombre("Star Wars Anthology: Rogue One");
        pelicula2.setSinopsis("Jyn Erso (Felicity Jones) es una problemática recluta Rebelde, hábil y testaruda, que está a punto de experimentar su mayor desafío cuando Mon Mothma (Genevieve O'Reilly), Senadora y líder secreto de la Alianza Rebelde, le confía una importante misión: robar los planos de la Estrella de la Muerte. Este arma secreta y definitiva, ideada por el Imperio Galáctico, es capaz de hacer saltar por los aires planetas enteros en un abrir y cerrar de ojos. Un grupo de Rebeldes liderado por Jyn, se embarcará en esta arriesgada misión, mientras se enfrentan a un nuevo y peligroso Lord Sith que se hace llamar Darth Vader. ");
        pelicula2.setFechaEstreno("16 de Diciembre de 2016");
        pelicula2.setImgUrl("http://static.batanga.com/sites/default/files/styles/large/public/cine.batanga.com/files/peliculas-mas-esperadas-2016-19.jpg?itok=N3KSF179");
        data.add(pelicula2);

        Pelicula pelicula3 = new Pelicula();
        pelicula3.setNombre("Resident Evil: The Final Chapter");
        pelicula3.setSinopsis("Siguiendo a los hechos ocurridos en Resident Evil: Venganza, la humanidad está en peligro después de que Alice haya sido traicionada por Wesker. Alice debe regresar al lugar donde todo comenzó: Raccoon City. Allí es donde la Corporación Umbrella está reuniendo fuerzas para un ataque final contra los supervivientes que quedan del apocalipsis.");
        pelicula3.setFechaEstreno("15 de Septiembre de 2016");
        pelicula3.setImgUrl("http://es.web.img2.acsta.net/newsv7/15/09/19/18/44/559855.jpg");
        data.add(pelicula3);

        Pelicula pelicula4 = new Pelicula();
        pelicula4.setNombre("Transformers: El último caballero");
        pelicula4.setSinopsis("Quinta entrega de la saga 'Transformers', cuyo estreno está previsto para 2017. Estará dirigida, al igual que las anteriores, por Michael Bay y se centrará  de nuevo en la historia de Optimus Prime, quien está buscando a través del cosmos pistas sobre los Quintessons, los creadores de los Transformers.\n" +
                "\n" + "Mientras tanto, en la Tierra Cade Yeager (Mark Wahlberg) tendrá que enfrentarse a una nueva amenaza alienígena que volverá a introducir a Lenox (Josh Duhamel) y a Epps (Tyrese Gibson) una vez más en la historia.");
        pelicula4.setFechaEstreno("28 de julio de 2017");
        pelicula4.setImgUrl("http://images.mysofa.es/upload/storage/actores/styles/news/storage-api/transformers-5_0.jpg?itok=PUhFmLV7");
        data.add(pelicula4);

        Pelicula pelicula5 = new Pelicula();
        pelicula5.setNombre("Deadpool");
        pelicula5.setSinopsis("Después de alistarse en el ejército, Wade Wilson (Ryan Reynolds) comienza a realizar trabajos de mercenario, y acabará siendo agente de las Fuerzas Especiales de EE.UU. Ya retirado, en su vida civil se dedica a ser un \"matón a sueldo\", ayudando a gente que no puede defenderse por sí sola. Su vida transcurre de forma normal, junto a su novia Vanessa (Morena Baccarin), hasta que llega la terrible noticia de que está gravemente enfermo.");
        pelicula5.setFechaEstreno("19 de febrero de 2016");
        pelicula5.setImgUrl("http://static.batanga.com/sites/default/files/styles/large/public/cine.batanga.com/files/peliculas-mas-esperadas-2016-3.jpg?itok=hPh-w8f4");
        data.add(pelicula5);

        Pelicula pelicula6 = new Pelicula();
        pelicula6.setNombre("X-MEN: Apocalipsis");
        pelicula6.setSinopsis("Diez años después de los hechos ocurridos en Días del futuro pasado, los caminos de Magneto (Michael Fassbender), Mística (Jennifer Lawrence) y Charles Xavier (James McAvoy) se han separado, pero volverán a unirse cuando Apocalipsis (Oscar Isaac) despierte. Este mutante que, desde los inicios de la civilización, fue venerado como un Dios, es el primer y más poderoso mutante del universo de los X-Men de Marvel.");
        pelicula6.setFechaEstreno("20 de mayo de 2016");
        pelicula6.setImgUrl("http://static.batanga.com/sites/default/files/styles/large/public/cine.batanga.com/files/peliculas-mas-esperadas-2016-5.jpg?itok=QbzZDVlp");
        data.add(pelicula6);
        //endregion

        adapter = new ListPeliculasAdapter(data,this);
        list.setAdapter(adapter);
        //list.setOnItemClickListener(this);
    }
}
