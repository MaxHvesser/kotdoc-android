package no.mhl.kotdoc.ui

import androidx.activity.OnBackPressedDispatcher
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import no.mhl.kotdoc.ui.theme.KotDocTheme
import no.mhl.kotdoc.ui.utils.LocalBackDispatcher

@Composable
fun KotDocApp(backDispatcher: OnBackPressedDispatcher) {

    CompositionLocalProvider(LocalBackDispatcher provides backDispatcher) {
        KotDocTheme {
            NavGraph()
        }
    }

}