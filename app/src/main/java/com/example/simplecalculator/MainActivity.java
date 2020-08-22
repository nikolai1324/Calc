package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button num0;
    Button num1;
    Button num2;
    Button num3;
    Button num4;
    Button num5;
    Button num6;
    Button num7;
    Button num8;
    Button num9;

    Button bAC;
    Button bDel;

    Button bAdd;
    Button bSub;
    Button bMul;
    Button bDiv;

    Button bDot;
    Button bEquals;

    TextView fResult;
    EditText rInput;

    double val1 = Double.NaN;

    public static double operDoer(double a, double b, String s)
    {
        if(s.equals("a"))
        {
            return (a + b);
        }
        else if(s.equals("s"))
        {
            return (a - b);
        }
        else if(s.equals("m"))
        {
            return (a * b);
        }
        else
        {
            return (a / b);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num0 = (Button) findViewById(R.id.num0);
        num1 = (Button) findViewById(R.id.num1);
        num2 = (Button) findViewById(R.id.num2);
        num3 = (Button) findViewById(R.id.num3);
        num4 = (Button) findViewById(R.id.num4);
        num5 = (Button) findViewById(R.id.num5);
        num6 = (Button) findViewById(R.id.num6);
        num7 = (Button) findViewById(R.id.num7);
        num8 = (Button) findViewById(R.id.num8);
        num9 = (Button) findViewById(R.id.num9);
        bDot = (Button) findViewById(R.id.bDot);

        bAC = (Button) findViewById(R.id.bAC);
        bDel = (Button) findViewById(R.id.bDel);

        bAdd = (Button) findViewById(R.id.bAdd);
        bSub = (Button) findViewById(R.id.bSub);
        bMul = (Button) findViewById(R.id.bMul);
        bDiv = (Button) findViewById(R.id.bDiv);
        bEquals = (Button) findViewById(R.id.bEquals);

        fResult = (TextView) findViewById(R.id.fResult);
        rInput = (EditText) findViewById(R.id.rInput);

        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rInput.setText(rInput.getText() + "0");
            }
        });

        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rInput.setText(rInput.getText() + "0");
            }
        });

        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rInput.setText(rInput.getText() + "1");
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rInput.setText(rInput.getText() + "2");
            }
        });

        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rInput.setText(rInput.getText() + "3");
            }
        });

        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rInput.setText(rInput.getText() + "4");
            }
        });

        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rInput.setText(rInput.getText() + "5");
            }
        });

        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rInput.setText(rInput.getText() + "6");
            }
        });

        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rInput.setText(rInput.getText() + "7");
            }
        });

        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rInput.setText(rInput.getText() + "8");
            }
        });

        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rInput.setText(rInput.getText() + "9");
            }
        });

        bDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rInput.setText(rInput.getText() + ".");
            }
        });

        bAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rInput.setText("");
                fResult.setText("");
                val1 = Double.NaN;
            }
        });

        bDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNum = rInput.getText().toString();
                if (strNum.length() > 0) {
                    strNum = strNum.substring(0, strNum.length() - 1);
                }
                rInput.setText(strNum);
            }
        });

        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rInput.setText(rInput.getText() + "+");
            }
        });

        bSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rInput.setText(rInput.getText() + "-");
            }
        });

        bMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rInput.setText(rInput.getText() + "*");
            }
        });

        bDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rInput.setText(rInput.getText() + "/");
            }
        });


        bEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = rInput.getText().toString();
                str = str + "z";
                if(!(Double.isNaN(val1)))
                {
                    str = Double.toString(val1) + str;
                }
                int a = 0;
                int b = 0;
                int n = 0;
                for (int k = 0; k < str.length(); k++) {
                    if ((str.substring(k, k + 1).equals("+")) || (str.substring(k, k + 1).equals("-")) || (str.substring(k, k + 1).equals("*")) || (str.substring(k, k + 1).equals("/"))) {
                        n++;
                        if (str.substring(k, k + 1).equals("+")) {
                            str = str.replaceFirst("\\+", "a");
                        } else if (str.substring(k, k + 1).equals("-")) {
                            str = str.replaceFirst("-", "s");
                        } else if (str.substring(k, k + 1).equals("*")) {
                            str = str.replaceFirst("\\*", "m");
                        } else {
                            str = str.replaceFirst("/", "d");
                        }
                    }
                }
                int i = 0;
                String strActive = "";
                for (int c = 0; c < n; c++) {
                    i = 0;
                    while (!(str.substring(i, i + 1).equals("a") || str.substring(i, i + 1).equals("s") || str.substring(i, i + 1).equals("m") || str.substring(i, i + 1).equals("d"))) {
                        i++;
                    }
                    a = i;
                    int j = a + 1;
                    while (!(str.substring(j, j + 1).equals("a") || str.substring(j, j + 1).equals("s") || str.substring(j, j + 1).equals("m") || str.substring(j, j + 1).equals("d") || j == str.length() - 1)) {
                        j++;
                    }
                    b = j;
                    strActive = Double.toString(operDoer(Double.parseDouble(str.substring(0, a)), Double.parseDouble(str.substring(a + 1, b)), str.substring(a, a + 1)));
                    str = str.replaceFirst(str.substring(0, b), strActive);
                }

                fResult.setText(str.substring(0, str.length() - 1));
                val1 = Double.parseDouble(str.substring(0, str.length() - 1));
                rInput.setText("");
            }

        });
    }
}