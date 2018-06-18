package thhsu.chloe.finalexam.activities;

import thhsu.chloe.finalexam.AwsCafeContract;

/**
 * Created by Chloe on 6/18/2018.
 */

public class AwsCafeActivity extends BaseActivity implements AwsCafeContract.View {
    private AwsCafeContract.Presenter mPresenter;

    @Override
    public void setPresenter(AwsCafeContract.Presenter presenter) {
        mPresenter = presenter;
    }
}
