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
public final class DogDetailsMappers_Factory implements Factory<DogDetailsMappers> {
  @Override
  public DogDetailsMappers get() {
    return newInstance();
  }

  public static DogDetailsMappers_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static DogDetailsMappers newInstance() {
    return new DogDetailsMappers();
  }

  private static final class InstanceHolder {
    private static final DogDetailsMappers_Factory INSTANCE = new DogDetailsMappers_Factory();
  }
}
