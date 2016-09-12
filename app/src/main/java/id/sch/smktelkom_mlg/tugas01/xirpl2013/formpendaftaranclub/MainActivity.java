package id.sch.smktelkom_mlg.tugas01.xirpl2013.formpendaftaranclub;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    EditText etNama;
    CheckBox cbPG, cbSG, cbC;
    RadioButton rbL, rbP;
    Button buttonOK;
    Spinner spKota;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editTextNama);
        cbPG = (CheckBox) findViewById(R.id.checkBoxPG);
        cbSG = (CheckBox) findViewById(R.id.checkBoxSG);
        cbC = (CheckBox) findViewById(R.id.checkBoxC);
        rbL = (RadioButton) findViewById(R.id.radioButtonL);
        rbP = (RadioButton) findViewById(R.id.radioButtonP);
        buttonOK = (Button) findViewById(R.id.buttonOK);

    }
}
