https://docs.gradle.org/current/userguide/java_testing.html

* ### Run tests from specific package (recursively):
    
    `gradle test --tests 'all.in.specific.package*'`

* ### You can also combine filters defined at the command line with continuous build to re-execute a subset of tests immediately after every change to a production or test source file. The following executes all tests in the 'com.mypackage.foo' package or subpackages whenever a change triggers the tests to run:

    `gradle test --continuous --tests "com.mypackage.foo.*"`