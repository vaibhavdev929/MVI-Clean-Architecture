package com.mvi.data.di;

import com.mvi.data.services.DogService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
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
public final class NetworkModule_ProvideDogApiFactory implements Factory<DogService> {
  @Override
  public DogService get() {
    return provideDogApi();
  }

  public static NetworkModule_ProvideDogApiFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static DogService provideDogApi() {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideDogApi());
  }

  private static final class InstanceHolder {
    private static final NetworkModule_ProvideDogApiFactory INSTANCE = new NetworkModule_ProvideDogApiFactory();
  }
}
