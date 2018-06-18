package thhsu.chloe.finalexam;

/**
 * Created by Chloe on 6/18/2018.
 */

public class AwsCafePresenter implements AwsCafeContract.Presenter {

    private AwsCafeContract.View mView;

    public AwsCafePresenter(AwsCafeContract.View view) {
        mView = view;
        if(view != null){
            mView.setPresenter(this);
        }
    }

    @Override
    public void start() {

    }
}
