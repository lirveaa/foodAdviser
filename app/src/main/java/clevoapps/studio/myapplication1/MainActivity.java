package clevoapps.studio.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends Activity {

    private FoodExpert expert = new FoodExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindFood(View view){
        TextView food_names = (TextView)findViewById(R.id.dishName);
        Spinner color = (Spinner)findViewById(R.id.color);
        String dishType = String.valueOf(color.getSelectedItem());

        // Recommendation from FoodExpert class
        List<String> list_food = expert.getDishes(dishType);
        StringBuilder foodFormatted = new StringBuilder();
        for(String food : list_food){
            foodFormatted.append(food).append("\n");
        }

        food_names.setText(foodFormatted);
    }
}