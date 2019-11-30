package com.example.aluno.caracoroa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MoedaActivity extends AppCompatActivity {
   Button btnJogar;
    ImageView imgView1;
    Random r;
    int ladoDaMoeda;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moeda);

        btnJogar = (Button) findViewById(R.id.button);
        imgView1 = (ImageView) findViewById(R.id.imageView);
        r = new Random();
        btnJogar.setOnClickListener(new View.OnClickListener() {
                 @Override
                         public void onClick(View view){
                     ladoDaMoeda = r.nextInt(2);
                     if(ladoDaMoeda == 0){
                         imgView1.setImageResource(R.drawable.cara);
                         Toast.makeText(MoedaActivity.this,"Cara!!!",Toast.LENGTH_SHORT).show();
                     }else{
                         imgView1.setImageResource(R.drawable.coroa);
                         Toast.makeText(MoedaActivity.this,"Coroa!!!",Toast.LENGTH_SHORT).show();
                     }
                     RotateAnimation rodar = new RotateAnimation(0, 360,RotateAnimation.RELATIVE_TO_SELF, 0.5f,
                             RotateAnimation.RELATIVE_TO_SELF,0.5f);
                     rodar.setDuration(1000);
                     imgView1.startAnimation(rodar);
                 }

        });
    }
}
