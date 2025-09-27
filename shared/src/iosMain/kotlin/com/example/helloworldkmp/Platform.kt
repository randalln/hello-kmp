package com.example.helloworldkmp

import org.koin.core.annotation.Single
import platform.UIKit.UIDevice

@Single
actual class Platform actual constructor() {
    actual val name: String =
        UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}