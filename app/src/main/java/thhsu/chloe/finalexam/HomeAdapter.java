package thhsu.chloe.finalexam;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import thhsu.chloe.finalexam.home.HomeContract;

/**
 * Created by Chloe on 6/18/2018.
 */

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeItemViewHolder> {

    private HomeContract.Presenter mPresenter;
    public HomeAdapter(HomeContract.Presenter presenter){
        mPresenter = presenter;
    }


    @NonNull
    @Override
    public HomeItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_selected_coffee_home, parent, false);
        return new HomeItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeItemViewHolder holder, int position) {

    }


    @Override
    public int getItemCount() {
        return 5;
    }

    class HomeItemViewHolder extends RecyclerView.ViewHolder{
        private ImageView mImageViewCoffee;
        private TextView mCoffeeName, mType, mSugar;
        private RadioGroup mTypeRadioGroup, mSugarRadioGroup;
        private RadioButton mIcedRadioBtn, mHotRadioBtn, mYesRadioBtn, mNoRadioBtn;


        HomeItemViewHolder(View itemView) {
            super(itemView);
            mImageViewCoffee = (ImageView) itemView.findViewById(R.id.imageview_order_item_home);
            mCoffeeName = (TextView) itemView.findViewById(R.id.title_order_item_home);
            mType = (TextView) itemView.findViewById(R.id.title_type_home);
            mSugar = (TextView) itemView.findViewById(R.id.title_sugar_home);
            mTypeRadioGroup = (RadioGroup) itemView.findViewById(R.id.radiogroup_type_home);
            mSugarRadioGroup = (RadioGroup) itemView.findViewById(R.id.radiogroup_sugar_home);
            mIcedRadioBtn = (RadioButton) itemView.findViewById(R.id.radiobtn_iced_home);
            mHotRadioBtn = (RadioButton) itemView.findViewById(R.id.radiobtn_hot_home);
            mYesRadioBtn = (RadioButton) itemView.findViewById(R.id.radiobtn_yes_home);
            mNoRadioBtn = (RadioButton) itemView.findViewById(R.id.radiobtn_no_home);

        }


    }
}
