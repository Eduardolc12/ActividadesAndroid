// Generated by data binding compiler. Do not edit!
package com.example.scores.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.scores.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityScoreBinding extends ViewDataBinding {
  @NonNull
  public final TextView scoreText;

  @NonNull
  public final TextView whoWonText;

  protected ActivityScoreBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView scoreText, TextView whoWonText) {
    super(_bindingComponent, _root, _localFieldCount);
    this.scoreText = scoreText;
    this.whoWonText = whoWonText;
  }

  @NonNull
  public static ActivityScoreBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_score, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityScoreBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityScoreBinding>inflateInternal(inflater, R.layout.activity_score, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityScoreBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_score, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityScoreBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityScoreBinding>inflateInternal(inflater, R.layout.activity_score, null, false, component);
  }

  public static ActivityScoreBinding bind(@NonNull View view) {
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
  public static ActivityScoreBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityScoreBinding)bind(component, view, R.layout.activity_score);
  }
}
