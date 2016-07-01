package androidpro.com.br.aulaapp8tab;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ActionBar.Tab mTab1;
    private ActionBar.Tab mTab2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        mTab1 = actionBar.newTab().setText("Tab 1").setTabListener(new
                NavTabListener());
        mTab2 = actionBar.newTab().setText("Tab 2").setTabListener(new
                NavTabListener());
        actionBar.addTab(mTab1);
        actionBar.addTab(mTab2);
    }

    public void showFragmentA() {
        AFragment aFragment = new AFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.layout_container, aFragment);
        ft.addToBackStack("fragment a");
        //ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.commit();
    }

    public void showFragmentB() {
        BFragment bFragment = new BFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.layout_container, bFragment);
        ft.addToBackStack("fragment b");
        //ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.commit();
    }


    private class NavTabListener implements ActionBar.TabListener {

        @Override
        public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {
        }

        @Override
        public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
            if (tab.equals(mTab1)) {
                showFragmentA();
            } else {
                showFragmentB();
            }
        }

        @Override
        public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
        }
    }
}
