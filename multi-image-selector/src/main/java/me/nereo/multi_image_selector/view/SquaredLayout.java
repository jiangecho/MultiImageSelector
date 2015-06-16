package me.nereo.multi_image_selector.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

final class SquaredLayout extends FrameLayout {
    public SquaredLayout(Context context) {
        super(context);
    }

    public SquaredLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(getMeasuredWidth(), getMeasuredWidth());
    }
}
