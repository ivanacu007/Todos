package hppc.example.com.todos;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.content.Intent;

/**
 * Created by HP PC on 10/06/2015.
 */
public class Segunda extends Fragment {

    String nValor, nValor1, nValor2, nValor3;
    TextView txt, txt1, txt2, txt3;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        android.view.View rootView = inflater.inflate(R.layout.segunda, container, false);
       /* txt = (TextView) rootView.findViewById(R.id.txtt);
        txt1 = (TextView) rootView.findViewById(R.id.txtt1);
        txt2 = (TextView) rootView.findViewById(R.id.txtt2);
        txt3 = (TextView) rootView.findViewById(R.id.txtt3);
        Bundle bundle = getActivity().getIntent().getExtras();
        if (bundle != null){
            nValor = bundle.getString("valor");
            txt.setText(nValor);
            nValor1 = bundle.getString("valor1");
            txt1.setText(nValor1);
            nValor2 = bundle.getString("valor2");
            txt2.setText(nValor2);
            nValor3 = bundle.getString("valor3");
            txt3.setText(nValor3);
        }*/
        return rootView;

    }
}
