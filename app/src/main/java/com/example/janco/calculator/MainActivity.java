package com.example.janco.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

import butterknife.Bind;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private int numberFunctionCharacter = 1;
    private Boolean dot = false;


    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.text);
        Map<Integer, Character> maps = new HashMap<>();
        maps.put(R.id.button0, '0');
        maps.put(R.id.button1, '1');
        maps.put(R.id.button2, '2');
        maps.put(R.id.button3, '3');
        maps.put(R.id.button4, '4');
        maps.put(R.id.button5, '5');
        maps.put(R.id.button6, '6');
        maps.put(R.id.button7, '7');
        maps.put(R.id.button8, '8');
        maps.put(R.id.button9, '9');
        maps.put(R.id.buttonDot, ',');
        maps.put(R.id.buttonEqual, '=');
        maps.put(R.id.buttonSub, '-');
        maps.put(R.id.buttonAdd, '+');
        maps.put(R.id.buttonMult, '*');
        maps.put(R.id.buttonDiv, '/');
        maps.put(R.id.buttonClr, 'c');


        for (int btn : maps.keySet()) {
            prepareButton(btn, maps.get(btn));
        }

    }

    private void prepareButton(final int btn, final Character mChar) {

        Button button = (Button) findViewById(btn);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                switch (mChar) {
                    case '0':
                        textView.setText(textView.getText() + mChar.toString());
                        break;
                    case '1':
                        textView.setText(textView.getText() + mChar.toString());
                        break;
                    case '2':
                        textView.setText(textView.getText() + mChar.toString());
                        break;
                    case '3':
                        textView.setText(textView.getText() + mChar.toString());
                        break;
                    case '4':
                        textView.setText(textView.getText() + mChar.toString());
                        break;
                    case '5':
                        textView.setText(textView.getText() + mChar.toString());
                        break;
                    case '6':
                        textView.setText(textView.getText() + mChar.toString());
                        break;
                    case '7':
                        textView.setText(textView.getText() + mChar.toString());
                        break;
                    case '8':
                        textView.setText(textView.getText() + mChar.toString());
                        break;
                    case '9':
                        textView.setText(textView.getText() + mChar.toString());
                        break;
                    //funkcyjne
                    case '+':
                        if ((numberFunctionCharacter != (textView.getText().length() - 1)) & (textView.getText().length() != 0)) {
                            numberFunctionCharacter = textView.getText().length();
                            dot = false;
                            textView.setText(textView.getText() + mChar.toString());
                        }
                        break;
                    case '-':
                        if ((numberFunctionCharacter != (textView.getText().length() - 1)) & (textView.getText().length() != 0)) {
                            numberFunctionCharacter = textView.getText().length();
                            dot = false;
                            textView.setText(textView.getText() + mChar.toString());
                        }
                        break;
                    case '*':
                        if ((numberFunctionCharacter != (textView.getText().length() - 1)) & (textView.getText().length() != 0)) {
                            numberFunctionCharacter = textView.getText().length();
                            dot = false;
                            textView.setText(textView.getText() + mChar.toString());
                        }
                        break;
                    case '/':
                        if ((numberFunctionCharacter != (textView.getText().length() - 1)) & (textView.getText().length() != 0)) {
                            numberFunctionCharacter = textView.getText().length();
                            dot = false;
                            textView.setText(textView.getText() + mChar.toString());
                        }
                        break;
                    case ',':
                        if ((numberFunctionCharacter != (textView.getText().length() - 1)) & (textView.getText().length() != 0) & (dot == false)) {
                            numberFunctionCharacter = textView.getText().length();
                            dot = true;
                            textView.setText(textView.getText() + mChar.toString());
                        }
                        break;
                    case '=':
                        Result result = new Result(textView.getText().toString());
                        textView.setText(result.calculate());
                        ;

                        break;
                    case 'c':
                        textView.setText("");
                        dot = false;
                        break;

                }

            }
        });

    }



}
