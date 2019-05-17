package sg.edu.rp.c346.p05_quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FlightDetails extends AppCompatActivity {

    TextView tv;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flight_details);

        tv = findViewById(R.id.textView4);
        tv1 = findViewById(R.id.textView5);

        Intent intentRecieved = getIntent();
        String value = intentRecieved.getStringExtra("value");
        tv.setText("You have selected " + value);

        Intent intentRecieved1 = getIntent();
        String value1 = intentRecieved1.getStringExtra("value1");
        tv1.setText("Your air ticket costs " + value1);





    }
}
