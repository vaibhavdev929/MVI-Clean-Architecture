package com.mvi.data.repository;

import com.mvi.data.mappers.DogDetailsMappers;
import com.mvi.data.mappers.DogListMappers;
import com.mvi.data.services.DogService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class DogRepositoryImpl_Factory implements Factory<DogRepositoryImpl> {
  private final Provider<DogService> dogApiProvider;

  private final Provider<DogDetailsMappers> dogDetailsMappersProvider;

  private final Provider<DogListMappers> dogListMappersProvider;

  public DogRepositoryImpl_Factory(Provider<DogService> dogApiProvider,
      Provider<DogDetailsMappers> dogDetailsMappersProvider,
      Provider<DogListMappers> dogListMappersProvider) {
    this.dogApiProvider = dogApiProvider;
    this.dogDetailsMappersProvider = dogDetailsMappersProvider;
    this.dogListMappersProvider = dogListMappersProvider;
  }

  @Override
  public DogRepositoryImpl get() {
    return newInstance(dogApiProvider.get(), dogDetailsMappersProvider.get(), dogListMappersProvider.get());
  }

  public static DogRepositoryImpl_Factory create(Provider<DogService> dogApiProvider,
      Provider<DogDetailsMappers> dogDetailsMappersProvider,
      Provider<DogListMappers> dogListMappersProvider) {
    return new DogRepositoryImpl_Factory(dogApiProvider, dogDetailsMappersProvider, dogListMappersProvider);
  }

  public static DogRepositoryImpl newInstance(DogService dogApi,
      DogDetailsMappers dogDetailsMappers, DogListMappers dogListMappers) {
    return new DogRepositoryImpl(dogApi, dogDetailsMappers, dogListMappers);
  }
}
