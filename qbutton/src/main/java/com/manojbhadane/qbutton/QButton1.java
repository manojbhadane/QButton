package com.manojbhadane.qbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;

/**
 * Version Commit guide on Jitpack , execute follwing commands
 * <p>
 * git tag -a v1.2 -m "first commit"
 * git push origin v1.2
 */
public class QButton1 extends AppCompatButton {

    private boolean isEnable = true;
    private int mRadius;
    private int mStrokeDashWidth, mStrokeDashGap;
    private int mStrokeColor = 0, mStrokeWidth, mBackgroundColor;

    public QButton1(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.QButton);
        mBackgroundColor = a.getColor(R.styleable.QButton_qb_backgroundColor, getResources().getColor(R.color.colorPrimary));
        mRadius = a.getInt(R.styleable.QButton_qb_radius, 100);
        mStrokeDashGap = a.getInt(R.styleable.QButton_qb_strokeDashGap, 0);
        mStrokeDashWidth = a.getInt(R.styleable.QButton_qb_strokeDashWidth, 0);
        mStrokeWidth = a.getInt(R.styleable.QButton_qb_strokeWidth, 0);
        mStrokeColor = a.getColor(R.styleable.QButton_qb_strokeColor, mBackgroundColor);
        a.recycle();

//        TypedArray a1 = getContext().obtainStyledAttributes(new int[]{android.R.attr.selectableItemBackground});
//        Drawable mForegroundDrawable = a1.getDrawable(0);
//        setForeground(mForegroundDrawable);

        notifyChanges();
    }

    @Override
    public void setEnabled(boolean enabled) {
        isEnable = enabled;
        notifyChanges();
        super.setEnabled(enabled);
    }

    private void notifyChanges() {

        Float factor = 0.8f, factorStorke = 0.9f;

        if (!isEnable) {
            //handling for button disable state
            setAlpha(0.6f);
        }

        if (mStrokeColor == 0) {
            mStrokeColor = manipulateColor(mBackgroundColor, factorStorke);
        }

        Drawable pressed = getDrawable1(manipulateColor(mBackgroundColor, factor), mRadius);
        Drawable normal = getDrawable1(mBackgroundColor, mRadius);

        StateListDrawable states = new StateListDrawable();
        states.addState(new int[]{android.R.attr.state_pressed}, pressed);
        states.addState(new int[]{}, normal);
        setBackground(states);

    }

    public GradientDrawable getDrawable1(int backgroundColor, float radius) {

        int colors[] = {backgroundColor,
                manipulateColor(backgroundColor, 0.8f)};

        GradientDrawable shape = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, colors);

        shape.setShape(GradientDrawable.RECTANGLE);
        shape.setCornerRadius(radius);

        shape.setGradientType(GradientDrawable.LINEAR_GRADIENT);

        shape.setStroke(mStrokeWidth, mStrokeColor);
        if (mStrokeDashGap > 0 || mStrokeDashWidth > 0) {
            shape.setStroke(mStrokeWidth, mStrokeColor, mStrokeDashWidth, mStrokeDashGap);
        }

        return shape;
    }

    private int manipulateColor(int color, float factor) {
        //factor = 0.8f
        int a = Color.alpha(color);
        int r = Math.round(Color.red(color) * factor);
        int g = Math.round(Color.green(color) * factor);
        int b = Math.round(Color.blue(color) * factor);
        return Color.argb(a,
                Math.min(r, 255),
                Math.min(g, 255),
                Math.min(b, 255));
    }

    public void setBackgroundColor(int backgroundColor) {
        mBackgroundColor = backgroundColor;
        notifyChanges();
    }
}
