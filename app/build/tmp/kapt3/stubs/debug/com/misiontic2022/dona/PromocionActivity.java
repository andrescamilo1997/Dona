package com.misiontic2022.dona;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/misiontic2022/dona/PromocionActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "mAdapter", "Lcom/misiontic2022/dona/adapter/PromocionAdapter;", "mDataBase", "Lcom/google/firebase/database/DatabaseReference;", "getMDataBase", "()Lcom/google/firebase/database/DatabaseReference;", "setMDataBase", "(Lcom/google/firebase/database/DatabaseReference;)V", "promocList", "Ljava/util/ArrayList;", "Lcom/misiontic2022/dona/model/PromocionData;", "Lkotlin/collections/ArrayList;", "getPromocionData", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class PromocionActivity extends androidx.appcompat.app.AppCompatActivity {
    public com.google.firebase.database.DatabaseReference mDataBase;
    private java.util.ArrayList<com.misiontic2022.dona.model.PromocionData> promocList;
    private com.misiontic2022.dona.adapter.PromocionAdapter mAdapter;
    private java.util.HashMap _$_findViewCache;
    
    public PromocionActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.database.DatabaseReference getMDataBase() {
        return null;
    }
    
    public final void setMDataBase(@org.jetbrains.annotations.NotNull()
    com.google.firebase.database.DatabaseReference p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getPromocionData() {
    }
}