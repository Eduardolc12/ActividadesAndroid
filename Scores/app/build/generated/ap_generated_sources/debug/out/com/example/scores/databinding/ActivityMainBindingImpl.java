package com.example.scores.databinding;
import com.example.scores.R;
import com.example.scores.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.center_layout, 1);
        sViewsWithIds.put(R.id.restart_button, 2);
        sViewsWithIds.put(R.id.results_button, 3);
        sViewsWithIds.put(R.id.local_text, 4);
        sViewsWithIds.put(R.id.visitor_text, 5);
        sViewsWithIds.put(R.id.local_minus_button, 6);
        sViewsWithIds.put(R.id.local_score_text, 7);
        sViewsWithIds.put(R.id.local_plus_button, 8);
        sViewsWithIds.put(R.id.local_two_points_button, 9);
        sViewsWithIds.put(R.id.visitor_minus_button, 10);
        sViewsWithIds.put(R.id.visitor_score_text, 11);
        sViewsWithIds.put(R.id.visitor_plus_button, 12);
        sViewsWithIds.put(R.id.visitor_two_points_button, 13);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[1]
            , (android.widget.Button) bindings[6]
            , (android.widget.Button) bindings[8]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[4]
            , (android.widget.Button) bindings[9]
            , (android.widget.ImageButton) bindings[2]
            , (android.widget.ImageButton) bindings[3]
            , (android.widget.Button) bindings[10]
            , (android.widget.Button) bindings[12]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[5]
            , (android.widget.Button) bindings[13]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}