package com.apptosteco.david.criminalintent;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;

public class CrimeListActivity extends SingleFragmentActivity{

    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }

}
