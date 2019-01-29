![enter image description here](https://raw.githubusercontent.com/manojbhadane/QButton/master/qbutton_banner.png?token=AKPddlQNgRZT1DbSR_pBUSw70a1Yrrzcks5cUIfvwA%3D%3D)

# QButton
An easy-to-use, customizable, Button for Android.


### Specs
[![API](https://img.shields.io/badge/API-15%2B-orange.svg?style=flat)](https://android-arsenal.com/api?level=15) 
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-Payment%20Card%20View-brightgreen.svg?style=plastic)](https://android-arsenal.com/details/1/7417)
[![Donate](https://img.shields.io/badge/Donate-PayPal-blue.svg)](https://paypal.me/manojbhadane)
<!---[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0) -->

# Download

This library is available in **jCenter** which is the default Maven repository used in Android Studio.

## Gradle 
**Step 1.** Add it in your root build.gradle at the end of repositories
```
allprojects 
{
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

**Step 2.** Add the dependency in your apps module build.gradle
```
dependencies 
{
	  implementation 'com.github.manojbhadane:QButton:v1.0'
}
```

### Spread Some :heart:
[![GitHub followers](https://img.shields.io/github/followers/manojbhadane.svg?style=social&label=Follow)](https://github.com/manojbhadane)  [![Twitter Follow](https://img.shields.io/twitter/follow/manojbhadane.svg?style=social)](https://twitter.com/Manoj_bhadane) 


# Usage
**XML**
```xml
<com.manojbhadane.QButton
       android:layout_width="match_parent"
       android:layout_height="wrap_content"
       android:text="Hello World!"
       android:textColor="@android:color/white"
       app:qb_backgroundColor="@color/green"
       app:qb_radius="100"
       app:qb_strokeColor="@color/darkGreen"
       app:qb_strokeWidth="5" />
``` 


# Customization

There are several customization options available which you can use to completely change the look-and-feel and functionality of this view to match your needs.

### XML (Quick and Easy)

You can add some attributes to the PaymentCardView from your XML layout.

```xml
app:qb_backgroundColor="@color/green"
app:qb_radius="100"
app:qb_strokeColor="@color/darkGreen"
app:qb_strokeWidth="5"
```

### JAVA (Programatically)

You can also programatically change the properties of the view, thereby having more control over it.

```java
qButton.setCornerRadious(5);
qButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));

qButton.setStrokeWidth(5);
qButton.setStrokeDashGap(5);
qButton.setStrokeDashWidth(90);
qButton.setStrokeColor(getResources().getColor(R.color.colorPrimaryDark));
```

# Bugs or Requests

If you encounter any problems feel free to open an [issue](https://github.com/manojbhadane/QButton/issues/new?assignees=&labels=&template=bug_report.md). If you feel the library is missing a feature, please raise a [ticket](https://github.com/manojbhadane/QButton/issues/new?assignees=&labels=&template=feature_request.md) on GitHub and I'll look into it. Pull request are also welcome. 


# About The Author

### Manoj Bhadane

Android & Backend Developer.


<a href="https://medium.com/@manojbhadane"><img src="https://github.com/manojbhadane/Social-Icons/blob/master/medium-icon.png?raw=true" width="60"></a>
<a href="https://stackoverflow.com/users/4034678/manoj-bhadane"><img src="https://github.com/manojbhadane/Social-Icons/blob/master/stackoverflow-icon.png?raw=true" width="60"></a>
<a href="https://twitter.com/Manoj_bhadane"><img src="https://github.com/manojbhadane/Social-Icons/blob/master/twitter-icon.png?raw=true" width="60"></a>
<a href="https://in.linkedin.com/in/manojbhadane"><img src="https://github.com/manojbhadane/Social-Icons/blob/master/linkedin-icon.png?raw=true" width="60"></a>

# License

```
MIT License

Copyright (c) 2019 Manoj Bhadane

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```



