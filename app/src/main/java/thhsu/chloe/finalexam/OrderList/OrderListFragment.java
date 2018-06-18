package thhsu.chloe.finalexam.OrderList;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import thhsu.chloe.finalexam.AwsCafe;
import thhsu.chloe.finalexam.OrderListAdapter;
import thhsu.chloe.finalexam.R;
import thhsu.chloe.finalexam.activities.AwsCafeActivity;

/**
 * Created by Chloe on 6/18/2018.
 */

public class OrderListFragment extends Fragment implements OrderListContract.View{

    private OrderListContract.Presenter mPresenter;
    private OrderListAdapter mAdapter;

    @Override
    public void setPresenter(OrderListContract.Presenter presenter) {
        mPresenter = presenter;
    }

    public static OrderListFragment newInstance(){
        return new OrderListFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mAdapter = new OrderListAdapter(mPresenter, (AwsCafeActivity) getActivity());
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_orderlist, container, false);
        RecyclerView recyclerView = (RecyclerView) root.findViewById(R.id.orderlist_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(AwsCafe.getAppContext()));
        recyclerView.setAdapter(mAdapter);
        return root;
    }
}
