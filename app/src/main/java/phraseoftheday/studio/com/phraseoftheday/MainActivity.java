package phraseoftheday.studio.com.phraseoftheday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView textNewPhrase;
    private Button buttonNewPhrase;
    private String[] phrases = {
            "Maria, larga esse crochê.",
            "Jorge, vai estudar.",
            "Larissa, arruma um emprego.",
            "Rafael, sai desse computador.",
            "Du precisa de um banho.",
            "A gata caga na casa do seu Nico.",
            "O rato birutinha.",
            "Amo vocês!!!"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textNewPhrase = (TextView) findViewById(R.id.textNewPhrase);
        buttonNewPhrase = (Button) findViewById(R.id.button_newPhrase);


        buttonNewPhrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textNewPhrase.setText(phrases[new Random().nextInt(phrases.length)]);
            }
        });
    }

}
