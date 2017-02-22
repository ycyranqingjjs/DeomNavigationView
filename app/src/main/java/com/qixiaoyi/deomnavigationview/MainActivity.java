package com.qixiaoyi.deomnavigationview;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nv_main);
        navigationView.setItemIconTintList(null);//设置菜单的图片列表、
//        1.app:itemBackground="@color/colorAccent"设置每一个item的背景颜色
//        2.app:itemTextColor=""设置item的背景颜色
        View headerView = navigationView.getHeaderView(0);//获取头布局 并设置点击事件
        headerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "点击了头布局", Toast.LENGTH_SHORT).show();
            }
        });
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                //菜单点击事件
                switch (item.getItemId()){
                    case R.id.photo:
                        Toast.makeText(MainActivity.this, "相册", Toast.LENGTH_SHORT).show();
                    break;
                    case R.id.favorite:
                        Toast.makeText(MainActivity.this, "收藏", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.file:
                        Toast.makeText(MainActivity.this, "文件", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.wallet:
                        Toast.makeText(MainActivity.this, "钱包", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
                return true;
            }
        });
    }
}
