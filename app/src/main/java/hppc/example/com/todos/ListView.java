package hppc.example.com.todos;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 * Created by HP PC on 29/05/2015.
 */
public class ListView extends Fragment {
    android.widget.ListView lista1;
    String []valores = new String[]{"Manzana","Pera","Uva","Naranja","Durazno","Durazno","Limon","Papaya","Pokemon","Nintendo","The Strokes","HP","Charizard","Parangaricutirimicuaro"};

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.lay_lista, container, false);
        lista1 = (android.widget.ListView) rootView.findViewById(R.id.listax);
        ArrayAdapter<String> adaptador;
        adaptador = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,valores);
        lista1.setAdapter(adaptador);
        return rootView;
    }
}
