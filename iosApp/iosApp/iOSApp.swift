import SwiftUI
import Shared

@main
struct iOSApp: App {
    
    init() {
        GreetingHelperKt.doInitKoin()
    }
    
	var body: some Scene {
		WindowGroup {
			ContentView()
		}
	}
}