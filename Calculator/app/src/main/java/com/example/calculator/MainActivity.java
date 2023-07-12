package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView editText;
    TextView textView;
    Button ac;
    Button openB;
    Button closeB;
    Button div;
    Button mul;
    Button add;
    Button sub;
    Button eqls;
    Button zero;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button deci;
    Button clr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.edittext);

        textView = findViewById(R.id.textView2);
        ac=findViewById(R.id.button2);
        openB=findViewById(R.id.button4);
        closeB=findViewById(R.id.button);
        div=findViewById(R.id.button3);
        seven=findViewById(R.id.button5);
        eight=findViewById(R.id.button6);
        nine=findViewById(R.id.button7);
        mul=findViewById(R.id.button8);
        four=findViewById(R.id.button9);
        five=findViewById(R.id.button10);
        six=findViewById(R.id.button11);
        sub=findViewById(R.id.button12);
        one=findViewById(R.id.button13);
        two=findViewById(R.id.button14);
        three=findViewById(R.id.button15);
        add=findViewById(R.id.button16);
        clr=findViewById(R.id.button17);
        zero=findViewById(R.id.button18);
        deci=findViewById(R.id.button19);
        eqls=findViewById(R.id.button20);

        final String[] str = {""};
        openB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str[0] = equation(str[0],openB);
                editText.setText(str[0]);
            }
        });

        closeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str[0] = equation(str[0],closeB);
                editText.setText(str[0]);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str[0] = equation(str[0],mul);
                editText.setText(str[0]);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str[0] = equation(str[0],div);
                editText.setText(str[0]);
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str[0] = equation(str[0],add);
                editText.setText(str[0]);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str[0] = equation(str[0],sub);
                editText.setText(str[0]);
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str[0] = equation(str[0],one);
                editText.setText(str[0]);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str[0] = equation(str[0],two);
                editText.setText(str[0]);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str[0] = equation(str[0],three);
                editText.setText(str[0]);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str[0] = equation(str[0],four);
                editText.setText(str[0]);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str[0] = equation(str[0],five);
                editText.setText(str[0]);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str[0] = equation(str[0],six);
                editText.setText(str[0]);
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str[0] = equation(str[0],seven);
                editText.setText(str[0]);
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str[0] = equation(str[0],eight);
                editText.setText(str[0]);
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str[0] = equation(str[0],nine);
                editText.setText(str[0]);
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str[0] = equation(str[0],zero);
                editText.setText(str[0]);
            }
        });
        deci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str[0] = equation(str[0],deci);
                editText.setText(str[0]);
            }
        });


        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str[0] = "";
                editText.setText(str[0]);
                textView.setText(str[0]);
            }
        });
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(str[0].length()!=0){
                    str[0]=str[0].substring(0,str[0].length()-1);
                    editText.setText(str[0]);
                }

            }
        });

        eqls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eval(str[0])!=0){
                    textView.setText(str[0]);
                    str[0]=eval(str[0])+"";
                    editText.setText(str[0]);
                }
                else {
                    str[0]="";
                    textView.setText("");
                    editText.setText("");
                }

            }
        });
    }
    String equation(String str,Button btn){

        str = str + btn.getText().toString();
        return str;
    }


    double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) {
                    Toast.makeText(MainActivity.this, "Unexpected: " + (char) ch, Toast.LENGTH_SHORT).show();
                    return 0;
                }
                return x;
            }

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return +parseFactor();
                if (eat('-')) return -parseFactor();

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    if (!eat(')')) {
                        Toast.makeText(MainActivity.this, "Missing ')'", Toast.LENGTH_SHORT).show();
                        return 0;

                    }
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    if (eat('(')) {
                        x = parseExpression();
                        if (!eat(')')) {
                            Toast.makeText(MainActivity.this, "Missing ')'", Toast.LENGTH_SHORT).show();
                            return 0;

                        }
                    } else {
                        x = parseFactor();
                    }

                } else {
                    Toast.makeText(MainActivity.this, "Wrong input", Toast.LENGTH_SHORT).show();
                    return 0;
                }

                if (eat('^')) x = Math.pow(x, parseFactor());

                return x;
            }
        }.parse();
    }
}