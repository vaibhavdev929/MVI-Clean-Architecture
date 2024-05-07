package com.mvi.data.mappers;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DogListMappers_Factory implements Factory<DogListMappers> {
  @Override
  public DogListMappers get() {
    return newInstance();
  }

  public static DogListMappers_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static DogListMappers newInstance() {
    return new DogListMappers();
  }

  private static final class InstanceHolder {
    private static final DogListMappers_Factory INSTANCE = new DogListMappers_Factory();
  }
}
