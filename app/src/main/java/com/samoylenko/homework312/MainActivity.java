package com.samoylenko.homework312;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn0;
    private Button point;
    private Button minus;
    private Button pluse;
    private Button clear;
    private Button delete;
    private Button res;
    private Button percent;
    private Button plmin;
    private Button multiply;
    private TextView textView;

    public StringBuffer sb = new StringBuffer("");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init(){
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
        btn9 = findViewById(R.id.button9);
        btn0 = findViewById(R.id.button0);
        point = findViewById(R.id.button_point);
        minus = findViewById(R.id.button_minus);
        pluse = findViewById(R.id.button_pl);
        clear = findViewById(R.id.button_clear);
        delete = findViewById(R.id.button_del);
        res  = findViewById(R.id.button_res);
        percent = findViewById(R.id.button_percent);
        plmin = findViewById(R.id.button_plmin);
        multiply = findViewById(R.id.button_x);
        textView = findViewById(R.id.textView);

        //один обработчик на все кнопки
        View.OnClickListener oclBtn = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // по id определеяем кнопку, вызвавшую этот обработчик
                switch (v.getId()) {
                    case R.id.button1:
                        textView.setText(valueResult((String) btn1.getText()));
                        break;
                    case R.id.button2:
                        textView.setText(valueResult((String) btn2.getText()));
                        break;
                    case R.id.button3:
                        textView.setText(valueResult((String) btn3.getText()));
                        break;
                    case R.id.button4:
                        textView.setText(valueResult((String) btn4.getText()));
                        break;
                    case R.id.button5:
                        textView.setText(valueResult((String) btn5.getText()));
                        break;
                    case R.id.button6:
                        textView.setText(valueResult((String) btn6.getText()));
                        break;
                    case R.id.button7:
                        textView.setText(valueResult((String) btn7.getText()));
                        break;
                    case R.id.button8:
                        textView.setText(valueResult((String) btn8.getText()));
                        break;
                    case R.id.button9:
                        textView.setText(valueResult((String) btn9.getText()));
                        break;
                    case R.id.button0:
                        textView.setText(valueResult((String) btn0.getText()));
                        break;
                    case R.id.button_point:
                        textView.setText(valueResult((String) point.getText()));
                        break;
                    case R.id.button_minus:
                        textView.setText(valueResult((String) minus.getText()));
                        break;
                    case R.id.button_pl:
                        textView.setText(valueResult((String) pluse.getText()));
                        break;
                    case R.id.button_clear:
                        textView.setText("");
                        sb.delete(0, sb.length());
                        break;
                    case R.id.button_del:
                        textView.setText(valueResult((String) delete.getText()));
                        break;
                    case R.id.button_res:
                        textView.setText(valueResult((String) res.getText()));
                        break;
                    case R.id.button_percent:
                        textView.setText(valueResult((String) percent.getText()));
                        break;
                    case R.id.button_plmin:
                        textView.setText(valueResult((String) plmin.getText()));
                        break;
                    case R.id.button_x:
                        textView.setText(valueResult((String) multiply.getText()));
                        break;
                    default:
                        break;
                }
            }
        };

        btn1.setOnClickListener(oclBtn);
        btn2.setOnClickListener(oclBtn);
        btn3.setOnClickListener(oclBtn);
        btn4.setOnClickListener(oclBtn);
        btn5.setOnClickListener(oclBtn);
        btn6.setOnClickListener(oclBtn);
        btn7.setOnClickListener(oclBtn);
        btn8.setOnClickListener(oclBtn);
        btn9.setOnClickListener(oclBtn);
        btn0.setOnClickListener(oclBtn);
        point.setOnClickListener(oclBtn);
        minus.setOnClickListener(oclBtn);
        pluse.setOnClickListener(oclBtn);
        clear.setOnClickListener(oclBtn);
        delete.setOnClickListener(oclBtn);
        res.setOnClickListener(oclBtn);
        percent.setOnClickListener(oclBtn);
        plmin.setOnClickListener(oclBtn);
        multiply.setOnClickListener(oclBtn);
    }

    public StringBuffer valueResult(String value){
        sb.insert(sb.length(),value);
        if (sb.length()>8){
            sb.delete(0, sb.length());
            return sb.insert(sb.length(),"many symbols");
        }else{
            return sb;
        }
    }
}
