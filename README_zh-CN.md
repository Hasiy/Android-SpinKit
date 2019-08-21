# Android-SpinKit
> Android 加载动画([SpinKit](https://tobiasahlin.com/spinkit)的Android版本实现)

 原项目[Android-SpinKit](https://ybq.github.io/Android-SpinKit)  添加 Heartbeat效果

## 效果

<img src="http://ww1.sinaimg.cn/large/8c95cb62gy1g678umt2q5g208w08xn2k.gif" width="240px" height="240px"/>

<img src="https://raw.githubusercontent.com/ybq/AndroidSpinKit/master/art/screen2.gif" width="200px" height="200px"/>

## Gradle 依赖

 ``` gradle
dependencies {
    implementation "top.hasiy:Android-SpinKit:1.0.0"
 }
 ```


## 使用
- Xml

 ```xml
<top.hasiy.spinkit.SpinKitView
     xmlns:app="http://schemas.android.com/apk/res-auto"
     android:id="@+id/spin_kit"
     style="@style/SpinKitView.Large.Circle"
     android:layout_width="wrap_content"
     android:layout_height="wrap_content"
     android:layout_gravity="center"
     app:SpinKit_Color="@color/colorAccent" />         
 ```


- ProgressBar

 ```java
ProgressBar progressBar = (ProgressBar)findViewById(R.id.progress);
DoubleBounce doubleBounce = new DoubleBounce();
progressBar.setIndeterminateDrawable(doubleBounce);
 ```

###样式:

样式 | 预览
------------     |   -------------
RotatingPlane    | <img src='https://raw.githubusercontent.com/ybq/AndroidSpinKit/master/art/RotatingPlane.gif' alt='RotatingPlane' width="90px" height="90px"/>
DoubleBounce     | <img src='https://raw.githubusercontent.com/ybq/AndroidSpinKit/master/art/DoubleBounce.gif' alt='DoubleBounce' width="90px" height="90px"/>
Wave             | <img src='https://raw.githubusercontent.com/ybq/AndroidSpinKit/master/art/Wave.gif' alt='Wave' width="90px" height="90px"/>
WanderingCubes   | <img src='https://raw.githubusercontent.com/ybq/AndroidSpinKit/master/art/WanderingCubes.gif' alt='WanderingCubes' width="90px" height="90px"/>
Pulse            | <img src='https://raw.githubusercontent.com/ybq/AndroidSpinKit/master/art/Pulse.gif' alt='Pulse' width="90px" height="90px"/>
ChasingDots      | <img src='https://raw.githubusercontent.com/ybq/AndroidSpinKit/master/art/ChasingDots.gif' alt='ChasingDots' width="90px" height="90px"/>
ThreeBounce      | <img src='https://raw.githubusercontent.com/ybq/AndroidSpinKit/master/art/ThreeBounce.gif' alt='ThreeBounce' width="90px" height="90px"/>
Circle           | <img src='https://raw.githubusercontent.com/ybq/AndroidSpinKit/master/art/Circle.gif' alt='Circle' width="90px" height="90px"/>
CubeGrid         | <img src='https://raw.githubusercontent.com/ybq/AndroidSpinKit/master/art/CubeGrid.gif' alt='CubeGrid' width="90px" height="90px"/>
FadingCircle     | <img src='https://raw.githubusercontent.com/ybq/AndroidSpinKit/master/art/FadingCircle.gif' alt='FadingCircle' width="90px" height="90px"/>
FoldingCube      | <img src='https://raw.githubusercontent.com/ybq/AndroidSpinKit/master/art/FoldingCube.gif' alt='FoldingCube' width="90px" height="90px"/>
RotatingCircle   | <img src='https://raw.githubusercontent.com/ybq/AndroidSpinKit/master/art/RotatingCircle.gif' alt='RotatingCircle' width="90px" height="90px"/>
Heartbeat        | <img src='http://ww1.sinaimg.cn/large/8c95cb62gy1g679fzbszeg208w08ytge.gif' alt='Heartbeat' width="90px" height="90px"/>


##感谢
- [SpinKit](https://github.com/tobiasahlin/SpinKit).
