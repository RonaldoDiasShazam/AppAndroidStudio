package com.example.aluno.game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.HashMap;
import java.util.HashSet;


import javax.swing.*;

public class MainActivityPrincipal extends AppCompatActivity {

    private int height, width;
    private Time t = new Timer(5, this);
    private boolean first;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_principal);



    }
}
