package be.abstraction.bankapp.application

import android.app.Application
import be.abstraction.bankapp.moduleAssembler.myModule
import org.koin.core.context.startKoin

class MyApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            // your modules
            modules(myModule)
        }
    }
 }