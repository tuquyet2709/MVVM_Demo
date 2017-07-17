package com.example.tuquyet.mvvmdemo.ViewModel;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.view.View;
import android.widget.Toast;

import com.example.tuquyet.mvvmdemo.Model.UserModel;

/**
 * Created by tuquyet on 17/07/2017.
 */
public class UserViewModel extends BaseObservable{
    private UserModel mUserModel;
    private Context mContext;

    public UserViewModel(UserModel userModel, Context context) {
        mUserModel = userModel;
        mContext = context;
    }

    public UserViewModel(UserModel userModel) {
        mUserModel = userModel;
    }

    @Bindable
    public int getUserAvatar() {
        return mUserModel.getUserAvatar();
    }

    public void setUserAvatar(int userAvatar) {
        mUserModel.setUserAvatar(userAvatar);
    }

    @Bindable
    public String getUserName() {
        return mUserModel.getUserName();
    }

    public void setUserName(String userName) {
        mUserModel.setUserName(userName);
    }

    @Bindable
    public String getUserAge() {
        return mUserModel.getUserAge();
    }

    public void setUserAge(String userAge) {
        mUserModel.setUserAge(userAge);
    }
    public View.OnClickListener onReadMoreClicked() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Open detail", Toast.LENGTH_SHORT).show();
            }
        };
    }
}
