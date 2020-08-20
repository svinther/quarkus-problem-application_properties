```
$ mvn package -e
[INFO] Error stacktraces are turned on.
[INFO] Scanning for projects...
[INFO] 
[INFO] ----------------------< org.acme:getting-started >----------------------
[INFO] Building getting-started 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- quarkus-maven-plugin:1.7.0.Final:prepare (default) @ getting-started ---
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ getting-started ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 2 resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ getting-started ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- quarkus-maven-plugin:1.7.0.Final:prepare-tests (default) @ getting-started ---
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ getting-started ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/svs/develop/quarkus-problem-application_properties/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:testCompile (default-testCompile) @ getting-started ---
[INFO] No sources to compile
[INFO] 
[INFO] --- maven-surefire-plugin:3.0.0-M5:test (default-test) @ getting-started ---
[INFO] No tests to run.
[INFO] 
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ getting-started ---
[INFO] 
[INFO] --- quarkus-maven-plugin:1.7.0.Final:build (default) @ getting-started ---
[WARNING] [io.quarkus.deployment.QuarkusAugmentor] Using Java versions older than 11 to build Quarkus applications is deprecated and will be disallowed in a future release!
[INFO] [org.jboss.threads] JBoss Threads version 3.1.1.Final
[WARNING] [io.quarkus.agroal.deployment.AgroalProcessor] The Agroal dependency is present but no JDBC datasources have been defined.
[INFO] [org.hibernate.Version] HHH000412: Hibernate ORM core version 5.4.19.Final
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.577 s
[INFO] Finished at: 2020-08-20T13:16:10+02:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal io.quarkus:quarkus-maven-plugin:1.7.0.Final:build (default) on project getting-started: Failed to build quarkus application: io.quarkus.builder.BuildException: Build failure: Build failed due to errors
[ERROR]         [error]: Build step io.quarkus.arc.deployment.ArcProcessor#validate threw an exception: javax.enterprise.inject.spi.DeploymentException: javax.enterprise.inject.UnsatisfiedResolutionException: Unsatisfied dependency for type javax.persistence.EntityManager and qualifiers [@Default]
[ERROR]         - java member: org.acme.getting.started.SantaClausService#em
[ERROR]         - declared on CLASS bean [types=[org.acme.getting.started.SantaClausService, java.lang.Object], qualifiers=[@Default, @Any], target=org.acme.getting.started.SantaClausService]
[ERROR]         at io.quarkus.arc.processor.BeanDeployment.processErrors(BeanDeployment.java:990)
[ERROR]         at io.quarkus.arc.processor.BeanDeployment.init(BeanDeployment.java:234)
[ERROR]         at io.quarkus.arc.processor.BeanProcessor.initialize(BeanProcessor.java:122)
[ERROR]         at io.quarkus.arc.deployment.ArcProcessor.validate(ArcProcessor.java:391)
[ERROR]         at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
[ERROR]         at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
[ERROR]         at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
[ERROR]         at java.lang.reflect.Method.invoke(Method.java:498)
[ERROR]         at io.quarkus.deployment.ExtensionLoader$2.execute(ExtensionLoader.java:932)
[ERROR]         at io.quarkus.builder.BuildContext.run(BuildContext.java:277)
[ERROR]         at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
[ERROR]         at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:2046)
[ERROR]         at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1578)
[ERROR]         at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1452)
[ERROR]         at java.lang.Thread.run(Thread.java:748)
[ERROR]         at org.jboss.threads.JBossThread.run(JBossThread.java:479)
[ERROR] Caused by: javax.enterprise.inject.UnsatisfiedResolutionException: Unsatisfied dependency for type javax.persistence.EntityManager and qualifiers [@Default]
[ERROR]         - java member: org.acme.getting.started.SantaClausService#em
[ERROR]         - declared on CLASS bean [types=[org.acme.getting.started.SantaClausService, java.lang.Object], qualifiers=[@Default, @Any], target=org.acme.getting.started.SantaClausService]
[ERROR]         at io.quarkus.arc.processor.Beans.resolveInjectionPoint(Beans.java:494)
[ERROR]         at io.quarkus.arc.processor.BeanInfo.init(BeanInfo.java:362)
[ERROR]         at io.quarkus.arc.processor.BeanDeployment.init(BeanDeployment.java:226)
[ERROR]         ... 14 more
[ERROR] -> [Help 1]
org.apache.maven.lifecycle.LifecycleExecutionException: Failed to execute goal io.quarkus:quarkus-maven-plugin:1.7.0.Final:build (default) on project getting-started: Failed to build quarkus application
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:215)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:156)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:148)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:117)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:81)
    at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build (SingleThreadedBuilder.java:56)
    at org.apache.maven.lifecycle.internal.LifecycleStarter.execute (LifecycleStarter.java:128)
    at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:305)
    at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:192)
    at org.apache.maven.DefaultMaven.execute (DefaultMaven.java:105)
    at org.apache.maven.cli.MavenCli.execute (MavenCli.java:957)
    at org.apache.maven.cli.MavenCli.doMain (MavenCli.java:289)
    at org.apache.maven.cli.MavenCli.main (MavenCli.java:193)
    at sun.reflect.NativeMethodAccessorImpl.invoke0 (Native Method)
    at sun.reflect.NativeMethodAccessorImpl.invoke (NativeMethodAccessorImpl.java:62)
    at sun.reflect.DelegatingMethodAccessorImpl.invoke (DelegatingMethodAccessorImpl.java:43)
    at java.lang.reflect.Method.invoke (Method.java:498)
    at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced (Launcher.java:282)
    at org.codehaus.plexus.classworlds.launcher.Launcher.launch (Launcher.java:225)
    at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode (Launcher.java:406)
    at org.codehaus.plexus.classworlds.launcher.Launcher.main (Launcher.java:347)
Caused by: org.apache.maven.plugin.MojoExecutionException: Failed to build quarkus application
    at io.quarkus.maven.BuildMojo.execute (BuildMojo.java:244)
    at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo (DefaultBuildPluginManager.java:137)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:210)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:156)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:148)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:117)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:81)
    at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build (SingleThreadedBuilder.java:56)
    at org.apache.maven.lifecycle.internal.LifecycleStarter.execute (LifecycleStarter.java:128)
    at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:305)
    at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:192)
    at org.apache.maven.DefaultMaven.execute (DefaultMaven.java:105)
    at org.apache.maven.cli.MavenCli.execute (MavenCli.java:957)
    at org.apache.maven.cli.MavenCli.doMain (MavenCli.java:289)
    at org.apache.maven.cli.MavenCli.main (MavenCli.java:193)
    at sun.reflect.NativeMethodAccessorImpl.invoke0 (Native Method)
    at sun.reflect.NativeMethodAccessorImpl.invoke (NativeMethodAccessorImpl.java:62)
    at sun.reflect.DelegatingMethodAccessorImpl.invoke (DelegatingMethodAccessorImpl.java:43)
    at java.lang.reflect.Method.invoke (Method.java:498)
    at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced (Launcher.java:282)
    at org.codehaus.plexus.classworlds.launcher.Launcher.launch (Launcher.java:225)
    at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode (Launcher.java:406)
    at org.codehaus.plexus.classworlds.launcher.Launcher.main (Launcher.java:347)
Caused by: java.lang.RuntimeException: io.quarkus.builder.BuildException: Build failure: Build failed due to errors
        [error]: Build step io.quarkus.arc.deployment.ArcProcessor#validate threw an exception: javax.enterprise.inject.spi.DeploymentException: javax.enterprise.inject.UnsatisfiedResolutionException: Unsatisfied dependency for type javax.persistence.EntityManager and qualifiers [@Default]
        - java member: org.acme.getting.started.SantaClausService#em
        - declared on CLASS bean [types=[org.acme.getting.started.SantaClausService, java.lang.Object], qualifiers=[@Default, @Any], target=org.acme.getting.started.SantaClausService]
        at io.quarkus.arc.processor.BeanDeployment.processErrors(BeanDeployment.java:990)
        at io.quarkus.arc.processor.BeanDeployment.init(BeanDeployment.java:234)
        at io.quarkus.arc.processor.BeanProcessor.initialize(BeanProcessor.java:122)
        at io.quarkus.arc.deployment.ArcProcessor.validate(ArcProcessor.java:391)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:498)
        at io.quarkus.deployment.ExtensionLoader$2.execute(ExtensionLoader.java:932)
        at io.quarkus.builder.BuildContext.run(BuildContext.java:277)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:2046)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1578)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1452)
        at java.lang.Thread.run(Thread.java:748)
        at org.jboss.threads.JBossThread.run(JBossThread.java:479)
Caused by: javax.enterprise.inject.UnsatisfiedResolutionException: Unsatisfied dependency for type javax.persistence.EntityManager and qualifiers [@Default]
        - java member: org.acme.getting.started.SantaClausService#em
        - declared on CLASS bean [types=[org.acme.getting.started.SantaClausService, java.lang.Object], qualifiers=[@Default, @Any], target=org.acme.getting.started.SantaClausService]
        at io.quarkus.arc.processor.Beans.resolveInjectionPoint(Beans.java:494)
        at io.quarkus.arc.processor.BeanInfo.init(BeanInfo.java:362)
        at io.quarkus.arc.processor.BeanDeployment.init(BeanDeployment.java:226)
        ... 14 more

    at io.quarkus.runner.bootstrap.AugmentActionImpl.runAugment (AugmentActionImpl.java:253)
    at io.quarkus.runner.bootstrap.AugmentActionImpl.createProductionApplication (AugmentActionImpl.java:92)
    at io.quarkus.maven.BuildMojo.execute (BuildMojo.java:220)
    at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo (DefaultBuildPluginManager.java:137)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:210)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:156)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:148)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:117)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:81)
    at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build (SingleThreadedBuilder.java:56)
    at org.apache.maven.lifecycle.internal.LifecycleStarter.execute (LifecycleStarter.java:128)
    at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:305)
    at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:192)
    at org.apache.maven.DefaultMaven.execute (DefaultMaven.java:105)
    at org.apache.maven.cli.MavenCli.execute (MavenCli.java:957)
    at org.apache.maven.cli.MavenCli.doMain (MavenCli.java:289)
    at org.apache.maven.cli.MavenCli.main (MavenCli.java:193)
    at sun.reflect.NativeMethodAccessorImpl.invoke0 (Native Method)
    at sun.reflect.NativeMethodAccessorImpl.invoke (NativeMethodAccessorImpl.java:62)
    at sun.reflect.DelegatingMethodAccessorImpl.invoke (DelegatingMethodAccessorImpl.java:43)
    at java.lang.reflect.Method.invoke (Method.java:498)
    at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced (Launcher.java:282)
    at org.codehaus.plexus.classworlds.launcher.Launcher.launch (Launcher.java:225)
    at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode (Launcher.java:406)
    at org.codehaus.plexus.classworlds.launcher.Launcher.main (Launcher.java:347)
Caused by: io.quarkus.builder.BuildException: Build failure: Build failed due to errors
        [error]: Build step io.quarkus.arc.deployment.ArcProcessor#validate threw an exception: javax.enterprise.inject.spi.DeploymentException: javax.enterprise.inject.UnsatisfiedResolutionException: Unsatisfied dependency for type javax.persistence.EntityManager and qualifiers [@Default]
        - java member: org.acme.getting.started.SantaClausService#em
        - declared on CLASS bean [types=[org.acme.getting.started.SantaClausService, java.lang.Object], qualifiers=[@Default, @Any], target=org.acme.getting.started.SantaClausService]
        at io.quarkus.arc.processor.BeanDeployment.processErrors(BeanDeployment.java:990)
        at io.quarkus.arc.processor.BeanDeployment.init(BeanDeployment.java:234)
        at io.quarkus.arc.processor.BeanProcessor.initialize(BeanProcessor.java:122)
        at io.quarkus.arc.deployment.ArcProcessor.validate(ArcProcessor.java:391)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:498)
        at io.quarkus.deployment.ExtensionLoader$2.execute(ExtensionLoader.java:932)
        at io.quarkus.builder.BuildContext.run(BuildContext.java:277)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:2046)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1578)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1452)
        at java.lang.Thread.run(Thread.java:748)
        at org.jboss.threads.JBossThread.run(JBossThread.java:479)
Caused by: javax.enterprise.inject.UnsatisfiedResolutionException: Unsatisfied dependency for type javax.persistence.EntityManager and qualifiers [@Default]
        - java member: org.acme.getting.started.SantaClausService#em
        - declared on CLASS bean [types=[org.acme.getting.started.SantaClausService, java.lang.Object], qualifiers=[@Default, @Any], target=org.acme.getting.started.SantaClausService]
        at io.quarkus.arc.processor.Beans.resolveInjectionPoint(Beans.java:494)
        at io.quarkus.arc.processor.BeanInfo.init(BeanInfo.java:362)
        at io.quarkus.arc.processor.BeanDeployment.init(BeanDeployment.java:226)
        ... 14 more

    at io.quarkus.builder.Execution.run (Execution.java:115)
    at io.quarkus.builder.BuildExecutionBuilder.execute (BuildExecutionBuilder.java:79)
    at io.quarkus.deployment.QuarkusAugmentor.run (QuarkusAugmentor.java:149)
    at io.quarkus.runner.bootstrap.AugmentActionImpl.runAugment (AugmentActionImpl.java:251)
    at io.quarkus.runner.bootstrap.AugmentActionImpl.createProductionApplication (AugmentActionImpl.java:92)
    at io.quarkus.maven.BuildMojo.execute (BuildMojo.java:220)
    at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo (DefaultBuildPluginManager.java:137)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:210)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:156)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:148)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:117)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:81)
    at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build (SingleThreadedBuilder.java:56)
    at org.apache.maven.lifecycle.internal.LifecycleStarter.execute (LifecycleStarter.java:128)
    at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:305)
    at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:192)
    at org.apache.maven.DefaultMaven.execute (DefaultMaven.java:105)
    at org.apache.maven.cli.MavenCli.execute (MavenCli.java:957)
    at org.apache.maven.cli.MavenCli.doMain (MavenCli.java:289)
    at org.apache.maven.cli.MavenCli.main (MavenCli.java:193)
    at sun.reflect.NativeMethodAccessorImpl.invoke0 (Native Method)
    at sun.reflect.NativeMethodAccessorImpl.invoke (NativeMethodAccessorImpl.java:62)
    at sun.reflect.DelegatingMethodAccessorImpl.invoke (DelegatingMethodAccessorImpl.java:43)
    at java.lang.reflect.Method.invoke (Method.java:498)
    at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced (Launcher.java:282)
    at org.codehaus.plexus.classworlds.launcher.Launcher.launch (Launcher.java:225)
    at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode (Launcher.java:406)
    at org.codehaus.plexus.classworlds.launcher.Launcher.main (Launcher.java:347)
Caused by: javax.enterprise.inject.spi.DeploymentException: javax.enterprise.inject.UnsatisfiedResolutionException: Unsatisfied dependency for type javax.persistence.EntityManager and qualifiers [@Default]
        - java member: org.acme.getting.started.SantaClausService#em
        - declared on CLASS bean [types=[org.acme.getting.started.SantaClausService, java.lang.Object], qualifiers=[@Default, @Any], target=org.acme.getting.started.SantaClausService]
    at io.quarkus.arc.processor.BeanDeployment.processErrors (BeanDeployment.java:990)
    at io.quarkus.arc.processor.BeanDeployment.init (BeanDeployment.java:234)
    at io.quarkus.arc.processor.BeanProcessor.initialize (BeanProcessor.java:122)
    at io.quarkus.arc.deployment.ArcProcessor.validate (ArcProcessor.java:391)
    at sun.reflect.NativeMethodAccessorImpl.invoke0 (Native Method)
    at sun.reflect.NativeMethodAccessorImpl.invoke (NativeMethodAccessorImpl.java:62)
    at sun.reflect.DelegatingMethodAccessorImpl.invoke (DelegatingMethodAccessorImpl.java:43)
    at java.lang.reflect.Method.invoke (Method.java:498)
    at io.quarkus.deployment.ExtensionLoader$2.execute (ExtensionLoader.java:932)
    at io.quarkus.builder.BuildContext.run (BuildContext.java:277)
    at org.jboss.threads.ContextClassLoaderSavingRunnable.run (ContextClassLoaderSavingRunnable.java:35)
    at org.jboss.threads.EnhancedQueueExecutor.safeRun (EnhancedQueueExecutor.java:2046)
    at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask (EnhancedQueueExecutor.java:1578)
    at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run (EnhancedQueueExecutor.java:1452)
    at java.lang.Thread.run (Thread.java:748)
    at org.jboss.threads.JBossThread.run (JBossThread.java:479)
Caused by: javax.enterprise.inject.UnsatisfiedResolutionException: Unsatisfied dependency for type javax.persistence.EntityManager and qualifiers [@Default]
        - java member: org.acme.getting.started.SantaClausService#em
        - declared on CLASS bean [types=[org.acme.getting.started.SantaClausService, java.lang.Object], qualifiers=[@Default, @Any], target=org.acme.getting.started.SantaClausService]
    at io.quarkus.arc.processor.Beans.resolveInjectionPoint (Beans.java:494)
    at io.quarkus.arc.processor.BeanInfo.init (BeanInfo.java:362)
    at io.quarkus.arc.processor.BeanDeployment.init (BeanDeployment.java:226)
    at io.quarkus.arc.processor.BeanProcessor.initialize (BeanProcessor.java:122)
    at io.quarkus.arc.deployment.ArcProcessor.validate (ArcProcessor.java:391)
    at sun.reflect.NativeMethodAccessorImpl.invoke0 (Native Method)
    at sun.reflect.NativeMethodAccessorImpl.invoke (NativeMethodAccessorImpl.java:62)
    at sun.reflect.DelegatingMethodAccessorImpl.invoke (DelegatingMethodAccessorImpl.java:43)
    at java.lang.reflect.Method.invoke (Method.java:498)
    at io.quarkus.deployment.ExtensionLoader$2.execute (ExtensionLoader.java:932)
    at io.quarkus.builder.BuildContext.run (BuildContext.java:277)
    at org.jboss.threads.ContextClassLoaderSavingRunnable.run (ContextClassLoaderSavingRunnable.java:35)
    at org.jboss.threads.EnhancedQueueExecutor.safeRun (EnhancedQueueExecutor.java:2046)
    at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask (EnhancedQueueExecutor.java:1578)
    at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run (EnhancedQueueExecutor.java:1452)
    at java.lang.Thread.run (Thread.java:748)
    at org.jboss.threads.JBossThread.run (JBossThread.java:479)
[ERROR] 
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoExecutionException
```