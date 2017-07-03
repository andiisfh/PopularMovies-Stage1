package com.popularmovies.ui.activity;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.widget.ImageView;
import android.widget.TextView;

import com.popularmovies.R;
import com.popularmovies.ui.utils.ImageLoader;

import butterknife.BindView;

/**
 * Created by andiisfh on 01/07/17.
 */

public class DetailMovieActivity extends BaseActivity {

    @BindView(R.id.tv_title)
    TextView mTVTitle;
    @BindView(R.id.tv_release_date)
    TextView mTVReleaseDate;
    @BindView(R.id.tv_rating)
    TextView mTVRating;
    @BindView(R.id.tv_synopsis)
    TextView mTVSynopsis;
    @BindView(R.id.iv_thumbnail)
    ImageView mIVThumbnail;

    @Override
    protected int setLayoutResource() {
        return R.layout.activity_detail;
    }

    @Override
    protected String setTitle() {
        return getResources().getString(R.string.movie_detail);
    }

    @Override
    protected int setIconColor() {
        return ContextCompat.getColor(this, android.R.color.white);
    }

    @Override
    protected boolean isToolbarHasBack() {
        return true;
    }

    @Override
    protected void onViewReady(Bundle savedInstanceState) {
        mTVTitle.setText(getIntent().getExtras().getString("title"));
        mTVReleaseDate.setText(getIntent().getExtras().getString("release_date"));
        mTVRating.setText(getResources().getString(R.string.of_ten, getIntent().getExtras().getString("rating")));
        mTVSynopsis.setText(getIntent().getExtras().getString("synopsis"));
        ImageLoader.load(this, getIntent().getExtras().getString("image_path"), mIVThumbnail);
    }
}
