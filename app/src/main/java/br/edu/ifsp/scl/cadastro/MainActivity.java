package br.edu.ifsp.scl.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button saveBt;
    private Button cleanBt;
    private EditText nameEt;
    private EditText phoneEt;
    private EditText emailEt;
    private CheckBox termEmailCb;
    private RadioGroup sexRg;
    private EditText cityEt;
    private Spinner stateSp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        saveBt = findViewById(R.id.btSave);
        cleanBt = findViewById(R.id.btClean);
        nameEt = findViewById(R.id.etCompleteName);
        phoneEt = findViewById(R.id.etPhoneNumber);
        emailEt = findViewById(R.id.etEmail);
        termEmailCb = findViewById(R.id.cbTermEmail);
        sexRg = findViewById(R.id.rgSex);
        cityEt = findViewById(R.id.etCity);
        stateSp = findViewById(R.id.spState);
        cleanBt.setOnClickListener(v -> cleanDataActivity());
        saveBt.setOnClickListener(v -> saveDataActivity());
    }

    private void cleanDataActivity(){
        nameEt.setText("");
        phoneEt.setText("");
        emailEt.setText("");
        termEmailCb.setChecked(false);
        sexRg.clearCheck();
        cityEt.setText("");
        stateSp.clearFocus();
        stateSp.setSelection(0);
    }

    private void saveDataActivity(){
        SignUp cadastro = new SignUp(nameEt.getText().toString(), phoneEt.getText().toString(), emailEt.getText().toString(), termEmailCb.isChecked(), convertSex(sexRg), cityEt.getText().toString(), ((TextView) stateSp.getSelectedView()).getText().toString());
        System.out.println(cadastro.toString());
        cleanDataActivity();
    }

    private Sex convertSex(RadioGroup radioGroup) {
        if (radioGroup.getCheckedRadioButtonId() == R.id.rbMasculine){
            return Sex.masculine;
        } else if (radioGroup.getCheckedRadioButtonId() == R.id.rbFeminine) {
            return Sex.feminine;
        }
        return null;
    }
}