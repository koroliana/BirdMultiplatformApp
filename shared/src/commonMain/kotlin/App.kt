import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import dev.icerock.moko.mvvm.compose.getViewModel
import dev.icerock.moko.mvvm.compose.viewModelFactory

@Composable
fun App() {
    MaterialTheme {
       // val birdsViewModel = getViewModel(Unit, viewModelFactory { BirdsViewModel() })
      //  BirdsPage(birdsViewModel)

    }
}

//@Composable
//fun BirdsPage(viewModel: BirdsViewModel) {
   // val uiState: State<BirdsUiState> by viewModel.uiState.collectAsState()
//}

expect fun getPlatformName(): String