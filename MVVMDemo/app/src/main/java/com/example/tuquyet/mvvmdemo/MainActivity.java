package com.example.tuquyet.mvvmdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.tuquyet.mvvmdemo.Adapter.UserAdapter;
import com.example.tuquyet.mvvmdemo.Model.UserModel;
import com.example.tuquyet.mvvmdemo.ViewModel.UserViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private UserAdapter mUserAdapter;
    private List<UserViewModel> mUserList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.reycler);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        for (int i = 0; i < 10; i++) {
            UserModel model = new UserModel(R.mipmap.ic_launcher, "Nguyen Van " + i,
                "012345678"+String.valueOf
                    (i));
            mUserList.add(new UserViewModel(model, this));
        }
        mUserAdapter = new UserAdapter(mUserList);
        mRecyclerView.setAdapter(mUserAdapter);
    }
}
