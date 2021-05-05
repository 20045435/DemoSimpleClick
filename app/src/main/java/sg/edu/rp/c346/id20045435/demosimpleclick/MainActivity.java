package sg.edu.rp.c346.id20045435.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    // Step 1: Declare the field variables
    Button btnDisplay;
    EditText etInput;
    TextView tvDisplay;
    ToggleButton tgBtn;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Step 2: Link the field variables to UI components in layout
        btnDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextInput);
        tvDisplay = findViewById(R.id.textViewDisplay);
        tgBtn = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById(R.id.radioGroupGender);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                String userInput = etInput.getText().toString();
                int checkRadioId = rgGender.getCheckedRadioButtonId();

                if (checkRadioId == R.id.radioButtonGenderMale) {
                    // Write the code when male selected
                    userInput = "He says " + userInput;
                }

                else {
                    // Write the code when female selected
                    userInput = "She says " + userInput;
                }

                tvDisplay.setText(userInput);
            }
        });

        tgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add your code for the action
                if (tgBtn.isChecked()) {
                    etInput.setEnabled(true);
                }

                else {
                    etInput.setEnabled(false);
                }

                etInput.setEnabled(tgBtn.isChecked());
            }
        });
    }
}