package thhsu.chloe.finalexam.OrderDetails;

/**
 * Created by Chloe on 6/18/2018.
 */

public class OrderDetailsPresenter implements OrderDetailsContract.Presenter{

    private OrderDetailsContract.View mView;


    public OrderDetailsPresenter(OrderDetailsContract.View view) {
        mView = view;
        if(view != null){
            mView.setPresenter(this);
        }
    }

    @Override
    public void start() {

    }
}
