package polinema.ac.id.dtschapter03_starter;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class WelcomeSlideSuperhero extends Fragment {

//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_welcome_slide_superhero);
//
//
//    }
//
//    public void clickGetStarted(View view) {
//        Intent i = new Intent(WelcomeSlideSuperhero.this, WelcomeSlideAssign.class);
//        startActivity(i);
//    }
//
//    public void clickLogin(View view) {
//        Intent i = new Intent(WelcomeSlideSuperhero.this, WelcomeBack.class);
//        startActivity(i);
//    }

    Button BtnGetStart;
    TextView TvLoginText;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.activity_welcome_slide_superhero, container, false);

        BtnGetStart = (Button) rootView.findViewById(R.id.btn_get_started);
        clickGetStarted();

        TvLoginText = (TextView) rootView.findViewById(R.id.login_text);
        clickLogin();

        return rootView;
    }

    public void clickGetStarted() {

        BtnGetStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), WelcomeBack.class);
                startActivity(i);

//                Toast.makeText(getActivity(),"ini",Toast.LENGTH_LONG).show();
            }
        });

    }

    public void clickLogin() {

        TvLoginText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), WelcomeBack.class);
                startActivity(i);
            }
        });


    }

}
