package fall2018.csc2017.slidingtiles;

import android.support.v7.app.AppCompatActivity;

import java.util.Observable;
import java.util.Observer;

public class PlayMemoryPuzzleActivity extends AppCompatActivity implements Observer {

    /**
     * Set up the background image for each button based on the master list
     * of positions, and then call the adapter to set the view.
     */
    // Display
    public void display() {

    }

    @Override
    public void update(Observable o, Object arg) {
        display();
    }
}


