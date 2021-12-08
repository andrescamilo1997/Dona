package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.misiontic2022.dona.DataBinderMapperImpl());
  }
}
