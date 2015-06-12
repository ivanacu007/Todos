package hppc.example.com.todos;

import android.app.AlertDialog;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by HP PC on 29/05/2015.
 */
public class Checkbox extends Fragment implements View.OnClickListener {

    EditText texto;
    Button boton;
    CheckBox che1;
    CheckBox che2;
    String msj;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.lay_checkbox, container, false);
        texto = (EditText) rootView.findViewById(R.id.campo);
        boton = (Button) rootView.findViewById(R.id.boton);
        che1 = (CheckBox) rootView.findViewById(R.id.chee);
        che2 = (CheckBox) rootView.findViewById(R.id.cheee);
        msj = texto.getText().toString();
        boton.setOnClickListener(this);
        return rootView;
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.boton:
                if (che1.isChecked() == false || che2.isChecked() == false) {
                    texto.setText(msj);
                }
                if (che1.isChecked() == true) {

                    texto.setText("Hombre");
                }
                if (che2.isChecked() == true) {

                    texto.setText("Mujer");
                }
                if (che1.isChecked() == true && che2.isChecked() == true) {
                    Toast.makeText(getActivity(), "Elige uno", Toast.LENGTH_SHORT).show();
                    texto.setText(msj);
                    che1.setChecked(false);
                    che2.setChecked(false);
                }
        }
    }

}
