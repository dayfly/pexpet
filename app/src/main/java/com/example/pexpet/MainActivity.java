package com.example.pexpet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView text1,text2;
    CheckBox chkAgree;
    RadioGroup rGroup1;
    RadioButton rdoDog, rdoCat, rdoRabbit;
    Button btnOk;
    ImageView imgPet;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("애완동울 사진 보기 ");
        text1 = (TextView)findViewById(R.id.editText);
        text2 = (TextView)findViewById(R.id.editText2);
        chkAgree=(CheckBox)findViewById(R.id.checkBox);
        rGroup1=(RadioGroup)findViewById(R.id.RadioGroup1);
        rdoCat=(RadioButton)findViewById(R.id.rdocat);
        rdoDog=(RadioButton)findViewById(R.id.rdoDog);
        rdoRabbit=(RadioButton)findViewById(R.id.rdoRabbit);
        btnOk=(Button)findViewById(R.id.btnOK);
        imgPet=(ImageView)findViewById(R.id.imgPet);

        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(chkAgree.isChecked() == true) {
                    text2.setVisibility(View.VISIBLE);
                    rGroup1.setVisibility(View.VISIBLE);
                    btnOk.setVisibility(View.VISIBLE);
                    imgPet.setVisibility(View.VISIBLE);
                }else{
                    text2.setVisibility(View.INVISIBLE);
                    rGroup1.setVisibility(View.INVISIBLE);
                    btnOk.setVisibility(View.INVISIBLE);
                    imgPet.setVisibility(View.INVISIBLE);
                }
            }

        });
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id = rGroup1.getCheckedRadioButtonId();
                switch (id) {
                case R.id.rdoDog:
                imgPet.setImageResource(R.drawable.dog);
                break;
                case R.id.rdocat:
                imgPet.setImageResource(R.drawable.cat);
                break;
                case R.id.rdoRabbit:
                imgPet.setImageResource(R.drawable.rabbit);
                break;
                default:
                Toast.makeText(getApplicationContext(),"동물을 먼저 선택하세요.", Toast.LENGTH_SHORT).show();
                }
            }
                });
            }
    }
