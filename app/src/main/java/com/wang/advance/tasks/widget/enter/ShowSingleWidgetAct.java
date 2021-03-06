package com.wang.advance.tasks.widget.enter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.wang.advance.R;
import com.wang.advance.tasks.widget.low.AnnularView;
import com.wang.advance.tasks.widget.low.BrickView;
import com.wang.advance.tasks.widget.low.CircleView;
import com.wang.advance.tasks.widget.low.CustomView1;
import com.wang.advance.tasks.widget.low.CustomView2;
import com.wang.advance.tasks.widget.low.CustomView3;
import com.wang.advance.tasks.widget.low.CustomView4;
import com.wang.advance.tasks.widget.low.CustomView5;
import com.wang.advance.tasks.widget.low.CustomView6;
import com.wang.advance.tasks.widget.low.MatrixImageView;
import com.wang.advance.tasks.widget.low.MultiCricleView;
import com.wang.advance.tasks.widget.low.ShaderView;
import com.wang.advance.tasks.widget.low.loading.LoadingIndicatorView;
import com.wang.tools.base.BaseAct;

import butterknife.BindView;

/**
 * Created by romantiskt on 2017/3/9.
 */

public class ShowSingleWidgetAct extends BaseAct {
    public static final String EXA_SHOW_TYPE = "exa_show_type";

    @Override
    protected int getLayoutId() {
        return R.layout.act_widget_show;
    }

    @Override
    protected void initDataAfterViewInflate() {

    }

    @BindView(R.id.rl_parent)
    RelativeLayout mRlParent;

    @Override
    protected void initView() {
        if (getIntent() != null) {
            String stringExtra = getIntent().getStringExtra(EXA_SHOW_TYPE);
            ViewType viewType = ViewType.fromTypeName(stringExtra);
            switch (viewType) {
                case AnnularView:
                    AnnularView annularView = new AnnularView(this);
                    annularView.setSourceData(new float[]{40, 50, 110}, new String[]{"苹果", "香蕉", "梨子"});
                    addViewToContainer(annularView);
                    break;
                case BrickView:
                    addViewToContainer(new BrickView(this));
                    break;
                case CustomView1:
                    addViewToContainer(new CustomView1(this));
                    break;
                case CustomView2:
                    addViewToContainer(new CustomView2(this));
                    break;
                case CustomView3:
                    addViewToContainer(new CustomView3(this));
                    break;
                case CustomView4:
                    addViewToContainer(new CustomView4(this));
                    break;
                case CustomView5:
                    addViewToContainer(new CustomView5(this));
                    break;
                case CustomView6:
                    addViewToContainer(new CustomView6(this));
                    break;
                case MatrixImageView:
                    addViewToContainer(new MatrixImageView(this));
                    break;
                case MultiCricleView:
                    addViewToContainer(new MultiCricleView(this));
                    break;
                case ShaderView:
                    addViewToContainer(new ShaderView(this));
                    break;
                case LoadingIndicatorView:
                    addViewToContainer(new LoadingIndicatorView(this));
                    break;
                case CircleView:
                    addViewToContainer(new CircleView(this));
                    break;
            }
        }
    }

    private void addViewToContainer(View view) {
        view.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        mRlParent.addView(view);
    }

    @Override
    public String getClassTag() {
        return null;
    }
}
