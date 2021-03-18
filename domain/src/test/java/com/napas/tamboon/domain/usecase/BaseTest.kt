package com.napas.tamboon.domain.usecase

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.tesco.pricereduction.common.test.TestCoroutineRule
import org.junit.Rule

abstract class BaseTest {

    @get:Rule
    val instantExecutorRule = InstantTaskExecutorRule()

    @get:Rule
    val testCoroutineRule = TestCoroutineRule()
}