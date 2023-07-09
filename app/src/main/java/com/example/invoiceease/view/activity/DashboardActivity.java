package com.example.invoiceease.view.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.invoiceease.R;
import com.example.invoiceease.databinding.ActivityDashboardBinding;

import ru.nikartm.support.ImageBadgeView;

public class DashboardActivity extends AppCompatActivity {

    private ActivityDashboardBinding mBinding;
    private ImageBadgeView imageBadgeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_dashboard);
        /*getWindow().setStatusBarColor(getResources().getColor(R.color.zxing_transparent));
        getWindow().setNavigationBarColor(getResources().getColor(R.color.zxing_transparent));

        setSupportActionBar(mBinding.appBarDashboard.toolbar);

        DrawerLayout drawer = mBinding.drawerLayout;
        NavigationView navigationView = mBinding.navView;
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, mBinding.appBarDashboard.toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        RoundedImageView roundedImageView = mBinding.navView.getHeaderView(0).findViewById(R.id.qr_nav);
        HomeFragment homeFragment = new HomeFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment_content_dashboard, homeFragment).commit();


*/
    }


    @Override
    public boolean onSupportNavigateUp() {
        super.onSupportNavigateUp();
        return true;
    }
}