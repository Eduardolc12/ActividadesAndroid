package com.example.practica2.databinding;
import com.example.practica2.R;
import com.example.practica2.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityResultBindingImpl extends ActivityResultBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.row_under_weight, 4);
        sViewsWithIds.put(R.id.row_normal_weight, 5);
        sViewsWithIds.put(R.id.row_overweight, 6);
        sViewsWithIds.put(R.id.row_obesity1, 7);
        sViewsWithIds.put(R.id.row_obesity2, 8);
        sViewsWithIds.put(R.id.row_obesity3, 9);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityResultBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ActivityResultBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[3]
            , (android.widget.TableRow) bindings[5]
            , (android.widget.TableRow) bindings[7]
            , (android.widget.TableRow) bindings[8]
            , (android.widget.TableRow) bindings[9]
            , (android.widget.TableRow) bindings[6]
            , (android.widget.TableRow) bindings[4]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.resultMessage.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.result_imc == variableId) {
            setResultImc((java.lang.String) variable);
        }
        else if (BR.data_height == variableId) {
            setDataHeight((java.lang.String) variable);
        }
        else if (BR.data_weight == variableId) {
            setDataWeight((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setResultImc(@Nullable java.lang.String ResultImc) {
        this.mResultImc = ResultImc;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.result_imc);
        super.requestRebind();
    }
    public void setDataHeight(@Nullable java.lang.String DataHeight) {
        this.mDataHeight = DataHeight;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.data_height);
        super.requestRebind();
    }
    public void setDataWeight(@Nullable java.lang.String DataWeight) {
        this.mDataWeight = DataWeight;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.data_weight);
        super.requestRebind();
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
        java.lang.String resultImc = mResultImc;
        java.lang.String dataHeight = mDataHeight;
        java.lang.String dataWeight = mDataWeight;

        if ((dirtyFlags & 0x9L) != 0) {
        }
        if ((dirtyFlags & 0xaL) != 0) {
        }
        if ((dirtyFlags & 0xcL) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, dataHeight);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, dataWeight);
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.resultMessage, resultImc);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): result_imc
        flag 1 (0x2L): data_height
        flag 2 (0x3L): data_weight
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}