package sg.edu.rp.c346.p05_quiz;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int counter;
    CheckBox chk1;
    CheckBox chk2;
    Button plus;
    Button minus;
    TextView integer;
    Button submit;
    int price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        price = 0;
        counter = 0;
        chk1 = findViewById(R.id.checkBox);
        chk2 = findViewById(R.id.checkBox2);
        plus = findViewById(R.id.button);
        minus = findViewById(R.id.button2);
        integer = findViewById(R.id.textView3);
        submit = findViewById(R.id.button3);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MyActivity", "Inside Onclick()");
                if (chk1.isChecked()) {
                    Intent intent = new Intent(getBaseContext(), FlightDetails.class);
                    intent.putExtra("value", "One Way Trip");
                    startActivity(intent);
                } else if (chk2.isChecked()) {
                    Intent intent1 = new Intent(getBaseContext(), FlightDetails.class);
                    intent1.putExtra("value", "Round Trip");
                    startActivity(intent1);
                } else {
                    Context context = getApplicationContext();
                    CharSequence text = "Both checkbox selected";
                    int duration = Toast.LENGTH_LONG;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }


        });
        final String num = integer.toString();
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter = counter +1;
                integer.setText(" Your total is :" + counter);
                Intent intent2 = new Intent(getBaseContext(), FlightDetails.class);
                intent2.putExtra("value1", "counter");
                startActivity(intent2);
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter = counter -1;
                integer.setText(" Your total is :" + counter);
                Intent intent3 = new Intent(getBaseContext(), FlightDetails.class);
                intent3.putExtra("value1", "counter");
                startActivity(intent3);
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(getBaseContext(), FlightDetails.class);
                intent4.putExtra("value4", "intent");
                intent4.putExtra("value4", "intent1");
                intent4.putExtra("value4", "intent2");
                intent4.putExtra("value4", "intent3");
                startActivity(intent4);
            }
        });


    }

    private double calcPrice(int integer) {
        if (chk1.isChecked()) {
            if (integer == 1) {
                double price = 100;
            } else {
                double price = 100 * integer;
            }
        } else {
            if (integer == 1) {
                double price = 100 * 2;
            } else {
                double price = 100 * integer * 2;
            }
        }
        return price;


    }

}
