package com.example.shubham.sixfourfantasy;

import android.databinding.BaseObservable;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;

public class BindingHolder extends RecyclerView.ViewHolder {

    // each data item is just a string in this case
    private final ViewDataBinding mBinding;

    public BindingHolder(@NonNull ViewDataBinding viewDataBinding) {
        super(viewDataBinding.getRoot());
        mBinding = viewDataBinding;
    }

    public void bind(BaseObservable baseObservable) {
        mBinding.setVariable(BR.viewmodel, baseObservable);
        mBinding.executePendingBindings();
    }

    public ViewDataBinding getBinding() {
        return mBinding;
    }
}
