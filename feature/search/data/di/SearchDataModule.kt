package gaur.himanshu.searchrecipeapp.search.data.di

const val BASE_URL = "https://www.themealdb.com/"

@InstallIn(SingletonComponent::class)
@Module
object SearchDataModule {
    @Provides
    @Singleton
    fun provideRetrofit(): SearchApiService {
        return Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(SearchApiService::class.java)

    }

    @Provides
    @Singleton
    fun provideSearcApiService(retrofit: Retrofit): SearchApiService {
        return retrofit.create(SearchApiService::class.java)
    }

}