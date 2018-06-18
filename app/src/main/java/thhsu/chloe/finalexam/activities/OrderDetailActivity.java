package thhsu.chloe.finalexam.activities;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import thhsu.chloe.finalexam.AwsCafePresenter;
import thhsu.chloe.finalexam.OrderDetails.OrderDetailsContract;
import thhsu.chloe.finalexam.OrderDetails.OrderDetailsPresenter;
import thhsu.chloe.finalexam.R;

/**
 * Created by Chloe on 6/18/2018.
 */

public class OrderDetailActivity extends BaseActivity implements OrderDetailsContract.View{
    private Toolbar mToolbar;
    private OrderDetailsContract.Presenter mPresenter;

    @Override
    public void setPresenter(OrderDetailsContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    private void init(){
        setContentView(R.layout.activity_order_details);
        setToolbar();
        mPresenter = new OrderDetailsPresenter(this);
        mPresenter.start();
    }

    private void setToolbar() {
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
//        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }
}
