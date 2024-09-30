# Define variables
SDK_PATH := $(HOME)/android-sdk
APK_PATH := $(CURDIR)/app/build/outputs/apk/debug/app-debug.apk
SETENV_PATH := $(CURDIR)/setenv.sh  # Path to setenv.sh in the same directory as the Makefile

# Set the environment variable for ANDROID_HOME
export ANDROID_HOME := $(SDK_PATH)

# Define the default target
all: build

# Target to build the APK
build:
	@if [ -f $(SETENV_PATH) ]; then \
		. $(SETENV_PATH); \
	else \
		echo "Warning: setenv.sh not found. Continuing with the build without environment settings."; \
	fi; \
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
