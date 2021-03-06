package csc1304.gr13.retailmanagercsc.adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import csc1304.gr13.retailmanagercsc.suppliertables.Suppliefrg;

/**
 * Created by CS1304 on 8/02/2021.
 */

public class SupplierPagerAdapter extends FragmentStatePagerAdapter {

    int mNumOfTabs;

    public SupplierPagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Suppliefrg tab1 = new Suppliefrg();
                return tab1;
            /*case 1:
                AddSupplierDBfrg tab2 = new AddSupplierDBfrg();
                return tab2;*/
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }

}
