# Define variables
SDK_PATH := $(HOME)/android-sdk
APK_PATH := app/build/outputs/apk/debug/app-debug.apk

# Set the environment variable for ANDROID_HOME
export ANDROID_HOME := $(SDK_PATH)

# Define the default target
all: build

# Target to build the APK
build:
	./gradlew build

# Check if a device is connected, then install the APK
install: build
	@if adb devices | grep -w "device" >/dev/null; then \
		echo "Device found, installing APK..."; \
		adb install $(APK_PATH); \
	else \
		echo "Error: No Android device found. Please connect a device and try again."; \
	fi

# Optional clean target
clean:
	./gradlew clean
