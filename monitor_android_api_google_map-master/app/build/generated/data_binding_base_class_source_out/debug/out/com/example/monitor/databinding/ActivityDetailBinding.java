// Generated by data binding compiler. Do not edit!
package com.example.monitor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.monitor.Earthquake;
import com.example.monitor.R;
import com.google.android.gms.maps.MapView;
import java.lang.Deprecated;
import java.lang.Object;
import java.lang.String;

public abstract class ActivityDetailBinding extends ViewDataBinding {
  @NonNull
  public final TextView lblTVPlace;

  @NonNull
  public final TextView lblTVTime;

  @NonNull
  public final MapView mapView;

  @NonNull
  public final TextView txtMag;

  @NonNull
  public final TextView txtPlace;

  @NonNull
  public final TextView txtTime;

  @Bindable
  protected Earthquake mTer;

  @Bindable
  protected String mTime;

  @Bindable
  protected String mMag;

  protected ActivityDetailBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView lblTVPlace, TextView lblTVTime, MapView mapView, TextView txtMag, TextView txtPlace,
      TextView txtTime) {
    super(_bindingComponent, _root, _localFieldCount);
    this.lblTVPlace = lblTVPlace;
    this.lblTVTime = lblTVTime;
    this.mapView = mapView;
    this.txtMag = txtMag;
    this.txtPlace = txtPlace;
    this.txtTime = txtTime;
  }

  public abstract void setTer(@Nullable Earthquake ter);

  @Nullable
  public Earthquake getTer() {
    return mTer;
  }

  public abstract void setTime(@Nullable String time);

  @Nullable
  public String getTime() {
    return mTime;
  }

  public abstract void setMag(@Nullable String mag);

  @Nullable
  public String getMag() {
    return mMag;
  }

  @NonNull
  public static ActivityDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_detail, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityDetailBinding>inflateInternal(inflater, R.layout.activity_detail, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_detail, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityDetailBinding>inflateInternal(inflater, R.layout.activity_detail, null, false, component);
  }

  public static ActivityDetailBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityDetailBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityDetailBinding)bind(component, view, R.layout.activity_detail);
  }
}
