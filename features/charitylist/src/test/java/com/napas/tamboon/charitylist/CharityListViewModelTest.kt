package com.napas.tamboon.charitylist

import androidx.lifecycle.Observer
import com.napas.tamboon.commonui.model.AlertEvent
import com.napas.tamboon.domain.model.Charity
import com.napas.tamboon.domain.model.Result
import com.napas.tamboon.domain.model.ResultWrapper
import com.napas.tamboon.domain.usecase.GetCharitiesUseCase
import io.mockk.coEvery
import io.mockk.mockk
import io.mockk.verify
import org.junit.Test

class CharityListViewModelTest : BaseTest() {

    private val getCharitiesUseCase: GetCharitiesUseCase = mockk()
    private lateinit var viewModel: CharityListViewModel

    @Test
    fun `get charities successfully`() = testCoroutineRule.runBlockingTest {
        val fakeCharities = listOf(Charity())
        coEvery { getCharitiesUseCase() } returns ResultWrapper.Success(fakeCharities)
        viewModel = CharityListViewModel(getCharitiesUseCase)

        val observerCharities: Observer<List<Charity>> = mockk(relaxed = true)
        viewModel.charities.observeForever(observerCharities)

        verify {
            observerCharities.onChanged(fakeCharities)
        }
    }

    @Test
    fun `get charities failed`() = testCoroutineRule.runBlockingTest {
        val fakeErrorResult =
            Result(code = "insufficient_minerals", message = "Card has insufficient balance.")
        coEvery { getCharitiesUseCase() } returns ResultWrapper.HttpError(fakeErrorResult)
        viewModel = CharityListViewModel(getCharitiesUseCase)

        val observerAlertEvent: Observer<AlertEvent> = mockk(relaxed = true)
        viewModel.alertEvent.observeForever(observerAlertEvent)

        verify {
            observerAlertEvent.onChanged(
                AlertEvent(
                    titleRes = R.string.error_title,
                    message = fakeErrorResult.message
                )
            )
        }
    }
}