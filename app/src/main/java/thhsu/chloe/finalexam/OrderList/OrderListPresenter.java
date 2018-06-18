package thhsu.chloe.finalexam.OrderList;


/**
 * Created by Chloe on 6/18/2018.
 */

public class OrderListPresenter implements OrderListContract.Presenter {
    private OrderListContract.View mView;

    public OrderListPresenter(OrderListContract.View view) {
        mView = view;
        if(view != null){
            mView.setPresenter(this);
        }
    }

    @Override
    public void start() {

    }
}
