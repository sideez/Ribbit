package com.sideez.ribbit;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by sideez on 2015-09-27.
 */
public class RibbitApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, getString(R.string.parsecom_application_id),
                getString(R.string.parsecom_client_id));
    }

}
