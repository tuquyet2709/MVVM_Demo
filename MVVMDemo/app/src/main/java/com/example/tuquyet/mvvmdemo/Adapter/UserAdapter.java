package com.example.tuquyet.mvvmdemo.Adapter;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.tuquyet.mvvmdemo.R;
import com.example.tuquyet.mvvmdemo.ViewModel.UserViewModel;
import com.example.tuquyet.mvvmdemo.databinding.ItemAppBinding;

import java.util.List;

/**
 * Created by tuquyet on 17/07/2017.
 */
public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {
    private List<UserViewModel> mUserList;

    public UserAdapter(List<UserViewModel> userList) {
        mUserList = userList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemAppBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()
        ), R.layout.item_app, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bindData(mUserList.get(position));
    }

    @Override
    public int getItemCount() {
        return (mUserList != null ? mUserList.size() : 0);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ItemAppBinding mItemAppBinding;

        public ViewHolder(ItemAppBinding itemAppBinding) {
            super(itemAppBinding.getRoot());
            mItemAppBinding = itemAppBinding;
        }

        private void bindData(UserViewModel userModel) {
            mItemAppBinding.setUser(userModel);
            mItemAppBinding.executePendingBindings();
        }
    }
}

