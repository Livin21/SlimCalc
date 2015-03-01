package com.lmntrx.slimcalc;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn0;
    Button btnAdd;
    Button btnSub;
    Button btnMultiply;
    Button btnDivide;
    Button btnClear;
    Button btnA;
    Button btnB;
    Button btnC;
    Button btnEquals;
    Button btnDot;
    TextView Display;
    String operator="";
    double a=0;
    String lastPress="";
    String op="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btn0=(Button)findViewById(R.id.btn0);
        btnA=(Button)findViewById(R.id.storeA);
        btnB=(Button)findViewById(R.id.storeB);
        btnC=(Button)findViewById(R.id.storeC);
        btnClear=(Button)findViewById(R.id.btnClear);
        btnAdd=(Button)findViewById(R.id.btnAdd);
        btnSub=(Button)findViewById(R.id.btnSub);
        btnDivide=(Button)findViewById(R.id.btnDivide);
        btnMultiply=(Button)findViewById(R.id.btnMultiply);
        btnDot=(Button)findViewById(R.id.btnDot);
        btnEquals=(Button)findViewById(R.id.btnEqual);
        Display=(TextView)findViewById(R.id.display);
        /*View.OnClickListener bt_Click=new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                readAndDisplay(v);
            }
        };
        btn1.setOnClickListener(bt_Click);*/
        /*View.OnClickListener bt_Click=new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                Toast.makeText(getApplicationContext(),"You tapped 1", Toast.LENGTH_LONG).show();
                display.setText(display.getText()+"1");

            }
        };
        btn1.setOnClickListener(bt_Click);*/
    }

        public void readAndDisplay(View v) {
            if(lastPress.equals("=")) {
                clearAll();
                lastPress="";
            }
            switch(v.getId())
                {
                    case R.id.btn0:
                        if(lastPress.equals("+")||lastPress.equals("-")||lastPress.equals("*")||lastPress.equals("/")){
                            clearAll();
                            lastPress="";
                        }
                        Display.setText(Display.getText()+"0");
                        break;
                    case R.id.btn1:
                        if(lastPress.equals("+")||lastPress.equals("-")||lastPress.equals("*")||lastPress.equals("/")){
                            clearAll();
                            lastPress="";
                        }
                        Display.setText(Display.getText()+"1");
                        break;
                    case R.id.btn2:
                        if(lastPress.equals("+")||lastPress.equals("-")||lastPress.equals("*")||lastPress.equals("/")){
                            clearAll();
                            lastPress="";
                        }
                        Display.setText(Display.getText()+"2");
                        break;
                    case R.id.btn3:
                        if(lastPress.equals("+")||lastPress.equals("-")||lastPress.equals("*")||lastPress.equals("/")){
                            clearAll();
                            lastPress="";
                        }
                        Display.setText(Display.getText()+"3");
                        break;
                    case R.id.btn4:
                        if(lastPress.equals("+")||lastPress.equals("-")||lastPress.equals("*")||lastPress.equals("/")){
                            clearAll();
                            lastPress="";
                        }
                        Display.setText(Display.getText()+"4");
                        break;
                    case R.id.btn5:
                        if(lastPress.equals("+")||lastPress.equals("-")||lastPress.equals("*")||lastPress.equals("/")){
                            clearAll();
                            lastPress="";
                        }
                        Display.setText(Display.getText()+"5");
                        break;
                    case R.id.btn6:
                        if(lastPress.equals("+")||lastPress.equals("-")||lastPress.equals("*")||lastPress.equals("/")){
                            clearAll();
                            lastPress="";
                        }
                        Display.setText(Display.getText()+"6");
                        break;
                    case R.id.btn7:
                        if(lastPress.equals("+")||lastPress.equals("-")||lastPress.equals("*")||lastPress.equals("/")){
                            clearAll();
                            lastPress="";
                        }
                        Display.setText(Display.getText()+"7");
                        break;
                    case R.id.btn8:
                        if(lastPress.equals("+")||lastPress.equals("-")||lastPress.equals("*")||lastPress.equals("/")){
                            clearAll();
                            lastPress="";
                        }
                        Display.setText(Display.getText()+"8");
                        break;
                    case R.id.btn9:
                        if(lastPress.equals("+")||lastPress.equals("-")||lastPress.equals("*")||lastPress.equals("/")){
                            clearAll();
                            lastPress="";
                        }
                        Display.setText(Display.getText()+"9");
                        break;

                }

            }
    public void add(View v){
        //Toast.makeText(getApplicationContext(),"Here",Toast.LENGTH_LONG).show();
        if(operator.equals("+")){
            //Toast.makeText(getApplicationContext(),"Here1",Toast.LENGTH_LONG).show();
            a+=Double.parseDouble(Display.getText()+"");
            operator="+";
            lastPress="+";
            btnDot.setEnabled(true);
        }
        else if(operator.equals("-")){
            a-=Double.parseDouble(Display.getText()+"");
            operator="+";
            lastPress="+";
            btnDot.setEnabled(true);
        }
        else if(operator.equals("*")){
            a*=Double.parseDouble(Display.getText()+"");
            operator="+";
            lastPress="+";
            btnDot.setEnabled(true);
        }
        else if(operator.equals("/")){
            a/=Double.parseDouble(Display.getText()+"");
            operator="+";
            lastPress="+";
            btnDot.setEnabled(true);
        }
        else{
            //Toast.makeText(getApplicationContext(),"Here2",Toast.LENGTH_LONG).show();
            a=Double.parseDouble(Display.getText()+"");
            operator="+";
            lastPress="+";
            btnDot.setEnabled(true);
        }
        //a+=Double.parseDouble(Display.getText()+"");
        //clearAll();

    }
    public void sub(View v){
        //Toast.makeText(getApplicationContext(),"Here",Toast.LENGTH_LONG).show();
        if(operator.equals("+")){
            //Toast.makeText(getApplicationContext(),"Here1",Toast.LENGTH_LONG).show();
            a+=Double.parseDouble(Display.getText()+"");
            operator="-";
            lastPress="-";
            btnDot.setEnabled(true);
        }
        else if(operator.equals("-")){
            a-=Double.parseDouble(Display.getText()+"");
            operator="-";
            lastPress="-";
            btnDot.setEnabled(true);
        }
        else if(operator.equals("*")){
            a*=Double.parseDouble(Display.getText()+"");
            operator="-";
            lastPress="-";
            btnDot.setEnabled(true);
        }
        else if(operator.equals("/")){
            a/=Double.parseDouble(Display.getText()+"");
            operator="-";
            lastPress="-";
            btnDot.setEnabled(true);
        }
        else{
            //Toast.makeText(getApplicationContext(),"Here2",Toast.LENGTH_LONG).show();
            a=Double.parseDouble(Display.getText()+"");
            operator="-";
            lastPress="-";
            btnDot.setEnabled(true);
        }
        //a+=Double.parseDouble(Display.getText()+"");
        //clearAll();

    }
    public void multiply(View v){
        //Toast.makeText(getApplicationContext(),"Here",Toast.LENGTH_LONG).show();
        if(operator.equals("+")){
            //Toast.makeText(getApplicationContext(),"Here1",Toast.LENGTH_LONG).show();
            a+=Double.parseDouble(Display.getText()+"");
            operator="*";
            lastPress="*";
            btnDot.setEnabled(true);
        }
        else if(operator.equals("-")){
            a-=Double.parseDouble(Display.getText()+"");
            operator="*";
            btnDot.setEnabled(true);
            lastPress="*";
        }
        else if(operator.equals("*")){
            a*=Double.parseDouble(Display.getText()+"");
            operator="*";
            lastPress="*";
            btnDot.setEnabled(true);
        }
        else if(operator.equals("/")){
            a/=Double.parseDouble(Display.getText()+"");
            operator="*";
            lastPress="*";
            btnDot.setEnabled(true);
        }
        else{
            //Toast.makeText(getApplicationContext(),"Here2",Toast.LENGTH_LONG).show();
            a=Double.parseDouble(Display.getText()+"");
            operator="*";
            lastPress="*";
            btnDot.setEnabled(true);
        }
        //a+=Double.parseDouble(Display.getText()+"");
        //clearAll();

    }
    public void divide(View v){
        //Toast.makeText(getApplicationContext(),"Here",Toast.LENGTH_LONG).show();
        if(operator.equals("+")){
            //Toast.makeText(getApplicationContext(),"Here1",Toast.LENGTH_LONG).show();
            a+=Double.parseDouble(Display.getText()+"");
            operator="/";
            lastPress="/";
            btnDot.setEnabled(true);
        }
        else if(operator.equals("-")){
            a-=Double.parseDouble(Display.getText()+"");
            operator="/";
            lastPress="/";
            btnDot.setEnabled(true);
        }
        else if(operator.equals("*")){
            a*=Double.parseDouble(Display.getText()+"");
            operator="/";
            lastPress="/";
            btnDot.setEnabled(true);
        }
        else if(operator.equals("/")){
            a/=Double.parseDouble(Display.getText()+"");
            operator="/";
            lastPress="/";
            btnDot.setEnabled(true);
        }
        else{
            //Toast.makeText(getApplicationContext(),"Here2",Toast.LENGTH_LONG).show();
            a=Double.parseDouble(Display.getText()+"");
            operator="/";
            lastPress="/";
            btnDot.setEnabled(true);
        }
        //a+=Double.parseDouble(Display.getText()+"");
        //clearAll();

    }

    public void equal(View v){
        switch (operator){
            case "+":{
                Display.setText(Double.parseDouble(Display.getText()+"")+a+"");
                break;
            }
            case "-":{
                Display.setText(a-Double.parseDouble(Display.getText()+"")+"");
                break;
            }
            case "*":{
                Display.setText(a*Double.parseDouble(Display.getText()+"")+"");
                break;
            }
            case "/":{
                Display.setText(a/Double.parseDouble(Display.getText()+"")+"");
                break;
            }
        }
       // Display.setText(Double.parseDouble(Display.getText()+"")+a+"");
        a=0;
        lastPress="=";
        operator="";
        btnDot.setEnabled(true);
    }
    public void decimal(View v){
        if(lastPress.equals("=")) {
            clearAll();
            lastPress="";
        }
        Display.append(".");
        btnDot.setEnabled(false);
    }

    public void clearAll(){
        Display.setText("");
    }
    public void back(View v){

        String h=Display.getText()+"",k="";
        int l=h.length();
        int i=0,j=0;
        while(i<(l-1)){
            k+=h.charAt(i);
            i++;
        }
        Display.setText(k);
        k="";
        while(j<k.length()){
            if(k.charAt(j)!='.')
                btnDot.setEnabled(true);
            else {
                btnDot.setEnabled(false);
                break;
            }
            j++;
        }

    }



    }



