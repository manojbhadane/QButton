package com.manojbhadane.sample;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;

/**
 * Created by manoj.bhadane on 24/01/19.
 */
public class CustomButton extends AppCompatButton {

    private float mRadius, mStrokeDashWidth, mStrokeDashGap;
    private int mStrokeColor = 0, mStrokeWidth, mBackgroundColor;

    public CustomButton(Context context, AttributeSet attrs) {
        super(context, attrs);

//        LayoutInflater mInflater = LayoutInflater.from(context);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CustomButton);
        mBackgroundColor = a.getColor(R.styleable.CustomButton_cb_backgroundColor, getResources().getColor(R.color.colorPrimary));
        mRadius = a.getFloat(R.styleable.CustomButton_cb_radius, 100f);
        mStrokeDashGap = a.getFloat(R.styleable.CustomButton_cb_strokeDashGap, 0);
        mStrokeDashWidth = a.getFloat(R.styleable.CustomButton_cb_strokeDashWidth, 0);
        mStrokeWidth = a.getInt(R.styleable.CustomButton_cb_strokeWidth, 0);
        mStrokeColor = a.getColor(R.styleable.CustomButton_cb_strokeColor, mBackgroundColor);
        a.recycle();

//        View v = mInflater.inflate(R.layout.layout_item_result, this, true);

//        setBackground(getDrawable(mBackgroundColor, mRadius));

//        TypedArray a1 = getContext().obtainStyledAttributes(new int[]{android.R.attr.selectableItemBackground});
//        Drawable mForegroundDrawable = a1.getDrawable(0);
//        setForeground(mForegroundDrawable);

        if (mStrokeColor == 0) {
            mStrokeColor = manipulateColor(mBackgroundColor, 0.9f);
        }

        Drawable pressed = getDrawable1(manipulateColor(mBackgroundColor, 0.8f), mRadius);
        Drawable normal = getDrawable1(mBackgroundColor, mRadius);

        StateListDrawable states = new StateListDrawable();
        states.addState(new int[]{android.R.attr.state_pressed}, pressed);
        states.addState(new int[]{}, normal);
        setBackground(states);

//        TypedValue outValue = new TypedValue();
//        getContext().getTheme().resolveAttribute(android.R.attr.selectableItemBackground, outValue, true);
////        setBackgroundResource(getDrawable(context, outValue.resourceId));
//        setForeground(outValue.resourceId);

    }

    public GradientDrawable getDrawable1(int backgroundColor, float radius) {

//        int colors[] = {getResources().getColor(R.color.btnGreen),
//                manipulateColor(getResources().getColor(R.color.btnGreen), 0.8f)};
        int colors[] = {backgroundColor,
                manipulateColor(backgroundColor, 0.8f)};

        GradientDrawable shape = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, colors);

        shape.setShape(GradientDrawable.RECTANGLE);
        shape.setCornerRadius(radius);

        shape.setGradientType(GradientDrawable.LINEAR_GRADIENT);

        shape.setStroke(mStrokeWidth, mStrokeColor);
//        shape.setStroke(mStrokeWidth, mStrokeColor, mStrokeDashWidth, mStrokeDashGap);
        if (mStrokeDashGap > 0 || mStrokeDashWidth > 0) {
            shape.setStroke(mStrokeWidth, mStrokeColor, mStrokeDashWidth, mStrokeDashGap);
        }

//        v.setBackground(shape);
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
}
