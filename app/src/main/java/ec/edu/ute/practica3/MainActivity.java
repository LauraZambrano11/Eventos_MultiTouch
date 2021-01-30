package ec.edu.ute.practica3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConstraintLayout pantalla = (ConstraintLayout) findViewById(R.id.pantalla);
        TextView txtDedos =(TextView) findViewById(R.id.txtDedos);

        pantalla.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                int tipoEvento = motionEvent.getActionMasked();

                switch (tipoEvento)
                {
                    //para single touch
                    case MotionEvent.ACTION_DOWN:
                        pantalla.setBackgroundColor(Color.RED);
                        txtDedos.setText("1 DEDO");
                        break;

                    //para multi touch
                    case MotionEvent.ACTION_POINTER_DOWN:

                        //Switch para contar los dedos presionados
                        switch (motionEvent.getPointerCount()) {
                            case 2:
                                pantalla.setBackgroundColor(Color.BLUE);
                                txtDedos.setText("2 DEDOS");
                                break;
                            case 3:
                                pantalla.setBackgroundColor(Color.GREEN);
                                txtDedos.setText("3 DEDOS");
                                break;
                            case 4:
                                pantalla.setBackgroundColor(Color.MAGENTA);
                                txtDedos.setText("4 DEDOS");
                                break;
                            case 5:
                                pantalla.setBackgroundColor(Color.GRAY);
                                txtDedos.setText("5 DEDOS");
                                break;
                            case 6:
                                pantalla.setBackgroundColor(Color.YELLOW);
                                txtDedos.setText("6 DEDOS");
                                break;
                            case 7:
                                pantalla.setBackgroundColor(Color.CYAN);
                                txtDedos.setText("7 DEDOS");
                                break;
                            case 8:
                                pantalla.setBackgroundColor(Color.BLACK);
                                txtDedos.setText("8 DEDOS");
                                break;
                        }
                        break;

                    //para single touch
                    case MotionEvent.ACTION_UP:
                        pantalla.setBackgroundColor(Color.WHITE);
                        txtDedos.setText("0 DEDOS");
                        break;

                    //para multi touch
                    case MotionEvent.ACTION_POINTER_UP:
                        //Switch para contar los dedos levantados
                        switch (motionEvent.getPointerCount()) {
                            case 2:
                                pantalla.setBackgroundColor(Color.RED);
                                txtDedos.setText("1 DEDO");
                                break;
                            case 3:
                                pantalla.setBackgroundColor(Color.BLUE);
                                txtDedos.setText("2 DEDOS");
                                break;
                            case 4:
                                pantalla.setBackgroundColor(Color.GREEN);
                                txtDedos.setText("3 DEDOS");
                                break;
                            case 5:
                                pantalla.setBackgroundColor(Color.MAGENTA);
                                txtDedos.setText("4 DEDOS");
                                break;
                            case 6:
                                pantalla.setBackgroundColor(Color.GRAY);
                                txtDedos.setText("5 DEDOS");
                                break;
                            case 7:
                                pantalla.setBackgroundColor(Color.YELLOW);
                                txtDedos.setText("6 DEDOS");
                                break;
                            case 8:
                                pantalla.setBackgroundColor(Color.CYAN);
                                txtDedos.setText("7 DEDOS");
                                break;
                        }
                        break;


                }



                return true;
            }
        });
    }
}