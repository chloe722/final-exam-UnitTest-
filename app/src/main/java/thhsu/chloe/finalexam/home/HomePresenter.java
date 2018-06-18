package thhsu.chloe.finalexam.home;

/**
 * Created by Chloe on 6/18/2018.
 */

public class HomePresenter implements HomeContract.Presenter{

    private HomeContract.View mView;

    public HomePresenter(HomeContract.View view) {
        mView = view;
        if(view != null){
            mView.setPresenter(this);
        }
    }

    @Override
    public void start() {

    }
}
