package com.example.jason.firstproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private int points;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void generateMeme(View view) {
        EditText firstNameText = (EditText) findViewById(R.id.firstName);
        EditText middleNameText = (EditText) findViewById(R.id.middleName);
        EditText lastNameText = (EditText) findViewById(R.id.lastName);
        Button memeButton = (Button) findViewById(R.id.generateButton);
        memeButton.setText("Generate another meme!");
        char firstNameChar = firstNameText.getText().toString().charAt(0);
        firstNameChar = Character.toLowerCase(firstNameChar);
        char middleNameChar = middleNameText.getText().toString().charAt(0);
        middleNameChar = Character.toLowerCase(middleNameChar);
        char lastNameChar = lastNameText.getText().toString().charAt(0);
        lastNameChar = Character.toLowerCase(lastNameChar);
        String meme = "";
        if (firstNameChar == 'a' || firstNameChar == 'b') {
            meme += "ayy ";
        } else if (firstNameChar == 'c' || firstNameChar == 'd') {
            meme += "nice ";
        } else if (firstNameChar == 'e' || firstNameChar == 'f') {
            meme += "tipping ";
        } else if (firstNameChar == 'g' || firstNameChar == 'h') {
            meme += "very ";
        } else if (firstNameChar == 'i' || firstNameChar == 'j') {
            meme += "edgy ";
        }else if (firstNameChar == 'k' || firstNameChar == 'l') {
            meme += "swole ";
        }else if (firstNameChar == 'm' || firstNameChar == 'n') {
            meme += "420 ";
        }else if (firstNameChar == 'o' || firstNameChar == 'p') {
            meme += "le ";
        }else if (firstNameChar == 'q' || firstNameChar == 'r') {
            meme += "i am ";
        }else if (firstNameChar == 's' || firstNameChar == 't') {
            meme += "heavy ";
        }else if (firstNameChar == 'u' || firstNameChar == 'v') {
            meme += "euphoric ";
        }else if (firstNameChar == 'w' || firstNameChar == 'x') {
            meme += "rekt ";
        }else if (firstNameChar == 'y' || firstNameChar == 'z') {
            meme += "i love the ";
        } else {
            meme += "uhhh ";
        }

        if (middleNameChar == 'a' || middleNameChar == 'b') {
            meme += "wassup ";
        } else if (middleNameChar == 'c' || middleNameChar == 'd') {
            meme += "dank ";
        } else if (middleNameChar == 'e' || middleNameChar == 'f') {
            meme += "gentlemanly ";
        } else if (middleNameChar == 'g' || middleNameChar == 'h') {
            meme += "mad ";
        } else if (middleNameChar == 'i' || middleNameChar == 'j') {
            meme += "enlightened ";
        }else if (middleNameChar == 'k' || middleNameChar == 'l') {
            meme += "gymbro ";
        }else if (middleNameChar == 'm' || middleNameChar == 'n') {
            meme += "blaze ";
        }else if (middleNameChar == 'o' || middleNameChar == 'p') {
            meme += "cool ";
        }else if (middleNameChar == 'q' || middleNameChar == 'r') {
            meme += "extremely ";
        }else if (middleNameChar == 's' || middleNameChar == 't') {
            meme += "turnt ";
        }else if (middleNameChar == 'u' || middleNameChar == 'v') {
            meme += "atheist ";
        }else if (middleNameChar == 'w' || middleNameChar == 'x') {
            meme += "pepperoni ";
        }else if (middleNameChar == 'y' || middleNameChar == 'z') {
            meme += "yolo ";
        } else {
            meme += "what is ";
        }

        if (lastNameChar == 'a' || lastNameChar == 'b') {
            meme += "lmao";
        } else if (lastNameChar == 'c' || lastNameChar == 'd') {
            meme += "meme";
        } else if (lastNameChar == 'e' || lastNameChar == 'f') {
            meme += "fedora";
        } else if (lastNameChar == 'g' || lastNameChar == 'h') {
            meme += "brah";
        } else if (lastNameChar == 'i' || lastNameChar == 'j') {
            meme += "scholar";
        }else if (lastNameChar == 'k' || lastNameChar == 'l') {
            meme += "dude";
        }else if (lastNameChar == 'm' || lastNameChar == 'n') {
            meme += "alcohols";
        }else if (lastNameChar == 'o' || lastNameChar == 'p') {
            meme += "doge";
        }else if (lastNameChar == 'q' || lastNameChar == 'r') {
            meme += "( ͡° ͜ʖ ͡°)";
        }else if (lastNameChar == 's' || lastNameChar == 't') {
            meme += "༼ つ ◕_◕ ༽つ";
        }else if (lastNameChar == 'u' || lastNameChar == 'v') {
            meme += "୧༼ಠ益ಠ༽୨";
        }else if (lastNameChar == 'w' || lastNameChar == 'x') {
            meme += "in the face";
        }else if (lastNameChar == 'y' || lastNameChar == 'z') {
            meme += "donger";
        } else {
            meme += "life";
        }
        TextView memeText = (TextView) findViewById(R.id.memeText);
        memeText.setText(meme);
        Toast.makeText(this, "Nice meme!",Toast.LENGTH_LONG).show();
    }
}
