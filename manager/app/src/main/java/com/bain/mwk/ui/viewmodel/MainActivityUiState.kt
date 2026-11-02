package com.bain.mwk.ui.viewmodel

import androidx.compose.runtime.Immutable
import com.bain.mwk.ui.UiMode
import com.bain.mwk.ui.theme.AppSettings

@Immutable
data class MainActivityUiState(
    val appSettings: AppSettings,
    val pageScale: Float,
    val enableBlur: Boolean,
    val enableFloatingBottomBar: Boolean,
    val enableFloatingBottomBarBlur: Boolean,
    val uiMode: UiMode,
)
