package com.bain.mwk.ui.component.uninstalldialog

import androidx.compose.runtime.Composable
import com.bain.mwk.ui.LocalUiMode
import com.bain.mwk.ui.UiMode

@Composable
fun UninstallDialog(
    show: Boolean,
    onDismissRequest: () -> Unit
) {
    when (LocalUiMode.current) {
        UiMode.Miuix -> UninstallDialogMiuix(show, onDismissRequest)
        UiMode.Material -> UninstallDialogMaterial(show, onDismissRequest)
    }
}
