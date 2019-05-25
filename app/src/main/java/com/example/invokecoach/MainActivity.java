package com.example.invokecoach;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.invokecoach.presenters.MainPresenter;

public class MainActivity extends AppCompatActivity implements IMainView{

    private MainPresenter mainPresenter;

    private ImageButton quasButton;
    private ImageButton wexButton;
    private ImageButton exortButton;
    private ImageButton invokeButton;

    private ImageView heroImageView;
    private ImageView skillImageView;

    private TextView taskComboTextView;
    private TextView userCastComboTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainPresenter = new MainPresenter(this);

        quasButton = (ImageButton) findViewById(R.id.quasButton);
        wexButton = (ImageButton) findViewById(R.id.wexButton);
        exortButton = (ImageButton) findViewById(R.id.exortButton);
        invokeButton = (ImageButton) findViewById(R.id.invokeButton);

        heroImageView = (ImageView) findViewById(R.id.heroImageView);
        skillImageView = (ImageView) findViewById(R.id.skillImageView);

        taskComboTextView = findViewById(R.id.taskComboTextView);
        userCastComboTextView = findViewById(R.id.userCastComboTextView);

        mainPresenter.init();

        quasButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainPresenter.quasSphereWasClicked();
            }
        });

        wexButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainPresenter.wexSphereWasClicked();
            }
        });

        exortButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainPresenter.exortSphereWasClicked();
            }
        });

        invokeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainPresenter.invokeSpheresWasClicked();
            }
        });

    }

    @Override
    public void setSkillImage(int imageId) {
        skillImageView.setImageResource(imageId);
    }

    @Override
    public void setUserCastCombo(String combo) {
        userCastComboTextView.setText(combo);
    }

    @Override
    public void setTaskCastCombo(String combo) {
        taskComboTextView.setText(combo);
    }
}
