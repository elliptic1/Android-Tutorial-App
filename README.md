<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
          package="com.tbse.happybirthdaypatrick">

    <!--

   Happy Birthday Patrick!

   Here's a basic app with many comments from me.

   -Uncle Todd


   This is the Manifest. Every app has one. It's the first place the Android operating system
   will go to run your app. It tells Android what's in the app and what to do next.

   This file is in XML format. It gives name and value pairs like this:

   <Patrick
     age:12
     color:blue
     />

   The different parts of an Android app are called 'components' and the most common ones are the Activity,
   the Service, and the Broadcast Receiver.

   An Activity is what you're seeing on the screen, the holder of all the buttons and text and video
   and everything else you touch and interact with.

   A Service runs code in the background. It doesn't obstruct the user interface or bother the user at all.
   For example, if you wanted to download a large file, you'd do it in the background.

   A Broadcast Receiver listens for messages from the operating system and acts upon them
   when they come in. For example, Android will let it be known to all apps that the battery is low, or that wifi has
   been turned on, or that the screen is off... there are tons of different broadcast messages.

   For this app I'll just use an Activity.
    -->


    <!-- The whole app will run inside this "application". Think of it as a wrapper for all your code,
         all your components, everything associated with your app.

         -Icon tells Android where to go to get the image for the icon
         -Label tells Android what the name of the app is for the launcher, and to put under your icon
    on the user's phone's screen.
         -Style tells Android how it should look - colors, sizes of things, etc. -->
    <application
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:theme="@style/AppTheme">

    <!-- This tells Android that we have one Activity in our app. -->
        <activity
            android:name=".MainActivity"
            android:label="@string/app_name"
            android:theme="@style/AppTheme.NoActionBar">

            <!-- This intent filter will catch broadcast messages from the system,
             but only the ones mentioned below. -->
            <intent-filter>

            <!-- When Android wants to open the app because the user touched your icon on the screen,
            it sends the message "android.intent.action.MAIN" to your app, and here you're
            telling android that you want MainActivity to handle that message.
            -->
                <action android:name="android.intent.action.MAIN"/>

            <!-- This tells Android to show your icon in the launcher with all the other apps. -->
                <category android:name="android.intent.category.LAUNCHER"/>

            </intent-filter>
        </activity>
    </application>

</manifest>
