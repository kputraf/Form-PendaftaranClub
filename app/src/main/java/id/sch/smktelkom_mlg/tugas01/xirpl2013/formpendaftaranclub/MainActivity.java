package id.sch.smktelkom_mlg.tugas01.xirpl2013.formpendaftaranclub;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etNama;
    CheckBox cbPG, cbSG, cbC;
    RadioGroup rgStatus;
    RadioButton rbL, rbP;
    Button buttonOK;
    Spinner spKota;
    TextView tvHasil, tvAK, tvJeka, tvPS, tvNama, tvAskot;

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
        tvAK = (TextView) findViewById(R.id.textViewAK);
        tvAskot = (TextView) findViewById(R.id.textViewAskot);
        tvNama = (TextView) findViewById(R.id.textViewNama);
        tvPS = (TextView) findViewById(R.id.textViewPS);
        tvJeka = (TextView) findViewById(R.id.textViewJeka);
        spKota = (Spinner) findViewById(R.id.spinnerKota);
        rbP = (RadioButton) findViewById(R.id.radioButtonP);
        rbL = (RadioButton) findViewById(R.id.radioButtonL);
        buttonOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                doCoba();
                doProses();
                doClick();
            }
        });
    }

    private void doCoba() {
        String hasil = "Posisi Bermain : ";
        int startlen = hasil.length();
        if (cbPG.isChecked()) hasil += cbPG.getText() + ", ";
        if (cbSG.isChecked()) hasil += cbSG.getText() + ", ";
        if (cbC.isChecked()) hasil += cbC.getText() + ", ";
        if (hasil.length() == startlen) hasil += "Belum Memilih Posisi";
        tvPS.setText(hasil);
    }

    private void doProses() {
        if (isValid()) {
            String nama = etNama.getText().toString();

            tvNama.setText("Nama : " + nama);

        }
    }

    private boolean isValid() {
        boolean valid = true;
        String nama = etNama.getText().toString();

        if (nama.isEmpty()) {
            etNama.setError("Nama Belum di Isi");
            valid = false;
        } else {
            etNama.setError(null);
        }
        return valid;
    }

    private void doClick() {
        tvAskot.setText("Asal Kota : " + spKota.getSelectedItem().toString());
        String jeka = null;

        if (rbL.isChecked()) {
            jeka = rbL.getText().toString();

        } else if (rbP.isChecked()) {
            jeka = rbP.getText().toString();
        }
        if (jeka == null) {
            tvJeka.setText("Belum Memilih Jenis Kelamin");
        } else {
            tvJeka.setText("Jenis Kelamin : " + jeka);
        }
    }
}
