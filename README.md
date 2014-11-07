# Android Ripple Background

A beautiful ripple animation for your app. You can easily change its color, speed of wave, one ripple or multiple ripples. See demo below.

![Simple Ripple](previews/rippleSimple.gif)　　　　　　![Multiple ripples](previews/rippleFoundDevice.gif)

##Usage

###Step 1

####Install with Gradle

//TODO push to maven center

###Step 2
####RippleBackground

Add `RippleBackground` to your layout with content you want, like an ImageView. Configure the view customization elements using styleable attributes.
 
```xml
<org.yyu.library.RippleBackground
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:id="@+id/content"
    app:rb_color="#0099CC"
    app:rb_radius="32dp"
    app:rb_rippleAmount="4"
    app:rb_duration="3000"
    app:rb_scale="6">
    <ImageView
        android:layout_width="64dp"
        android:layout_height="64dp"
        android:layout_centerInParent="true"
        android:id="@+id/centerImage"
        android:src="@drawable/demoImage"/>
</org.yyu.library.RippleBackground>
```

##Theming
* app:rb_color [color def:@android:color/holo_blue_dark] --> Color of the ripple
* app:rb_radius [dimension def:64dp ] --> Radius of the ripple
* app:rb_duration [integer def:3000 ] --> Duration of one ripple animation (millisecond) 
* app:rb_rippleAmount [integer def:6] --> Max amount of ripples at one screen
* app:rb_scale [interger def:6] --> Scale of ripple at the end of one animation cycle
* app:rb_type [enum (fillRipple, strokeRipple) def:fillRipple] --> Filled circle or ring
* app:rb_strokeWidth [dimension def:2dp] --> Stroke width of the ripple, ONLY work when rb_type="strokeRipple"
