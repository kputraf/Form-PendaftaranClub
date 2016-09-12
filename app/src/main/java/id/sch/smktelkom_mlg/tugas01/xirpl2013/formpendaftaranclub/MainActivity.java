package id.sch.smktelkom_mlg.tugas01.xirpl2013.formpendaftaranclub;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etNama;
    CheckBox cbPG, cbSG, cbC;
    RadioGroup rgStatus;
    Button buttonOK;
    Spinner spKota;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editTextNama);
        cbPG = (CheckBox) findViewById(R.id.checkBoxPG);
        cbSG = (CheckBox) findViewById(R.id.checkBoxSG);
        cbC = (CheckBox) findViewById(R.id.checkBoxC);
        rgStatus = (RadioGroup) findViewById(R.id.radioGroupStatus);
        buttonOK = (Button) findViewById(R.id.buttonOK);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);
        findViewById(R.id.buttonOK).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                doClick();
            }
        });
    }

    private void doClick() {
    }
}
