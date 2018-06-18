package thhsu.chloe.finalexam.home;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import thhsu.chloe.finalexam.AwsCafe;
import thhsu.chloe.finalexam.HomeAdapter;
import thhsu.chloe.finalexam.R;
import thhsu.chloe.finalexam.model.Items;

/**
 * Created by Chloe on 6/18/2018.
 */

public class HomeFragment extends Fragment implements HomeContract.View {
    private HomeContract.Presenter mPresenter;
    private ImageView mImageBtnExpresso, mImageBtnAmericano, mImageBtnLatte, mImageBtnMocha,
            mImageBtnSingleOrigin, mImageBtnBlackTea, mImageBtnGreenTea;
//    private DatabaseReference myRef;
    private ArrayList<Items> list;
    DatabaseReference firebaseDatabase;
    DatabaseReference myRef;
    private HomeAdapter mAdapter;

    @Override
    public void setPresenter(HomeContract.Presenter presenter) {
        mPresenter = presenter;
    }

    public static HomeFragment newInstance(){
        return new HomeFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mAdapter = new HomeAdapter(mPresenter);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        list = new ArrayList<>();
        mImageBtnExpresso = (ImageView) root.findViewById(R.id.imagebtn_expresso_home_fragment);
        mImageBtnAmericano = (ImageView) root.findViewById(R.id.imagebtn_americano_home_fragment);
        mImageBtnLatte = (ImageView) root.findViewById(R.id.imagebtn_latte_home_fragment);
        mImageBtnMocha = (ImageView) root.findViewById(R.id.imagebtn_mocha_home_fragment);
        mImageBtnSingleOrigin = (ImageView) root.findViewById(R.id.imagebtn_single_origin_home_fragment);
        mImageBtnBlackTea = (ImageView) root.findViewById(R.id.imagebtn_black_tea_home_fragment);
        mImageBtnGreenTea = (ImageView) root.findViewById(R.id.imagebtn_green_tea_home_fragment);

        RecyclerView recyclerView = (RecyclerView) root.findViewById(R.id.selecte_coffee_recyclerview_home);
        recyclerView.setLayoutManager(new LinearLayoutManager(AwsCafe.getAppContext()));
        recyclerView.setAdapter(mAdapter);

        showCoffeeItems();

//        DatabaseReference firebaseDatabase = FirebaseDatabase.getInstance().getReference();
//        DatabaseReference myRef = firebaseDatabase.child("items");
//
//        myRef.addValueEventListener(new ValueEventListener() {
//
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                FirebaseDatabase.getInstance().goOnline();
//                String x = dataSnapshot.getValue(String.class);
//                Picasso.get().load(x).fit().centerCrop().into(mImageBtnExpresso);
////                Items items = dataSnapshot.getValue(Items.class);
////                    list.add(items);
////                    Log.d("Chloe", "list: " + list);
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//                Log.d("Chloe", "error:" + databaseError);
//
//            }
//        });


        return root;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        showCoffeeItems();

    }

//    @Override
//    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//        Log.d("Chloe", "testing");
//    }
//
//    @Override
//    public void onCancelled(@NonNull DatabaseError databaseError) {
//
//    }

    @Override
    public void onResume() {
        super.onResume();
    }

    private void showCoffeeItems(){

        Picasso.get().load("https://i.imgur.com/EB3miDu.png").resize(300,300).into(mImageBtnExpresso);
        Picasso.get().load("https://i.imgur.com/yqixI6k.jpg").resize(300,300).into(mImageBtnAmericano);
        Picasso.get().load("https://i.imgur.com/KzYvIBV.jpg").resize(300,300).into(mImageBtnLatte);
        Picasso.get().load("https://i.imgur.com/s9cW7U0.jpg").resize(300,300).into(mImageBtnMocha);
        Picasso.get().load("https://i.imgur.com/ENKT4iM.jpg").resize(300,300).into(mImageBtnSingleOrigin);
        Picasso.get().load("https://i.imgur.com/hltHqWj.jpg").resize(300,300).into(mImageBtnBlackTea);
        Picasso.get().load("https://i.imgur.com/V8z8DJc.jpg").resize(300,300).into(mImageBtnGreenTea);

    }
}
