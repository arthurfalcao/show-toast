package arthurfalcao.learningandroid.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

//        Button sendButton = (Button) findViewById(R.id.message_send);
//        sendButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//            Intent intentGoToMain = new Intent(MessageActivity.this, MainActivity.class);
//            }
//        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int i = item.getItemId();
        if (i == R.id.message_send) {
            EditText textField = findViewById(R.id.message);
            String textMessage = textField.getText().toString();

            Toast.makeText(MessageActivity.this, textMessage, Toast.LENGTH_SHORT).show();

            finish();

        }
        return super.onOptionsItemSelected(item);
    }
}
