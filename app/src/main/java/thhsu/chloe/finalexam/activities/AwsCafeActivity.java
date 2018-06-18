package thhsu.chloe.finalexam.activities;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import thhsu.chloe.finalexam.AwsCafeContract;
import thhsu.chloe.finalexam.AwsCafePresenter;
import thhsu.chloe.finalexam.R;

/**
 * Created by Chloe on 6/18/2018.
 */

public class AwsCafeActivity extends BaseActivity implements AwsCafeContract.View, BottomNavigationView.OnNavigationItemSelectedListener {
    private AwsCafeContract.Presenter mPresenter;
    private Toolbar mToolbar;
    private BottomNavigationView mBottomNavigationView;

    @Override
    public void setPresenter(AwsCafeContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    private void init(){
        setContentView(R.layout.activity_main);
        setToolbar();
        setBottomNavigationView();
        mPresenter = new AwsCafePresenter(this, getSupportFragmentManager());
        mPresenter.start();

    }

    private void setBottomNavigationView(){
        mBottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        mBottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    private void setToolbar() {
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_home:
                mPresenter.transToHome();
                break;

            case R.id.action_order_list:
                mPresenter.transToOrderList();
                break;
        }

        return true;
    }
}
