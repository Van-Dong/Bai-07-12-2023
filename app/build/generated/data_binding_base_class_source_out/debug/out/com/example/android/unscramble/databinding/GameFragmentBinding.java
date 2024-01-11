// Generated by data binding compiler. Do not edit!
package com.example.android.unscramble.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.android.unscramble.R;
import com.example.android.unscramble.ui.game.GameViewModel;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class GameFragmentBinding extends ViewDataBinding {
  @NonNull
  public final TextView score;

  @NonNull
  public final Button skip;

  @NonNull
  public final Button submit;

  @NonNull
  public final TextInputLayout textField;

  @NonNull
  public final TextInputEditText textInputEditText;

  @NonNull
  public final TextView textViewInstructions;

  @NonNull
  public final TextView textViewUnscrambledWord;

  @NonNull
  public final TextView wordCount;

  @Bindable
  protected GameViewModel mGameViewModel;

  @Bindable
  protected int mMaxNoOfWords;

  protected GameFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView score, Button skip, Button submit, TextInputLayout textField,
      TextInputEditText textInputEditText, TextView textViewInstructions,
      TextView textViewUnscrambledWord, TextView wordCount) {
    super(_bindingComponent, _root, _localFieldCount);
    this.score = score;
    this.skip = skip;
    this.submit = submit;
    this.textField = textField;
    this.textInputEditText = textInputEditText;
    this.textViewInstructions = textViewInstructions;
    this.textViewUnscrambledWord = textViewUnscrambledWord;
    this.wordCount = wordCount;
  }

  public abstract void setGameViewModel(@Nullable GameViewModel gameViewModel);

  @Nullable
  public GameViewModel getGameViewModel() {
    return mGameViewModel;
  }

  public abstract void setMaxNoOfWords(int maxNoOfWords);

  public int getMaxNoOfWords() {
    return mMaxNoOfWords;
  }

  @NonNull
  public static GameFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.game_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static GameFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<GameFragmentBinding>inflateInternal(inflater, R.layout.game_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static GameFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.game_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static GameFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<GameFragmentBinding>inflateInternal(inflater, R.layout.game_fragment, null, false, component);
  }

  public static GameFragmentBinding bind(@NonNull View view) {
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
  public static GameFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (GameFragmentBinding)bind(component, view, R.layout.game_fragment);
  }
}
