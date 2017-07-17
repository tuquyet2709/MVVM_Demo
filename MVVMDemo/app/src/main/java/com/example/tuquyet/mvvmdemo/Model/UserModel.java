package com.example.tuquyet.mvvmdemo.Model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by tuquyet on 17/07/2017.
 */
public class UserModel extends BaseObservable{
    public int mUserAvatar;
    private String mUserName;
    private String mUserAge;

    public UserModel(int userAvatar, String userName, String userAge) {
        mUserAvatar = userAvatar;
        mUserName = userName;
        mUserAge = userAge;
    }

    public int getUserAvatar() {
        return mUserAvatar;
    }

    public void setUserAvatar(int userAvatar) {
        mUserAvatar = userAvatar;
    }

    public String getUserName() {
        return mUserName;
    }

    public void setUserName(String userName) {
        mUserName = userName;
    }

    public String getUserAge() {
        return mUserAge;
    }

    public void setUserAge(String userAge) {
        mUserAge = userAge;
    }
}
