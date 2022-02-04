package com.example.junkcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button buttonOne, buttonTwo, buttonThree, buttonPlus,
            buttonFour, buttonFive, buttonSix, buttonMinus,
            buttonSeven, buttonEight, buttonNine, buttonMultiply,
            buttonClear, buttonZero, buttonEquals, buttonDivide,
            buttonMod, buttonPow, buttonMax, buttonMin,
            buttonMode;

    TextView resultTextView;
    boolean resultReturned = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonZero = findViewById(R.id.button0);
        buttonOne = findViewById(R.id.button1);
        buttonTwo = findViewById(R.id.button2);
        buttonThree = findViewById(R.id.button3);
        buttonFour = findViewById(R.id.button4);
        buttonFive = findViewById(R.id.button5);
        buttonSix = findViewById(R.id.button6);
        buttonSeven = findViewById(R.id.button7);
        buttonEight = findViewById(R.id.button8);
        buttonNine = findViewById(R.id.button9);

        buttonPlus = findViewById(R.id.buttonPlus);
        buttonMinus = findViewById(R.id.buttonMinus);
        buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonDivide = findViewById(R.id.buttonDivide);
        buttonClear = findViewById(R.id.buttonClear);
        buttonEquals = findViewById(R.id.buttonEquals);

        buttonMod = findViewById(R.id.buttonMod);
        buttonPow = findViewById(R.id.buttonPow);
        buttonMax = findViewById(R.id.buttonMax);
        buttonMin = findViewById(R.id.buttonMin);

        buttonMode = findViewById(R.id.buttonMode);

        resultTextView = findViewById(R.id.resultDisplay);

        //Hiding scientific buttons
        buttonMod.setVisibility(View.GONE);
        buttonPow.setVisibility(View.GONE);
        buttonMax.setVisibility(View.GONE);
        buttonMin.setVisibility(View.GONE);


        Calculator result = new Calculator();

        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resultReturned) {
                    resultTextView.setText("");
                    resultReturned = false;
                }

                if(!result.maxSize(resultTextView.getText().toString())) {
                    resultTextView.setText(String.format("%s1 ", resultTextView.getText()));
                }

            }
        });

        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resultReturned) {
                    resultTextView.setText("");
                    resultReturned = false;
                }

                if(!result.maxSize(resultTextView.getText().toString())) {
                    resultTextView.setText(String.format("%s2 ", resultTextView.getText()));
                }
            }
        });

        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resultReturned) {
                    resultTextView.setText("");
                    resultReturned = false;
                }

                if(!result.maxSize(resultTextView.getText().toString())) {
                    resultTextView.setText(String.format("%s3 ", resultTextView.getText()));
                }
            }
        });

        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resultReturned) {
                    resultTextView.setText("");
                    resultReturned = false;
                }

                if(!result.maxSize(resultTextView.getText().toString())) {
                    resultTextView.setText(String.format("%s4 ", resultTextView.getText()));
                }
            }
        });

        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resultReturned) {
                    resultTextView.setText("");
                    resultReturned = false;
                }

                if(!result.maxSize(resultTextView.getText().toString())) {
                    resultTextView.setText(String.format("%s5 ", resultTextView.getText()));
                }
            }
        });

        buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resultReturned) {
                    resultTextView.setText("");
                    resultReturned = false;
                }

                if(!result.maxSize(resultTextView.getText().toString())) {
                    resultTextView.setText(String.format("%s6 ", resultTextView.getText()));
                }
            }
        });

        buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resultReturned) {
                    resultTextView.setText("");
                    resultReturned = false;
                }

                if(!result.maxSize(resultTextView.getText().toString())) {
                    resultTextView.setText(String.format("%s7 ", resultTextView.getText()));
                }
            }
        });

        buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resultReturned) {
                    resultTextView.setText("");
                    resultReturned = false;
                }

                if(!result.maxSize(resultTextView.getText().toString())) {
                    resultTextView.setText(String.format("%s8 ", resultTextView.getText()));
                }
            }
        });

        buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resultReturned) {
                    resultTextView.setText("");
                    resultReturned = false;
                }

                if(!result.maxSize(resultTextView.getText().toString())) {
                    resultTextView.setText(String.format("%s9 ", resultTextView.getText()));
                }
            }
        });

        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resultReturned) {
                    resultTextView.setText("");
                    resultReturned = false;
                }

                if(!result.maxSize(resultTextView.getText().toString())) {
                    resultTextView.setText(String.format("%s0 ", resultTextView.getText()));
                }
            }
        });


        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resultReturned) {
                    resultTextView.setText("");
                    resultReturned = false;
                }

                if(!result.maxSize(resultTextView.getText().toString())) {
                    resultTextView.setText(String.format("%s+ ", resultTextView.getText()));
                }
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resultReturned) {
                    resultTextView.setText("");
                    resultReturned = false;
                }

                if(!result.maxSize(resultTextView.getText().toString())) {
                    resultTextView.setText(String.format("%s- ", resultTextView.getText()));
                }
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resultReturned) {
                    resultTextView.setText("");
                    resultReturned = false;
                }

                if(!result.maxSize(resultTextView.getText().toString())) {
                    resultTextView.setText(String.format("%s* ", resultTextView.getText()));
                }
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resultReturned) {
                    resultTextView.setText("");
                    resultReturned = false;
                }

                if(!result.maxSize(resultTextView.getText().toString())) {
                    resultTextView.setText(String.format("%s/ ", resultTextView.getText()));
                }
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultTextView.setText("");
                resultReturned = false;
            }
        });


        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!resultReturned) {
                    result.push(resultTextView.getText().toString());

                    String finalValue = result.calculate();

                    resultTextView.setText(String.format("%s= %s", resultTextView.getText(), finalValue));
                }

                resultReturned = true;
            }
        });

        buttonMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (buttonMod.getVisibility() == View.VISIBLE) {
                    buttonMod.setVisibility(View.GONE);
                    buttonPow.setVisibility(View.GONE);
                    buttonMax.setVisibility(View.GONE);
                    buttonMin.setVisibility(View.GONE);
                    buttonMode.setText(R.string._advanced_scientific);
                } else {
                    buttonMod.setVisibility(View.VISIBLE);
                    buttonPow.setVisibility(View.VISIBLE);
                    buttonMax.setVisibility(View.VISIBLE);
                    buttonMin.setVisibility(View.VISIBLE);
                    buttonMode.setText(R.string._standard);
                }


            }
        });

        buttonMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resultReturned) {
                    resultTextView.setText("");
                    resultReturned = false;
                }

                if(!result.maxSize(resultTextView.getText().toString())) {
                    resultTextView.setText(String.format("%s%% ", resultTextView.getText()));
                }
            }
        });

        buttonPow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resultReturned) {
                    resultTextView.setText("");
                    resultReturned = false;
                }

                if(!result.maxSize(resultTextView.getText().toString())) {
                    resultTextView.setText(String.format("%sPOW ", resultTextView.getText()));
                }
            }
        });

        buttonMax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resultReturned) {
                    resultTextView.setText("");
                    resultReturned = false;
                }

                if(!result.maxSize(resultTextView.getText().toString())) {
                    resultTextView.setText(String.format("%sMAX ", resultTextView.getText()));
                }
            }
        });

        buttonMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resultReturned) {
                    resultTextView.setText("");
                    resultReturned = false;

                }

                if(!result.maxSize(resultTextView.getText().toString())) {
                    resultTextView.setText(String.format("%sMIN ", resultTextView.getText()));
                }
            }
        });
    }

}