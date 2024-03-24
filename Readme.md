# Cider-repl bug reproduction

## Steps

- clone the repo
- On the terminal run `clj -M -m main` should show a JavaFX window saying "Hello world"
- Now open main.clj with Emacs, then Cider jack-in
- Load the namespace (Ctrl-k)
- Try to run (-main)

In my case it throws with :

```
Exception in thread "JavaFX Application Thread" java.lang.NoClassDefFoundError: Could not initialize class javafx.scene.control.Label
	at main$_main$fn__9611.invoke(main.clj:13)
	at clojure.lang.AFn.run(AFn.java:22)
	at com.sun.javafx.application.PlatformImpl.lambda$runLater$10(PlatformImpl.java:456)
	at java.base/java.security.AccessController.doPrivileged(AccessController.java:400)
	at com.sun.javafx.application.PlatformImpl.lambda$runLater$11(PlatformImpl.java:455)
	at com.sun.glass.ui.InvokeLaterDispatcher$Future.run(InvokeLaterDispatcher.java:95)
	at com.sun.glass.ui.gtk.GtkApplication._runLoop(Native Method)
	at com.sun.glass.ui.gtk.GtkApplication.lambda$runLoop$10(GtkApplication.java:264)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "clojure-agent-send-off-pool-0"]
	at java.base/java.lang.Class.forName0(Native Method)
	at java.base/java.lang.Class.forName(Class.java:421)
	at java.base/ja
```
