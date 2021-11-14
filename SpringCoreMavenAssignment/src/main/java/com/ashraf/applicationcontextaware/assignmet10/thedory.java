package com.ashraf.applicationcontextaware.assignmet10;

public class thedory {
	
//	WHY ApplicationContextAware?
//			Imagine we have an application (e.g. a web or Swing-application) which we now want to be Spring-enabled. Ok, we add the Spring libraries(spring.jar) and the Configuration-file(spring.xml) 
//			and create our Spring-beans. But there are still some old class-files
//			which you can’t use in this way. These files still need access to the 
//			Spring-Honeypot where all the goodies exist and you don’t want to
//			redesign your application.

//	First, create the class “ApplicationContextProvider (Triangle class)”.
//	This class implements the ApplicationContextAware. A bean which 
//	implements the ApplicationContextAware-interface and is deployed 
//	into the context will be called back on the creation of the bean,
//	using the interface’s setApplicationContext(…) method, and provided 
//	with a reference to the context, which may be stored for later
//	interaction with the context.
//
//	In this tutorial, you will see an example of using ApplicationContextAware. 
//	The ApplicationContextAware is used when an object required.

}
