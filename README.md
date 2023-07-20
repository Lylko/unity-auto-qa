<!-- GETTING STARTED -->
## Getting Started

### Prerequisites
List of needed tools:
* Java 11
* Maven
* Xcode (For iOS only)
* adb (For Android only)

### Installation

1. Clone the repo
   ```sh
   git clone https://github.com/Lylko/unity-auto-qa.git
   ```
2. Install dependencies
   ```sh
   mvn clean install
   ```
3. Switch platform in _config.properties if needed

Next steps are based on platform which you want to choose.

### Android Installation

1. Run chmod command in project folder:
   ```sh
   chmod 777 src/main/resources/android-set-up.sh
   ```
2. Connect your device to computer or run simulator.
3. Make sure that device is visible for adb:
  ```sh
   adb devices
   ```
4. Run any test from project on your computer.

### iOS Installation

1. Download iOS build and open as a project from xcode.
2. Go to the targets and switch to "Signing & Capabilities" tab.
3. Enable "Automatically Signing" checkbox.
4. Choose developer team (Create if needed).
5. Build project.
6. Open game on device.
7. In the next step you will have to enter IP address of your computer. (System Settings -> Wifi -> Details). Make sure that your computer and your device are on the same network.
8. Run any test from project on your computer.

<p align="right">(<a href="#readme-top">back to top</a>)</p>
