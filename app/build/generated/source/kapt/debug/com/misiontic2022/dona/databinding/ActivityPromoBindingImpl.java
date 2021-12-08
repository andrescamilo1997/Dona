package com.misiontic2022.dona.databinding;
import com.misiontic2022.dona.R;
import com.misiontic2022.dona.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityPromoBindingImpl extends ActivityPromoBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityPromoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ActivityPromoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.promoImg.setTag(null);
        this.promoInfo.setTag(null);
        this.promoName.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.isData == variableId) {
            setIsData((com.misiontic2022.dona.model.PromocionData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setIsData(@Nullable com.misiontic2022.dona.model.PromocionData IsData) {
        this.mIsData = IsData;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.isData);
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
        com.misiontic2022.dona.model.PromocionData isData = mIsData;
        java.lang.String isDataImg = null;
        java.lang.String isDataPromo = null;
        java.lang.String isDataInfo = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (isData != null) {
                    // read isData.img
                    isDataImg = isData.getImg();
                    // read isData.promo
                    isDataPromo = isData.getPromo();
                    // read isData.info
                    isDataInfo = isData.getInfo();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.misiontic2022.dona.uitel.UitelKt.loadImage(this.promoImg, isDataImg);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.promoInfo, isDataInfo);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.promoName, isDataPromo);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): isData
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}