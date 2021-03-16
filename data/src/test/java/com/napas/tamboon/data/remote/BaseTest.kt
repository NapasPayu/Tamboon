package com.napas.tamboon.data.remote

import android.content.Context
import com.napas.tamboon.data.remote.di.createRemoteModule
import io.mockk.mockk
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import org.junit.After
import org.junit.Before
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin
import org.koin.test.KoinTest
import java.io.File

abstract class BaseTest : KoinTest {

    private val context: Context = mockk(relaxed = true)
    protected lateinit var mockServer: MockWebServer

    @Before
    fun setUp() {
        mockServer = MockWebServer()
        mockServer.start()
        startKoin {
            androidContext(context)
            modules(listOf(createRemoteModule(mockServer.url("/").toString())))
        }
    }

    @After
    fun tearDown() {
        mockServer.shutdown()
        stopKoin()
    }

    protected fun mockHttpResponse(mockServer: MockWebServer, responseCode: Int, fileName: String) =
        mockServer.enqueue(
            MockResponse()
                .setResponseCode(responseCode)
                .setBody(getJson(fileName))
        )

    private fun getJson(path: String): String {
        val uri = this.javaClass.classLoader!!.getResource(path)
        val file = File(uri.path)
        return String(file.readBytes())
    }
}