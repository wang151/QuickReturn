package com.etiennelawlor.quickreturn.activities;

import android.content.Intent;
import android.os.Bundle;

import com.etiennelawlor.quickreturn.R;

import butterknife.ButterKnife;
import butterknife.OnClick;


public class QuickReturnActivity extends QuickReturnBaseActivity {

    // region Listeners
    @OnClick(R.id.twitter_cv)
    public void onTwitterClicked(){
        startActivity(new Intent(QuickReturnActivity.this, QuickReturnTwitterActivity.class));
    }

    @OnClick(R.id.facebook_cv)
    public void onFacebookClicked(){
        startActivity(new Intent(QuickReturnActivity.this, QuickReturnFacebookActivity.class));
    }

    @OnClick(R.id.google_plus_cv)
    public void onGooglePlusClicked(){
        startActivity(new Intent(QuickReturnActivity.this, QuickReturnGooglePlusActivity.class));
    }

    @OnClick(R.id.recyclerview_cv)
    public void onRecyclerViewClicked(){
        startActivity(new Intent(QuickReturnActivity.this, QuickReturnRecyclerViewActivity.class));
    }
    
    @OnClick(R.id.listview_cv)
    public void onListViewClicked(){
        startActivity(new Intent(QuickReturnActivity.this, QuickReturnListViewActivity.class));
    }

    @OnClick(R.id.scrollview_cv)
    public void onScrollViewClicked(){
        startActivity(new Intent(QuickReturnActivity.this, QuickReturnScrollViewActivity.class));
    }
    // endregion

    // region Lifecycle Methods
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quick_return);
        ButterKnife.inject(this);
    }
    // endregion
    
}
