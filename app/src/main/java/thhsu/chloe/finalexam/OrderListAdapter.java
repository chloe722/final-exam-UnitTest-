package thhsu.chloe.finalexam;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import thhsu.chloe.finalexam.OrderList.OrderListContract;
import thhsu.chloe.finalexam.activities.AwsCafeActivity;
import thhsu.chloe.finalexam.activities.OrderDetailActivity;

/**
 * Created by Chloe on 6/18/2018.
 */

public class OrderListAdapter  extends RecyclerView.Adapter<OrderListAdapter.OrderListItemViewHolder> {

    private OrderListContract.Presenter mPresenter;
    private AwsCafeActivity mActivity;

    public OrderListAdapter(OrderListContract.Presenter presenter, AwsCafeActivity awsCafeActivity){
        mPresenter = presenter;
        mActivity = awsCafeActivity;
    }

    @NonNull
    @Override
    public OrderListItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_orderlist, parent, false);
        return new OrderListItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OrderListItemViewHolder holder, int position) {

    }


    @Override
    public int getItemCount() {
        return 10;
    }

    class OrderListItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private ConstraintLayout mItemConstraint;
        OrderListItemViewHolder(View itemView) {
            super(itemView);

            mItemConstraint = (ConstraintLayout) itemView.findViewById(R.id.item_constraint);
            mItemConstraint.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.item_constraint:
                    Intent intent = new Intent(mActivity, OrderDetailActivity.class);
                    mActivity.startActivity(intent);

            }
        }
    }
}
