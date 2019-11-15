package id.udibara.santoso.budi.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvSahabat;
    private ArrayList<Sahabat> list = new ArrayList<>();
    private String title = "Mode List";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBarTitle(title);

        rvSahabat = findViewById(R.id.rv_sahabat);
        rvSahabat.setHasFixedSize(true);

        list.addAll(SahabatData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvSahabat.setLayoutManager(new LinearLayoutManager(this));
        ListSahabatAdapter listSahabatAdapter = new ListSahabatAdapter(list);
        rvSahabat.setAdapter(listSahabatAdapter);
    }

    private void showRecyclerGrid() {
        rvSahabat.setLayoutManager(new GridLayoutManager(this, 2));
        GridSahabatAdapter gridSahabatAdapter = new GridSahabatAdapter(list);
        rvSahabat.setAdapter(gridSahabatAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list:
                title = "Mode List";
                showRecyclerList();
                break;

            case R.id.action_grid:
                title = "Mode Grid";
                showRecyclerGrid();
                break;

            case R.id.action_cardview:
                title = "Mode CardView";
                showRecyclerCardView();
                break;
        }
        setActionBarTitle(title);
    }

        private void showRecyclerCardView () {
            rvSahabat.setLayoutManager(new LinearLayoutManager(this));
            CardViewSahabatAdapter cardViewSahabatAdapter = new CardViewSahabatAdapter(list);
            rvSahabat.setAdapter(cardViewSahabatAdapter);
        }

        private void setActionBarTitle(String title) {
            if (getSupportActionBar() != null) {
                getSupportActionBar().setTitle(title);
            }
        }
    }