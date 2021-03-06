package com.example.shubham.sixfourfantasy.matches;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shubham.sixfourfantasy.R;
import com.example.shubham.sixfourfantasy.data.model.MatchStatus;
import com.example.shubham.sixfourfantasy.databinding.MatchesFragBinding;

import java.util.ArrayList;

public class MatchesFragment extends Fragment {

    public static final String MATCH_TYPE_KEY = "match_type";

    private MatchesViewModel mMatchesViewModel;

    private MatchesFragBinding mMatchesFragBinding;

    public static MatchesFragment newInstance(MatchStatus matchType) {
        Bundle args = new Bundle();
        args.putString(MATCH_TYPE_KEY, matchType.toString());
        MatchesFragment matchesFragment = new MatchesFragment();
        matchesFragment.setArguments(args);
        return matchesFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (mMatchesViewModel == null) {
            mMatchesViewModel = ((MatchesActivity) getActivity()).attachViewModel(this);
        }

        mMatchesFragBinding = MatchesFragBinding.inflate(inflater, container, false);
        mMatchesFragBinding.setViewmodel(mMatchesViewModel);
        View root = mMatchesFragBinding.getRoot();
        return root;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setupListAdapter();
    }


    @Override
    public void onResume() {
        super.onResume();
        mMatchesViewModel.start();
    }


    private void setupListAdapter() {
        RecyclerView recyclerView = mMatchesFragBinding.matcheslistRecyclerview;
        GridLayoutManager gridLayoutManager =
                new GridLayoutManager(getActivity(), getResources().getInteger(R.integer.list_column_count));
        recyclerView.setLayoutManager(gridLayoutManager);

        MatchesListAdapter mListAdapter = new MatchesListAdapter(new ArrayList<>(0), (MatchItemNavigator) getActivity());
        recyclerView.setAdapter(mListAdapter);
    }
}
