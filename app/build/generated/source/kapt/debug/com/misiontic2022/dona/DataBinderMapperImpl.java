package com.misiontic2022.dona;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.misiontic2022.dona.databinding.ActivityPromoBindingImpl;
import com.misiontic2022.dona.databinding.ActivityPromocionActBindingImpl;
import com.misiontic2022.dona.databinding.ItemListBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYPROMO = 1;

  private static final int LAYOUT_ACTIVITYPROMOCIONACT = 2;

  private static final int LAYOUT_ITEMLIST = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.misiontic2022.dona.R.layout.activity_promo, LAYOUT_ACTIVITYPROMO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.misiontic2022.dona.R.layout.activity_promocion_act, LAYOUT_ACTIVITYPROMOCIONACT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.misiontic2022.dona.R.layout.item_list, LAYOUT_ITEMLIST);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYPROMO: {
          if ("layout/activity_promo_0".equals(tag)) {
            return new ActivityPromoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_promo is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYPROMOCIONACT: {
          if ("layout/activity_promocion_act_0".equals(tag)) {
            return new ActivityPromocionActBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_promocion_act is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMLIST: {
          if ("layout/item_list_0".equals(tag)) {
            return new ItemListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_list is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "isData");
      sKeys.put(2, "isPromocion");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/activity_promo_0", com.misiontic2022.dona.R.layout.activity_promo);
      sKeys.put("layout/activity_promocion_act_0", com.misiontic2022.dona.R.layout.activity_promocion_act);
      sKeys.put("layout/item_list_0", com.misiontic2022.dona.R.layout.item_list);
    }
  }
}
