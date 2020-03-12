package cl.puntogestion.dogapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import java.util.List;

public class MainActivity extends AppCompatActivity implements DogFragment.OnListFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onListFragmentInteraction(List<String> lista) {

    }
}
