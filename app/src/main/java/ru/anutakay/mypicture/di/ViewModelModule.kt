package ru.anutakay.mypicture.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import ru.anutakay.mypicture.presentation.common.viewmodel.AppViewModelFactory
import ru.anutakay.mypicture.presentation.ui.picture.PictureViewModel

@Module
abstract class ViewModelModule {

    @Binds
    internal abstract fun bindViewModelFactory(factory: AppViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(PictureViewModel::class)
    abstract fun pictureViewModel(viewModel: PictureViewModel): ViewModel
}