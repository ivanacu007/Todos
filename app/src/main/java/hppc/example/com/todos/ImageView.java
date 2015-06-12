package hppc.example.com.todos;

import android.app.Fragment;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.io.IOException;

/**
 * Created by HP PC on 29/05/2015.
 */
public class ImageView extends Fragment implements View.OnClickListener {
    Button boton;
    android.widget.ImageView imagen,p01,p02,p03,p04,p05,p06,p07,p08,p09;
    int movil;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.lay_imagen, container, false);

        boton = (Button) rootView.findViewById(R.id.btn1);
        imagen = (android.widget.ImageView) rootView.findViewById(R.id.iv1);
        p01 = (android.widget.ImageView) rootView.findViewById(R.id.iv2);
        p02 = (android.widget.ImageView) rootView.findViewById(R.id.iv3);
        p03 = (android.widget.ImageView) rootView.findViewById(R.id.iv4);
        p04 = (android.widget.ImageView) rootView.findViewById(R.id.iv5);
        p05 = (android.widget.ImageView) rootView.findViewById(R.id.iv6);
        p06 = (android.widget.ImageView) rootView.findViewById(R.id.iv7);
        p07 = (android.widget.ImageView) rootView.findViewById(R.id.iv8);
        p08 = (android.widget.ImageView) rootView.findViewById(R.id.iv9);
        p09 = (android.widget.ImageView) rootView.findViewById(R.id.iv10);
        p01.setOnClickListener(this);
        p02.setOnClickListener(this);
        p03.setOnClickListener(this);
        p04.setOnClickListener(this);
        p05.setOnClickListener(this);
        p06.setOnClickListener(this);
        p07.setOnClickListener(this);
        p08.setOnClickListener(this);
        p09.setOnClickListener(this);
       boton.setOnClickListener(this);
        movil = R.drawable.p001;

        return rootView;
    }

    public void  onClick(View v){
        switch (v.getId()){
            case R.id.iv2:
                imagen.setImageResource(R.drawable.p001);
                movil = R.drawable.p001;
                break;
            case R.id.iv3:
                imagen.setImageResource(R.drawable.p002);
                movil = R.drawable.p002;
                break;
            case R.id.iv4:
                imagen.setImageResource(R.drawable.p003);
                movil = R.drawable.p003;
                break;
            case R.id.iv5:
                imagen.setImageResource(R.drawable.p004);
                movil = R.drawable.p004;
                break;
            case R.id.iv6:
                imagen.setImageResource(R.drawable.p005);
                movil = R.drawable.p005;
                break;
            case R.id.iv7:
                imagen.setImageResource(R.drawable.p006);
                movil = R.drawable.p006;
                break;
            case R.id.iv8:
                imagen.setImageResource(R.drawable.p007);
                movil = R.drawable.p007;
                break;
            case R.id.iv9:
                imagen.setImageResource(R.drawable.p008);
                movil = R.drawable.p008;
                break;
            case R.id.iv10:
                imagen.setImageResource(R.drawable.p009);
                movil = R.drawable.p009;
                break;
            case R.id.btn1:
                Bitmap bitmap = BitmapFactory.decodeStream(getResources().openRawResource(movil));
                try{
                    getActivity().setWallpaper(bitmap);
                }catch (IOException e){
                    e.printStackTrace();
                }
                Toast toast = Toast.makeText(getActivity(),"Se aplicó el wallpaper", Toast.LENGTH_SHORT);
                toast.show();
                break;
        }

    }



}

