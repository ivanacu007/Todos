package hppc.example.com.todos;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by HP PC on 29/05/2015.
 */
public class HolaMundo extends Fragment implements View.OnClickListener{

    // Atributos tipo de texto y nombre
    EditText campo,campo1,campo2,campo3;
    Button enviar;
    // Declara mensaje
    String msg,msg1,msg2,msg3;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.lay_hola, container, false);

        campo = (EditText) rootView.findViewById(R.id.txt);
        campo1 = (EditText) rootView.findViewById(R.id.txt1);
        campo2 = (EditText) rootView.findViewById(R.id.txt2);
        campo3 = (EditText) rootView.findViewById(R.id.txt3);
        enviar = (Button) rootView.findViewById(R.id.button);
        enviar.setOnClickListener(this);

        return rootView;
        }
    @Override
    public void onClick(View view) {
        FragmentManager fragmentManager = getFragmentManager();
        Fragment fragment = null;
        switch (view.getId()){
        case R.id.boton:
            fragment = new Segunda();
            break;
        }
    }
}


