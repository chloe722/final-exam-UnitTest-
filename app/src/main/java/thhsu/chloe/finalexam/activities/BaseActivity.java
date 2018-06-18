package thhsu.chloe.finalexam.activities;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

public class BaseActivity extends AppCompatActivity {

//    DatabaseReference firebaseDatabase;
//    DatabaseReference myRef;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        firebaseDatabase = FirebaseDatabase.getInstance().getReference();
//        myRef = firebaseDatabase.child("items");
//                Log.d("Chloe", "myRef: " + myRef);
//        myRef.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                Log.d("Chloe", "testing" );
//
////                String x = dataSnapshot.getValue(String.class);
////                Picasso.get().load(x).fit().centerCrop().into(mImageBtnExpresso);
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

    }
}
