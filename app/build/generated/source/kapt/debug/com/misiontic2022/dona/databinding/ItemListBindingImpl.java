package com.misiontic2022.dona.databinding;
import com.misiontic2022.dona.R;
import com.misiontic2022.dona.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemListBindingImpl extends ItemListBinding  {

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
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
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
        if (BR.isPromocion == variableId) {
            setIsPromocion((com.misiontic2022.dona.model.PromocionData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setIsPromocion(@Nullable com.misiontic2022.dona.model.PromocionData IsPromocion) {
        this.mIsPromocion = IsPromocion;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.isPromocion);
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
        java.lang.String isPromocionImg = null;
        java.lang.String isPromocionInfo = null;
        com.misiontic2022.dona.model.PromocionData isPromocion = mIsPromocion;
        java.lang.String isPromocionPromo = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (isPromocion != null) {
                    // read isPromocion.img
                    isPromocionImg = isPromocion.getImg();
                    // read isPromocion.info
                    isPromocionInfo = isPromocion.getInfo();
                    // read isPromocion.promo
                    isPromocionPromo = isPromocion.getPromo();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.misiontic2022.dona.uitel.UitelKt.loadImage(this.promoImg, isPromocionImg);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.promoInfo, isPromocionInfo);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.promoName, isPromocionPromo);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): isPromocion
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}