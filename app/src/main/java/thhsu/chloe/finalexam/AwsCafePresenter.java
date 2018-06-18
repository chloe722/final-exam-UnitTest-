package thhsu.chloe.finalexam;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;


import thhsu.chloe.finalexam.OrderList.OrderListFragment;
import thhsu.chloe.finalexam.OrderList.OrderListPresenter;
import thhsu.chloe.finalexam.home.HomeFragment;
import thhsu.chloe.finalexam.home.HomePresenter;

/**
 * Created by Chloe on 6/18/2018.
 */

public class AwsCafePresenter implements AwsCafeContract.Presenter {

    private FragmentManager mFragmentManager;
    private AwsCafeContract.View mView;
    private static final String HOME = "HOME";
    private static final String ORDERLIST = "ORDERLIST";

    private OrderListFragment mOrderListFragment;
    private HomeFragment mHomeFragment;

    private OrderListPresenter mOrderListPresenter;
    private HomePresenter mHomePresenter;


    public AwsCafePresenter(AwsCafeContract.View view, FragmentManager fragmentManager) {
        mView = view;
        if(view != null){
            mView.setPresenter(this);
        }

        mFragmentManager = fragmentManager;
    }

    @Override
    public void start() {
        transToHome();
    }

    @Override
    public void transToHome() {
        FragmentTransaction transaction = mFragmentManager.beginTransaction();
        if (mHomeFragment == null) mHomeFragment = HomeFragment.newInstance();
        if (mOrderListFragment != null) transaction.hide(mOrderListFragment);
        if (!mHomeFragment.isAdded()) {
            transaction.add(R.id.main_container_for_fragment, mHomeFragment, HOME);
        } else {
            transaction.show(mHomeFragment);
        }
        transaction.commit();
        if (mHomePresenter == null) {
            mHomePresenter = new HomePresenter(mHomeFragment);
        }
    }

    @Override
    public void transToOrderList() {
        FragmentTransaction transaction = mFragmentManager.beginTransaction();
        if (mOrderListFragment == null) mOrderListFragment = OrderListFragment.newInstance();
        if (mHomeFragment != null) transaction.hide(mHomeFragment);

        if (!mOrderListFragment.isAdded()) {
            transaction.add(R.id.main_container_for_fragment, mOrderListFragment, ORDERLIST);
        } else {
            transaction.show(mOrderListFragment);
        }
        transaction.commit();

        if (mOrderListPresenter == null) {
            mOrderListPresenter = new OrderListPresenter(mOrderListFragment);
        }

    }


}
