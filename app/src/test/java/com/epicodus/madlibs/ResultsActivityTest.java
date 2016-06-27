package com.epicodus.madlibs;

import android.content.Intent;
import android.os.Build;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowActivity;

import static junit.framework.Assert.assertTrue;

@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
@RunWith(RobolectricGradleTestRunner.class)

public class ResultsActivityTest {
    private ResultsActivity activity;

    @Before
    public void setup() {
        activity = Robolectric.setupActivity(ResultsActivity.class);
    }

    @Test
    public void validateResultContent() {
        TextView resultTextView = (TextView) activity.findViewById(R.id.test);
        assertTrue("result".equals(resultTextView.getText().toString()));
    }

}
